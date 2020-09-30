
//Erstellt von Emre (etuerk2s)

package parkhausInterfaces;

import java.util.List;

import parkhausKlassen.Auto;

public interface EinweiserIF
{
	
	public int enter(Auto in);
	
	public Auto leave(Auto out);
	
	public void addCar(Auto in);
	
	public List<Auto> getCars();
	
	public int getSize();
	
	public int getMax();
}
