package parkhaus.model;

public abstract class View 
{
	Berechnung model;
	
	public void subscribe(Berechnung m)  //View in die Berechnung hinzuf�gen
	{
		model = m;
		m.addView(this);
		update();
	}
	
	public abstract void update();
}