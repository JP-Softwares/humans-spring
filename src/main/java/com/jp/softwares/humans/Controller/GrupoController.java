package com.jp.softwares.humans.Controller;


import com.jp.softwares.humans.Models.Grupo;
import com.jp.softwares.humans.Models.Records.grupoJson;
import com.jp.softwares.humans.Services.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Grupo")
public class GrupoController {
    @Autowired
    private GrupoService grupos;

    @PostMapping
    public Grupo criarGrupo(@RequestBody grupoJson json){
        return grupos.salvar(json);
    }

    @GetMapping("/{id}")
    public Grupo buscarGrupo(@PathVariable long id){
        return grupos.buscar(id);
    }

    @GetMapping
    public List<Grupo> ListarGrupos(){
        return grupos.ListarTodos();
    }

}
