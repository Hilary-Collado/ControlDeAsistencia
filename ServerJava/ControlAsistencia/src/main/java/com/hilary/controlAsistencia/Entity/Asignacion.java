package com.hilary.controlAsistencia.Entity;

import com.hilary.controlAsistencia.Enum.EstadoAsistencia;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Asignacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsignacion;

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;

    @ManyToOne
    @JoinColumn(name = "materia_id")
    private Materia materia;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    private LocalDate fecha;

    @Enumerated(EnumType.STRING)
    private EstadoAsistencia status;
}