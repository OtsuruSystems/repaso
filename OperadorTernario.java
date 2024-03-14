import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String variable = 5 == 5? "Si es verdadero" : "si es falsa";
        System.out.println("Variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematicas entre 2.0 - 7");
        matematicas = sc.nextDouble();
        System.out.println("Ingrese la nota de ciencias entre 2.0 - 7");
        ciencias = sc.nextDouble();
        System.out.println("Ingrese la nota de historia entre 2.0 - 7");
        historia = sc.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("Promedio = " + estado);

        System.out.println("Promedio = "+promedio);
        sc.close();
    }
}
