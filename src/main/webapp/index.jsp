<%@page import="Controller.DemoHttpSessionListener" %>
<%@page session="true"%>
<html>
<head>
    <link href="<%=request.getContextPath()%>/mycss.css" rel="stylesheet" type="text/css">
    <style>

    </style>
</head>
<body>
 <p>Hello World!</p>
 asocjasjcoiasjcosm
    Number session: <%=DemoHttpSessionListener.getNumberSession()%>
</body>
</html>
