

// Erstellt von Christopher (codenk2s): KLASSE ZEIT

package parkhaus.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datum {
	
	 // ###### ERSTELLT EIN ZEITOBJEKT
	
	static Date datum = new Date();
	
	// ###### FORMATE ANLEGEN
	
	static SimpleDateFormat zeitFormat  = new SimpleDateFormat("HH:mm:ss");
	static SimpleDateFormat datumFormat = new SimpleDateFormat("dd.MM.yyy");
	
	// Es lässt sich auch der aktuelle Wochentag anzeigen -> xxx = ew SimpleDateFormat("EEEE");
	
	
	// #### TEST METHODE
	
	public static String test () {
		return "test";
	}
	
	// #### AUSGABEMETHODEN
	
	public static String zeitToString() {
		return zeitFormat.format(datum);
	}
	
	public static String datumToString() {
		return datumFormat.format(datum);
	}
	
}
