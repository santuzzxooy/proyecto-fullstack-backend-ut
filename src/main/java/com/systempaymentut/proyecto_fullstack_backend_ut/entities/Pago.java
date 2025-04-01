package com.systempaymentut.proyecto_fullstack_backend_ut.entities;

import java.time.LocalDate;

import com.systempaymentut.proyecto_fullstack_backend_ut.enums.PagoStatus;
import com.systempaymentut.proyecto_fullstack_backend_ut.enums.TypePago;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class Pago {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;
    private Double cantidad;
    private TypePago type;
    private PagoStatus status;

    private String file;

    @ManyToOne
    private Estudiante estudiante;

}
