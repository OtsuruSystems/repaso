public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNull = curso == null;

        System.out.println(esNull);
        if (esNull) {
            curso = "";// "Programacion Java"
        }

        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio = " + esVacio2);
boolean esBlanco = curso.isBlank();
System.out.println("esBlanco = "+esBlanco);
        if (esBlanco == false) {
            System.out.println(curso.toUpperCase());
            System.out.println("Biemvenido al curso".concat(curso));
        }
    }
}
