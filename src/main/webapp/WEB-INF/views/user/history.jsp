<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>History</h1>
<h3>User history email = ${name}</h3>

  <c:forEach items = "${findParticularHistory}" var = "history">
<div class="container">
<div class="row">

<table class="table table-bordered">
<thead>
<tr>

<th>${history.name} </th>
<th>${history.price} </th>
<th>${history.date} </th>



</tr></thead></table></div></div>
</c:forEach> 