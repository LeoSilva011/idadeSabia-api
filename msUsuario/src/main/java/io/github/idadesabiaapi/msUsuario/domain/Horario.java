package io.github.idadesabiaapi.msUsuario.domain;



import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;


@Entity
@Data
public class Horario {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String diaDaSemana;

    private LocalTime horarioInicial;

    private LocalTime horarioFinal;
}
