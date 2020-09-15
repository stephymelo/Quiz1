package com.example.quizme;

public class Names {
    private String name,id,puntaje;
    public Names(String name,String id,String puntaje){
        this.name=name;
        this.id=id;
        this.puntaje=puntaje;

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }
}
