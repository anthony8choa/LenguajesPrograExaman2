package hn.lenguajes.examen2.examen.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes.examen2.examen.modelos.Cliente;
import hn.lenguajes.examen2.examen.modelos.Prestamos;
import hn.lenguajes.examen2.examen.repositorios.ClienteRepositorio;

@Service
public class ClienteServicio {
    
    @Autowired
    private ClienteRepositorio clienteRepositorio;


    public Cliente crearCliente(Cliente nvoCliente){
        if(!this.clienteRepositorio.existsById(nvoCliente.getDni())){
            List<Prestamos> cuentaNueva = nvoCliente.getPrestamos();
            for(Prestamos cuentaGuardar : cuentaNueva){
                cuentaGuardar.setCliente(nvoCliente);
            }
        }
        return null;
    }
     

}
