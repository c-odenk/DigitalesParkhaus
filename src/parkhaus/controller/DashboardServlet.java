

// Erstellt von Christopher (codenk2s): Dashboard Servlet

package parkhaus.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
	
	// private int parkplatzMax;
	
	// private float preisKunde;
	// private float preisMitarbeiter;

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		
		// Schritt 1: Daten erhalten (von index.jsp form)
		
		offenVon = Integer.parseInt(request.getParameter("inputOpen"));
		offenBis = Integer.parseInt(request.getParameter("inputClose"));
		
		// parkplatzMax = Integer.parseInt(request.getParameter("inputParkMax"));
		
		// preisKunde = Float.parseFloat(request.getParameter("inputPreisKunde"));
		// preisMitarbeiter = Float.parseFloat(request.getParameter("inputPreisMitarbeiter"));
		
		
		// Definiere Attribut + Wert Paare
		
		request.setAttribute("offenVon", offenVon);
		request.setAttribute("offenBis", offenBis);
	
		
		
		// Schritt 2: Daten weiterleiten an div. Klassen
		
		// Schritt 3: Verarbeitete Daten an View (dashboard.jsp) zurückgeben	
		
		RequestDispatcher dispatcherToView = request.getRequestDispatcher("dashboard.jsp");
		dispatcherToView.forward(request, response);
		
	}

}
