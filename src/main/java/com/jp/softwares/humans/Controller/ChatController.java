package com.jp.softwares.humans.Controller;


import com.jp.softwares.humans.Models.Mensagem;
import com.jp.softwares.humans.Models.Records.mensagemJson;
import com.jp.softwares.humans.Services.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Chat")
public class ChatController {

    @Autowired
    private MensagemService mensagens;

    @PostMapping
    public Mensagem salvarMensagem(@ModelAttribute mensagemJson json){
        return mensagens.Salvar(json);
    }

    @GetMapping("/{id}")
    public Mensagem buscarMensagem(@PathVariable long id){
        return mensagens.Buscar(id);
    }

    @GetMapping
    public String API_Padrao(){
        return "Teste com sucesso";
    }


}
