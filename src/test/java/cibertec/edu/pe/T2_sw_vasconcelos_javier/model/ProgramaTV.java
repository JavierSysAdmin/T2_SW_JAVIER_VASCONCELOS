package cibertec.edu.pe.T2_sw_vasconcelos_javier.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "Personaje")
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPersonaje")
    private Integer id;

    @Column(name = "NomPersonaje", nullable = false, length = 50)
    private String nombre;

    @Column(name = "ApePersonaje", nullable = false, length = 50)
    private String apellido;

    @Column(name = "FechNacPersonaje", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    // Getters y Setters

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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
