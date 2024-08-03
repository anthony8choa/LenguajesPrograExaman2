package hn.lenguajes.examen2.examen.modelos;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="prestamos")
public class Prestamos {
    

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="codigoPrestamo")
    private long codigoPrestamo;

    private LocalDate fechaApertura;

    private double monto;

    private double cuota;

    private Integer plazo;

    @ManyToOne
     @JoinColumn(name = "dni")
    private Cliente cliente;

    @OneToMany(mappedBy="prestamos", cascade= CascadeType.ALL)
    private List<Cuotas> cuotas;
    
}
