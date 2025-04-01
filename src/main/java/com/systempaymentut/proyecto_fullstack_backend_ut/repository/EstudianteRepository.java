package com.systempaymentut.proyecto_fullstack_backend_ut.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.systempaymentut.proyecto_fullstack_backend_ut.entities.Estudiante;
import java.util.List;


@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, String>{

    Estudiante findByCodigo(String codigo);
    List<Estudiante> findByProgramaId(String programaId);
    
}
