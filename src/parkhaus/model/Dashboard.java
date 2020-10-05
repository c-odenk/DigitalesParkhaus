

// Erstellt von Christopher (codenk2s): Dashboard Klasse welche Interface implementiert

package parkhaus.model;
import parkhaus.interfaces.DashboardIF;

public class Dashboard implements DashboardIF {
	
	private float preisKunde;
	private float preisMitarbeiter;
	
	private static int parkplatzMax;

	// ###### SET METHODEN

	public void setPreisKunde(float preis) {
		// Parkgebühren für Kunden festlegen
		// Verändert float preisKunde und die Preisvariable für Kunden bei "Einweiser"
		
		preisKunde = preis;
		// Einweiser.setPreisKunde(preis);
	}

	public void setPreisMitarbeiter(float preis) {
		// Parkgebühren für Mitarbeiter festlegen
		// Verändert float preisKunde und die Preisvariable für Mitarbeiter bei "Einweiser"
		
		preisMitarbeiter = preis;
		// Einweiser.setPreisMitarbeiter(preis);
	}

	public void seitZeit() {
		// Öffnungszeiten festlegen
		
	}
	
	public void setParkplatzMax(int parkplaetze) {
		parkplatzMax = parkplaetze;
	}
	
		
	// ###### GET METHODEN
	
	public float getPreisKunde() {
		// Gibt die Parkgebühren für Kunden zurück
		
		return preisKunde;
	}
	
	public float getPreisMitarbeiter() {
		// Gibt die Parkgebühren für Mitarbeiter zurück
		
		return preisMitarbeiter;
	}
	
	public int getParkplatzFrei() {
		// Gibt die Anzahl an freien Parkplätzen zurück
		// Information hierüber wird später aus "Einweiser" erhalten
		
		return parkplatzMax;
		
	}
	
	public String testMethode() {
		return "testMethode";
	}
	
	// Muss um komplette Einnahmenfunktionalität erweitert werden. Kommt im nächsten push
	
}
