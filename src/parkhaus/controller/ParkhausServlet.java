

// Erstellt von Christopher (codenk2s): Parkhaus Servlet

package parkhaus.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import parkhaus.model.Verwalter;

@WebServlet("/ParkhausServlet")

public class ParkhausServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// ###### VARIABLEN ERSTELLEN
	private Verwalter verwalter = new Verwalter();
	
    public ParkhausServlet() {
        super();
    }
    
    private void processPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {	
    	String body = getBody(request);
		String[] params = body.split(",");
		System.out.println(body);
    
		// VERARBEITETE DATEN AN VIEW (dashboard.jsp) ZURÜCKGEBEN 
	
		RequestDispatcher dispatcherToView = request.getRequestDispatcher("dashboard.jsp");
		dispatcherToView.forward(request, response);

    }
    
    private void processGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {	
    	String body = getBody(request);
		String[] params = body.split(",");
		System.out.println(body);
    
		// VERARBEITETE DATEN AN VIEW (dashboard.jsp) ZURÜCKGEBEN 

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		processGet(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		if(!verwalter.getChanged())
		{
			verwalter.setOpen(Integer.parseInt(request.getParameter("inputOpen")));
			verwalter.setClosed(Integer.parseInt(request.getParameter("inputClose")));
			verwalter.setMax(Integer.parseInt(request.getParameter("inputParkMax")));
			verwalter.setPreisMitarbeiter(Float.parseFloat(request.getParameter("inputPreisMitarbeiter")));
			verwalter.setPreisKunde(Float.parseFloat(request.getParameter("inputPreisKunde")));
			
			request.setAttribute("offenVon", verwalter.getOpen());
			request.setAttribute("offenBis", verwalter.getClosed());
			request.setAttribute("max", verwalter.getMax());
			request.setAttribute("preisMitarbeiter", verwalter.getPreisMitarbeiter());
			request.setAttribute("preisKunde", verwalter.getPreisKunde());
			
			verwalter.setChange();
		}
		
		processPost(request, response);
	}

	private static String getBody(HttpServletRequest request) throws IOException //von Vorlesung, lese http-post-body
	{
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader bufferedReader = null;
		
		try
		{
			InputStream inputStream = request.getInputStream();
			if(inputStream != null)
			{
				bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
				char[] charBuffer = new char[128];
				int bytesRead = -1;
				while ((bytesRead = bufferedReader.read(charBuffer)) > 0)
				{
					stringBuilder.append(charBuffer, 0, bytesRead);
				}
			} 
			else 
			{
				stringBuilder.append("");
			}
		} 
		finally 
		{
			if (bufferedReader != null)
			{
				bufferedReader.close();
			}
		}
		
		return stringBuilder.toString();
	}

}
