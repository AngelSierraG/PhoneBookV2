package Administrador;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Angel Sierra
 */
import Chat.Chatear;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RoomServer2 extends Thread {
    
   
     private Socket sc; //Socket cliente
     private PrintStream p; //Canal de escritura
     private BufferedReader b; //Canal de Lectura
     private  int i;
   
     

    private RoomServer2(Socket sc, int i) {
    this.sc = sc; 
    this.i = i; 
    
    
    }
   
    public void run() {
        String peticion = null; 
        String mensaje[] = null;
        int action = 0;
        String strChating = "";





        try {
            b = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            p = new PrintStream(sc.getOutputStream());
            //Escribo en canal de escritura el mismo mensaje recibido
            peticion = b.readLine();//peticion
        } catch (IOException ex) {
            Logger.getLogger(RoomServer2.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (peticion != null) {
            System.out.println("Petition(hilo:" + i + "): " + peticion);

// split mensaje
           


            mensaje =  peticion.split(",");
            action = Integer.parseInt(mensaje[0]);

            /**
             *****************************************************************************************************************
             *******************************************Listar_Marcas(action=1)***********************************************
             *****************************************************************************************************************
                 */
                GestorMarcas gm = new GestorMarcas();
                Chatear miChat = new Chatear(); 
                 
                if (action == 1) {

                  
                    
                    
                    p.println(""+ gm.listaMarcas());
                    System.out.println("answer:" +"listaMarcas() succesfull");

                } /**
                 ***********************************************************************************************************
                 *******************************************Crear_Marcas(action=2)*************************************************
                 * **********************************************************************************************************
                 */
                else if (action == 2) {

                  
                  
                    
                    
                    p.println(""+ mensaje[1]+","+ mensaje[2]);
                    System.out.println("answer:" +"crearMarcas() succesfull");

                }/**
                 ***********************************************************************************************************
                 *******************************************Crear_Marcas(action=3)*************************************************
                 * **********************************************************************************************************
                 */
                else if (action == 3) {

                  
                    
                    
                    p.println(""+ gm.listaMarcas());
                    System.out.println("answer:" +"editarMarcas() succesfull");

                }/**
                 ***********************************************************************************************************
                 *******************************************Crear_Marcas(action=4)*************************************************
                 * **********************************************************************************************************
                 */
                else if (action == 4) {

                  
                    
                    
                    p.println(""+ gm.listaMarcas());
                    System.out.println("answer:" +"eliminarMarca() succesfull");

                }
                
                /**
                 ***********************************************************************************************************
                 *******************************************iniciarChat(action=10)*************************************************
                 * **********************************************************************************************************
                 */
                else if (action == 10) {
                    String comprador = mensaje[1];
                    String vendedor = mensaje[2];
                    
                    miChat.iniciarChat(comprador, vendedor);
                    p.println("Has Iniciado un chat con "+ vendedor+"");
                    System.out.println("answer:" +" chat start succesfull");

                }
                  /**
                 ***********************************************************************************************************
                 *******************************************msjComprador(action=11)*************************************************
                 * **********************************************************************************************************
                 */
                else if (action == 11) {
                    String comprador = mensaje[1];
                    String vendedor = mensaje[2];
                    String msj= mensaje[3];
                    miChat.msjComprador(comprador,vendedor,msj);
                    p.println(comprador +": "+msj);
                    System.out.println("answer: msj comprador"+ comprador +": "+msj);

                }
                
                /**
                 ***********************************************************************************************************
                 *******************************************showChats(action=12)*************************************************
                 * **********************************************************************************************************
                 */
                else if (action == 12) {
                    
                    String vendedor = mensaje[1];
                   String clientes =  miChat.showClientes(vendedor);
                   
                    p.println(clientes);
                    System.out.println("answer:"+clientes);

                }
                /**
                 ***********************************************************************************************************
                 *******************************************msjVendedor(action=13)*************************************************
                 * **********************************************************************************************************
                 */
                else if (action == 13) {
                    String comprador = mensaje[1];
                    String vendedor = mensaje[2];
                    String msj= mensaje[3];
                    miChat.msjVendedor(comprador,vendedor,msj);
                    p.println(comprador +": "+msj);
                    System.out.println("answer: msj vendedor"+ comprador +": "+msj);

                }
                
                 /**
                 ***********************************************************************************************************
                 *******************************************showChatVendedor(action=14)*************************************************
                 * **********************************************************************************************************
                 */
                else if (action == 14) {
                    String comprador = mensaje[1];
                    String vendedor = mensaje[2];
                    String chat = miChat.showChatVendedor(comprador,vendedor);
                    p.println(chat);
                    System.out.println("update chat succefull");

                }
                /**
                 ***********************************************************************************************************
                 *******************************************showChatComprador(action=15)*************************************************
                 * **********************************************************************************************************
                 */
                else if (action == 15) {
                    String comprador = mensaje[1];
                    String vendedor = mensaje[2];
                    String chat = miChat.showChatComprador(comprador,vendedor);
                    p.println(chat);
                    System.out.println("update chat succefull");

                }
                
                 /**
                 ***********************************************************************************************************
                 *******************************************ListaPublicaciones(action=16)*************************************************
                 * **********************************************************************************************************
                 */
                else if (action == 16) {
                   
                    GestorPublicaciones  gp = new GestorPublicaciones();
                    String lista = gp.listaPublicaciones();
                    p.println(lista);
                    System.out.println("update chat succefull: "+ lista);

                }
                
                /**
                 ***********************************************************************************************************
                 *******************************************enableDisable(action=17)*************************************************
                 * **********************************************************************************************************
                 */
                else if (action == 17) {
                   
                    GestorPublicaciones  gp2 = new GestorPublicaciones();
                    gp2.enableDisable(Integer.parseInt(mensaje[1]), Integer.parseInt(mensaje[2]));
                    p.println("éxito, id: "+mensaje[1] +"check: "+ mensaje[2]);
                    System.out.println("update publicacion succefull: ");

                }
                
                /**
                 ***********************************************************************************************************
                 *******************************************enableDisable(action=18)*************************************************
                 * **********************************************************************************************************
                 */
                else if (action == 18) {
                   
                    GestorPublicaciones  gp3 = new GestorPublicaciones();
                    gp3.eliminarPublicacion(Integer.parseInt(mensaje[1]));
                    p.println("éxito, id: "+mensaje[1]);
                    System.out.println("update publicacion succefull: ");

                }

        }
        

        
       
    }

    public static void main(String[] args) {
        ServerSocket s; //Socket servidor
        Socket sc; //Socket cliente
        PrintStream p = null; //Canal de escritura
        BufferedReader b = null; //Canal de Lectura
        int i=0;
        System.out.println("Server Running");
        try {
            //Escribo en canal de escritura el mismo mensaje recibido
            s = new ServerSocket(1112);
            System.out.println("ServerSocket Started in port 1112 ");
            



//Creo el socket server


//Invoco el metodo accept del socket servidor, me devuelve una referencia al socket cliente

//Obtengo una referencia a los canales de escritura y lectura del socket cliente


            while (true) {

                sc = s.accept();
              
                new Thread(new RoomServer2(sc, i)).start();
//Leo lo que escribio el socket cliente en el canal de lectura

i++;
            }
        } catch (IOException ex) {
            System.out.println("the socket wasn´t created");
            Logger.getLogger(RoomServer2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
