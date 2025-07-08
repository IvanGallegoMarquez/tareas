package com.ivan.tareas;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tarea {

    @Id
    private Long id;

    private String descripcion;
    private boolean completada;


    //Constructores
    public Tarea() {}


    public Tarea(Long id, String descripcion, boolean completada){
        this.id = id;
        this.descripcion = descripcion;
        this.completada = completada;
    }

    //Getters nd Setters
    public Long getId() {return id;}
    public String getDescripcion() {return descripcion;}
    public boolean isCompletada() {return completada;}

    public void setId(Long id) {
        this.id = id;}

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;}

    public void setCompletada(boolean completada) {
        this.completada = completada;}
}
