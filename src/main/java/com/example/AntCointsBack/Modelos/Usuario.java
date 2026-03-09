package com.example.AntCointsBack.Modelos;

import java.util.List;

import com.example.AntCointsBack.Modelos.utils.TipoDocumento;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="nombresCompletos",nullable= false, unique=false, length=50 )
    private String nombre;
    private String apellido;
    @Column(name="tipo_documento",nullable= false, unique=false)
    @Enumerated(EnumType.STRING)
    private String tipodoc;
    @Column(name="documento",nullable= false, unique=true,  length = 15)
    private TipoDocumento documento;
    @Column(name="edad",nullable= true, unique=false)
    private Integer edad;
    @Column(name="email", nullable= false, unique= true, length = 50)
    private String email;
    @Column(name="telefono", nullable=true, unique= false)
    private String telefono;
    @Column(name="telefono", nullable=true, unique= false)
    private String direccion;
    private double saldoDisponible;
    private java.time.LocalDate fechaRegistro;
    

    //creando la primera relacion con la tabla gasto
    // 1 usuario muchos gastos 

    @OneToMany(mappedBy = "usuario")
    private List<Gasto> gastos;


    //creando la relacion con la tabla Metodo de pago
    // 1 usuario muchos metodos xde pago

    @OneToMany(mappedBy = "usuario")
    private List<MetodoPago> metodoPagos;

    public Usuario() {
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public TipoDocumento getDocumento() {
        return documento;
    }

    public void setDocumento(TipoDocumento documento) {
        this.documento = documento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public java.time.LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(java.time.LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    

    


}