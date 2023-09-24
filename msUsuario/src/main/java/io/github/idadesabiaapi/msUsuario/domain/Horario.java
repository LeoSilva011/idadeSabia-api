package io.github.idadesabiaapi.msUsuario.domain;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalTime;


@Entity
@Data
public class Horario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String diaDaSemana;

    private LocalTime horarioInicial;

    private LocalTime horarioFinal;
}
