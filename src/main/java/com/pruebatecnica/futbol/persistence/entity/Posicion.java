package com.pruebatecnica.futbol.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "posiciones")
public class Posicion {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_posicion")
  private Integer idPosicion;
  
  private String colocacion;

  public Integer getIdPosicion() {
    return idPosicion;
  }

  public void setIdPosicion(Integer idPosicion) {
    this.idPosicion = idPosicion;
  }

  public String getColocacion() {
    return colocacion;
  }

  public void setColocacion(String colocacion) {
    this.colocacion = colocacion;
  }

  
}
