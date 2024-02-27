package com.jp.softwares.humans.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Mensagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private String nomeUsuario;

    private String conteudo;

    private Date dataHora;

    @ManyToOne
    private Grupo groupid;

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public void setGrupo(Grupo grupo) {
        this.groupid = grupo;
    }
}
