package com.jp.softwares.humans.Services;

import com.jp.softwares.humans.Models.Grupo;
import com.jp.softwares.humans.Models.Records.grupoJson;
import com.jp.softwares.humans.Persistencia.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrupoService {


    @Autowired
    private GrupoRepository grupos;


    public Grupo salvar(grupoJson json){
        Grupo gru = new Grupo();
        gru.setNome(json.nome());
        gru.setStatus(json.status());
        gru.setUltimaInteracao(json.ultimaInteracao());
        return grupos.save(gru);
    }

    public Grupo buscar(long id){
        return grupos.findByid(id);
    }

}
