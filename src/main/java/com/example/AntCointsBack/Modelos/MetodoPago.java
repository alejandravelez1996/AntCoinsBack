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
@Table(name="metodo_pago")
public class MetodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String franquicia;
    private Estados estado;
    private String descripcion;

    //relacion con tabla usuario 
    // 1 usuario asociado a muchos metodos de pago
    @ManyToOne
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id")
    private Usuario usuario;
    


    public MetodoPago() {
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


    public String getFranquicia() {
        return franquicia;
    }


    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }


    public Estados getEstado() {
        return estado;
    }


    public void setEstado(Estados estado) {
        this.estado = estado;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

    
}