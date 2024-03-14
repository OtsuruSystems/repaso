import java.util.Scanner;

public class SentenciaSwitchCaseDiasMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero del mes");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año(YYYY)");
        int anio = sc.nextInt();

        int numeroDias = 0;
        String nombreMes = null;
        switch (mes) {
            case 1:
                numeroDias = 31;
                break;
            case 2:
                if (anio % 400 == 0 || (anio % 4 == 0 && !(anio % 100 == 0))) {
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
            case 3:
                numeroDias = 31;
                break;
            case 4:
                numeroDias = 30;
                break;
            case 5:
                numeroDias = 31;
                break;
            case 6:
                numeroDias = 30;
                break;
            case 7:
                numeroDias = 31;
                break;
            case 8:
                numeroDias = 31;
                break;
            case 9:
                numeroDias = 30;
                break;
            case 10:
                numeroDias = 31;
                break;
            case 11:
                numeroDias = 30;
                break;
            case 12:
                numeroDias = 31;
                break;
            default:
                System.out.println("Mes no encontrado");
                break;
        }

        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                System.out.println("Mes no encontrado");
                break;
        }
       System.out.println(numeroDias);
        System.out.println(nombreMes);

        int a = 2;
        switch (a) {
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
            default:
                System.out.println("Valor no encontrado");
                break;
        }

        String nombre = "samuel";
        switch (nombre) {
            case "admin":
                System.out.println("Hola Admin");
                break;
            case "samuel":
                System.out.println("Hola Samuel");
                break;
            case "colitas":
                System.out.println("Hola Colitas");
                break;
            default:
                System.out.println("Usuario no encontrado");
        }
        sc.close();
    }
}
