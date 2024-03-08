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

    @Autowired
    private GrupoService grupos;



    public mensagemJson Salvar(mensagemJson json){
        Mensagem men = new Mensagem();
        men.setConteudo(json.conteudo());
        men.setDataHora(json.dataHora());
        men.setNomeUsuario(json.nomeUsuario());
        men.setGroupid(new Grupo(json.groupid()));
        Mensagem envio = mensagem.save(men);
        return new mensagemJson(men.getNomeUsuario(), men.getConteudo(), men.getDataHora(), men.getGroupid().getId());
    }

    public List<Mensagem> ListarTodos(){
        return mensagem.ListarTodasAsMensagens().orElseGet(ArrayList::new);
    }

    public Mensagem Buscar(long id){
        return mensagem.findByid(id);
    }

    public List<Mensagem> ListarDoGrupo(Long id){
        return mensagem.listarTodasDoGrupo(new Grupo(id)).orElseGet(ArrayList::new);

    }


}
