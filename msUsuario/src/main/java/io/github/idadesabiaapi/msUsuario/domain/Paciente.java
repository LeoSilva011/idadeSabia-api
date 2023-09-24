package io.github.idadesabiaapi.msUsuario.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Long id;

    private String name;

    private String cpf;

    private String address;

    @OneToMany(mappedBy = "paciente")
    private List<Consulta> consultas;
}
