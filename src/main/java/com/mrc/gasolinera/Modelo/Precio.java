package com.mrc.gasolinera.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Precio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Date fechaInicio;
    private Date fechaFin;
    private Double precioPorLitro;

    @ManyToOne
    private Producto producto;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaIncio(Date fechaInicio) {
        this.fechaInicio = this.fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getPrecioPorLitro() {
        return precioPorLitro;
    }

    public void setPrecioPorLitro(Double precioPorLitro) {
        this.precioPorLitro = precioPorLitro;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
