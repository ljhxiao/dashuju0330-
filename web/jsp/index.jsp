<%--
  Created by IntelliJ IDEA.
  User: 70201
  Date: 2020/6/13
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <c:if test="${requestScope.name=='tom'}">
      <h1>我是tom</h1>
    </c:if>
  </body>
</html>
