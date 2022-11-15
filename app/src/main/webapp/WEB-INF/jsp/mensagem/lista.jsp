<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Mensagens</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
	  <h3>Mensagens: ${listagem.size()}</h3>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Destinatario</th>
	        <th>Conteudo</th>
	        <th>Data Envio</th>
	        <th>Custo Envio</th>
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
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>