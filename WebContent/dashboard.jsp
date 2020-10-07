

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

	<div class="dashboard_col-1">
	
		<div class="dashboard_col-1_rowBig">
		  <div class="head">
		    <h2>  Uebersicht Parkplaetze: </h2>
		    <i class="fas fa-info-circle"></i>
		  </div>
		  <div class="parkhaus">
		      <ul>
		        <li class="parkplatz belegt"> </li>
		        <li class="parkplatz belegt"> </li>
		        <li class="parkplatz frei"> </li>
		        <li class="parkplatz frei"> </li>
		        <li class="parkplatz belegt"> </li>
		        <li class="parkplatz frei"> </li>
		        <li class="parkplatz frei"> </li>
		        <li class="parkplatz belegt"> </li>
		        <li class="parkplatz belegt"> </li>
		        <li class="parkplatz belegt"> </li>
		        <li class="parkplatz frei"> </li>
		        <li class="parkplatz belegt"> </li>
		        <li class="parkplatz frei"> </li>
		        <li class="parkplatz belegt"> </li>
		        <li class="parkplatz belegt"> </li>
		        <li class="parkplatz frei"> </li>
		        <li class="parkplatz belegt"> </li>
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
		      <tbody>
		        <tr>
		          <td> 1 </td>
		          <td> YY </td>
		          <td> XX </td>
		          <td> YY </td>
		          <td> cb9f80f5e7ec08f485e94a484e79c774 </td>
		          <td> € 16.04 </td>
		        </tr>
		        <tr>
		          <td> 2 </td>
		          <td> YY </td>
		          <td> XX </td>
		          <td> YY </td>
		          <td> d0144c422ef40c6124c3dac3166aa942 </td>
		          <td> € 23.93 </td>
		        </tr>
		        <tr>
		          <td> 3 </td>
		          <td> YY </td>
		          <td> XX </td>
		          <td> YY </td>
		          <td> 6eb3cf9141e4e7854db680673c4e461f </td>
		          <td> € 79.68 </td>
		        </tr>
		        <tr>
		          <td> 4 </td>
		          <td> YY </td>
		          <td> XX </td>
		          <td> YY </td>
		          <td> cb9f80f5e7ec08f485e94a484e79c774 </td>
		          <td> € 16.04 </td>
		        </tr>
		        <tr>
		          <td> 5 </td>
		          <td> YY </td>
		          <td> XX </td>
		          <td> YY </td>
		          <td> d0144c422ef40c6124c3dac3166aa942 </td>
		          <td> € 23.93 </td>
		        </tr>
		        <tr>
		          <td> 6 </td>
		          <td> YY </td>
		          <td> XX </td>
		          <td> YY </td>
		          <td> 6eb3cf9141e4e7854db680673c4e461f </td>
		          <td> € 79.68 </td>
		        </tr>
		        <tr>
		          <td> 7 </td>
		          <td> YY </td>
		          <td> XX </td>
		          <td> YY </td>
		          <td> cb9f80f5e7ec08f485e94a484e79c774 </td>
		          <td> € 16.04 </td>
		        </tr>
		        <tr>
		          <td> 8 </td>
		          <td> YY </td>
		          <td> XX </td>
		          <td> YY </td>
		          <td> d0144c422ef40c6124c3dac3166aa942 </td>
		          <td> € 23.93 </td>
		        </tr>
		        <tr>
		          <td> 9 </td>
		          <td> YY </td>
		          <td> XX </td>
		          <td> YY </td>
		          <td> 6eb3cf9141e4e7854db680673c4e461f </td>
		          <td> € 79.68 </td>
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
		     <a href="#popup-taxes"> Steuerabgabe ermitteln <i class="fas fa-file-upload"></i></a>
		  </div>
		</div>
	</div>
</section>

<!-- ################################################################################## -->
<!-- ##########                3. REIHE: POP OP TAXES                        ########## -->

<section class="popup-taxes" id="popup-taxes">
	<div class="popup">
		<a href="dashboard.jsp" class="popup-close"> &times; </a>
		<table>
         <tr class="gray">
           <td> Parkhaus Umsatz </td>
           <td> Betrag €</td>
         </tr>
         <tr class="orange">
           <td> Umsatzsteuer </td>
           <td> Betrag €</td>
         </tr>
         <tr>
           <td> - Fixkosten </td>
           <td> Betrag €</td>
         </tr>
         <tr>
           <td> - Personalkosten </td>
           <td> Betrag €</td>
         </tr>
         <tr>
           <td> - Abschreibungen </td>
           <td> Betrag €</td>
         </tr>
         <tr class="green">
           <td> Gewinn </td>
           <td> Betrag €</td>
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

</body>
</html>