<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Campanhas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h3>Campanhas: ${listagem.size()}</h3>

	  <h4><a href="/campanha">Novo campanha</a></h4>

	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Descri??o</th>
	        <th>Data</th>
	        <th>Total Mensagens</th>
	        <th>Cliente</th>
	        <th>Mensagems</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="p" items="${listagem}">
		      <tr>
				<td>${p.id}</td>
		        <td>${p.descricao}</td>
		        <td>${p.dataHoraInicio}</td>
		        <td>${p.totalMensagens}</td>
		        <td>${p.cliente.razaoSocial}</td>
		        <td>${p.mensagens.size()}</td>
		        <td><a href="/campanha/${p.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>