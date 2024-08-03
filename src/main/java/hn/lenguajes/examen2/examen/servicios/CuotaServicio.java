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
       int  calcular = 0;
       int  tasa  = (int) (0.09/12);

       
      Prestamos prestamo = new Prestamos();

      calcular = (int) ((prestamo.getMonto()* tasa)/ ((Math.pow((1+tasa),60))-1));

        return null;

    }

}
