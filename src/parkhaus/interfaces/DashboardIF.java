

//Erstellt von Christopher (codenk2s): Dashboard Interface

package parkhaus.interfaces;

public interface DashboardIF {
	
	// ###### SET METHODEN
	
	public static void setPreisKunde(float preis) {}
	public static void setPreisMitarbeiter(float preis) {}
	public static void seitZeit() {}
		
	// ###### GET METHODEN
	
	public float getPreisKunde();
	public float getPreisMitarbeiter();
	public int getParkplatzFrei();

}