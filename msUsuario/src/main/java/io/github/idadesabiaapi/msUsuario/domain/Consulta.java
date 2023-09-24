package io.github.idadesabiaapi.msUsuario.domain;


import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;

@Entity
@Data

public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

//    @ManyToOne
//    @JoinColumn(name = "medico_id")
//    private Medico medico;

    private LocalDate date;

    @ManyToOne
    private  Horario horario;

    @Enumerated(EnumType.STRING)
    private Status status;
}
