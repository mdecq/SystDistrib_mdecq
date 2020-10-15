<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test webdynam</title>
</head>
<body>
Partie VUE du modèle MVC <br/>

Bonjour ${a} <br/>

A<br/>
<input type="text" id="VarA" name="nameA" required
       minlength="4" maxlength="8" size="10">
<br/>     
B<br/>
<input type="text" id="VarB" name="nameB" required
       minlength="4" maxlength="8" size="10">
<br/>
<input type="addition" onClick="Addition()" />
<br/>
Le résultat de l'addition est ${resAdd} !
       
</body>
</html>