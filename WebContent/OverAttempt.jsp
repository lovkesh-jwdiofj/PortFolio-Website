<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Waiting page</title>

<style type="text/css">
body{
  background-color:#2D3047;
}

div{
  color:#EFD0CA;
  font-size:30px;
  text-align:center;
}


.loader {
  border: 16px solid #f3f3f3; /* Light grey */
  border-top: 16px solid #3498db; /* Blue */
  border-radius: 50%;
  width: 100px;
  height: 100px;
  animation: spin 2s linear infinite;
}

@keyframes spin {
  0% { transform: rotate(0deg); }
  100% { transform: rotate(360deg); }
}
</style>




</head>
<body>

<h1 style="color: white;text-align: center;">Too many wrong attempts occured</h1>
<h2 style="color: white;text-align: center;">Please wait while we redirect you...</h2>

  <div>Time left = <span id="timer"></span>
  
<div>
  <script >
  
 
  
  
document.getElementById('timer').innerHTML =
	  01 + ":" + 00;
	startTimer();


	function startTimer() {
	  var presentTime = document.getElementById('timer').innerHTML;
	  var timeArray = presentTime.split(/[:]+/);
	  var m = timeArray[0];
	  var s = checkSecond((timeArray[1] - 1));
	  if(s==59){m=m-1}
	  if(m<0){
	    return
	  }
	  
	  document.getElementById('timer').innerHTML =
	    m + ":" + s;
	  console.log(m)
	  setTimeout(startTimer, 1000);
	  
	}

	function checkSecond(sec) {
	  if (sec < 10 && sec >= 0) {sec = "0" + sec}; // add zero in front of numbers < 10
	  if (sec < 0) {sec = "59"};
	if(sec==0)
		{
		window.location.replace("adminauth.jsp");
		}
	  return sec;
	}
	
	
	
	 
</script>
</div>


<span>
<div style="margin-left: 620px; margin-top: 50px"   class="loader"></div>
</span>






</body>
</html>