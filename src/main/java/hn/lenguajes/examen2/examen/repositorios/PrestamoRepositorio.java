package hn.lenguajes.examen2.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes.examen2.examen.modelos.Prestamos;

public interface  PrestamoRepositorio  extends JpaRepository<Prestamos, Long> {
    
}
