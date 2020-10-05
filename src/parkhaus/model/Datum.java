

// Erstellt von Christopher (codenk2s): KLASSE ZEIT

package parkhaus.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datum {
	
	// ###### ERSTELLT EIN ZEITOBJEKT
	
	Date datum = new Date();
	
	// ###### FORMATE ANLEGEN
	
	SimpleDateFormat zeitFormat  = new SimpleDateFormat("hh:mm:ss");
	SimpleDateFormat datumFormat = new SimpleDateFormat("dd.mm.yyy");
	
	// Es lässt sich auch der aktuelle Wochentag anzeigen -> xxx = ew SimpleDateFormat("EEEE");
	
	
	// #### TEST METHODE
	
	public Date testDate () {
		return datum;
	}
	
	public static String test () {
		return "test";
	}
	
	public static String datumToString() {
		return "DatumToString";
	}
	
}
