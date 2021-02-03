function consultaCep() {
    var cep = document.getElementById("cep").value;
    $.ajax({
        url: 'https://viacep.com.br/ws/' + cep + '/json/',
        type: 'GET',
        success: function(response){
            console.log(response);
            //$("#logradouro").html(response.logradouro); // com jquery
            //document.getElementById("logradouro").innerHTML = response.logradouro; // com js puro
            
            $("#logradouro").html(response.logradouro);
            $("#bairro").html(response.bairro);
            $("#localidade").html(response.localidade);
            $("#uf").html(response.uf);
            $("#numero_cep").html('CEP: ' + response.cep);

        }  
    })
}