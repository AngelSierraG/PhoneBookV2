<%@page import="BaseDatos.AdministradorBD"%>
<%@page import="java.sql.ResultSet"%>
<!doctype html>
<html lang="en">

<head>
	<meta charset="utf-8"/>
	<title>Phonebook</title>
		<link rel="stylesheet" href="view/css/layout.css" type="text/css" media="screen" />
		<link rel="stylesheet" href="view/css/chat.css" type="text/css" media="screen" />
		<link rel="stylesheet" href="view/css/form.css" type="text/css" media="screen" />
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
    <%! String User;%>
    <%
        if(session.getAttribute("sesion_usuario")!=null && session.getAttribute("sesion_tipo").equals("0")){
          User = (String)session.getAttribute("sesion_usuario");
         
    %>
    <%
        String id = request.getParameter("id");
            AdministradorBD admi = new AdministradorBD();
            ResultSet rs = admi.Publicacion_a_editar(id);
           rs.next();
            String titulo = rs.getString("titulo");
            String FechaI = rs.getString("FechaInicio");
            String FechaF = rs.getString("FechaFinal");
            int Precio = rs.getInt("Precio");
            String Descripcion = rs.getString("Descripcion");
            String urlImage = rs.getString("urlImage");
            String modelo = rs.getString("nombremodelo");
            String marca = rs.getString("nombremarca");
        
         %>
	<header id="header">
		<hgroup>
			<h1 class="site_title"><a href="index.html"><img src="images/phonebookLogo1.png" width="343" height="80"></a></h1>
			<h2 class="section_title"><!--texto --></h2><div class="btn_view_site"><a href="#"><img src="images/icn_profile.png" width="20" height="20" style="margin-right: 5px;"><%=User%></a></div><a href="closeSession.do" style="color: black; margin-left: 11%" >Cerrar Sesion</a>
		</hgroup>
	</header> <!-- end of header bar -->
	
  <section id="secondary_bar">
		<div class="user">
		 
			<!-- <a class="logout_user" href="#" title="Logout">Logout</a> -->
	</div>
		<div class="breadcrumbs_container">
		
	</div>
	</section><!-- end of secondary bar -->
	
	<aside id="sidebar" class="column">
		<h2>Men�</h2>
		<hr/>
		<h3>Compras</h3>
		<ul class="toggle">
			<li class="icn_categories"><a href="http://localhost:8080/PhoneBook/interfaz_comprador.jsp">Publicaciones</a></li>
			
		</ul>
		<h3>Ventas</h3>
        
        
        	<ul class="toggle">
			<li class="icn_categories"><a href="http://localhost:8080/PhoneBook/interfaz_Vendedor.jsp">Mis Publicaciones</a></li>
            <li class="icn_new_article"><a href="http://localhost:8080/PhoneBook/interfaz_Vendedor_crearAnuncio.jsp">Crear Publicacion</a></li>
			
			
		</ul>
	

	</aside><!-- end of sidebar -->
	
	<section id="main" class="column">
		
		<h4 class="alert_info">Bienvenido a Phonebook</h4>
		
		
		
		<article class="module width_3_quarter">
		<header><h3 class="tabs_involved">Editar Publicacion</h3>
		</header>

		<div class="tab_container" >
			<div id="tab1" class="tab_content">
	<form class="contact_form" action="Editar_listar_publicaciones.do" method="post" enctype="multipart/form-data">
    <ul>
        <li>
            <input type="hidden" name="id" value="<%=id%>">
            <label for="name">Titulo:</label>
            <input type="text" name="titulo" value="<%=titulo%>" required />
        </li>
        <li>
        <%
           ResultSet rs2 = admi.marcas();
           
        %>
            <label for="email">Marca:</label>
            <select id="sel_marca" name="sel_marca" onchange="seleccion_marca(this.value);">
                <%
                while (rs2.next()){
                int idMarca = rs2.getInt("idMarca");
                String sel_marca = rs2.getString("NombreMarca");
                if(!sel_marca.equals(marca)){
                out.println("<option value='"+idMarca+"'>"+sel_marca+"</option>");
                }else{
                    out.println("<option value='"+idMarca+"' selected=\"selected\">"+sel_marca+"</option>");
                }
                
                        }
                rs.close();
                %>       
							</select>
        </li>
        <li>
            <label for="website">Modelo:</label>
			<select id="sel_modelo" name="sel_modelo">
								
							</select>
        </li>
        <li>
             <label for="name">Precio:</label>
            <input type="text" name="precio" placeholder="Ejemp: 100" required value="<%=Precio%>"/>
        </li>
        <li>

				<label>Fecha I.:</label><input type="date" name="fechaI" value="<%=FechaI%>">
			
        </li>
        <li>	
            <label>Fecha F.:</label><input type="date" name="fechaF" value="<%=FechaF%>">
			
        </li>
        <li>
            <label >Descripcion:</label>
            <textarea name="descripcion" cols="40" rows="6" required ><%=Descripcion%></textarea>
        </li>
        <li>
            <input style="margin-left: 50px;" width="150px" height="150px" type="image" src="BDImagenes_Usuarios/<%=urlImage%>" title="MaxImg">
            <label>Imagen:</label><p><input style="margin-left: 100px;" name="file" required="required" type="file"  /></p>
        </li>
        <li>
        	<button class="submit" type="submit">Editar</button><button type="button" class="submit" onclick="href();">Salir</button>
        </li>
    </ul>
</form>
			

			</div><!-- end of #tab1 -->
			
			
			
		</div><!-- end of .tab_container -->
		
		</article><!-- end of content manager article -->
	
		<article class="module width_quarter">
			<header><h3>Chats </h3></header>
			<div class="message_list">
				<div class="module_content">
					<input type="button" value="Chat con Miguel" onclick="javascript:chatWith(1,'Miguel')" class="btnInvitRequest"/>
					<input type="button" value="Chat con Luis" onclick="javascript:chatWith(2,'Luis')" class="btnInvitRequest"/>
					<input type="button" value="Chat con Juan" onclick="javascript:chatWith(3,'Juan')" class="btnInvitRequest"/>
				</div>
			</div>
			
		</article><!-- end of messages article -->
			
			</section>


			<footer>
			<p><strong>Copyright &copy; 2015 Phonebook</strong></p>
		
		</footer>
		  <script type="text/javascript" src="view/js/chat.js"></script> 
                  <script>
                      var sel_marca =  seleccion_marca_Inicio(document.getElementById("sel_marca").value,'<%=modelo%>');  
    
                function seleccion_marca_Inicio(idmarca,modelo){
                        $.ajax({
                        type: 'GET',
                        url: 'GetModelos.do',
                        data: {
                        idmarca: idmarca,
                        modelo: modelo
                        }
                        }).done(function(resp){
                        $('#sel_modelo').html(resp);
                        });
                        } 
                        
                   function seleccion_marca(idmarca){
                        $.ajax({
                        type: 'POST',
                        url: 'GetModelos.do',
                        data: {
                        idmarca: idmarca
                        }
                        }).done(function(resp){
                        $('#sel_modelo').html(resp);
                        });
                        } 
                        
                  function href(){
                      window.location="http://localhost:8080/PhoneBook/interfaz_Vendedor.jsp";
                  }      
    
                  </script>
          <%
        }else{
            response.sendRedirect("login.jsp");
            
        }
        %>
</body>

</html>