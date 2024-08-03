package hn.lenguajes.examen2.examen.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajes.examen2.examen.modelos.Cliente;
import hn.lenguajes.examen2.examen.servicios.ClienteServicio;


@RestController
@RequestMapping("/api/crear")
public class ClienteControlador {

    @Autowired
    private ClienteServicio clienteservicio;

    @PostMapping("/cliente")
    public Cliente crearCliente(@RequestBody Cliente nvoCliente) {
   
            return this.clienteservicio.crearCliente(nvoCliente);
        
        
    }
    

}
