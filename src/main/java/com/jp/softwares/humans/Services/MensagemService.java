package com.jp.softwares.humans.Services;


import com.jp.softwares.humans.Models.Grupo;
import com.jp.softwares.humans.Models.Mensagem;
import com.jp.softwares.humans.Models.Records.mensagemJson;
import com.jp.softwares.humans.Persistencia.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MensagemService {

    @Autowired
    private MensagemRepository mensagem;



    public Mensagem Salvar(mensagemJson json){
        Mensagem men = new Mensagem();
        men.setConteudo(json.conteudo());
        men.setDataHora(json.dataHora());
        men.setNomeUsuario(json.nomeUsuario());
        Mensagem envio = mensagem.save(men);
        return envio;
    }

    public List<Mensagem> ListarTodos(){
        return mensagem.ListarTodasAsMensagens().orElseGet(ArrayList::new);
    }

    public Mensagem Buscar(long id){
        return mensagem.findByid(id);
    }
}
