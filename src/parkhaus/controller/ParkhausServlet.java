

// Erstellt von Christopher (codenk2s): Parkhaus Servlet

package parkhaus.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import parkhaus.model.Multiplier;



@WebServlet("/ParkhausServlet")

public class ParkhausServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// ###### VARIABLEN ERSTELLEN
	
	private int offenVon;
	private int offenBis;
	
	// private int parkplatzMax;
	
	// private float preisKunde;
	// private float preisMitarbeiter;

	
    public ParkhausServlet() {
        super();
    }
    
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	// Schritt 1: REFERENZEN AUF MODEL ERSTELLEN
    	
    	// Multiplier multiplier = new Multiplier();
    	 
    	// Schritt 2: DATEN ERHALTEN & SPEICHERN (von index.jsp form)
		
		offenVon = Integer.parseInt(request.getParameter("inputOpen"));
		offenBis = Integer.parseInt(request.getParameter("inputClose"));
		
		// parkplatzMax = Integer.parseInt(request.getParameter("inputParkMax"));
		
		// preisKunde = Float.parseFloat(request.getParameter("inputPreisKunde"));
		// preisMitarbeiter = Float.parseFloat(request.getParameter("inputPreisMitarbeiter"));
		
		
		// DEFINIERE ATTRIBUT - WERT PAARE
		
		// request.setAttribute("offenVon", offenVon);
		// request.setAttribute("offenBis", offenBis);
	
		
		// Schritt 3: DATENVERARBEITUNG DURCH MODELS MITTELS SCHNITTSTELLEN	
		
		// offenVon = multiplier.multi(offenVon);
		
		
		// Schritt 4: VERARBEITETE DATEN AN VIEW (dashboard.jsp) ZURÜCKGEBEN 	
		
		RequestDispatcher dispatcherToView = request.getRequestDispatcher("dashboard.jsp");
		dispatcherToView.forward(request, response);

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
