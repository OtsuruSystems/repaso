import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {
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

    public static void sortBurbuja(Object[] arreglo){
        int total = arreglo.length;
        int contador =0;
        for (int i =0;i<total-1;i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                //si cambiamos el '<' por el '>' el arrreglo lo hace de forma desendente
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar; 
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }

    public static void main(String[] args) {

        String[] productos = {"Kingston pendrive 64gb", "Samsumg Galaxi", "Disco duro adata", "Audifonos de gato",
                "Bocina bluetoo", "Teclado havit", "Monitor DELL"};
        int total = productos.length;



            sortBurbuja(productos);
        System.out.println("=== Usando for ====");
        for (int i = 0; i <= total - 1; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        Integer[] enteros = new Integer[4];
        enteros[0] = 10;
        enteros[1] = Integer.valueOf("75");
        enteros[2] = 34;
        enteros[3] = -4;
sortBurbuja(enteros);

for (int i=0;i<enteros.length;i++){
    System.out.println("enteros[i] = " + enteros[i]);
}
    }
}
