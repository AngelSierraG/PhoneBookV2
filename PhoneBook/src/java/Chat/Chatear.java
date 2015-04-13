/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import Administrador.RoomServer2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author natsumiangel
 */
public class Chatear {
    
    public void iniciarChat(String comprador, String vendedor){
    

                    File fichero1 = new File("src/java/Chat/"+vendedor+"_"+comprador+".txt");
                    
                    try {
                        // A partir del objeto File creamos el fichero físicamente
                        if(fichero1.exists()==false){
                        fichero1.createNewFile();
                        crearListaClientes(comprador, vendedor);
                        }
                        
                      
                        //System.out.println("El fichero se ha creado correctamente");

                        //System.out.println("No ha podido ser creado el fichero");
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
    }
    
    public void crearListaClientes(String comprador, String vendedor){
    File fichero1 = new File("src/java/Chat/"+vendedor+"_clientes.txt");
                    
                    try {
                        // A partir del objeto File creamos el fichero físicamente
                        if(fichero1.exists()){
                        boolean isUser = userExiste(comprador, vendedor+"_clientes.txt");
                        if(isUser==false){
                          BufferedWriter out2 = null;
                        try {


                            // write in the room indicate, the message of user 
                            out2 = new BufferedWriter(new FileWriter("src/java/Chat/"+vendedor+"_clientes.txt", true));

                            out2.write(comprador + "\n");

                        } catch (IOException e) {
                            // error processing code   
                        } finally {
                            if (out2 != null) {
                                try {
                                    out2.close();
                                } catch (IOException ex) {
                                    Logger.getLogger(RoomServer2.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                        }
                        }else{
                        fichero1.createNewFile();
                        crearListaClientes(comprador, vendedor);
                        }
                        //System.out.println("El fichero se ha creado correctamente");

                        //System.out.println("No ha podido ser creado el fichero");
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
    
    }
    
    public boolean userExiste(String user, String room){
       boolean bandera = false; 
    
                    File archivo2 = null;
                    FileReader fr = null;
                    BufferedReader br = null;
                   
                    try {
                        //open file 

                        archivo2 = new File("src/java/Chat/"+room);

                        fr = new FileReader(archivo2);
                        // buffer up
                        br = new BufferedReader(fr);


                        String line;
                        //read line to line 
                        while ((line = br.readLine()) != null) {   // 

                            if (line.equals(user)) {
                                bandera = true;
                            }



                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        // close the file 
                        try {
                            if (null != fr) {
                                fr.close();
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }  ///skldhlashdk 
    return bandera; 
}
    
    public void msjComprador(String comprador, String vendedor, String msj){
        BufferedWriter out2 = null;
                        try {


                            // write in the room indicate, the message of user 
                            out2 = new BufferedWriter(new FileWriter("src/java/Chat/"+vendedor+"_"+comprador+".txt", true));

                            out2.write(comprador+": "+msj + "\n");

                        } catch (IOException e) {
                            // error processing code   
                        } finally {
                            if (out2 != null) {
                                try {
                                    out2.close();
                                } catch (IOException ex) {
                                    Logger.getLogger(RoomServer2.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
    
    }
    
        public void msjVendedor(String comprador, String vendedor, String msj){
        BufferedWriter out2 = null;
                        try {


                            // write in the room indicate, the message of user 
                            out2 = new BufferedWriter(new FileWriter("src/java/Chat/"+vendedor+"_"+comprador+".txt", true));

                            out2.write(vendedor+": "+msj + "\n");

                        } catch (IOException e) {
                            // error processing code   
                        } finally {
                            if (out2 != null) {
                                try {
                                    out2.close();
                                } catch (IOException ex) {
                                    Logger.getLogger(RoomServer2.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            
                            
                        }
    
    }
    
    public String showClientes(String vendedor) {
    String respuesta = "";
    File archivo2 = null;
                    FileReader fr = null;
                    BufferedReader br = null;

                    String stranswer = "";
                    String msj = null;
                    try {
                        //open file 

                        archivo2 = new File("src/java/Chat/"+vendedor+"_clientes.txt");

                        fr = new FileReader(archivo2);
                        // buffer up
                        br = new BufferedReader(fr);


                        String line;
                        //read line to line 
                        int cont = 1; 
                        while ((line = br.readLine()) != null) {   // 

                            respuesta = respuesta + "<input type=\"button\" value=\""+line+"\" onclick=\"javascript:showVentana('"+line+"')\" class=\"btnInvitRequest\"/>";
                            cont ++;


                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        // close the file 
                        try {
                            if (null != fr) {
                                fr.close();
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }  ///skldhlashdk  
    return respuesta; 
    }
    
    public String showChatVendedor(String comprador, String vendedor){
     String respuesta = "";
    File archivo2 = null;
                    FileReader fr = null;
                    BufferedReader br = null;

                    String stranswer = "";
                    String msj = null;
                    try {
                        //open file 

                        archivo2 = new File("src/java/Chat/"+vendedor+"_"+comprador+".txt");

                        fr = new FileReader(archivo2);
                        // buffer up
                        br = new BufferedReader(fr);


                        String line;
                        //read line to line 
                       
                        while ((line = br.readLine()) != null) {   // 

                            respuesta = respuesta + line+"<br/>";
                           


                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        // close the file 
                        try {
                            if (null != fr) {
                                fr.close();
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }  ///skldhlashdk  
    return respuesta; 
    
    
    } 
    
    public String showChatComprador(String comprador, String vendedor){
       String respuesta = "";
    File archivo2 = null;
                    FileReader fr = null;
                    BufferedReader br = null;

                    String stranswer = "";
                    String msj = null;
                    try {
                        //open file 

                        archivo2 = new File("src/java/Chat/"+vendedor+"_"+comprador+".txt");

                        fr = new FileReader(archivo2);
                        // buffer up
                        br = new BufferedReader(fr);


                        String line;
                        //read line to line 
                       
                        while ((line = br.readLine()) != null) {   // 

                            respuesta = respuesta + line+"<br/>";
                           


                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        // close the file 
                        try {
                            if (null != fr) {
                                fr.close();
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }  ///skldhlashdk  
    return respuesta; 
    
    
    }
    
}
