package com.javanauta.usuario.infrastructure.repository;


import com.javanauta.usuario.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepsitory extends JpaRepository<Usuario,Long> {


}
