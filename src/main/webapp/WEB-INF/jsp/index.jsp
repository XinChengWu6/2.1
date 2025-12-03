<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>CampFlea 示例首页</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 0; padding: 32px; background: #f6f7fb; }
        .container { max-width: 760px; margin: 0 auto; background: #fff; border-radius: 12px; padding: 24px 28px; box-shadow: 0 6px 18px rgba(0,0,0,0.08); }
        h1 { margin-top: 0; }
        code { background: #f0f2f5; padding: 2px 6px; border-radius: 4px; }
        ul { line-height: 1.8; }
    </style>
</head>
<body>
<div class="container">
    <h1>CampFlea Spring Boot</h1>
    <p>这是一个基于 Spring Boot + MyBatis + JSP 的示例骨架，默认上下文路径为 <code>/campflea</code>。</p>
    <h3>快速入口</h3>
    <ul>
        <li>用户接口：<code>/campflea/api/users</code></li>
        <li>商品接口：<code>/campflea/api/products</code></li>
        <li>订单接口：<code>/campflea/api/orders</code></li>
    </ul>
    <p>如需对接真实数据库与 Mapper，可在 <code>src/main/resources/mapper</code> 中补充 XML 映射，并替换内存版 Service。</p>
</div>
</body>
</html>
