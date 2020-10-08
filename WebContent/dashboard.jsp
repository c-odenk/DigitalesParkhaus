

<!-- Erstellt von Christopher (codenk2s): Index JSP -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ page import="parkhaus.controller.*" %>
<%@ page import="parkhaus.model.*" %>


<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title> PARKHAUS#32 </title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
	<!-- CUSTOM CSS -->
	<!-- <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css"> -->
	<style><%@include file="/css/styles.css"%></style>
	
	<!-- FONT AWESOME -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">

</head>
<body>

<!-- ################################################################################## -->
<!-- ##########                1. REIHE: LOGO & MENÜ                         ########## -->

<header>
	<nav>
		<h1><a href="#"><span class="big">Parkhaus</span><span class="small">#32</span></a></h1>
		<ul>
			<li><a href=""> Home </a></li>
			<li><a href=""> Dashboard </a></li>
		</ul>
	</nav>
</header>

<!-- ################################################################################## -->
<!-- ##########                2. REIHE: DASHBOARD ZWEISPALTIG               ########## -->

<section class="dashboard">

<% int free = (Integer) request.getAttribute("free"); %>

	<div class="dashboard_col-1">
	
		<div class="dashboard_col-1_rowBig">
		  <div class="head">
		    <h2>  Uebersicht Parkplaetze: </h2>
		    <i class="fas fa-info-circle"></i>
		  </div>
		  <div class="parkhaus">
		  
		      <ul>
		      <!--  HIER MUSS EINE SCHLEIFE IMPLEMENTIERT WERDEN DIE FÜR JEDEN PARKPLATZ SPÄTER EIN <li> IN EINER <ul> EINFÜGT  -->
		      	<%for(int i = 0; i < (Integer) request.getAttribute("max");i++) {
		      	  boolean slot = (Boolean) request.getAttribute("platz" + i);
		      	  if(slot) {%>
		      	  <li class="parkplatz  frei"></li> 
		    	  <% } else { %> 
		    	  <li class="parkplatz belegt"></li><%}
		      	}%>
		      	
		      </ul>
		  </div>
		</div>
		
	    <div class="dashboard_col-1_rowBig">
		  <div class="head">
		    <h2>  Uebersicht Parkhauskunden: </h2>
		    <i class="fas fa-info-circle"></i>
		  </div>
		  <div class="status-tabelle">
		    <table>
		      <thead>
		        <tr>
		          <th> Nr </th>
		          <th> Von </th>
		          <th> Bis </th>
		          <th> Dauer </th>
		          <th> Ticket </th>
		          <th> Preis </th>
		        </tr>
		      </thead>
		      
		      <!--  HIER MUSS EINE SCHLEIFE IMPLEMENTIERT WERDEN DIE FÜR JEDEN PARKENDEN SPÄTER EINE TABLE REIHE EINFÜGT  -->
		      <tbody>
		        <tr>
		          <td><%=request.getAttribute("count")%> </td>
		          <td> <%=request.getAttribute("von")%> </td>
		          <td> <%=request.getAttribute("bis")%>  </td>
		          <td> <%=request.getAttribute("dauer")%>  </td>
		          <td> <%=request.getAttribute("ticket")%>  </td>
		          <td> <%=request.getAttribute("preis")%>  </td>
		        </tr>
		      </tbody>
		    </table>
		  </div>
		</div>
	</div>
		
	<div class="dashboard_col-2">
	
		<div class="dashboard_col-2_rowBig">
		  <div class="head first">
		    <h2> Umsatz in Euro: </h2>
		    <ul>
		      <li><a href="#" onclick="showTag()"> Tag </a></li>
		      <li><a href="#" onclick="showWoche()"> Woche </a></li>
		      <li><a href="#"> Monat </a></li>
		      <li><a href="#"> Jahr </a></li>
		    </ul>
		    <i class="fas fa-info-circle"></i>
		 </div>
		 <canvas id="chartUmsatz"></canvas>
		</div>

		<div class="dashboard_col-2_rowBig">
		  <div class="head">
		    <h2> Parkhausauslastung in Prozent: </h2>
		    <i class="fas fa-info-circle"></i>
		   </div>
		   <input type="hidden" name="free" value='<%=(Integer) request.getAttribute("free") %>' >
		   <input type="hidden" name="occupied" value='<%=(Integer) request.getAttribute("occupied") %>' >
		   <canvas id="chartAuslastung"></canvas>
		</div>
		
		<div class="dashboard_col-2_rowBig">
		  <div class="rowBox">
		     <div class="head">
		       <h2> Parkdauer avg: </h2>
		       <i class="fas fa-info-circle"></i>
		     </div>
		     <p> 39.5min </p>
		  </div>
		  <div class="rowBox">
		     <div class="head">
		       <h2> Parkdauer max: </h2>
		       <i class="fas fa-info-circle"></i>
		     </div>
		     <p> <%= java.util.Calendar.getInstance().getTime() %> </p>
		  </div>
		  <div class="rowBox">
		     <a href="#popup-taxes"> Steuerabgabe <i class="fas fa-file-upload"></i></a>
		  </div>
		</div>
	</div>
