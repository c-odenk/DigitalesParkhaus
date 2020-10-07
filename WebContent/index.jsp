
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
	<style><%@include file="/css/styles.css"%></style>
	
	<!-- FONT AWESOME -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
	
	
</head>
<body>
<!-- ################################################################################## -->
<!-- ##########                1. REIHE: LOGO & MEN�                         ########## -->

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
<!-- ##########                2. REIHE: CONTENT LANDING PAGE                ########## -->
  
<section class="landing-content">
	<div class="landing-content_col-1">
		<div class="landing-content_col-1_info-box">
			<p> Parkhaus von Projektgruppe #32. Es ist der <b> <%= Datum.datumToString() %> </b> <b> <%= java.util.Calendar.getInstance().getTime() %> </b> </p>
	    	<p> Geoeffnet von <b> 06 Uhr </b> bis <b> 24 Uhr </b>. Aktuell sind noch <b> 15 </b> von <b> 15 </b> Parkplaetzen frei. </p>
		</div>
	</div>
	
	<div class="landing-content_col-2">
		<div class="landing-content_col-2_form-box">
			<!-- <form action="dashboard.jsp" method="post"> -->
			<form action="ParkhausServlet" method="post">
				<div class="head">
					<h2> Oeffnungszeiten einstellen: </h2>
					<i class="fas fa-cog"></i>
				</div>
				<label> Oeffnungszeiten von: </label>
				<input type="number" name="inputOpen" placeholder="" value="6">
				<label> Oeffnungszeiten bis: </label>
				<input type="number" name="inputClose" placeholder="" value="24">
				
				<div class="head">
					<h2> Anzahl Parkplaetze einstellen: </h2>
					<i class="fas fa-cog"></i>
				</div>
				<label> Parkplaetze max: </label>
				<input type="number" name="inputParkMax" value="15">
				
				<div class="head">
					<h2> Preiskategorien einstellen: </h2>
					<i class="fas fa-cog"></i>
				</div>
				<label> Preis Mitarbeiter pro Stunde: </label>
				<input type="number" name="inputPreisMitarbeiter" value="6.50">
				<label> Preis Kunde pro Stunde: </label>
				<input type="number" name="inputPreisKunde" value="0">
				
				<input type="Submit" value="Simulation starten" class="send"> 
			</form>
		</div>
	</div>
</section>

<!-- ################################################################################## -->
<!-- ##########                3. REIHE: FOOTER                              ########## -->

<footer>
	<ul>
		<li><i class="fab fa-github"></i><a target="_blank" href="https://github.com/c-odenk/DigitalesParkhaus"> Git Repository </a></li>
		<li> Designed / Developed by: <a target="_blank" href="https://github.com/eturk28"> Emre </a> & <a target="_blank" href="https://github.com/c-odenk"> Christopher </a></li>
	</ul>
</footer>


</body>
</html>

