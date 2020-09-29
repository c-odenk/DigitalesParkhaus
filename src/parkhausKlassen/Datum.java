

// Erstellt von Christopher (codenk2s): KLASSE ZEIT

package parkhausKlassen;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datum {
	
	// ###### ERSTELLT EIN ZEITOBJEKT
	
	Date datumObjekt = new Date();
	
	// ###### FORMATE ANLEGEN
	
	SimpleDateFormat zeitFormat  = new SimpleDateFormat("hh:mm:ss");
	SimpleDateFormat datumFormat = new SimpleDateFormat("dd.mm.yyy");
	
	// Es lässt sich auch der aktuelle Wochentag anzeigen -> xxx = ew SimpleDateFormat("EEEE");

}
