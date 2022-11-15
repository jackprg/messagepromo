<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de Cliente</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">

		<h2>Cliente</h2>
		<form action="/cliente/incluir" method="post">
			<div class="form-group">
				<label>Razão Social:</label> <input type="text" class="form-control"
					placeholder="Entre com a razão social" name="razaoSocial">
			</div>
			<div class="form-group">
				<label>CNPJ:</label> <input type="text" class="form-control"
					placeholder="Entre com o CNPJ" name="cnpj">
			</div>
			<div class="form-group">
				<label>Telefone:</label> <input type="text" class="form-control"
					placeholder="Entre com o telefone" name="telefone">
			</div>

			<div class="form-group">
				<label>Salvo Envio:</label> <input type="number"
					class="form-control" placeholder="Entre com o saldo para envios"
					name="saldoEnvio" value="0">
			</div>

			<div class="form-group">
				<div class="form-check">
					<input class="form-check-input" type="radio"
						name="ativo" id="flexRadioDefault1" checked> <label
						class="form-check-label" for="flexRadioDefault1">Ativo</label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio"
						name="ativo" id="flexRadioDefault2"> <label
						class="form-check-label" for="flexRadioDefault2">Inativo</label>
				</div>
			</div>


			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>

	</div>
</body>
</html>