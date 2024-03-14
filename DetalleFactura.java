import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioA = 0;
        double precioB = 0;
        System.out.println("Ingrese el precio del primer producto");
        try {
            precioA = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("debe ingresar un numero entero" + e.getMessage());
            main(args);
            System.exit(0);
        }

        System.out.println("ingrese el precio del segundo producto");

        try {
            precioB = sc.nextInt();
        } catch (Exception e) {
            // TODO: handle exception
        }

        double suma = precioA + precioB;
        double porcentaje = 19 * (suma / 100);
        System.out.println("La factura producto de oficina tiene un total bruto de " + suma + ", con un impuesto de "
                + porcentaje + " y el monto despu\u00E9s de impuesto es de " + (suma + porcentaje));
        sc.close();

    }
}
