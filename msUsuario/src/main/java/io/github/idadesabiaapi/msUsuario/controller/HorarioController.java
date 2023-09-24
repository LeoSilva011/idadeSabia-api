package io.github.idadesabiaapi.msUsuario.controller;
import io.github.idadesabiaapi.msUsuario.domain.Horario;
import io.github.idadesabiaapi.msUsuario.repository.HorarioRepository;
import io.github.idadesabiaapi.msUsuario.service.HorarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("horario")

public class HorarioController {



    private final   HorarioRepository horarioRepository;
    private final  HorarioService horarioService;



    @GetMapping("/status")
    public String status(){
        return "ok";
    }


    @GetMapping
    public List<Horario> listar (Horario horario) {
        List<Horario> horarios = horarioRepository.findAll();
        return horarios;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Horario adicionar (@Validated @RequestBody Horario horario) {
        return horarioService.criarAgendamento(horario);
    }
}
