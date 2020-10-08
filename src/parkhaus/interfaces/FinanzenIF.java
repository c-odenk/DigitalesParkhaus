

// Erstellt von Christopher (codenk2s): Finanzen Interface

package parkhaus.interfaces;

public interface FinanzenIF {
	
	// ###### SET METHODEN
	
	public void setPreisKunde(float preis);
	public void setPreisMitarbeiter(float preis);
	public void setUmsatz(float sum);
	
	// ###### GET METHODEN
	
	public double getPreisKunde();
	public double getPreisMitarbeiter();
	public double getUmsatzSteuer();
	public double getUmsatz();
	
	// ###### METHODEN FINANZAMT
	
	public double getUst();
	public double getKostenFix();
	public double getKostenPersonal();
	public double getGewinn();

}
