package com.gm.mundopc;

public class Orden {
    private int idOrden;
    Computadora computadoras[];
    private int contadorOrdenes;
    private int contadorComputadoras;
    private final int MAX_COMPUTADORAS = 8;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < MAX_COMPUTADORAS) {
            computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado el límite de productos: " + MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden #" + idOrden);
        System.out.println("Cantidad de computadoras: " + contadorComputadoras);
        System.out.println("Computadoras de la orden: \n");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(computadoras[i].toString());
        }
    }
}
