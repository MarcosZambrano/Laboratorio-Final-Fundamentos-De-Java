package mundopc;
import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        // Definimos objetos hijos
        Monitor monitor1 = new Monitor("NTX Geforce", 100.2);
        Teclado teclado1 = new Teclado("teclado", "Republic of Gamers");
        Raton raton1 = new Raton("raton", "Microsoft");

        // Definimos objeto computadora1 con argumentos de tipo Object
        Computadora computadora1 = new Computadora("ASUS", monitor1, teclado1, raton1);

        Orden orden1 = new Orden(); // Definimos Orden

        orden1.agregarComputadora(computadora1); // Agregamos Orden

        // Imprimimos la orden
        orden1.mostrarOrden();
    }
}
