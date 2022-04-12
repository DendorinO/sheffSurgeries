<!doctype html>
<html>
<head>

<style>

button {
  background-color: #008c89;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 20px;
  cursor: pointer;
  width: 250px;
}

h1 {
 text-align: center;
 background-color: #008c89;
}

p {
 text-align: center;
 background-color: #008c89;
}

body {
 background-color: #006966;
}

</style>
</head>

<nav class="navbar navbar-expand-lg navbar-dark navbar-static-top" role="navigation">
	<div class="row">
 		<asset:image src="banner.jpg" width="1700" height="200"/>
 	</div>
</nav>


<body>

<h1> Welcome </h1>

<div class="second">

<p>Click on the buttons to be taken to the appropriate form!</p>

<button type="button">
	<g:link controller="prescription" action="create"> Create a new Prescription </g:link>
</button>

<br/>

<button type="button">
<g:link controller="prescription" action="list"> List Prescriptions </g:link>
</button>

<br/>

<button type="button">
<g:link controller="patient" action="list"> List Patients </g:link>
</button>

<br/>

<button type="button">
<g:link controller="appointment" action="list"> List Appointments </g:link>
</button>

</div>

</body>
