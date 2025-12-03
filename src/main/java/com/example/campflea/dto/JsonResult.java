package com.example.campflea.dto;

public class JsonResult<T> {
    private boolean success;
    private String message;
    private T data;

    private JsonResult(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public static <T> JsonResult<T> ok(T data) {
        return new JsonResult<>(true, "ok", data);
    }

    public static <T> JsonResult<T> ok(String message, T data) {
        return new JsonResult<>(true, message, data);
    }

    public static <T> JsonResult<T> fail(String message) {
        return new JsonResult<>(false, message, null);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
