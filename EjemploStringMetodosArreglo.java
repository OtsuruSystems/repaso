public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String trabalengua = "trabalenguas";
        System.out.println("trabalenguas.length = " + trabalengua.length());

        char[] arreglo = trabalengua.toCharArray();
        int largo = arreglo.length;
        System.out.println("Largo = " + largo);
        for (int i = 0; i < largo; i++) {
            System.out.print(arreglo[i]);
        }
        System.out.println("\ntrabalenguas = " + trabalengua.split("a"));

        String[] arreglo2 = trabalengua.split("a");
        int l = arreglo2.length;
        for (int j = 0; j < l; j++) {
            System.out.println(arreglo2[j]);
        }

        String archivo = "Aprendiendo.Java.pdf";
        String[] archivoAr = archivo.split("\\.");
        l = archivoAr.length;
        for (int j = 0; j < l; j++) {
            System.out.println(archivoAr[j]);
        }
        System.out.println("Estension = " + archivoAr[l - 1]);
    }

}
