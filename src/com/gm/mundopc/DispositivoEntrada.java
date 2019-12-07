package com.gm.mundopc;

public class DispositivoEntrada extends Computadora{
    private String tipoEntrada;
    private String marca;

    public DispositivoEntrada() {

    }

    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String toString() {
        return "Tipo de entrada: " + tipoEntrada + ", marca: " + marca;
    }
}
