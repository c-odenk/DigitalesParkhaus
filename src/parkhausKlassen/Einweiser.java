
//Erstellt von Emre (etuerk2s)

package parkhausKlassen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import parkhausInterfaces.EinweiserIF;

public class Einweiser implements EinweiserIF
{
	private int max = 15;
	private List<Auto> cars = new ArrayList<>();
	private int[] platzBelegt = new int[max];
	
	public Einweiser()
	{
		for(int i = 0; i < max; i++) //Markiere Parkplätze am Anfang als frei (0)
			platzBelegt[i] = 0;
	}

	public int enter(Auto in) 
	{
		int slot = 0;
		if(Arrays.stream(platzBelegt).allMatch(platz -> platz != 0)) //Parkhaus voll
		{
			return slot;
		}
		
		for(int i = 0; i < max; i++)
		{
			if(platzBelegt[i] == 0)
			{
				slot = i + 1;
				platzBelegt[i] = slot;
				in.setParkplatz(slot);
				addCar(in);
				break;
			}
		}
		return slot;
	}

	public Auto leave(Auto out) 
	{
		Auto tmp = getCars().stream().filter(car -> car.getParkplatz() == out.getParkplatz()).findFirst().get(); //Finde Auto im Parkhaus mit dem richtigen Parkplatz
		platzBelegt[tmp.getParkplatz() - 1] = 0; //Markiere Platz wieder als frei
		
		if(!cars.remove(tmp))
		{
			return null;
		}
		return tmp;
	}
	
	public void addCar(Auto in)
	{
		cars.add(in);
	}
	
	public List<Auto> getCars()
	{
		return cars;
	}
	
	public int getSize() 
	{
		return cars.size();
	}
	
	public int getMax()
	{
		return max;
	}
	
}
