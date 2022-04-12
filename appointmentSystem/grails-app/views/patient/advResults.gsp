<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Surgery Management System - Advanced Search</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
<div class="row">
    <h1>Surgery Management System</h1>
<h3>Advanced Results</h3>
<p>Searched

for students matching <em>${term}</em>.

Found<strong>${patients.size()}</strong>patients.

</p>
<ul>

    <g:each var="patient" in="${patients}">

    <li><g:link controller="patient" action="show" id="${patient.id}">${patient.patientName}</g:link></li>

    </g:each>
</ul>
<g:link action='advSearch'>Search Again</g:link>
</div>
</body>
</html>
