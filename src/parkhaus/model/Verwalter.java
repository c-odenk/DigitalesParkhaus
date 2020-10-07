
//Erstellt von Emre Türker (etuerk2s)

package parkhaus.model;

import parkhaus.interfaces.VerwalterIF;

public class Verwalter implements VerwalterIF
{
	private int offenVon;
	private int offenBis;
	private int max;
	private float preisMitarbeiter;
	private float preisKunde;
	private boolean changed = false;
	
	public Verwalter()
	{
	}
	
	public void setOpen(int set)
	{
		offenVon = set;
	}
	
	public void setClosed(int set)
	{
		offenBis = set;
	}
	
	public void setPreisMitarbeiter(float set)
	{
		preisMitarbeiter = set;
	}
	
	public void setPreisKunde(float set)
	{
		preisKunde = set;
	}
	
	public void setMax(int set)
	{
		max = set;
	}
	
	public void setChange()
	{
		changed = !changed;
	}
	
	public int getOpen()
	{
		return offenVon;
	}
	
	public int getClosed()
	{
		return offenBis;
	}
	public int getMax()
	{
		return max;
	}
	public float getPreisMitarbeiter()
	{
		return preisMitarbeiter;
	}
	public float getPreisKunde()
	{
		return preisKunde;
	}
	
	public boolean getChanged()
	{
		return changed;
	}

}
