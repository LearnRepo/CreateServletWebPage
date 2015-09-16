/**
 * 
 */
function getUserLogin()
{
	var property="<%=session.getAttribute("name")%>";
	document.write("Welcome User in javascript"+property);
}