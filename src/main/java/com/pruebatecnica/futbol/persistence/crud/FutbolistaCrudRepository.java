package com.pruebatecnica.futbol.persistence.crud;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pruebatecnica.futbol.persistence.entity.Futbolista;

import io.micrometer.common.lang.Nullable;

public interface FutbolistaCrudRepository extends JpaRepository<Futbolista, Integer>{
  default Page<Futbolista> findByIdSeleccion(Pageable pageable, @Nullable int idSeleccion) {
    Futbolista futbolista = new Futbolista();
    futbolista.setIdSeleccion(idSeleccion);

    ExampleMatcher matcher = ExampleMatcher.matching()
      .withIgnoreNullValues()
      .withIgnorePaths("idFutbolista");
    
    Example<Futbolista> example = Example.of(futbolista, matcher);
    Page<Futbolista> futbolistasPaginados = this.findAll(example, pageable);

    return futbolistasPaginados;
  }

  Page<Futbolista> findByIdPosicionAndIdSeleccion(int idPosicion, int idSeleccion, Pageable pageable);
}
