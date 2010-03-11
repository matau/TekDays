<html>
	<head>
		<title>Test Ajax</title>
		<g:javascript library="prototype"/>	
	</head>
	<body>
		<h1>Call service</h1>
		<g:remoteLink action="testajax" update="testoutput">
			Press me ...
		</g:remoteLink>
		
		<h3>Result</h3>
		<div id="testoutput">
		</div>
		
		<div id="sample">
			<g:backwards>Hello</g:backwards>	
		</div>
		
	</body>
</html>