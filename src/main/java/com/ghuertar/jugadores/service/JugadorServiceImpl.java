package com.ghuertar.jugadores.service;

import com.ghuertar.jugadores.dto.JugadorDTO;
import com.ghuertar.jugadores.entity.Jugador;
import com.ghuertar.jugadores.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorServiceImpl implements JugadorService {

    @Autowired
    private JugadorRepository repo;

    @Override
    public List<Jugador> listar() {
        return repo.findAll();
    }

    @Override
    public Jugador guardar(JugadorDTO dto) {
        Jugador jugador = new Jugador(null, dto.nombre(), dto.edad(), dto.posicion());
        return repo.save(jugador);
    }

    @Override
    public Jugador actualizar(Long id, JugadorDTO dto) {
        Jugador jugador = new Jugador(id, dto.nombre(), dto.edad(), dto.posicion());
        return repo.save(jugador);
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
