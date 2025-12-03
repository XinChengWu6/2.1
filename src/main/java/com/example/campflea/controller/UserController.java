package com.example.campflea.controller;

import com.example.campflea.dto.JsonResult;
import com.example.campflea.entity.Users;
import com.example.campflea.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@Validated
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public JsonResult<Users> register(@RequestParam @NotBlank String username,
                                      @RequestParam @NotBlank String password,
                                      @RequestParam(defaultValue = "buyer") String role) {
        return JsonResult.ok(userService.register(username, password, role));
    }

    @GetMapping
    public JsonResult<List<Users>> list() {
        return JsonResult.ok(userService.findAll());
    }

    @PutMapping("/{id}")
    public JsonResult<Users> update(@PathVariable Long id,
                                    @RequestParam @NotBlank String password,
                                    @RequestParam(defaultValue = "buyer") String role) {
        Users updated = userService.update(id, password, role);
        if (updated == null) {
            return JsonResult.fail("user not found");
        }
        return JsonResult.ok(updated);
    }

    @DeleteMapping("/{id}")
    public JsonResult<Void> delete(@PathVariable Long id) {
        userService.delete(id);
        return JsonResult.ok("deleted", null);
    }
}
