function consultaCep() {
    var cep = document.getElementById("cep").value;
    $.ajax({
        url: 'https://viacep.com.br/ws/' + cep + '/json/',
        type: 'GET',
        success: function(response){
            console.log(response);
            $("#cep").html(response.cep); // com jquery
            document.getElementById("logradouro").innerHTML = response.logradouro;
            document.getElementById("complemento").innerHTML = response.complemento;
            document.getElementById("bairro").innerHTML = response.bairro;
            document.getElementById("localidade").innerHTML = response.localidade;
            $("#uf").html(response.uf); // com jquery
        }  
    })
}