package com.shad;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendMessage
 */
public class SendMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendMessage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String htmlCode = new String("");
		Enumeration paraName = request.getParameterNames();
		htmlCode="<html><body>\r<table border=1 id='sendmail'>";
		while(paraName.hasMoreElements())
		{
			String str = (String)paraName.nextElement();
			htmlCode+="<tr>";
			htmlCode+="<td>"+str+"</td>";
			htmlCode+="<td>"+request.getParameter(str)+"</td>";
			htmlCode+="</tr>";
		}
		htmlCode+="</table>\r</body></html>";
		out.print(htmlCode);
	}

}
