import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

      //  String[] productos = new String[7];
        String[] productos = {"Kingston pendrive 64gb","Samsumg Galaxi","Disco duro adata","Audifonos de gato",
                "Mouse bluetoo","Teclado havit","Monitor DELL"};
        int total = productos.length;


        /*productos[0] = "Kingston pendrive 64gb";
        productos[1] = "Samsumg Galaxi";
        productos[2] = "Disco duro adata";
        productos[3] = "Audifonos de gato";
        productos[4] = "Mouse bluetoo";
        productos[5] = "Teclado havit";
        productos[6] = "Monitor DELL";*/
        Arrays.sort(productos);
        System.out.println("==== Usando for ====");
        for (int i = 0; i <= total - 1; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
        System.out.println("==== Usando for inverso ====");
        for (int i = 0; i < total; i++) {
            System.out.println("para i = " + (total - 1 - i) + " valor: " + productos[total - 1 - i]);
        }
        System.out.println("==== Usando for inverso 2 ====");
        for (int i = total - 1; i >= 0; i--) { 
            System.out.println("para i = " + i + " valor: " + productos[i]);
        }

    }
}