</section>

<!-- ################################################################################## -->
<!-- ##########                3. REIHE: POP OP TAXES                        ########## -->

<section class="popup-taxes" id="popup-taxes">
	<div class="popup">
		<a href="ParkhausServlet" class="popup-close"> &times; </a>
		<table>
         <tr class="gray">
           <td> Parkhaus Umsatz </td>
           <td>  </td>
         </tr>
         <tr class="orange">
           <td> Umsatzsteuer </td>
           <td> Betrag </td>
         </tr>
         <tr>
           <td> - Fixkosten </td>
           <td> Betrag </td>
         </tr>
         <tr>
           <td> - Personalkosten </td>
           <td>  </td>
         </tr>
         <tr>
           <td> - Abschreibungen </td>
           <td> Betrag </td>
         </tr>
         <tr class="green">
           <td> Gewinn </td>
           <td> Betrag </td>
         </tr>
       </table>
	</div>
</section>

<!-- ################################################################################## -->
<!-- ##########                4. REIHE: FOOTER                              ########## -->

<footer>
	<ul>
		<li><i class="fab fa-github"></i><a target="_blank" href="https://github.com/c-odenk/DigitalesParkhaus"> Git Repository </a></li>
		<li> Designed / Developed by: <a target="_blank" href="https://github.com/eturk28"> Emre </a> & <a target="_blank" href="https://github.com/c-odenk"> Christopher </a></li>
	</ul>
</footer>

<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.js" integrity="sha512-s+xg36jbIujB2S2VKfpGmlC3T5V2TF3lY48DX7u2r9XzGzgPsa6wTpOQA7J9iffvdeBN0q9tKzRxVxw1JviZPg==" crossorigin="anonymous"></script>
<script src="js/my-charts.js"></script>
<br><br><br><br><br><br><br>
<head>
		<title>WebParkhaus</title>
		<script src="https://ccmjs.github.io/mkaul-components/parkhaus/versions/ccm.parkhaus-9.1.8.js"></script>
</head>
<body>
<ccm-parkhaus-9-1-8
		name="WebParkhaus"
		open_from=<%= request.getAttribute("offenVon") %>
		open_to=<%= request.getAttribute("offenBis") %>
		Max=<%= request.getAttribute("max") %>
		server_url="http://localhost:8080/DigitalesParkhaus/Parkhaus"
		extra_buttons='["Kunde", "sum", "avg", "count"]'
		client_categories='["Kunde","Familie","Mitarbeiter"]'
		price_factor='{"Kunde":<%= request.getAttribute("preisKunde") %>,"Familie":2,"Mitarbeiter":<%= request.getAttribute("preisMitarbeiter") %>}'
	></ccm-parkhaus-9-1-8>
</body>

</body>
</html>