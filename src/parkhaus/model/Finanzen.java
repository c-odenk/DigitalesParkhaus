

// Erstellt von Christopher (codenk2s): Finanzen zum errechnen der Ums�tze und �bermittlung ans Finanzamt

package parkhaus.model;

public class Finanzen {
	
	// #### VARIABLEN
	
	private double preisKunde;
	private double preisMitarbeiter;
	
	private final double umsatzsteuer = 0.19;
	
	// ###### KONSTRUKTOR
	
	// ###### SET METHODEN
	
	// ###### GET METHODEN
	
	public double getPreisKunde() {
		// Gibt die Parkgeb�hren f�r Kunden zur�ck
		return preisKunde;
	}
	
	public double getPreisMitarbeiter() {
		// Gibt die Parkgeb�hren f�r Mitarbeiter zur�ck
		return preisMitarbeiter;
	}
	
	
	// ###### METHODE ZUM ERRECHNEN DER UMSATZSTEUER
	
	public double getUst() {
		// Nimmt einen Umsatz an und errechnet die Umsatzsteuer
	}

}
