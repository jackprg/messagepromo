<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
	rel="stylesheet">
<title>Cadastramento de Cliente</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h3>Clientes: ${listagem.size()}</h3>

		<h4>
			<a href="/cliente">Novo cliente</a>
		</h4>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Razão Social</th>
					<th>CNPJ</th>
					<th>Telefone</th>
					<th>Saldo Envio</th>
					<th>Ativo</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="s" items="${listagem}">
					<tr>
						<td>${s.id}</td>
						<td>${s.razaoSocial}</td>
						<td>${s.cnpj}</td>
						<td>${s.telefone}</td>
						<td>${s.saldoEnvio}</td>
						<td>${s.ativo}</td>
						<td><a href="/cliente/${s.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>