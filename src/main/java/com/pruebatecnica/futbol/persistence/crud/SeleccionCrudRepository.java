package com.pruebatecnica.futbol.persistence.crud;

import java.util.List;
import java.util.Optional;


import org.springframework.data.repository.CrudRepository;

import com.pruebatecnica.futbol.persistence.entity.Seleccion;

public interface SeleccionCrudRepository extends CrudRepository<Seleccion, Integer> {
  Optional<List<Seleccion>> findAllByOrderByIdSeleccionAsc();
}
