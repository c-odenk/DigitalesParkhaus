

// Erstellt von Christopher (codenk2s): Finanzen Interface

package parkhaus.interfaces;

public interface FinanzenIF {
	
	// ###### SET METHODEN
	
	public void setPreisKunde();
	public void setPreisMitarbeiter();
	
	// ###### GET METHODEN
	
	public double getPreisKunde();
	public double getPreisMitarbeiter();
	
	// ###### METHODEN FINANZAMT
	
	public double getUst();

}
