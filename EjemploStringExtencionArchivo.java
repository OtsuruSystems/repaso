public class EjemploStringExtencionArchivo {
    public static void main(String[] args) {
        String archivo = "AprenfiendoJAva.pdf";
int i = archivo.indexOf(".");
        System.out.println("Archivo.length() = " + archivo.length());
        System.out.println("Archivo.subString(.) = " + archivo.substring(i+1));
    }
}
