package hn.lenguajes.examen2.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes.examen2.examen.modelos.Cuotas;

public interface  CuotasRepositorio extends  JpaRepository<Cuotas, Long> {
    
}
