import java.util.Arrays;

public class EjeploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "Kingston pendrive 64gb";
        productos[1] = "Samsumg Galaxi";
        productos[2] = "Disco duro adata";
        productos[3] = "Audifonos de gato";
        productos[4] = "Mouse bluetoo";
        productos[5] = "Teclado havit";
        productos[6] = "Monitor DELL";

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("productos[0] = " + prod1);
        System.out.println("productos[1] = " + prod2);
        System.out.println("productos[2] = " + prod3); 
        System.out.println("productos[3] = " + prod4);
        System.out.println("productos[4] = " + prod5);
        System.out.println("productos[5] = " + prod6);
        System.out.println("productos[6] = " + prod7);


        int[] enteros = new int[4];
        enteros[0] = 10;
        enteros[1] = Integer.valueOf("75");
        enteros[2] = 34;
        enteros[3] = -4;
        //enteros[4]=5;

        Arrays.sort(enteros);

        int i = enteros[0];
        int j = enteros[1];
        int k = enteros[2];
        int l = enteros[enteros.length - 1];
        //int m = enteros[4];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
