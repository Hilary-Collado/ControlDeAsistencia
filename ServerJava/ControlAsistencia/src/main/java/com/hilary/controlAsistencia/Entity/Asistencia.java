package com.hilary.controlAsistencia.Entity;

import com.hilary.controlAsistencia.Enum.EstadoAsistencia;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "asistencia")
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAsistencia;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "asignacion_id")
    private Asignacion asignacion;

    private LocalDate fecha;

    @Enumerated(EnumType.STRING)
    private EstadoAsistencia status;

    private String descripcion;
}
