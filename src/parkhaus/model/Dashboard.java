

// Erstellt von Christopher (codenk2s): Dashboard Klasse welche Interface implementiert

package parkhaus.model;
import parkhaus.interfaces.DashboardIF;

public class Dashboard implements DashboardIF {
	
	private float preisKunde;
	private float preisMitarbeiter;
	
	private static int parkplatzMax;

	// ###### SET METHODEN

	public void setPreisKunde(float preis) {
		// Parkgeb�hren f�r Kunden festlegen
		// Ver�ndert float preisKunde und die Preisvariable f�r Kunden bei "Einweiser"
		
		preisKunde = preis;
		// Einweiser.setPreisKunde(preis);
	}

	public void setPreisMitarbeiter(float preis) {
		// Parkgeb�hren f�r Mitarbeiter festlegen
		// Ver�ndert float preisKunde und die Preisvariable f�r Mitarbeiter bei "Einweiser"
		
		preisMitarbeiter = preis;
		// Einweiser.setPreisMitarbeiter(preis);
	}

	public void seitZeit() {
		// �ffnungszeiten festlegen
		
	}
	
	public void setParkplatzMax(int parkplaetze) {
		parkplatzMax = parkplaetze;
	}
	
		
	// ###### GET METHODEN
	
	public float getPreisKunde() {
		// Gibt die Parkgeb�hren f�r Kunden zur�ck
		
		return preisKunde;
	}
	
	public float getPreisMitarbeiter() {
		// Gibt die Parkgeb�hren f�r Mitarbeiter zur�ck
		
		return preisMitarbeiter;
	}
	
	public int getParkplatzFrei() {
		// Gibt die Anzahl an freien Parkpl�tzen zur�ck
		// Information hier�ber wird sp�ter aus "Einweiser" erhalten
		
		return parkplatzMax;
		
	}
	
	public String testMethode() {
		return "testMethode";
	}
	
	// Muss um komplette Einnahmenfunktionalit�t erweitert werden. Kommt im n�chsten push
	
}
