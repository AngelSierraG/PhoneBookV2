/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;

import BaseDatos.AdministradorBD;
import java.sql.ResultSet;

/**
 *
 * @author Angel Sierra
 */
public class GestorPublicaciones{
    
//    Connection conexion =  new ConexionBD().GetConnection();
    
    public String listaPublicaciones(){
        String listaPublicaciones = null;
//        Statement stmt=null;
        ResultSet rst=null;
        try{
        //conectándose a la base de datos
     
//        stmt = conexion.createStatement();
//            rst = stmt.executeQuery("SELECT * FROM  `marcas` ");
            AdministradorBD admi2 = new AdministradorBD();
            rst = admi2.listarPublicaciones();
            //out.println(value);
            
            listaPublicaciones = "<table class=\"tablesorter\" cellspacing=\"1\" cellpadding=\"1\" id=\"reservations\" ><thead><tr><th>ID</th><th>Imagen</th><th>Titulo</th><th>Activo</th><th></th></tr></thead><tbody> ";
            while(rst.next()){

         String idPublicacion = rst.getString("idPublicacion");
          String Titulo = rst.getString("Titulo");
          String urlImage= rst.getString("urlImage");
          boolean activo = rst.getBoolean("Activo");
          String theCheck = ""; 
          
          if(activo==false)
          {
              theCheck = "<input value=\"0\" type=\"checkbox\" id=\"check"+idPublicacion+"\"/>"; 
          }
          else
          {
              theCheck = "<input value=\"1\" type=\"checkbox\" id=\"check"+idPublicacion+"\" checked/>";
          } 
          
                listaPublicaciones =  listaPublicaciones +"<tr><td>"+idPublicacion+"</td><td><input width=\"50px\" height=\"50px\" type=\"image\" src=\"images/Marcas/"+urlImage+"\" title=\"MinImg\"></td><td>"+Titulo+"</td><td>"+theCheck+"</td><td><a onclick=\"activarPublicacion('"+idPublicacion+"')\"><input type=\"image\" src=\"images/icn_settings.png\" title=\"Activar ó Desactivar\"></a><a onclick=\"eliminarPublicacion("+idPublicacion+")\"><input type=\"image\" src=\"images/icn_trash.png\" title=\"Eliminar_Publicacion\"></a></td></tr>";
               
            }
            //Conexion.close
            rst.close();
    }catch(Exception e){
        listaPublicaciones= "Error en Consulta: "+ e.getMessage();
    }
        listaPublicaciones = listaPublicaciones + "</tbody></tbody></table>"; 
        
        return listaPublicaciones;
}
    
    public void enableDisable(int idPublicacion, int state)
    {
    AdministradorBD admi = new AdministradorBD();
    admi.updateAnuncio(idPublicacion, state);
    } 
    
     public void eliminarPublicacion(int idPublicacion)
    {
    AdministradorBD admi2 = new AdministradorBD();
    admi2.eliminarPublicacion(idPublicacion);
    } 
    
}