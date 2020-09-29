

// Erstellt von Christopher (codenk2s): Dashboard Servlet

package parkhausServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// ###### VARIABLEN
	
	private int offenVon;
	private int offenBis;
	
	private int parkplatzMax;
	
	private float preisKunde;
	private float preisMitarbeiter;

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

		
		offenVon = Integer.parseInt(req.getParameter("inputOpen"));
		offenBis = Integer.parseInt(req.getParameter("inputClose"));
		
		parkplatzMax = Integer.parseInt(req.getParameter("inputParkMax"));
		
		preisKunde = Float.parseFloat(req.getParameter("inputPreisKunde"));
		preisMitarbeiter = Float.parseFloat(req.getParameter("inputPreisMitarbeiter"));
		

		PrintWriter out = res.getWriter();
		out.println("Werte: " + preisMitarbeiter + " .... " + preisKunde + " ... " + parkplatzMax + " ... " + offenVon + " ... "  + offenBis);
	}

}
