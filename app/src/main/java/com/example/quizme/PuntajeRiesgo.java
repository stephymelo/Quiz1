package com.example.quizme;

public class PuntajeRiesgo {
    private int opcion1N, opcion2N, opcion3N, opcion4N, opcion5N;
    private int opcion1S, opcion2S, opcion3S, opcion4S, opcion5S, opcion6S, opcion7S;
    private int sumaTotal;
    private int sumaSin;
    private int sumaNexo;


    public PuntajeRiesgo() {
        this.opcion1N = opcion1N;
        this.opcion2N = opcion2N;
        this.opcion3N = opcion3N;
        this.opcion4N = opcion4N;
        this.opcion5N = opcion5N;
        this.opcion1S = opcion1S;
        this.opcion2S = opcion2S;
        this.opcion3S = opcion3S;
        this.opcion4S = opcion4S;
        this.opcion5S = opcion5S;
        this.opcion6S = opcion6S;
        this.opcion7S = opcion7S;
        this.sumaTotal = sumaTotal;
        sumaSin = 0;
        sumaNexo = 0;

        sumaSintomas();
        sumaNexo();
    }


    public void sumaSintomas() {
        sumaSin = opcion1S + opcion2S + opcion3S + opcion4S + opcion5S + opcion6S + opcion7S;

    }

    public void sumaNexo() {
        sumaNexo = opcion1N + opcion2N + opcion3N + opcion4N + opcion5N;

    }

    public int getOpcion1N() {
        return opcion1N;
    }

    public int getOpcion2N() {
        return opcion2N;
    }

    public int getOpcion3N() {
        return opcion3N;
    }

    public int getOpcion4N() {
        return opcion4N;
    }

    public int getOpcion5N() {
        return opcion5N;
    }

    public int getOpcion1S() {
        return opcion1S;
    }

    public int getOpcion2S() {
        return opcion2S;
    }

    public int getOpcion3S() {
        return opcion3S;
    }

    public int getOpcion4S() {
        return opcion4S;
    }

    public int getOpcion5S() {
        return opcion5S;
    }

    public int getOpcion6S() {
        return opcion6S;
    }

    public int getOpcion7S() {
        return opcion7S;
    }

    public int getSumaTotal() {
        return sumaTotal;
    }

    public int getSumaSin() {
        return sumaSin;
    }

    public int getSumaNexo() {
        return sumaNexo;
    }


    public void setOpcion1N(int opcion1N) {
        this.opcion1N = opcion1N;
    }

    public void setOpcion2N(int opcion2N) {
        this.opcion2N = opcion2N;
    }

    public void setOpcion3N(int opcion3N) {
        this.opcion3N = opcion3N;
    }

    public void setOpcion4N(int opcion4N) {
        this.opcion4N = opcion4N;
    }

    public void setOpcion5N(int opcion5N) {
        this.opcion5N = opcion5N;
    }

    public void setOpcion1S(int opcion1S) {
        this.opcion1S = opcion1S;
    }

    public void setOpcion2S(int opcion2S) {
        this.opcion2S = opcion2S;
    }

    public void setOpcion3S(int opcion3S) {
        this.opcion3S = opcion3S;
    }

    public void setOpcion4S(int opcion4S) {
        this.opcion4S = opcion4S;
    }

    public void setOpcion5S(int opcion5S) {
        this.opcion5S = opcion5S;
    }

    public void setOpcion6S(int opcion6S) {
        this.opcion6S = opcion6S;
    }

    public void setOpcion7S(int opcion7S) {
        this.opcion7S = opcion7S;
    }

    public void setSumaTotal(int sumaTotal) {
        this.sumaTotal = sumaTotal;
    }

    public void setSumaSin(int sumaSin) {
        this.sumaSin = sumaSin;
    }

    public void setSumaNexo(int sumaNexo) {
        this.sumaNexo = sumaNexo;
    }
}
