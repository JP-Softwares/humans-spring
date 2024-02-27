package com.jp.softwares.humans.Persistencia;

import com.jp.softwares.humans.Models.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {

    Grupo findByid(Long id);
}
