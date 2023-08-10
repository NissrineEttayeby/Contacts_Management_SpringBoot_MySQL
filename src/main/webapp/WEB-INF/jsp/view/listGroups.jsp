<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>registration form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">

<style>
h3 {
	margin-top: 20px;
}

#navbarNav div {
	height: 0;
}

#navbarNav form {
	margin: 0;
	padding: 0;
}

form {
	margin-bottom: 60px;
	margin-top: 10px;
	padding: 10px;
}
</style>


</head>
<body>
	<div class="container">



		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page"
						href="${pageContext.request.contextPath}/showForm">Home</a></li>





					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/showForm">Add Contacts
					</a></li>
					
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/manageContacts">Manage Contacts </a></li>
					
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/addGroup">Add Groups
					</a></li>
							
					<li class="nav-item"><a class="nav-link"
						href="${pageContext.request.contextPath}/manageGroups">Manage Groups
					</a></li>
					
					<li class="nav-item"><form
							action="${pageContext.request.contextPath}/searchGroup"
							class="d-flex" method="POST">
							<input name="nom" class="form-control me-2" type="search"
								placeholder="group" aria-label="Search">
							<button class="btn btn-outline-success" type="submit">Search</button>
						</form></li>

					<li class="nav-item"><form
							action="${pageContext.request.contextPath}/searchContact"
							class="d-flex" method="POST">
							<input name="nid" class="form-control me-2" type="search"
								placeholder="contact" aria-label="Search">
							<button class="btn btn-outline-success" type="submit">Search</button>
						</form></li>
					<li class="nav-item"><form
							action="${pageContext.request.contextPath}/searchContactPer"
							class="d-flex" method="POST">
							<input name="phone1" class="form-control me-2" type="search"
								placeholder="Numéro personnel" aria-label="Search">
							<button class="btn btn-outline-success" type="submit">Search</button>
						</form></li>
					<li class="nav-item"><form
							action="${pageContext.request.contextPath}/searchContactPro"
							class="d-flex" method="POST">
							<input name="phone2" class="form-control me-2" type="search"
								placeholder="Numéro professionel" aria-label="Search">
							<button class="btn btn-outline-success" type="submit">Search</button>
						</form></li>

				</ul>

			</div>

		</nav>



		<div>
			<h3>Liste des Groupes</h3>
		</div>

		<div>

			<table class="table">
				<thead>
					<tr>
						<th scope="col">Nom_Groupe</th>
						<th scope="col">Members</th>
						
					</tr>
					
				</thead>
				<c:forEach items="${groupeList}" var="gr">
					<tr>
						<td><c:out value="${gr.nomGroup}" /></td>
						<td><c:out value="${gr.members}" /></td>
	
						

						<td>
							<ul>
								<li><a href="addGroupContacts/${gr.idGroup}">Add Contact</a></li>
								<li><a href="deleteGroup/${gr.idGroup}">Delete</a></li>
<!-- 								/{idGroup} -->
							</ul>
						</td>

					</tr>

				</c:forEach>

			</table>
		</div>
	</div>
</body>
</html>