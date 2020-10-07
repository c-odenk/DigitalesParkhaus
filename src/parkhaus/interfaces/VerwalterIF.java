
//Erstellt von Emre Türker (etuerk2s)

package parkhaus.interfaces;

public interface VerwalterIF 
{
	public void setOpen(int set);
	
	public void setClosed(int set);
	
	public void setMax(int set);
	
	public void setPreisMitarbeiter(float set);
	
	public void setPreisKunde(float set);
	
	public int getOpen();
	
	public int getClosed();
	
	public int getMax();
	
	public float getPreisMitarbeiter();
	
	public float getPreisKunde();
}
