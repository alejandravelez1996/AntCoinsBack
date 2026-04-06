package com.example.AntCointsBack.Modelos;

import com.example.AntCointsBack.Modelos.utils.Estados;
import com.example.AntCointsBack.Modelos.utils.TipoDocumento;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String correo;
    private String telefono;


    @Enumerated(EnumType.STRING)
    private TipoDocumento tipoDocumento;

    private String numeroDocumento;

    @Enumerated(EnumType.STRING)
    private Estados estado;

    // RELACION: un usuario tiene muchos gastos
    @OneToMany(mappedBy = "usuario")
    private List<Gasto> gastos;

    // RELACION: un usuario tiene muchos metodos de pago
    @OneToMany(mappedBy = "usuario")
    private List<MetodoPago> metodoPagos;

    public Usuario() {}



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

    public String getCorreo() { 
        return correo; 
    }
    public void setCorreo(String correo) { 
        this.correo = correo; 
    }

    public String getTelefono() { 
        return telefono; 
    }
    public void setTelefono(String telefono) { 
        this.telefono = telefono; 
    }

    public TipoDocumento getTipoDocumento() { 
        return tipoDocumento; 
    }
    public void setTipoDocumento(TipoDocumento tipoDocumento) { 
        this.tipoDocumento = tipoDocumento; 
    }

    public String getNumeroDocumento() { 
        return numeroDocumento; 
    }
    public void setNumeroDocumento(String numeroDocumento) { 
        this.numeroDocumento = numeroDocumento; 
    }

    public Estados getEstado() { 
        return estado; 
    }
    public void setEstado(Estados estado) { 
        this.estado = estado; 
    }

    public List<Gasto> getGastos() { 
        return gastos; 
    }
    public void setGastos(List<Gasto> gastos) { 
        this.gastos = gastos; 
    }

    public List<MetodoPago> getMetodoPagos() { 
        return metodoPagos; 
    }
    public void setMetodoPagos(List<MetodoPago> metodoPagos) { 
        this.metodoPagos = metodoPagos; 
    }
}