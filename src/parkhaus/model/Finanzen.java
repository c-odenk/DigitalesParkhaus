

// Erstellt von Christopher (codenk2s): Finanzen zum errechnen der Umsätze und übermittlung ans Finanzamt

package parkhaus.model;
import parkhaus.interfaces.FinanzenIF;

public class Finanzen implements FinanzenIF {
	
	// #### VARIABLEN
	
	private double preisKunde;
	private double preisMitarbeiter;
	private double umsatz;
	
	
	/* Zum errechnen der Umsatzsteuer und dem Gewinn haben wir fiktive aber dennoch realitätsnahe Kosten kalkuliert */
	
	private double kostenFix;
	private double kostenPersonal;
	private double kostenAbschreibungen;
	
	private final double umsatzsteuer = 0.19;
	
	
	// ###### KONSTRUKTOR
	
	
	
	// ###### SET METHODEN

	public void setPreisKunde(float preis) {
		// Nimmt den Preis von Servlet an. Servlet erhält den Preis von index.jsp
		preisKunde = preis;
	}

	public void setPreisMitarbeiter(float preis) {
		// Nimmt den Preis von Servlet an. Servlet erhält den Preis von index.jsp
		preisMitarbeiter = preis;
	}
	
	public void setUmsatz(float sum) {
		umsatz = sum;
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
	
	public double getUmsatzSteuer() {
		return umsatzsteuer;
	}
	
	public double getUmsatz() {
		return umsatz;
	}
	
	
	// ###### METHODE BERICHT FINANZAMT
	
	public double getUst() {
		// Nimmt einen Umsatz an und errechnet die Umsatzsteuer
		// getUmsatz * Umsatzsteuer in Prozent
		
		return getUmsatz() * getUmsatzSteuer();
	}
	
	public double getKostenFix () {
		// getUmsatz * kostenFix pauschale in Prozent
		return getUmsatz() * getPreisKunde();
	}
	
	public double getKostenPersonal() {
		// getUmsatz * kostenPersonal pauschale in Prozent
		return getUmsatz() * getPreisMitarbeiter();
	}
	
	
	public double getGewinn() {
		// getUmsatz - (getKostenFix + getKostenPersonal)
		return getUmsatz() - (getKostenFix() - getKostenPersonal());
	}


}
