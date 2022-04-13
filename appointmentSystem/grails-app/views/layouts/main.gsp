<!doctype html>
<html lang="en" class="no-js">
<head>
<style>
button {
  background-color: #3e9dc9;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 20px;
  cursor: pointer;
  width: 150px;
}

body {
 background-color: #4fc7ff;
}

</style>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark navbar-static-top" role="navigation">
	<div class="row">
 		<asset:image src="banner.jpg" width="1700" height="200"/>
 	</div>
	<div class="title">
		<title>Welcome to the surgery management system!</title>
	</div>
</nav>

<button type="button">
	<g:recepLoginToggle/>
</button>
<br/>
<br/>
<button type="button">
	<g:docLoginToggle/>
</button>
<g:layoutBody/>


<div class="footer" role="contentinfo">
    <div class="container-fluid">
        <div class="row">
            <div class="col">
                <a href="http://guides.grails.org" target="_blank">
                    <asset:image src="advancedgrails.svg" alt="Grails Guides" class="float-left"/>
                </a>
                <strong class="centered"><a href="http://guides.grails.org" target="_blank">Grails Guides</a></strong>
                <p>Building your first Grails app? Looking to add security, or create a Single-Page-App? Check out the <a href="http://guides.grails.org" target="_blank">Grails Guides</a> for step-by-step tutorials.</p>

            </div>
            <div class="col">
                <a href="http://docs.grails.org" target="_blank">
                    <asset:image src="documentation.svg" alt="Grails Documentation" class="float-left"/>
                </a>
                <strong class="centered"><a href="http://docs.grails.org" target="_blank">Documentation</a></strong>
                <p>Ready to dig in? You can find in-depth documentation for all the features of Grails in the <a href="http://docs.grails.org" target="_blank">User Guide</a>.</p>

            </div>
            <div class="col">
                <a href="https://slack.grails.org" target="_blank">
                    <asset:image src="slack.svg" alt="Grails Slack" class="float-left"/>
                </a>
                <strong class="centered"><a href="https://slack.grails.org" target="_blank">Join the Community</a></strong>
                <p>Get feedback and share your experience with other Grails developers in the community <a href="https://slack.grails.org" target="_blank">Slack channel</a>.</p>
            </div>
        </div>
    </div>
</div>

<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
