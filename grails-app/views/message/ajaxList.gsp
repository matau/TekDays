<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<meta name="layout" content="main"/>
		<g:javascript library="prototype"/>
		<title>Messages</title>
	</head>
	<body>
		<div class="nav">
			<span class="menuButton">
				<a class="home" href="${resource(dir:'')}">Home</a>
			</span>
			<span class="menuButton">
				<g:link class="create" action="create" params='[eventId:"${event?.id}"]'>New Message</g:link>
			</span>
		</div>	
	
		<div class="body">
			<h1>${event?.name} - Forum Messages</h1>
			<div id="messageList">
				<g:messageThread messages="${messageInstanceList}"/>
			</div>

			<h3>Message Detail</h3>
			<div id="details">
			</div>
		</div>
	</body>
</html>