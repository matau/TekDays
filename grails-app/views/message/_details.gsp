<div class="dialog">
	<table>
		<tr class="props">
			<td valign="top" class="name">Subject:</td>
			<td valign="top" class="value">
				${fieldValue(bean: messageInstance, field: 'subject')}
			</td>
		</tr>
		<tr class="props">
			<td valign="top" class="name">Content:</td>
			<td valign="top" class="value">
				${fieldValue(bean: messageInstance, field: 'content')}
			</td>
		</tr>		
		<tr class="props">
			<td valign="top" class="name">Author:</td>
			<td valign="top" class="value">
				<g:link controller="tekUser" action="show" id="${messageInstance?.author?.id}">
					${messageInstance?.author?.encodeAsHTML()}
				</g:link>
			</td>
		</tr>
	</table>
	<div class="buttons">
		<span class="menuButton">
			<g:link class="create" action="reply" id="${messageInstance.id}">
				Reply
			</g:link>
		</span>
	</div>
</div>