package com.pruebatecnica.futbol.persistence.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.pruebatecnica.futbol.persistence.entity.Posicion;

public interface PosicionCrudRepository extends CrudRepository<Posicion, Integer> {
  Optional<List<Posicion>> findAllByOrderByIdPosicionAsc();
}
