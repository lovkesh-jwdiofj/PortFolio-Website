<%@page import="com.dao.*"%>
<%@page import="com.pojo.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Education</title>

<style type="text/css">
.styled-table {
    border-collapse: collapse;
    margin: 25px 0;
    font-size: 0.9em;
    font-family: sans-serif;
    min-width: 400px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
}

.styled-table thead tr {
    background-color: #009879;
    color: #ffffff;
    text-align: left;
}

.styled-table th,
.styled-table td {
    padding: 12px 15px;
}

.styled-table tbody tr {
    border-bottom: 1px solid #dddddd;
}

.styled-table tbody tr:nth-of-type(even) {
    background-color: #f3f3f3;
}

.styled-table tbody tr:last-of-type {
    border-bottom: 2px solid #009879;
}

.styled-table tbody tr.active-row {
    font-weight: bold;
    color: #009879;
}

h1{
	text-align: center;
	 font-family: sans-serif;
	   font-weight: bold;
    color: #009879;
}

button {
	border-radius: 5px;
	border-color: white;
	background-color: #009879;
	color: white;
	height: 30px;
	width: 60px;
}

.button:hover
{
	color: white;
}

.container
{
display: flex;
align-items: center;
justify-content: center;
}


</style>

</head>
<body>
<h1>View Education</h1>

<section>
<div class="container">
<table class="styled-table" style="width: 1500px;">
    <thead>
        <tr>
            <th>Year</th>
            <th>Title</th>
            <th>Sub-Title</th>
            <th>Description</th>
            <th></th>
        </tr>
    </thead>
    
<% 
Read r = new Read();
	ArrayList<Education> al =r.readEdu();
	
	for(Education m : al)
	{
%>
    
    <tbody>
        <tr class="active-row">
            <td><%=m.getYear() %></td>
            <td><%=m.getTitle() %></td>
            <td><%=m.getSubtitle() %></td>
             <td><%=m.getDescription() %></td>
          
          
          <form action="DeleteEducation" method="post">
          <input type="hidden" name="year" value="<%=m.getYear()%>">
            <td><button style="cursor: pointer;">Delete</button></td>
          </form>
          
          
        </tr>
        <!-- and so on... -->
    </tbody>
    
    
    <%} %>
    
</table>
</div>
</section>


</body>
</html>