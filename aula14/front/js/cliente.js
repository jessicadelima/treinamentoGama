function obterAgencias(){
    fetch("http://localhost:8080/agencias")
    .then(res => res.json())
    .then(result => preencheAgencias(result));
}

function preencheAgencias(resposta){
    let agencias = '';

    for (let index = 0; index < resposta.length; index++) {
        agencias = agencias + `<option value = ${resposta[index].id}> ${resposta[index].nome} </option>`;
    }

    document.getElementById("sel_agencias").innerHTML = agencias;
}


function agendar(event) {

    event.preventDefault();  //não faça o comportamento padrão (enviar o formulário) 

    let nome = document.getElementById("txtNome");
    let email = document.getElementById("txtEmail");
    let celular = document.getElementById("txtCelular");
    let data = document.getElementById("txtData");
    let hora = document.getElementById("txtHora");
    let agencia = document.getElementById("sel_agencias");

    let novoAgendamento = {
        nome: nome.value,
        email: email.value,
        celular: celular.value,
        dataAgendamento: data.value,
        horaAgendamento: hora.value,
        agencia: {id: agencia.value}
    }
    
    let cabecalho = {
        method: 'POST',
        body: JSON.stringify(novoAgendamento),
        headers:{
            'Content-type':'application/json'
        }
    }

    fetch('http://localhost:8080/agendamentos/novo', cabecalho)
    .then( res => tratarResposta(res) );

}    

function tratarResposta (res){
    if(res.status == 200){ //cadastro realizado com sucesso
        alert("Cadastro realizado com sucesso! Não se esqueça de usar a máscara!");
    }else{
        alert("Falha no agendamento! Tente novamente!");
    }
}