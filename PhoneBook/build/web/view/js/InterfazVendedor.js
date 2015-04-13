/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


var vendedor; 
var comprador; 

function iniciar(vendedor){
    updateAll(comprador, vendedor);
    
}
function toBottomChatVendedor()
	{
		var objControl=document.getElementById("chatVendedor");
		objControl.scrollTop = objControl.scrollHeight;
	}
function updateAll(comprador, vendedor){
    
   showChats(vendedor);
    toBottomChatVendedor();
   showChatVendedor(comprador, vendedor);
    setTimeout(function(){
       updateAll(comprador, vendedor);
       
        //document.getElementById("room").scrollTop(350);
       
    }, 3000);

}                

function showChats(vendedor){
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
                        document.getElementById("showChats").innerHTML=xmlhttpSM.responseText;
                    }
                }
    xmlhttpSM.open("GET","messageClient.jsp?action=12&dato1="+vendedor,false);
    xmlhttpSM.send();
    
}


    
function enviaMsj(vendedor, e){
    
    var key=e.keyCode || e.which;
        if(key == 13){
            
    msj = document.getElementById("textoMsj").value; 
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
                        document.getElementById("nel").innerHTML=xmlhttpSM.responseText;
                    }
                }
     //showChatVendedor(compradro,vendedor);           
    xmlhttpSM.open("GET","messageClient.jsp?action=13&dato1="+comprador+"&dato2="+vendedor+"&dato3="+msj,false);
    xmlhttpSM.send();
    document.getElementById("textoMsj").value = "";
        }
}    

function showVentana(comprador1){
    
   document.getElementById("thisCliente").innerHTML = comprador1; 
   comprador = comprador1; 
   //showChatVendedor(comprador, vendedor); 
}

function showChatVendedor(comprador,vendedor){
  comprador1 = document.getElementById("thisCliente").innerHTML;
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
                        document.getElementById("chatVendedor").innerHTML=xmlhttpSM.responseText;
                    }
                }
    xmlhttpSM.open("GET","messageClient.jsp?action=14&dato1="+comprador1+"&dato2="+vendedor,false);
    xmlhttpSM.send();
    
}
 
 
