package com.javanauta.usuario.infrastructure.repository;

import com.spring4.aprendendo_spring4.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepsitory extends JpaRepository<Usuario,Long> {


}
