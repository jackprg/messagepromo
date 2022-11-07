<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de SMS</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">

		<h2>SMS</h2>
		<form action="/sms/incluir" method="post">
			<div class="form-group">
				<label>Nome Destinatário:</label> <input type="text"
					class="form-control" placeholder="Entre com o nome do destinatário"
					name="nomeDestinatario">
			</div>
			<div class="form-group">
				<label>Conteúdo:</label> <input type="text" class="form-control"
					placeholder="Entre com o conteudo" name="conteudo">
			</div>
			<div class="form-group">
				<label>Data Envio:</label> <input type="text" class="form-control"
					placeholder="Entre com a data de envio" name="dataEnvio">
			</div>
			<div class="form-group">
				<label>Custo Envio:</label> <input type="number"
					class="form-control" placeholder="Entre com o custo do envio"
					name="custoEnvio" value="0">
			</div>



			<div class="form-group">
				<label>Telefone:</label> <input type="text" class="form-control"
					placeholder="Entre com o telefone" name="telefone">
			</div>
			<div class="form-group">
				<label>Operadora:</label> <input type="text" class="form-control"
					placeholder="Entre com a operadora" name="operadora">
			</div>
			<div class="form-group">
				<label>Texto:</label> <input type="text" class="form-control"
					placeholder="Entre com o texto" name="texto">
			</div>



			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>

	</div>
</body>
</html>