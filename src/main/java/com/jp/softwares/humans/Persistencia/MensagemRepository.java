package com.jp.softwares.humans.Persistencia;

import com.jp.softwares.humans.Models.Grupo;
import com.jp.softwares.humans.Models.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MensagemRepository extends JpaRepository<Mensagem, Long> {

    Mensagem findByid(Long id);

    @Query("FROM Mensagem")
    Optional<List<Mensagem>> ListarTodasAsMensagens();
}
