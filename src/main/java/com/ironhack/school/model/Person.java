package com.ironhack.school.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String fechaNacimiento;
    @Embedded
    private Address direccionFacturacion;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "calle", column = @Column(name = "calle_envio")),
            @AttributeOverride(name = "numero", column = @Column(name = "numero_envio")),
            @AttributeOverride(name = "ciudad", column = @Column(name = "ciudad_envio"))
    }
    )
    private Address direccionDeEnvio;

    public Person(int id, String nombre, String fechaNacimiento, Address direccionFacturacion, Address direccionDeEnvio) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccionFacturacion = direccionFacturacion;
        this.direccionDeEnvio = direccionDeEnvio;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
