<%@ page contentType = "text/html; charset = UTF-8" %>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Struts 2</title>
</head>
<body>
	<form action = "salvarCarro">
         <label for = "nome">Nome:</label><br/>
         <input type = "text" name = "nome"/><br/><br/>
         
         <label for = "ano">Ano:</label><br/>
         <input type = "text" name = "ano"/><br/><br/>
         
         <label for = "cambio">Cambio:</label><br/>
         <input type = "text" name = "cambio"/><br/><br/>
         
         <input type = "submit" value = "Enviar"/>
      </form>
</body>
</html>