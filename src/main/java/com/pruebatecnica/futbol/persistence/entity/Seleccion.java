package com.pruebatecnica.futbol.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "selecciones")
public class Seleccion {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_seleccion")
  private Integer idSeleccion;

  @Column(name = "nombre_seleccion")
  private String nombreSeleccion;

  public Integer getIdSeleccion() {
    return idSeleccion;
  }

  public void setIdSeleccion(Integer idSeleccion) {
    this.idSeleccion = idSeleccion;
  }

  public String getNombreSeleccion() {
    return nombreSeleccion;
  }

  public void setNombreSeleccion(String nombreSeleccion) {
    this.nombreSeleccion = nombreSeleccion;
  }

  
}
