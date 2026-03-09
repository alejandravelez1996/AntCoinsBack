package com.example.AntCointsBack.Modelos;

import com.example.AntCointsBack.Modelos.utils.Estados;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private java.time.LocalDate fechaCreacion;
    private String responsable;
    private String justificacion;
    private String descripcion;
    private double presupuestoLimite;
    private double gastoActual;
    private Estados estado;
    private String tipo;


    //relacion con tabla gasto
    //categoria asociado a 1 solo gasto

    @ManyToOne
    @JoinColumn(name = "fk_gasto", referencedColumnName = "id")
    private Gasto gasto;


    public Categoria() {
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public java.time.LocalDate getFechaCreacion() {
        return fechaCreacion;
    }


    public void setFechaCreacion(java.time.LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }


    public String getResponsable() {
        return responsable;
    }


    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }


    public String getJustificacion() {
        return justificacion;
    }


    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public double getPresupuestoLimite() {
        return presupuestoLimite;
    }


    public void setPresupuestoLimite(double presupuestoLimite) {
        this.presupuestoLimite = presupuestoLimite;
    }


    public double getGastoActual() {
        return gastoActual;
    }


    public void setGastoActual(double gastoActual) {
        this.gastoActual = gastoActual;
    }


    public Estados getEstado() {
        return estado;
    }


    public void setEstado(Estados estado) {
        this.estado = estado;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    


}
