/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2015-04-13 15:09:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Gestor_005fAnuncios_005fLista_005fAnuncios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String User;
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\"/>\r\n");
      out.write("\t<title>Phonebook-Gestor Admin</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"view/css/layout.css\" type=\"text/css\" media=\"screen\" />\r\n");
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
      out.write("    ");
      out.write("\r\n");
      out.write("    ");

        if(session.getAttribute("sesion_usuario")!=null && session.getAttribute("sesion_tipo").equals("1")){
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
      out.write("\t\t<h2>MenÃº</h2>\r\n");
      out.write("\t\t<hr/>\r\n");
      out.write("\t\t\r\n");
      out.write("        <h3>Gestor_Marcas</h3>\r\n");
      out.write("\t\t<ul class=\"toggle\">\r\n");
      out.write("\t\t\t<li class=\"icn_new_article\"><a href=\"Gestor_Marcas_Crear_Marcas.jsp\">Crear Marcas</a></li>\r\n");
      out.write("            <li class=\"icn_categories\"><a href=\"Gestor_Marcas_Lista_Marcas.jsp\">Lista Marcas</a></li>\r\n");
      out.write("            \r\n");
      out.write("\t\t</ul>\r\n");
      out.write("        \r\n");
      out.write("\t\t<h3>Gestor_Modelos</h3>\r\n");
      out.write("        \t<ul class=\"toggle\">\r\n");
      out.write("\t\t\t<li class=\"icn_new_article\"><a href=\"Gestor_Modelos_Crear_Modelo.jsp\">Crear Modelo</a></li>\r\n");
      out.write("            <li class=\"icn_categories\"><a href=\"Gestor_Modelos_Lista_Modelos.jsp\">Lista Modelos</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("        \r\n");
      out.write("        <h3>Gestor_Anuncios</h3>\r\n");
      out.write("        \t<ul class=\"toggle\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("            <li class=\"icn_categories\"><a href=\"Gestor_Anuncios_Lista_Anuncios.jsp\">Lista Anuncios</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t</aside><!-- end of sidebar -->\r\n");
      out.write("\t\r\n");
      out.write("\t<section id=\"main\" class=\"column\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<h4 class=\"alert_info\">Phonebook | Gestor_Marcas | Lista_Anuncios</h4>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<article class=\"module width_3_quarter\">\r\n");
      out.write("\t\t<header><h3 class=\"tabs_involved\">Anuncios</h3>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"tab_container\" >\r\n");
      out.write("\t\t\t<div id=\"tab1\" class=\"tab_content\">\r\n");
      out.write("\t\t\t<table class=\"tablesorter\" cellspacing=\"1\" cellpadding=\"1\" id=\"reservations\" > \r\n");
      out.write("\t\t\t<thead> \r\n");
      out.write("\t\t\t\t<tr> \r\n");
      out.write("   \t\t\t\t\t\r\n");
      out.write("    \t\t\t\t<th>ID</th> \r\n");
      out.write("    \t\t\t\t<th>Imagen</th>\r\n");
      out.write("    \t\t\t\t<th>TÃ­tulo Anuncio</th> \r\n");
      out.write("    \t\t\t\t \r\n");
      out.write("                    <th></th> \r\n");
      out.write("\t\t\t\t</tr> \r\n");
      out.write("\t\t\t</thead>     \r\n");
      out.write("            <tbody> \r\n");
      out.write("\t\t\t\t<tr> \r\n");
      out.write("   \t\t\t\t\t<td>1</td> \r\n");
      out.write("   \t\t\t\t\t<td><input width=\"50px\" height=\"50px\" type=\"image\" src=\"images/Motog.jpg\" title=\"MinImg\"></td>\r\n");
      out.write("    \t\t\t\t<td>Vendo Moto G</td> \r\n");
      out.write("    \t\t\t\t\r\n");
      out.write("    \t\t\t\t<td><input type=\"image\" src=\"images/icn_settings.png\" title=\"Confirmar_Anuncio\"><input type=\"image\" src=\"images/icn_trash.png\" title=\"Eliminar_Anuncio\"></td> \r\n");
      out.write("\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t<tr> \r\n");
      out.write("   \t\t\t\t\t<td>2</td> \r\n");
      out.write("   \t\t\t\t\t<td><input width=\"50px\" height=\"50px\" type=\"image\" src=\"images/Motog.jpg\" title=\"MinImg\"></td>\r\n");
      out.write("    \t\t\t\t<td>Vendo Moto G</td> \r\n");
      out.write("    \t\t\t\t\r\n");
      out.write("    \t\t\t\t<td><input type=\"image\" src=\"images/icn_settings.png\" title=\"Confirmar_Anuncio\"><input type=\"image\" src=\"images/icn_trash.png\" title=\"Eliminar_Anuncio\"></td> \r\n");
      out.write("\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t\t<tr> \r\n");
      out.write("   \t\t\t\t\t<td>3</td> \r\n");
      out.write("   \t\t\t\t\t<td><input width=\"50px\" height=\"50px\" type=\"image\" src=\"images/Motog.jpg\" title=\"MinImg\"></td>\r\n");
      out.write("    \t\t\t\t<td>Vendo Moto G</td> \r\n");
      out.write("    \t\t\t\t\r\n");
      out.write("    \t\t\t\t<td><input type=\"image\" src=\"images/icn_settings.png\" title=\"Confirmar_Anuncio\"><input type=\"image\" src=\"images/icn_trash.png\" title=\"Eliminar_Anuncio\"></td> \r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr> \r\n");
      out.write("   \t\t\t\t\t<td>4</td> \r\n");
      out.write("   \t\t\t\t\t<td><input width=\"50px\" height=\"50px\" type=\"image\" src=\"images/Motog.jpg\" title=\"MinImg\"></td>\r\n");
      out.write("    \t\t\t\t<td>Vendo Moto G</td> \r\n");
      out.write("    \t\t\t\r\n");
      out.write("    \t\t\t\t<td><input type=\"image\" src=\"images/icn_settings.png\" title=\"Confirmar_Anuncio\"><input type=\"image\" src=\"images/icn_trash.png\" title=\"Eliminar_Anuncio\"></td> \r\n");
      out.write("\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t<tr> \r\n");
      out.write("   \t\t\t\t\t<td>5</td> \r\n");
      out.write("   \t\t\t\t\t<td><input width=\"50px\" height=\"50px\" type=\"image\" src=\"images/Motog.jpg\" title=\"MinImg\"></td>\r\n");
      out.write("    \t\t\t\t<td>Vendo Moto G</td> \r\n");
      out.write("    \t\t\t\t \r\n");
      out.write("    \t\t\t\t<td><input type=\"image\" src=\"images/icn_settings.png\" title=\"Confirmar_Anuncio\"><input type=\"image\" src=\"images/icn_trash.png\" title=\"Eliminar_Anuncio\"></td> \r\n");
      out.write("\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t<tr> \r\n");
      out.write("   \t\t\t\t\t<td>6</td> \r\n");
      out.write("   \t\t\t\t\t<td><input width=\"50px\" height=\"50px\" type=\"image\" src=\"images/Motog.jpg\" title=\"MinImg\"></td>\r\n");
      out.write("    \t\t\t\t<td>Vendo Moto G</td> \r\n");
      out.write("    \t\t\t\t\r\n");
      out.write("    \t\t\t\t<td><input type=\"image\" src=\"images/icn_settings.png\" title=\"Confirmar_Anuncio\"><input type=\"image\" src=\"images/icn_trash.png\" title=\"Eliminar_Anuncio\"></td> \r\n");
      out.write("\t\t\t\t</tr> \r\n");
      out.write("\t\t\t\t<tr> \r\n");
      out.write("   \t\t\t\t\t<td>7</td> \r\n");
      out.write("   \t\t\t\t\t<td><input width=\"50px\" height=\"50px\" type=\"image\" src=\"images/Motog.jpg\" title=\"MinImg\"></td>\r\n");
      out.write("    \t\t\t\t<td>Vendo Moto G</td> \r\n");
      out.write("    \t\t\t\t\r\n");
      out.write("    \t\t\t\t<td><input type=\"image\" src=\"images/icn_settings.png\" title=\"Confirmar_Anuncio\"><input type=\"image\" src=\"images/icn_trash.png\" title=\"Eliminar_Anuncio\"></td> \r\n");
      out.write("\t\t\t\t</tr> \r\n");
      out.write("\t\t\t</tbody>  \r\n");
      out.write("              \r\n");
      out.write("\t\t\t</tbody> \r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t</div><!-- end of #tab1 -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div><!-- end of .tab_container -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</article><!-- end of content manager article -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<footer>\r\n");
      out.write("\t\t\t<p><strong>Copyright &copy; 2015 Phonebook</strong></p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
