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
                        document.getElementById("chatComprador").innerHTML=xmlhttpSM.responseText;
                    }
                }

function iniciarChat(comprador,vendedor){
    
        document.getElementById("chatArea").style.visibility ='visible';
        xmlhttpSM.open("GET","messageClient.jsp?action=10&dato1="+comprador+"&dato2="+vendedor+"",false);
        xmlhttpSM.send(); 
        
        updateAll(comprador,vendedor);

    }
    
function enviaMsj(comprador, vendedor, e){
    
    var key=e.keyCode || e.which;
        if(key == 13){
    msj = document.getElementById("textoMsj").value; 
    alert(msj);
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
                        document.getElementById("hidden").innerHTML=xmlhttpSM.responseText;
                    }
                }
        xmlhttpSM.open("GET","messageClient.jsp?action=11&dato1="+comprador+"&dato2="+vendedor+"&dato3="+msj,false);
    xmlhttpSM.send();
     document.getElementById("textoMsj").value = "";  
        }
       
}    

function showChatComprador(comprador, vendedor){
   xmlhttpSM.open("GET","messageClient.jsp?action=15&dato1="+comprador+"&dato2="+vendedor,false);
    xmlhttpSM.send();  
    
}

function toBottomChatComprador()
	{
		var objControl=document.getElementById("chatComprador");
		objControl.scrollTop = objControl.scrollHeight;
	}
    
function updateAll(comprador, vendedor){
    
    showChatComprador(comprador, vendedor);
    toBottomChatComprador();
    setTimeout(function(){
       updateAll(comprador, vendedor);
       
        //document.getElementById("room").scrollTop(350);
       
    }, 3000);

}        