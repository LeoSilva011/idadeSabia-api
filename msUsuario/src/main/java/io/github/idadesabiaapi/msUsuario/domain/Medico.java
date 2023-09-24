package io.github.idadesabiaapi.msUsuario.domain;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String especialidade;



}
