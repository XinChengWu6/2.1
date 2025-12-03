# CampFlea Spring Boot Starter

基于 Spring Boot 2.2.x、MyBatis、JSP 与 PageHelper 的电商 + 内容型校园二手平台骨架。项目默认运行在 `http://localhost:8080/campflea`，整合了 Hikari 数据源、统一 JSON 响应与基础业务示例，便于继续扩展下单、帖子、支付等功能。

## 目录结构
- `src/main/java/com/example/campflea` 核心后端代码
  - `controller`：示例 REST API（用户、商品、订单）与页面控制器 `PageController`（渲染 JSP 首页）
  - `service`：简单内存服务接口与实现
  - `entity`：实体模型草案（Users、Huiyuan、Shangpin、Subtype、Shorder、Orderitem、Spcomment 等）
  - `dto`：统一响应包装器 `JsonResult`
- `src/main/resources`：应用配置与 MyBatis 映射目录占位（`mapper/README.md`）
- `src/main/webapp/WEB-INF/jsp/index.jsp`：示例 JSP 首页，可验证视图解析配置

## 快速启动
1. 通过 `application.yml` 配置好数据库连接与上下文路径（默认 `/campflea`）。
2. 执行 `mvn spring-boot:run` 启动应用。
3. 访问示例接口：
   - `POST /api/users?username=demo&password=123456&role=buyer` 注册用户
   - `GET /api/products` 查看商品列表（内存存储示例）
   - `POST /api/orders` 创建订单草稿（传入订单与订单项 JSON）

本仓库提供快速验证与二次开发的基线，后续可继续补充 MyBatis 映射、数据库脚本、鉴权、支付、帖子等完整业务模块。
