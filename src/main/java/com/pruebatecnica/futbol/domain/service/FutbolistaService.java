package com.pruebatecnica.futbol.domain.service;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.lang.Nullable;

import com.pruebatecnica.futbol.persistence.crud.FutbolistaCrudRepository;
import com.pruebatecnica.futbol.persistence.crud.PosicionCrudRepository;
import com.pruebatecnica.futbol.persistence.crud.SeleccionCrudRepository;
import com.pruebatecnica.futbol.persistence.entity.Futbolista;
import com.pruebatecnica.futbol.persistence.entity.Posicion;
import com.pruebatecnica.futbol.persistence.entity.Seleccion;

@Service
public class FutbolistaService {
  @Autowired
  private FutbolistaCrudRepository futbolistaCrudRepository;

  @Autowired
  private SeleccionCrudRepository seleccionCrudRepository;

  @Autowired
  private PosicionCrudRepository posicionCrudRepository;

  public Page<Futbolista> findAll(Pageable pageable, @Nullable int idSeleccion) {
    return futbolistaCrudRepository.findByIdSeleccion(pageable, idSeleccion);
  }

  public Page<Futbolista> findByIdPosicionAndIdSeleccion(int idPosicion, int idSeleccion, Pageable pageable) {
    return futbolistaCrudRepository.findByIdPosicionAndIdSeleccion(idPosicion, idSeleccion, pageable);
  }

  public Optional<Futbolista> getFutbolistaById(int idFutbolista) {
    return futbolistaCrudRepository.findById(idFutbolista);
  }

  public Optional<List<Seleccion>> getSelecciones() {
    return seleccionCrudRepository.findAllByOrderByIdSeleccionAsc();
  }

  public Optional<List<Posicion>> getPosiciones() {
    return posicionCrudRepository.findAllByOrderByIdPosicionAsc();
  }
  
}
