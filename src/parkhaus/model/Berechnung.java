
//Erstellt von Emre (etuerk2s)

package parkhaus.model;

import java.util.ArrayList;
import java.util.List;

import parkhaus.interfaces.BerechnungIF;

public class Berechnung extends AbstractPublisher implements BerechnungIF
{
	List<Float> costs = new ArrayList<>();
	Finanzen f = new Finanzen();
	
	public Berechnung()
	{
		super();
	}
	
	public void addCost(float cost)
	{
		costs.add(cost);
		update();       //alle Views aktualisieren nachdem Liste verändert wurde
	}
	
	public List<Float> getCosts()
	{
		return costs;
	}
	
	public int getSize()
	{
		return costs.size();
	}
}