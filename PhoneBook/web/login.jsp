

<!DOCTYPE html>
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title>Iniciar Sesi�n</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="view/css/demo.css" />
        <link rel="stylesheet" href="view/css/layout.css" type="text/css" media="screen" />
        <link rel="stylesheet" type="text/css" href="view/css/style3.css" />
		<link rel="stylesheet" type="text/css" href="view/css/animate-custom.css" />
        <link href="aboutPageStyle.css" rel="stylesheet" type="text/css">
    </head>
   
    
    <body>
        <div class="container">
            <div class="codrops-top">
                <div class="clr"></div>
            </div>
            <header>
	
    <div class="profileLogo"> 
        <p class="logoPlaceholder" style="background: #91BABC;"><img src="images/phonebookLogo1.png" height="50%"></div>
</header>
            <%
              if(request.getAttribute("message")!=null){
                  out.println("<h4 class='alert_success'>"+request.getAttribute("message")+"</h4>");
              }
            %>
            <section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form  action="Inicar_Registrar_Sesion.do"  method="post">
                              <h1>Iniciar Sesion</h1>
                              <p> 
                                <label for="username" class="uname" data-icon="u" > Ingresa email </label>
                                    <input id="username" name="user" required="required" type="text" placeholder="minombredeusuario o miemail@mail.com"/>
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p"> Ingresa contrase�a </label>
                                    <input id="password" name="pass" required="required" type="password" placeholder="Ej. X8df!90EO" /> 
                                </p>
                               
                              	<p id="divAjaxLogin">Phonebook</p>
                                <p class="login button"> 
                                    <input type="submit" value="Iniciar sesion"  /> 
								</p>
                                <p class="change_link">
									�Ya est�s registrado?
									<a href="#toregister" class="to_register">Crear una cuenta</a>
								</p>
                            </form>
                        </div>


<!-- crearUsuario() -->


                        <div id="register" class="animate form">
                            <form action="Inicar_Registrar_Sesion.do" method="get">
                            
                                <h1> Crear Usuario </h1> 
                                <!-- Nombre Usuario -->
                                <p>
                                    <label for="emailsignup" class="youmail" data-icon="e" > Tu email</label>
                                    <input id="email" name="emailRegistro" required="required" type="email" placeholder="miemail@mail.com"/> 
                                    
                                </p>    
                                <!-- Password -->
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" data-icon="p">Tu contrase�a </label>
                                    <input id="password1" name="passRegistro" required="required" type="password" placeholder="Ej. X8df!90EO"/>
                                </p>
                                 <p> 
                                    <label  class="uname" >Nombre:</label>
                                    <input id="nombre" name="nombre" required="required" type="text" placeholder="Nombre/s" />
                                </p>
                                 <p> 
                                    <label  class="uname" >Apellidos:</label>
                                    <input id="nombre" name="apellido" required="required" type="text" placeholder="Apellidos" />
                                </p>
                                <!-- Sexo -->    
                                <p>Estado: 
                                    <select name="estado" required="required">
                                           <option value="0">Selecciona un Estado</option>
                                          <!--  <option value="Aguascalientes">Aguascalientes</option>
                                            <option value="Baja California">Baja California</option>
                                            <option value="Baja California Sur">Baja California Sur</option>
                                            <option value="Campeche">Campeche</option>
                                            <option value="Coahuila">Coahuila de Zaragoza</option>
                                            <option value="Colima">Colima</option> -->
                                            <option value="Chiapas">Chiapas</option>
                                           <!-- <option value="Chihuahua">Chihuahua</option>
                                            <option value="Distrito Federal">Distrito Federal</option>
                                            <option value="Durango">Durango</option>
                                            <option value="Guanajuato">Guanajuato</option>
                                            <option value="Guerrero">Guerrero</option>
                                            <option value="Hidalgo">Hidalgo</option>
                                            <option value="Jalisco">Jalisco</option>
                                            <option value="Mexico">M�xico</option>
                                            <option value="Michoacan">Michoac�n de Ocampo</option>
                                            <option value="Morelos">Morelos</option>
                                            <option value="Nararit">Nayarit</option>
                                            <option value="Nuevo Le�n">Nuevo Le�n</option>
                                            <option value="Oaxaca">Oaxaca</option>
                                            <option value="Puebla">Puebla</option>
                                            <option value="Quer�taro">Quer�taro</option>
                                            <option value="Quintana Roo">Quintana Roo</option>
                                            <option value="San Luis Potosi">San Luis Potos�</option>
                                            <option value="Sinaloa">Sinaloa</option>
                                            <option value="Sonora">Sonora</option>
                                            <option value="Tabasco">Tabasco</option>
                                            <option value="Tamaulipas">Tamaulipas</option>
                                            <option value="Tlaxcala">Tlaxcala</option>
                                            <option value="Veracruz">Veracruz</option>
                                            <option value="Yucat�n">Yucat�n</option>
                                            <option value="Zacatecas">Zacatecas</option>-->
                                    </select>
                                   </p>
                                  <p>Ciudad:
                                      <select name="ciudad" id="lugar" required="required">
                                          <option value="0">Selecciona una Ciudad</option>
                                          <option value="Arriaga">Arriaga</option>
                                          <option value="Comitan de Dominguez">Comitan de Dominguez</option>
                                          <option value="Palenque">Palenque</option>
                                          <option value="San Cristobal de las Casas">San Cristobal de las Casas</option>
                                          <option value="Suchiapa">Suchiapa</option>
                                          <option value="Tuxtla Gutierrez">Tuxtla Gutierrez</option>
                                      </select> 
                                  </p>
                                  <p> 
                                    <label  class="uname" >Direccion:</label>
                                    <input id="nombre" name="direccion" required="required" type="text" placeholder="Calle ejemplo...." />
                                </p>
                                <!-- Teléfono -->
                                <p>Tel�fono
                                    <input type="tel" id="tel" name="telefono" required="required">
                                </p>
                              
                                
                                <div id="divAjax"></div>
                                
                                
                                <!-- CREAR USUARIO -->
                                <p class="signin button"> 
									<input type="submit" value="Registrarse" /> 
								</p>
                                                                
                                <p class="change_link">  
									�Ya eres un usuario?
									<a href="#tologin" class="to_register"> Iniciar Sesi�n </a>
								</p>
                            </form>
                        </div>
						
                    </div>
                </div>  
            </section>
        </div>


    </body>
</html>