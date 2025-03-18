package com.mrc.gasolinera.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Surtidor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String codigo;
    private Date fechaInstalacion;
    private boolean activo;

    @JsonIgnore
    @OneToMany(mappedBy = "surtidor", cascade = CascadeType.ALL)
    private List<Suministro> suministros;

    @JsonIgnore
    @OneToMany(mappedBy = "surtidor", cascade = CascadeType.ALL)
    private List<SurtidorProducto> surtidorProductos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String condigo) {
        this.codigo = condigo;
    }

    public Date getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(Date fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
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
