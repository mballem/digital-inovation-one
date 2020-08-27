function clicou() {
    console.log("Obrigado pelo click!");
    var p = document.getElementById("agradecimento");
    p.innerHTML = "<b>Obrigado por clicar!</b>";
}

function redirecionar() { 
    // abre nova aba
    window.open("https://github.com/");
    // abre na aba atual
    window.location.href = "https://github.com/";
}

function trocar() {
    //alert("trocar texto");
    var p = document.getElementById("trocando");
    p.innerHTML = "Tarefa concluída!";
}

function voltar() {
    //alert("trocar texto");
    var p = document.getElementById("trocando");
    p.innerHTML = "Passe o mouse aqui";
}

function trocar2(element) {
    element.innerHTML = "Tarefa 2 concluída!";
}

function voltar2(element) {
    element.innerHTML = "Passe o mouse aqui 2";
}

function alterar(element) {
    var fruta = element.value;
    document.getElementById("fruta").innerHTML = fruta;
}