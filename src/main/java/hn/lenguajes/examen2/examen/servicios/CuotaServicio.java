package hn.lenguajes.examen2.examen.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes.examen2.examen.modelos.Prestamos;
import hn.lenguajes.examen2.examen.repositorios.CuotasRepositorio;
import hn.lenguajes.examen2.examen.repositorios.PrestamoRepositorio;

@Service

public class CuotaServicio {
    
    @Autowired
    private CuotasRepositorio cuotasRepositorio;


    @Autowired
    private PrestamoRepositorio prestamoRepositorio;



    public Prestamos calcularcuota(){

        
      Prestamos prestamo = new Prestamos();

        return null;

    }

}
