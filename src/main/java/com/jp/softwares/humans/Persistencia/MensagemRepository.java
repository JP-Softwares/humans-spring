package com.jp.softwares.humans.Persistencia;

import com.jp.softwares.humans.Models.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensagemRepository extends JpaRepository<Mensagem, Long> {

    Mensagem findByid(Long id);
}
