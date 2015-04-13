package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--[if (gt IE 9)|!(IE)]><!--> <html lang=\"en\" class=\"no-js\"> <!--<![endif]-->\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <!-- <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">  -->\r\n");
      out.write("        <title>Iniciar Sesión</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \r\n");
      out.write("        <meta name=\"description\" content=\"Login and Registration Form with HTML5 and CSS3\" />\r\n");
      out.write("        <meta name=\"keywords\" content=\"html5, css3, form, switch, animation, :target, pseudo-class\" />\r\n");
      out.write("        <meta name=\"author\" content=\"Codrops\" />\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../favicon.ico\"> \r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"view/css/demo.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"view/css/layout.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"view/css/style3.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"view/css/animate-custom.css\" />\r\n");
      out.write("        <link href=\"aboutPageStyle.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    </head>\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"codrops-top\">\r\n");
      out.write("                <div class=\"clr\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <header>\r\n");
      out.write("\t\r\n");
      out.write("    <div class=\"profileLogo\"> \r\n");
      out.write("        <p class=\"logoPlaceholder\" style=\"background: #91BABC;\"><img src=\"images/phonebookLogo1.png\" height=\"50%\"></div>\r\n");
      out.write("</header>\r\n");
      out.write("            ");

              if(request.getAttribute("message")!=null){
                  out.println("<h4 class='alert_success'>"+request.getAttribute("message")+"</h4>");
              }
            
      out.write("\r\n");
      out.write("            <section>\t\t\t\t\r\n");
      out.write("                <div id=\"container_demo\" >\r\n");
      out.write("                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->\r\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"toregister\"></a>\r\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"tologin\"></a>\r\n");
      out.write("                    <div id=\"wrapper\">\r\n");
      out.write("                        <div id=\"login\" class=\"animate form\">\r\n");
      out.write("                            <form  action=\"Inicar_Registrar_Sesion.do\"  method=\"post\">\r\n");
      out.write("                              <h1>Iniciar Sesion</h1>\r\n");
      out.write("                              <p> \r\n");
      out.write("                                <label for=\"username\" class=\"uname\" data-icon=\"u\" > Ingresa email </label>\r\n");
      out.write("                                    <input id=\"username\" name=\"user\" required=\"required\" type=\"text\" placeholder=\"minombredeusuario o miemail@mail.com\"/>\r\n");
      out.write("                                </p>\r\n");
      out.write("                                <p> \r\n");
      out.write("                                    <label for=\"password\" class=\"youpasswd\" data-icon=\"p\"> Ingresa contraseña </label>\r\n");
      out.write("                                    <input id=\"password\" name=\"pass\" required=\"required\" type=\"password\" placeholder=\"Ej. X8df!90EO\" /> \r\n");
      out.write("                                </p>\r\n");
      out.write("                               \r\n");
      out.write("                              \t<p id=\"divAjaxLogin\">Phonebook</p>\r\n");
      out.write("                                <p class=\"login button\"> \r\n");
      out.write("                                    <input type=\"submit\" value=\"Iniciar sesion\"  /> \r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("                                <p class=\"change_link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t¿Ya estás registrado?\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#toregister\" class=\"to_register\">Crear una cuenta</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- crearUsuario() -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div id=\"register\" class=\"animate form\">\r\n");
      out.write("                            <form action=\"Inicar_Registrar_Sesion.do\" method=\"get\">\r\n");
      out.write("                            \r\n");
      out.write("                                <h1> Crear Usuario </h1> \r\n");
      out.write("                                <!-- Nombre Usuario -->\r\n");
      out.write("                                <p>\r\n");
      out.write("                                    <label for=\"emailsignup\" class=\"youmail\" data-icon=\"e\" > Tu email</label>\r\n");
      out.write("                                    <input id=\"email\" name=\"emailRegistro\" required=\"required\" type=\"email\" placeholder=\"miemail@mail.com\"/> \r\n");
      out.write("                                    \r\n");
      out.write("                                </p>    \r\n");
      out.write("                                <!-- Password -->\r\n");
      out.write("                                <p> \r\n");
      out.write("                                    <label for=\"passwordsignup\" class=\"youpasswd\" data-icon=\"p\">Tu contraseña </label>\r\n");
      out.write("                                    <input id=\"password1\" name=\"passRegistro\" required=\"required\" type=\"password\" placeholder=\"Ej. X8df!90EO\"/>\r\n");
      out.write("                                </p>\r\n");
      out.write("                                 <p> \r\n");
      out.write("                                    <label  class=\"uname\" >Nombre:</label>\r\n");
      out.write("                                    <input id=\"nombre\" name=\"nombre\" required=\"required\" type=\"text\" placeholder=\"Nombre/s\" />\r\n");
      out.write("                                </p>\r\n");
      out.write("                                 <p> \r\n");
      out.write("                                    <label  class=\"uname\" >Apellidos:</label>\r\n");
      out.write("                                    <input id=\"nombre\" name=\"apellido\" required=\"required\" type=\"text\" placeholder=\"Apellidos\" />\r\n");
      out.write("                                </p>\r\n");
      out.write("                                <!-- Sexo -->    \r\n");
      out.write("                                <p>Estado: \r\n");
      out.write("                                    <select name=\"estado\" required=\"required\">\r\n");
      out.write("                                           <option value=\"0\">Selecciona un Estado</option>\r\n");
      out.write("                                          <!--  <option value=\"Aguascalientes\">Aguascalientes</option>\r\n");
      out.write("                                            <option value=\"Baja California\">Baja California</option>\r\n");
      out.write("                                            <option value=\"Baja California Sur\">Baja California Sur</option>\r\n");
      out.write("                                            <option value=\"Campeche\">Campeche</option>\r\n");
      out.write("                                            <option value=\"Coahuila\">Coahuila de Zaragoza</option>\r\n");
      out.write("                                            <option value=\"Colima\">Colima</option> -->\r\n");
      out.write("                                            <option value=\"Chiapas\">Chiapas</option>\r\n");
      out.write("                                           <!-- <option value=\"Chihuahua\">Chihuahua</option>\r\n");
      out.write("                                            <option value=\"Distrito Federal\">Distrito Federal</option>\r\n");
      out.write("                                            <option value=\"Durango\">Durango</option>\r\n");
      out.write("                                            <option value=\"Guanajuato\">Guanajuato</option>\r\n");
      out.write("                                            <option value=\"Guerrero\">Guerrero</option>\r\n");
      out.write("                                            <option value=\"Hidalgo\">Hidalgo</option>\r\n");
      out.write("                                            <option value=\"Jalisco\">Jalisco</option>\r\n");
      out.write("                                            <option value=\"Mexico\">México</option>\r\n");
      out.write("                                            <option value=\"Michoacan\">Michoacán de Ocampo</option>\r\n");
      out.write("                                            <option value=\"Morelos\">Morelos</option>\r\n");
      out.write("                                            <option value=\"Nararit\">Nayarit</option>\r\n");
      out.write("                                            <option value=\"Nuevo León\">Nuevo León</option>\r\n");
      out.write("                                            <option value=\"Oaxaca\">Oaxaca</option>\r\n");
      out.write("                                            <option value=\"Puebla\">Puebla</option>\r\n");
      out.write("                                            <option value=\"Querétaro\">Querétaro</option>\r\n");
      out.write("                                            <option value=\"Quintana Roo\">Quintana Roo</option>\r\n");
      out.write("                                            <option value=\"San Luis Potosi\">San Luis Potosí</option>\r\n");
      out.write("                                            <option value=\"Sinaloa\">Sinaloa</option>\r\n");
      out.write("                                            <option value=\"Sonora\">Sonora</option>\r\n");
      out.write("                                            <option value=\"Tabasco\">Tabasco</option>\r\n");
      out.write("                                            <option value=\"Tamaulipas\">Tamaulipas</option>\r\n");
      out.write("                                            <option value=\"Tlaxcala\">Tlaxcala</option>\r\n");
      out.write("                                            <option value=\"Veracruz\">Veracruz</option>\r\n");
      out.write("                                            <option value=\"Yucatán\">Yucatán</option>\r\n");
      out.write("                                            <option value=\"Zacatecas\">Zacatecas</option>-->\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                   </p>\r\n");
      out.write("                                  <p>Ciudad:\r\n");
      out.write("                                      <select name=\"ciudad\" id=\"lugar\" required=\"required\">\r\n");
      out.write("                                          <option value=\"0\">Selecciona una Ciudad</option>\r\n");
      out.write("                                          <option value=\"Arriaga\">Arriaga</option>\r\n");
      out.write("                                          <option value=\"Comitan de Dominguez\">Comitan de Dominguez</option>\r\n");
      out.write("                                          <option value=\"Palenque\">Palenque</option>\r\n");
      out.write("                                          <option value=\"San Cristobal de las Casas\">San Cristobal de las Casas</option>\r\n");
      out.write("                                          <option value=\"Suchiapa\">Suchiapa</option>\r\n");
      out.write("                                          <option value=\"Tuxtla Gutierrez\">Tuxtla Gutierrez</option>\r\n");
      out.write("                                      </select> \r\n");
      out.write("                                  </p>\r\n");
      out.write("                                  <p> \r\n");
      out.write("                                    <label  class=\"uname\" >Direccion:</label>\r\n");
      out.write("                                    <input id=\"nombre\" name=\"direccion\" required=\"required\" type=\"text\" placeholder=\"Calle ejemplo....\" />\r\n");
      out.write("                                </p>\r\n");
      out.write("                                <!-- TelÃ©fono -->\r\n");
      out.write("                                <p>Teléfono\r\n");
      out.write("                                    <input type=\"tel\" id=\"tel\" name=\"telefono\" required=\"required\">\r\n");
      out.write("                                </p>\r\n");
      out.write("                              \r\n");
      out.write("                                \r\n");
      out.write("                                <div id=\"divAjax\"></div>\r\n");
      out.write("                                \r\n");
      out.write("                                \r\n");
      out.write("                                <!-- CREAR USUARIO -->\r\n");
      out.write("                                <p class=\"signin button\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Registrarse\" /> \r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("                                                                \r\n");
      out.write("                                <p class=\"change_link\">  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t¿Ya eres un usuario?\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#tologin\" class=\"to_register\"> Iniciar Sesión </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>  \r\n");
      out.write("            </section>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
