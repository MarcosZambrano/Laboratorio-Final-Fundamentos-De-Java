package com.gm.mundopc;

public class Raton extends DispositivoEntrada {
    private int idRaton;
    private int contadorRatones;

    public Raton() {

    }

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++contadorRatones;
    }

    public int getIdRaton() {
        return idRaton;
    }

    public int getContadorRatones() {
        return contadorRatones;
    }

    public String toString() {
        return "IdRaton: " + idRaton + ", cantidad de ratones: " + contadorRatones;
    }
}
