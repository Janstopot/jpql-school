package com.ironhack.school.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Student extends Person {

    private int numeroCreditos;
    private String tutor;

    public Student(int id, String nombre, String fechaNacimiento, Address direccionFacturacion, Address direccionDeEnvio, int numeroCreditos, String tutor) {
        super(id, nombre, fechaNacimiento, direccionFacturacion, direccionDeEnvio);
        this.numeroCreditos = numeroCreditos;
        this.tutor = tutor;
    }

    public Student(int numeroCreditos, String tutor) {
        this.numeroCreditos = numeroCreditos;
        this.tutor = tutor;
    }

    public Student() {}
}
