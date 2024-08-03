package hn.lenguajes.examen2.examen.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="cuotas")
public class Cuotas {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long codigoCuota;
    
    private Integer mes;

    private double interes;

    private double capital;

    private double saldo;

    @ManyToOne
     @JoinColumn(name = "codigoPrestamo")
    private Prestamos prestamos;
}
