package com.pruebatecnica.futbol.persistence.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "futbolistas")
public class Futbolista {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_futbolista")
  private Integer idFutbolista;

  @Column(name = "id_posicion")
  private Integer idPosicion;

  @Column(name = "id_seleccion")
  private Integer idSeleccion;

  private String nombres;

  private String apellidos;

  @Column(name = "fecha_nacimiento")
  private LocalDate fechaNacimiento;
  
  private String caracteristicas;

  private String foto;

  @ManyToOne
  @JoinColumn(name = "id_posicion", insertable = false, updatable = false)
  private Posicion posicion;

  @ManyToOne
  @JoinColumn(name = "id_seleccion", insertable = false, updatable = false)
  private Seleccion seleccion;

  public Integer getIdFutbolista() {
    return idFutbolista;
  }

  public void setIdFutbolista(Integer idFutbolista) {
    this.idFutbolista = idFutbolista;
  }

  public Integer getIdPosicion() {
    return idPosicion;
  }

  public void setIdPosicion(Integer idPosicion) {
    this.idPosicion = idPosicion;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public String getCaracteristicas() {
    return caracteristicas;
  }

  public void setCaracteristicas(String caracteristicas) {
    this.caracteristicas = caracteristicas;
  }

  public Posicion getPosicion() {
    return posicion;
  }

  public void setPosicion(Posicion posicion) {
    this.posicion = posicion;
  }

  public Integer getIdSeleccion() {
    return idSeleccion;
  }

  public void setIdSeleccion(Integer idSeleccion) {
    this.idSeleccion = idSeleccion;
  }

  public Seleccion getSeleccion() {
    return seleccion;
  }

  public void setSeleccion(Seleccion seleccion) {
    this.seleccion = seleccion;
  }

  public String getFoto() {
    return foto;
  }

  public void setFoto(String foto) {
    this.foto = foto;
  }
  
}
