import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;


        productos[0] = "Kingston pendrive 64gb";
        productos[1] = "Samsumg Galaxi";
        productos[2] = "Disco duro adata";
        productos[3] = "Audifonos de gato";
        productos[4] = "Mouse bluetoo";
        productos[5] = "Teclado havit";
        productos[6] = "Monitor DELL";
        Arrays.sort(productos);
        System.out.println("==== Usando for ====");
        for (int i = 0; i <= total - 1; i++) { 

            System.out.println("Para indice " + i + " : " + productos[i]);
        }
        System.out.println("==== Usando foreach ====");
        for (String prod : productos) {

            System.out.println("prod = " + prod);
        }
        System.out.println("==== Usando while ====");
        int i = 0;
        while (i < total) {
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;

        }
        System.out.println("==== Usando do while ====");
        int j = 0;
        do {
            System.out.println("Para indice " + j + " : " + productos[j]);
            j++;
        } while (j < total);
        int[] numeros = new int[10];
        int totalNum = numeros.length;
        for (int k = 0; k < totalNum; k++)
        {
            numeros[k] = k * 7;
        }
        for (int k = 0; k < totalNum; k++)
        {
            System.out.println("numeros = " + numeros[k]);
        }
    }
}
