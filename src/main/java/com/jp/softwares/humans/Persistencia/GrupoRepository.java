package com.jp.softwares.humans.Persistencia;

import com.jp.softwares.humans.Models.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {

    Grupo findByid(Long id);

    @Query("FROM Grupo")
    Optional<List<Grupo>> listarTodosGrupos();
}
