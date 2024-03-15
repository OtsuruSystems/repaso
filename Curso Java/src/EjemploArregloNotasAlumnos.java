import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHIstoria, claseEspañol;
        int sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasEspañol = 0;
        claseMatematicas = new double[7];
        claseHIstoria = new double[7];
        claseEspañol = new double[7]; 

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa 7 notas para estudiantes de Matematicas: ");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = sc.nextDouble();
        }
        System.out.println("Ingresa 7 notas para estudiantes de Historia: ");
        for (int i = 0; i < claseHIstoria.length; i++) {
            claseHIstoria[i] = sc.nextDouble();
        }
        System.out.println("Ingresa 7 notas para estudiantes de Español: ");
        for (int i = 0; i < claseEspañol.length; i++) {
            claseEspañol[i] = sc.nextDouble();
        }
        for (int i = 0; i < 7; i++) {
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHIstoria[i];
            sumNotasEspañol += claseEspañol[i];
        }
        double promedioMatematicas = (sumNotasMatematicas / claseMatematicas.length);
        double promedioHistoria = (sumNotasHistoria / claseHIstoria.length);
        double promedioEspañol = (sumNotasEspañol / claseEspañol.length);
        System.out.println("Promedio clase Mateticas: " + promedioMatematicas);
        System.out.println("Promedio clase Historia: " + promedioHistoria);
        System.out.println("Promedio clase Español: " + promedioEspañol);
        System.out.println("Promedio total del curso " + (promedioEspañol + promedioHistoria + promedioMatematicas) / 3);

        System.out.println("Ingrese el identificador del alumno (0-6):");
        int id = sc.nextInt();
        double promedioAlumno = (claseMatematicas[id] + claseHIstoria[id] + claseEspañol[id] / 3);
        System.out.println("promedio Alumno No = " + id + " : " + promedioAlumno);
    }
}
