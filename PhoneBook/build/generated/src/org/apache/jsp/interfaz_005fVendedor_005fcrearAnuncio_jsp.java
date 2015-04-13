package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import BaseDatos.AdministradorBD;

public final class interfaz_005fVendedor_005fcrearAnuncio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String User;
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
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\"/>\r\n");
      out.write("\t<title>Phonebook</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"view/css/layout.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"view/css/chat.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"view/css/form.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\t<script src=\"view/js/jquery-1.5.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"view/js/hideshow.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"view/js/jquery.tablesorter.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"view/js/jquery.equalHeight.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() \r\n");
      out.write("    \t{ \r\n");
      out.write("      \t  $(\".tablesorter\").tablesorter(); \r\n");
      out.write("   \t } \r\n");
      out.write("\t);\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("\t//When page loads...\r\n");
      out.write("\t$(\".tab_content\").hide(); //Hide all content\r\n");
      out.write("\t$(\"ul.tabs li:first\").addClass(\"active\").show(); //Activate first tab\r\n");
      out.write("\t$(\".tab_content:first\").show(); //Show first tab content\r\n");
      out.write("\r\n");
      out.write("\t//On Click Event\r\n");
      out.write("\t$(\"ul.tabs li\").click(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"ul.tabs li\").removeClass(\"active\"); //Remove any \"active\" class\r\n");
      out.write("\t\t$(this).addClass(\"active\"); //Add \"active\" class to selected tab\r\n");
      out.write("\t\t$(\".tab_content\").hide(); //Hide all tab content\r\n");
      out.write("\r\n");
      out.write("\t\tvar activeTab = $(this).find(\"a\").attr(\"href\"); //Find the href attribute value to identify the active tab + content\r\n");
      out.write("\t\t$(activeTab).fadeIn(); //Fade in the active ID content\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("    </script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    $(function(){\r\n");
      out.write("        $('.column').equalHeight();\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("    ");

        if(session.getAttribute("sesion_usuario")!=null && session.getAttribute("sesion_tipo").equals("0")){
          User = (String)session.getAttribute("sesion_usuario");
         }else{
            response.sendRedirect("login.jsp");
            
        }
    
      out.write("\r\n");
      out.write("\t<header id=\"header\">\r\n");
      out.write("\t\t<hgroup>\r\n");
      out.write("\t\t\t<h1 class=\"site_title\"><a href=\"index.html\"><img src=\"images/phonebookLogo1.png\" width=\"343\" height=\"80\"></a></h1>\r\n");
      out.write("\t\t\t<h2 class=\"section_title\"><!--texto --></h2><div class=\"btn_view_site\"><a href=\"#\"><img src=\"images/icn_profile.png\" width=\"20\" height=\"20\" style=\"margin-right: 5px;\">");
      out.print(User);
      out.write("</a></div><a href=\"closeSession.do\" style=\"color: black; margin-left: 11%\" >Cerrar Sesion</a>\r\n");
      out.write("\t\t</hgroup>\r\n");
      out.write("\t</header> <!-- end of header bar -->\r\n");
      out.write("\t\r\n");
      out.write("  <section id=\"secondary_bar\">\r\n");
      out.write("\t\t<div class=\"user\">\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t\t<!-- <a class=\"logout_user\" href=\"#\" title=\"Logout\">Logout</a> -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<div class=\"breadcrumbs_container\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</section><!-- end of secondary bar -->\r\n");
      out.write("\t\r\n");
      out.write("\t<aside id=\"sidebar\" class=\"column\">\r\n");
      out.write("\t\t<h2>Menú</h2>\r\n");
      out.write("\t\t<hr/>\r\n");
      out.write("\t\t<h3>Compras</h3>\r\n");
      out.write("\t\t<ul class=\"toggle\">\r\n");
      out.write("\t\t\t<li class=\"icn_categories\"><a href=\"http://localhost:8080/PhoneBook/interfaz_comprador.jsp\">Publicaciones</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<h3>Ventas</h3>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \t<ul class=\"toggle\">\r\n");
      out.write("\t\t\t<li class=\"icn_categories\"><a href=\"http://localhost:8080/PhoneBook/interfaz_Vendedor.jsp\">Mis Publicaciones</a></li>\r\n");
      out.write("            <li class=\"icn_new_article\"><a href=\"http://localhost:8080/PhoneBook/interfaz_Vendedor_crearAnuncio.jsp\">Crear Publicacion</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t</aside><!-- end of sidebar -->\r\n");
      out.write("\t\r\n");
      out.write("\t<section id=\"main\" class=\"column\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<h4 class=\"alert_info\">Bienvenido a Phonebook</h4>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<article class=\"module width_3_quarter\">\r\n");
      out.write("\t\t<header><h3 class=\"tabs_involved\">Crear Publicacion</h3>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"tab_container\" >\r\n");
      out.write("\t\t\t<div id=\"tab1\" class=\"tab_content\">\r\n");
      out.write("         <form class=\"contact_form\" action=\"Crear_eliminar_publicacion.do\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>\r\n");
      out.write("            <input type=\"hidden\" name=\"usuario\" value=\"");
      out.print(User);
      out.write("\"/>\r\n");
      out.write("            <label for=\"name\">Titulo:</label>\r\n");
      out.write("            <input type=\"text\" name=\"titulo\" placeholder=\"Titulo de tu publicacion\" required />\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("        ");

           AdministradorBD admi = new AdministradorBD();
           ResultSet rs = admi.marcas();
           
        
      out.write("    \r\n");
      out.write("            \r\n");
      out.write("            <label for=\"email\">Marca:</label>\r\n");
      out.write("            <select id=\"Field9\" name=\"sel_marca\" onchange=\"seleccion_marca(this.value);\">\r\n");
      out.write("                <option value='0'>Selecciona una marca</option>\r\n");
      out.write("                ");

                while (rs.next()){
                int idMarca = rs.getInt("idMarca");
                String marca = rs.getString("NombreMarca");
                out.println("<option value='"+idMarca+"'>"+marca+"</option>");
                        }
                rs.close();
                
      out.write("       \r\n");
      out.write("\t\t</select>\r\n");
      out.write("                                                    \r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("          \r\n");
      out.write("            <label for=\"website\">Modelo:</label>\r\n");
      out.write("\t\t\t<select id=\"sel_modelo\" name=\"sel_modelo\" >\r\n");
      out.write("                                <option value='0'>Selecciona un modelo</option>\r\n");
      out.write("                       </select>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("             <label for=\"name\">Precio:</label>\r\n");
      out.write("            <input type=\"text\" name=\"precio\" placeholder=\"Ejemp: 100\" required />\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<label>Fecha I.:</label><input type=\"date\" name=\"fechaI\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\t\r\n");
      out.write("        \t<label>Fecha F.:</label><input type=\"date\" name=\"fechaF\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <label >Descripcion:</label>\r\n");
      out.write("            <textarea name=\"descripcion\" cols=\"40\" rows=\"6\" required placeholder=\"Una breve descripcion acerca de tu publicacion.\"></textarea>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("        \t<label>Imagen:</label><input name=\"imagen\" type=\"file\"/>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("        \t<button class=\"submit\" type=\"submit\">Crear Publicacion</button><button class=\"submit\" type=\"reset\">Reinicar</button>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div><!-- end of #tab1 -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div><!-- end of .tab_container -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</article><!-- end of content manager article -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t<article class=\"module width_quarter\">\r\n");
      out.write("\t\t\t<header><h3>Chats </h3></header>\r\n");
      out.write("\t\t\t<div class=\"message_list\">\r\n");
      out.write("\t\t\t\t<div class=\"module_content\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"Chat con Miguel\" onclick=\"javascript:chatWith(1,'Miguel')\" class=\"btnInvitRequest\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"Chat con Luis\" onclick=\"javascript:chatWith(2,'Luis')\" class=\"btnInvitRequest\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"Chat con Juan\" onclick=\"javascript:chatWith(3,'Juan')\" class=\"btnInvitRequest\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</article><!-- end of messages article -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<footer>\r\n");
      out.write("\t\t\t<p><strong>Copyright &copy; 2015 Phonebook</strong></p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t\t  <script type=\"text/javascript\" src=\"view/js/chat.js\"></script>   \r\n");
      out.write("                  <script>\r\n");
      out.write("                   function seleccion_marca(idmarca){\r\n");
      out.write("                        $.ajax({\r\n");
      out.write("                        type: 'POST',\r\n");
      out.write("                        url: 'GetModelos.do',\r\n");
      out.write("                        data: {\r\n");
      out.write("                        idmarca: idmarca\r\n");
      out.write("                        }\r\n");
      out.write("                        }).done(function(resp){\r\n");
      out.write("                        $('#sel_modelo').html(resp);\r\n");
      out.write("                        });\r\n");
      out.write("                        } \r\n");
      out.write("    \r\n");
      out.write("                  </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
