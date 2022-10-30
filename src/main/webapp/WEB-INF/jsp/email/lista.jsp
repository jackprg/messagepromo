<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Emails</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Emails: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Destinatario</th>
	        <th>Conteudo</th>
	        <th>Data Envio</th>
	        <th>Custo Envio</th>
	        <th>Email destinatario</th>
	        <th>Assunto</th>
	        <th>Corpo Email</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="b" items="${listagem}">
		      <tr>
				<td>${b.id}</td>
		        <td>${b.nomeDestinatario}</td>
		        <td>${b.conteudo}</td>
		        <td>${b.dataEnvio}</td>
		        <td>${b.custoEnvio}</td>
		        <td>${b.emailDestinatario}</td>
		        <td>${b.assunto}</td>
		        <td>${b.corpoEmail}</td>
		        <td><a href="/email/${b.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>