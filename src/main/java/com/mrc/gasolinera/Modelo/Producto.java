package com.mrc.gasolinera.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String descripcion;
    private String tipo;

    @JsonIgnore
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<Tanque> tanques;

    @JsonIgnore
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<Precio> precios;

    @JsonIgnore
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<Suministro> suministros;

    @JsonIgnore
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<SurtidorProducto> surtidorProductos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Tanque> getTanques() {
        return tanques;
    }

    public void setTanques(List<Tanque> tanques) {
        this.tanques = tanques;
    }

    public List<Precio> getPrecios() {
        return precios;
    }

    public void setPrecios(List<Precio> precios) {
        this.precios = precios;
    }

    public List<Suministro> getSuministros() {
        return suministros;
    }

    public void setSuministros(List<Suministro> suministros) {
        this.suministros = suministros;
    }

    public List<SurtidorProducto> getSurtidorProductos() {
        return surtidorProductos;
    }

    public void setSurtidorProductos(List<SurtidorProducto> surtidorProductos) {
        this.surtidorProductos = surtidorProductos;
    }
}
