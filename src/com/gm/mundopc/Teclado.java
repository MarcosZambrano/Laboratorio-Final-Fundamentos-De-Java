package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private int contadorTeclados;

    public Teclado() {

    }

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++contadorTeclados;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public int getContadorTeclados() {
        return contadorTeclados;
    }

    public String toString() {
        return "idTeclado: " + idTeclado + ", cantidad de teclados: " + contadorTeclados;
    }
}
