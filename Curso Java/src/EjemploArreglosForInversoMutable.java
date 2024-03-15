import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void arregloInverso(String[] arreglo) {
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total / 2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {

        //  String[] productos = new String[7];
        String[] productos = {"Kingston pendrive 64gb", "Samsumg Galaxi", "Disco duro adata", "Audifonos de gato",
                "Mouse bluetoo", "Teclado havit", "Monitor DELL"};
        int total = productos.length;
        Arrays.sort(productos);
       arregloInverso(productos);
       // Collections.reverse(Arrays.asList(productos));
        System.out.println("==== Usando for ====");
        for (int i = 0; i <= total - 1; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]); 
        }
    }
}
