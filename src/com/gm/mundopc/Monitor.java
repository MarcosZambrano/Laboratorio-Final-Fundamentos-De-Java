package com.gm.mundopc;

public class Monitor extends Computadora{
    private int idMonitor;
    private String marca;
    private double tamaño;
    private int contadorMonitores;

    Monitor() {
        this.idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamaño) {
        this();
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public int getIdMonitores() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getContadorMonitores() {
        return contadorMonitores;
    }

    public String toString() {
        return "IdMonitor: " + idMonitor + ", marca de monitor: " + marca + ", tamaño del monitor: " + tamaño + ", cantidad de monitores: " + contadorMonitores;
    }
}
