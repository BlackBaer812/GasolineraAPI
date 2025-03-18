package com.mrc.gasolinera.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Suministro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Date fechaHora;
    private Double volumenLitros;
    private Double importeLitros;

    @ManyToOne
    private Producto producto;

    @ManyToOne
    private Surtidor surtidor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Double getVolumenLitros() {
        return volumenLitros;
    }

    public void setVolumenLitros(Double volumenLitros) {
        this.volumenLitros = volumenLitros;
    }

    public Double getImporteLitros() {
        return importeLitros;
    }

    public void setImporteLitros(Double importeLitros) {
        this.importeLitros = importeLitros;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Surtidor getSurtidor() {
        return surtidor;
    }

    public void setSurtidor(Surtidor surtidor) {
        this.surtidor = surtidor;
    }
}
