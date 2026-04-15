package com.hilary.controlAsistencia.Entity;

import com.hilary.controlAsistencia.Enum.EstadoAsistencia;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMateria;

    private String nombre;

    private LocalDate fecha;

    @Enumerated(EnumType.STRING)
    private EstadoAsistencia status;
}
