import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        // String numeroStr = sc.nextLine(); ;
        int numeroDecimal = 0;
        try {
            numeroDecimal = sc.nextInt();// Integer.parseInt(numeroStr);
        } catch (InputMismatchException e) {
            System.out.println("debe ingresar un numero entero" + e.getMessage());
            main(args);
            System.exit(0);
        }
        String mensaje = "\nnumero bnario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nnumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensaje);
        sc.close();// siempre se cierra el scanner como buena practica
    }

}
