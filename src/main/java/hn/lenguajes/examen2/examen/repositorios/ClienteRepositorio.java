package hn.lenguajes.examen2.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes.examen2.examen.modelos.Cliente;

public interface  ClienteRepositorio  extends JpaRepository<Cliente, String> {
    
}
