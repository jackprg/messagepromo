<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de Campanhas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">

		<h2>Campanha</h2>
		<form action="/campanha/incluir" method="post">
			<div class="form-group">
				<label>Descrição:</label> <input type="text" class="form-control"
					placeholder="Entre com a descrição" name="descricao">
			</div>

			<div class="form-group">
				<label>Data Hora Inicio:</label> <input type="datetime-local" class="form-control"
					placeholder="Entre com a data da campanha" name="dataHoraInicio">
			</div>

			<div class="form-group">
				<label>Total Mensagens:</label> <input type="number"
					class="form-control" placeholder="Entre com total de mensgens"
					name="totalMensagens" value="0">
			</div>


			<div class="form-group">
				<label>Cliente:</label> <select name="clienteid" class="form-control">
					<c:forEach var="c" items="${clientes}">
						<option value="${c.id}">${c.razaoSocial}</option>
					</c:forEach>
				</select>
			</div>

			<div class="form-group">
				<label>Mensagens:</label>
				<c:forEach var="m" items="${mensagens}">
					<div class="form-check">
						<input class="form-check-input" type="checkbox" name="mensagemid"
							value="${m.id}"> <label class="form-check-label">
							${m.nomeDestinatario}</label>
					</div>
				</c:forEach>
			</div>

			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>

	</div>
</body>
</html>