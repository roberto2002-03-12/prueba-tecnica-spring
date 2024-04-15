package com.pruebatecnica.futbol.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnica.futbol.domain.service.FutbolistaService;
import com.pruebatecnica.futbol.persistence.entity.*;

@CrossOrigin(origins = "http://localhost:5173/")
@RestController
@RequestMapping("/futbol")
public class FutbolistaController {

  @Autowired
  private FutbolistaService futbolistaService;

  @GetMapping("/futbolista")
  public Page<Futbolista> findAll(
    Pageable pageable,
    @RequestParam(name = "idSeleccion", required = false, defaultValue = "1") int idSeleccion
  ) {
    return futbolistaService.findAll(pageable, idSeleccion);
  }

  @GetMapping("/futbolista/posicion")
  public Page<Futbolista> findByIdSeleccionAndIdPosicion(
    @RequestParam(name = "idSeleccion") int idSeleccion,
    @RequestParam(name = "idPosicion") int idPosicion,  
    Pageable pageable
  ) {
    return futbolistaService.findByIdPosicionAndIdSeleccion(idPosicion, idSeleccion, pageable);
  }

  @GetMapping("/futbolista/{id}")
  public Optional<Futbolista> findByIdFutbolista(@PathVariable("id") int id) {
    return futbolistaService.getFutbolistaById(id);
  }

  @GetMapping("/posiciones")
  public Optional<List<Posicion>> findAllPosiciones() {
    return futbolistaService.getPosiciones();
  }

  @GetMapping("/selecciones")
  public Optional<List<Seleccion>> findAllSelecciones() {
    return futbolistaService.getSelecciones();
  }
}
