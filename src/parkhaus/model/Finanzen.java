

// Erstellt von Christopher (codenk2s): Finanzen zum errechnen der Umsätze und übermittlung ans Finanzamt

package parkhaus.model;
import parkhaus.interfaces.FinanzenIF;

public class Finanzen implements FinanzenIF {
	
	// #### VARIABLEN
	
	private double preisKunde;
	private double preisMitarbeiter;
	
	
	/* Zum errechnen der Umsatzsteuer und dem Gewinn haben wir fiktive aber dennoch realitätsnahe Kosten kalkuliert */
	
	private double kostenFix;
	private double kostenPersonal;
	private double kostenAbschreibungen;
	
	private final double umsatzsteuer = 0.19;
	
	
	// ###### KONSTRUKTOR
	
	
	
	// ###### SET METHODEN

	public void setPreisKunde() {
		// Nimmt den Preis von Servlet an. Servlet erhält den Preis von index.jsp
		
	}

	public void setPreisMitarbeiter() {
		// Nimmt den Preis von Servlet an. Servlet erhält den Preis von index.jsp		
	}
	
	
	// ###### GET METHODEN
	
	public double getPreisKunde() {
		// Gibt die Parkgebühren für Kunden zurück
		return preisKunde;
	}
	
	public double getPreisMitarbeiter() {
		// Gibt die Parkgebühren für Mitarbeiter zurück
		return preisMitarbeiter;
	}
	
	
	// ###### METHODE ZUM ERRECHNEN DER UMSATZSTEUER
	
	public double getUst() {
		// Nimmt einen Umsatz an und errechnet die Umsatzsteuer
		
		return 1.19;
	}


}
