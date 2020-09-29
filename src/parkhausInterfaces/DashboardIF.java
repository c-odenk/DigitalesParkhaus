

//Erstellt von Christopher (codenk2s): Dashboard Interface

package parkhausInterfaces;

public interface DashboardIF {
	
	// ###### SET METHODEN
	
	public void setPreisKunde(float preis);
	public void setPreisMitarbeiter(float preis);
	public void seitZeit();
		
	// ###### GET METHODEN
	
	public float getPreisKunde();
	public float getPreisMitarbeiter();
	public void getParkplatzFrei();

}