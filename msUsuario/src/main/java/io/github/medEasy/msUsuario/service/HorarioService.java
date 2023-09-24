package io.github.medEasy.msUsuario.service;

import io.github.medEasy.msUsuario.domain.Horario;
import io.github.medEasy.msUsuario.repository.HorarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class HorarioService {



    private  final HorarioRepository horarioRepository;

    @Autowired
    public HorarioService(HorarioRepository horarioRepository) {
        this.horarioRepository = horarioRepository;
    }


   public Horario buscar(Long id) {
       return horarioRepository.findById(id)
               .orElseThrow(() -> new RuntimeException("Horario não existente"));
   }

    public Horario criarAgendamento(Horario horario) {
       return horarioRepository.save(horario);
    }
    }

