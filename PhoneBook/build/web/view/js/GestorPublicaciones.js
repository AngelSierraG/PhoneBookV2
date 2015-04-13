/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 var xmlhttpSM;
                if (window.XMLHttpRequest){
                    // code for IE7+, Firefox, Chrome, Opera, Safari
                    xmlhttpSM=new XMLHttpRequest();
                }else{
                    // code for IE6, IE5
                    xmlhttpSM=new ActiveXObject("Microsoft.XMLHTTP");
                }
                xmlhttpSM.onreadystatechange=function(){
                    if (xmlhttpSM.readyState==4 && xmlhttpSM.status==200){
                        document.getElementById("tab1").innerHTML=xmlhttpSM.responseText;
                    }
                }

function listarPublicaciones()
{

                xmlhttpSM.open("GET","messageClient.jsp?action=16",false);
                xmlhttpSM.send(); 
    
}

function activarPublicacion(id){
    thecheck = document.getElementById("check"+id+"").value; 
   
    var xmlhttpSM;
                if (window.XMLHttpRequest){
                    // code for IE7+, Firefox, Chrome, Opera, Safari
                    xmlhttpSM=new XMLHttpRequest();
                }else{
                    // code for IE6, IE5
                    xmlhttpSM=new ActiveXObject("Microsoft.XMLHTTP");
                }
                xmlhttpSM.onreadystatechange=function(){
                    if (xmlhttpSM.readyState==4 && xmlhttpSM.status==200){
                        document.getElementById("tab1").innerHTML=xmlhttpSM.responseText;
                    }
                }
    xmlhttpSM.open("GET","messageClient.jsp?action=17&dato1="+id+"&dato2="+thecheck+"",false);
    xmlhttpSM.send(); 
    if(thecheck ==1){
        alert("se ha desactivado la publicación: "+ id);    
    }else {alert("se ha activado la publicación: "+ id);
        }
    listarPublicaciones();
}

function eliminarPublicacion(id){

    var xmlhttpSM;
                if (window.XMLHttpRequest){
                    // code for IE7+, Firefox, Chrome, Opera, Safari
                    xmlhttpSM=new XMLHttpRequest();
                }else{
                    // code for IE6, IE5
                    xmlhttpSM=new ActiveXObject("Microsoft.XMLHTTP");
                }
                xmlhttpSM.onreadystatechange=function(){
                    if (xmlhttpSM.readyState==4 && xmlhttpSM.status==200){
                        document.getElementById("tab1").innerHTML=xmlhttpSM.responseText;
                    }
                }
    xmlhttpSM.open("GET","messageClient.jsp?action=18&dato1="+id,false);
    xmlhttpSM.send(); 
    listarPublicaciones();
}

