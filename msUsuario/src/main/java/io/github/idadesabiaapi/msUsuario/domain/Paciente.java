package io.github.idadesabiaapi.msUsuario.domain;


import jakarta.persistence.*;
import lombok.Data;


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
