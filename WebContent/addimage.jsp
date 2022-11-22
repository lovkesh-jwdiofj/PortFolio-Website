<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Header Image</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<style type="text/css">
body{
    background: -webkit-linear-gradient(left, #cc2b5e   , #753a88);    
}
.contact-form{
    background: #fff;
    margin-top: 10%;
    margin-bottom: 5%;
    width: 70%;
}
.contact-form .form-control{
    border-radius:1rem;
}
.contact-image{
    text-align: center;
}
.contact-image img{
    border-radius: 6rem;
    width: 11%;
    margin-top: -3%;
    transform: rotate(29deg);
}
.contact-form form{
    padding: 14%;
}
.contact-form form .row{
    margin-bottom: -7%;
}
.contact-form h3{
    margin-bottom: 8%;
    margin-top: -10%;
    text-align: center;
    color: #0062cc;
}
.contact-form .btnContact {
    width: 50%;
    border: none;
    border-radius: 1rem;
    padding: 1.5%;
    background: #dc3545;
    font-weight: 600;
    color: #fff;
    cursor: pointer;
}
.btnContactSubmit
{
    width: 50%;
    border-radius: 1rem;
    padding: 1.5%;
    color: #fff;
    background-color: #0062cc;
    border: none;
    cursor: pointer;
    
}
</style>
</head>
<body>

<div class="container contact-form">
            <div class="contact-image">
                <img src="https://image.ibb.co/kUagtU/rocket_contact.png" alt="rocket_contact"/>
            </div>
            <form action="AddImage" method="post" enctype="multipart/form-data">
                <h3 >Add header Image</h3>
               <div class="row">
                    <div class="col-md-6">
                        <div class="form-group">
                           <input type="text" name="name"  style="margin-left: 170px;text-align: center;" class="form-control" placeholder="Enter Project Name">
                        </div>
                        <div class="form-group">
                           <input type="file" name="file"  style="margin-left: 170px" class="form-control" ">
                        </div>
                       
                        <div class="form-group">
                            <input type="submit" name="btnSubmit" class="btnContact" value="Add" style="margin-left: 250px ; margin-top: 20px" />
                        </div>
                    </div>
                   
                </div>
            </form>
</div>

</body>
</html>