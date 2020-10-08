
// Erstellt von Christopher (codenk2s)

/* ==========================================================================
   JAVASCRIPT CHART SETTINGS
========================================================================== */


var chartUmsatzObject     = document.getElementById("chartUmsatz");
var chartAuslastungObject = document.getElementById("chartAuslastung");

var free = document.getElementById("free");
var occupied = document.getElementById("occupied");

var chartUmsatz = new Chart(chartUmsatzObject, {

  type: 'line',
  data: {
    labels: ["Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"],
    datasets: [{
      label: "Umsatz in Euro",
      backgroundColor: 'rgba(65, 105, 225, 0.4)',
      borderColor: 'rgba(65, 105, 225, 1)',
      data: ["43875", "45521", "35098", "49842", "53876", "31789", "58098", "59876", "62097", "42304", "45521", "35098"]
    }]
  },
  options: {
    scales: {
      yAxes: [{
        ticks: {
          beginAtZero: true
        }
      }]
    },
    legend: {
        display: false
    },
  }
});

var chartAuslastung = new Chart(chartAuslastungObject, {

  type: 'doughnut',
  data: {
    labels: ["Belegt", "Frei"],
    datasets: [{
      label: "Parkhausauslastung",
      backgroundColor: ["rgba(65, 105, 225, 1)", "#F5F5F5"],
      borderColor: '#fff',
      data: [free.value, occupied.value]
    }]
  }
});
