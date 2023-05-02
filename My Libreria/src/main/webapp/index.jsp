<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
<meta name="autor" content="Victoria Sevilla">
<meta charset="UTF-8">
<title>My Libreria</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>  
 <link rel="icon" href="img/libros.png">
 
 

 </head><body>
 <div class="container m-5 border border-4 btn btn-primary-emphasis text-center">
 <div class="conatiner">
 <h2>Registro De Libros</h2>
 <form action="Controller" method="get" class="form-control needs-validation btn btn-secondary" novalidate>
	<div class="form-group">
	<label for="titulo" class="label-group">Título</label>
	<input type="text" name="titulo" class="form-control" required pattern="[[a-zA-ZáéíóúÁÉÍÓÚÑ ]+" maxlength="50">
	<label for="autor" class="label-group">Autor</label>
	<input type="text" name="autor" class="form-control" required pattern="[[a-zA-ZáéíóúÁÉÍÓÚÑ ]+" maxlength="50">
	<label for="isbn" class="label-group">ISBN</label>
	<input type="text" name="isbn" class="form-control" required pattern="[[0-9]{13} ]+"minlength="13">
	<label for="cantidad" class="label-group">Unidades</label>
	<input type="text" name="cantidad" class="form-control" required pattern="[0-9]{9}[9-500]{500} ">
	<label for="descripcion" class="label-group">Sipnosis</label>
    <textarea type="text" name="descripcion" class="form-control" required pattern="[a-zA-ZáéíóúÁÉÍÓÚÑ ]+" maxlength="500"></textarea>
	</div>
		<input type="submit" name="enviar" value="Aceptar" class="btn btn-danger border-3 border-dark">
	</form>
	<c:if test="${not empty mensg}">
      <div class="my-4 bg-ligth">
      <c:out value="${mensg}"/>
      </div>
</c:if>
<c:if test="${not empty titulo}">
<table class="table table-striped table-info">
  	 <tr class="table-primary">
		      <th>ID</th>
		      <th>Título</th>
		      <th>Autor</th>
		      <th>ISBN</th>
		      <th>Unidades</th>   
		      <th>Acciones</th>   
		      
     </tr>	
     	
      <c:forEach items="${titulo}" var="libroN">
       <tr>
           <td><c:out value="${libroN.idF}"></c:out></td>
           <td><c:out value="${libroN.nombre}"></c:out></td>
           <td><c:out value="${libroN.autor}"></c:out></td>
           <td><c:out value="${libroN.isbn}"></c:out></td>       
           <td><c:out value="${libroN.cantidad}"></c:out></td>
           <td>
           <a href="#" class="h6">Editar&#9999;</a>
           <a href="#" class="h6">Borrar&#128465;</a>
           </td>
           </tr>
           </c:forEach>
	</table>
	</c:if>
</div>
<div class="conatainer">

</div>
</div>
<script src="<c:url value="js/script.js"/>"></script>




</body>
</html>
