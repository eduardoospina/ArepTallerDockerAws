var app = (function(){

    var URLE = "http//localhost:34999/agregar?word=";

    function enviarMensaje(){
        var mensajeAInsertar = document.getElementById("inputName").value;
        console.info(mensajeAInsertar)
        $.ajax({
            url: URLE + mensajeAInsertar,
            type:'POST'
        }).then(function(data){
           alert(response.status)
        });
    }

    return{
        enviar:enviarMensaje
    };
})();