<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/static/error/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Error</title>
    <!-- Bootstrap core CSS -->
    <link href="<%=basePath%>/css/bootstrap.css" rel="stylesheet">
    <!-- FONT AWESOME CSS -->
    <link href="<%=basePath%>/css/font-awesome.min.css" rel="stylesheet" />
    <!--GOOGLE FONT -->
 <link href='http://fonts.googleapis.com/css?family=Nova+Flat' rel='stylesheet' type='text/css'>
    <!-- custom CSS here -->
    <link href="<%=basePath%>/css/style.css" rel="stylesheet" />
</head>
<body>
    
   
    <div class="container">
      
          <div class="row pad-top text-center">
                 <div class="col-md-6 col-md-offset-3 text-center">
                  <h1>  What have you done? </h1>
                   
              <span id="error-link"></span>
                     <h2>! ERROR DECETED !</h2>
</div>
        </div>

            <div class="row text-center">
                 <div class="col-md-8 col-md-offset-2">
                     
                     <h3> <i  class="fa fa-lightbulb-o fa-5x"></i> </h3>
               
</div>
        </div>

    </div>
    <!-- /.container -->
  
  
    <!--Core JavaScript file  -->
    <script src="<%=basePath%>/js/jquery-1.10.2.js"></script>
    <!--bootstrap JavaScript file  -->
    <script src="<%=basePath%>/js/bootstrap.js"></script>
     <!--Count Number JavaScript file  -->
    <script src="<%=basePath%>/js/countUp.js"></script>
       <!--Custom JavaScript file  -->
    <script src="<%=basePath%>/js/custom_500.js"></script>
</body>
</html>
