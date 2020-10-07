
//Erstellt von Emre (etuerk2s)

package parkhaus.interfaces;
import java.util.List;

public interface BerechnungIF
{
	public void addCost(float cost);
	
	public List<Float> getCosts();
	
	public int getSize();
}
