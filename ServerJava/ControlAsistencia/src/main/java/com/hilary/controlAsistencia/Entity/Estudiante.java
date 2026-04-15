package com.hilary.controlAsistencia.Entity;

import com.hilary.controlAsistencia.Enum.EstadoAsistencia;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstudiante;

    private String nombre;
    private String apellido;
    private int telefono;
    private String email;

    private LocalDate fecha;

    @Enumerated(EnumType.STRING)
    private EstadoAsistencia status;

}