
//Erstellt von Emre (etuerk2s)

package parkhausKlassen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import parkhausInterfaces.EinweiserIF;

public class Einweiser implements EinweiserIF
{
	private int max = 10;
	private List<Auto> cars = new ArrayList<>();
	
	public Einweiser()
	{
	}

	public int enter(Auto in) 
	{
		int slot = 0;
		if(getSize() > getMax()) //Parkhaus voll
		{
			return slot;
		}
		
		for(int i = 0;i < getMax()*10; i++) 		//Generiere solange eine zuf�llige Zahl bis ein freier Parkplatz gefunden wird
		{
			int rand = (new Random()).nextInt(getMax() - 1 + 1) + 1;
			if(getCars().stream().map(car -> car.getParkplatz()).noneMatch(platz -> platz == rand))
			{
				slot = rand;
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
