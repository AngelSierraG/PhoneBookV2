<%-- 
    Document   : interfaz_user_general
    Created on : 23/03/2015, 03:45:43 PM
    Author     : Dago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
	<meta charset="utf-8"/>
	<title>Phonebook</title>
		<link rel="stylesheet" href="view/css/layout.css" type="text/css" media="screen" />
		<link rel="stylesheet" href="view/css/chat.css" type="text/css" media="screen" />
	<script src="view/js/jquery-1.5.2.min.js" type="text/javascript"></script>
	<script src="view/js/hideshow.js" type="text/javascript"></script>
	<script src="view/js/jquery.tablesorter.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="view/js/jquery.equalHeight.js"></script>
	<script type="text/javascript">
	$(document).ready(function() 
    	{ 
      	  $(".tablesorter").tablesorter(); 
   	 } 
	);
	$(document).ready(function() {

	//When page loads...
	$(".tab_content").hide(); //Hide all content
	$("ul.tabs li:first").addClass("active").show(); //Activate first tab
	$(".tab_content:first").show(); //Show first tab content

	//On Click Event
	$("ul.tabs li").click(function() {

		$("ul.tabs li").removeClass("active"); //Remove any "active" class
		$(this).addClass("active"); //Add "active" class to selected tab
		$(".tab_content").hide(); //Hide all tab content

		var activeTab = $(this).find("a").attr("href"); //Find the href attribute value to identify the active tab + content
		$(activeTab).fadeIn(); //Fade in the active ID content
		return false;
	});

});
    </script>
    <script type="text/javascript">
    $(function(){
        $('.column').equalHeight();
    });
</script>

<body>
	<header id="header">
		<hgroup>
			<h1 class="site_title"><img src="images/phonebookLogo1.png" width="343" height="80"></h1>
			<h2 class="section_title"><!--texto --></h2><div class="btn_view_site"><a href="login.jsp">Iniciar sesión o Registrarse </a></div>
		</hgroup>
	</header> <!-- end of header bar -->
	
  <section id="secondary_bar">
		
		<div class="breadcrumbs_container">
		
	</div>
	</section><!-- end of secondary bar -->
	
	
	<section id="main" class="column">
		
		<%
              if(request.getAttribute("message")!=null){
                  out.println("<h4 class='alert_success'>"+request.getAttribute("message")+"</h4>");
              }else{
                  out.println("<h4 class='alert_info2'>Bienvenido a PhoneBook, para acceder necesitas Iniciar Sesion o Registrarte</h4>");
              }  
            %>
		
		
		
		<article class="module2 width_3_quarter">
		<header><h3 class="tabs_involved">Publicaciones más vistas</h3>
		</header>

		<div class="tab_container" >
			<div id="tab1" class="tab_content">
			
			</div><!-- end of #tab1 -->
			
			
			
		</div><!-- end of .tab_container -->
			
			
		
		
		</article><!-- end of content manager article -->
	
		<!-- end of messages article -->

		
			
			</section>


			<footer id="pie">
			<p><strong>Copyright &copy; 2015 Phonebook</strong></p>
			
		</footer>
		  <script type="text/javascript" src="view/js/chat.js"></script>   
          
</body>
<script>
   var Ver_Publicaciones = Ver_Publicaciones('');
         var x;
                    
                    function Ver_Publicaciones(message) {
                        $.ajax({
                        type: 'GET',
                        url: 'Ver_Publicacion.do',
                        data: {
                        message: message
                        }
                        }).done(function(resp){
                        $('#tab1').html(resp);
                        });
                        }
                        
                       
     
    
</script>

</html>

