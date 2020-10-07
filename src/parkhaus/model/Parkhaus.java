//Erstellt von Emre (etuerk2s)

package parkhaus.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ParkhausServlet
 */
@WebServlet("/Parkhaus")
public class Parkhaus extends HttpServlet 
{
	private static final long serialVersionUID = 2L;
	private static int count = 0;
	private static String state = "Kunde";
	
	private Berechnung calc = new Berechnung();
	private Einweiser guide = new Einweiser();
	
	private SumView sum = new SumView();		//initialisiere die Views
	private AvgView avg = new AvgView();

    public Parkhaus() 
    {
    	super();
    	sum.subscribe(calc);				//Views in die Liste der Berechnung einfügen
    	avg.subscribe(calc);
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		
		String[] requestParam = request.getQueryString().split("=");
		String cmd = requestParam[0];
		
		String arg = requestParam[1];
		
		if("cmd".equals(cmd))
		{
			
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			String[] args = arg.split("&");
			
			switch(args[0])
			{
				case "Kunde":
					out.println("<h3> " + state + "</h3>"); //Gebe Kundenart des letzten eingefahrenen Kunden aus
					System.out.println("Letzter Kunde = " + state);
					break;
				case "sum":
					out.println(sum.view());
					System.out.println("sum = " + sum.view());
					break;
				case "avg":
					if(calc.getSize() > 0) //nicht durch null teilen
					{
						out.println(avg.view());
						System.out.println("average = " +  avg.view());
					} else {
						System.err.println("Nulldivision!");
					}
					break;
				case "count":
					out.println(count + " eingefahren");
					System.out.println(count + " eingefahren");
					break;
				default:
					System.out.println("Invalid command: " + args[0]);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String body = getBody(request);
		String[] params = body.split(",");
		if(params[0].equals("enter"))
		{
			state = params[8]; //Kundenart
			int platz = Integer.parseInt(params[7]); //Slot des einfahrenden Autos
			String ticket = params[5]; //Hash/Ticket des einfahrenden Autos
			
			int id = guide.enter(new Auto(platz, ticket)); //Zugewiesener Slot für Auto, wenn 0 ist Parkhaus voll
			if(id == 0) 
			{
				System.out.println("Voll!");
				response.getWriter().println("full");
			}
			else
			{
				System.out.println("Einfahrt in Platz: " + id);
				response.getWriter().println(id);
				count++;
			}
		}
		
		if(params[0].equals("leave")) //4tes Element sind die Kosten
		{
			int platz = Integer.parseInt(params[7]);
			String ticket = params[5]; 
			
			System.out.println("Ausfahrt vom Platz: " + platz);
			guide.leave(new Auto(platz, ticket));
			
			if(!params[8].equals("Mitarbeiter"))        //Mitarbeiter sollen nicht in die Berechnung einfliessen
			{
				calc.addCost(Float.parseFloat(params[4]));
			}
		}
		
		System.out.println(body);
	}

	private static String getBody(HttpServletRequest request) throws IOException //von Vorlesung, lese http-post-body
	{
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader bufferedReader = null;
		
		try
		{
			InputStream inputStream = request.getInputStream();
			if(inputStream != null)
			{
				bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
				char[] charBuffer = new char[128];
				int bytesRead = -1;
				while ((bytesRead = bufferedReader.read(charBuffer)) > 0)
				{
					stringBuilder.append(charBuffer, 0, bytesRead);
				}
			} 
			else 
			{
				stringBuilder.append("");
			}
		} 
		finally 
		{
			if (bufferedReader != null)
			{
				bufferedReader.close();
			}
		}
		
		return stringBuilder.toString();
	}

}
