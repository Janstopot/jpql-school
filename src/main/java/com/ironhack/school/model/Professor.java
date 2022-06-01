package com.ironhack.school.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Professor extends Person{

    private double sueldo;
    private int numHoras;


    public Professor(int id, String nombre, String fechaNacimiento, Address direccionFacturacion, Address direccionDeEnvio, double sueldo, int numHoras) {
        super(id, nombre, fechaNacimiento, direccionFacturacion, direccionDeEnvio);
        this.sueldo = sueldo;
        this.numHoras = numHoras;
    }

    public Professor(double sueldo, int numHoras) {
        this.sueldo = sueldo;
        this.numHoras = numHoras;
    }

    public Professor(){}

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }
}
