public class EjemploStringImutable {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Samuel Perez";

        String resultado = curso.concat(profesor);
        System.out.println("Curso " + curso);
        System.out.println("Resultado " + resultado);
        System.out.println("curso==resultado " + curso == resultado);
        String resultado2 = curso.transform((c) -> {
            return c + " con " + profesor;
        });
        System.out.println("Resultado2 = " + resultado2);
        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado3 = " + resultado3);
    }
}
