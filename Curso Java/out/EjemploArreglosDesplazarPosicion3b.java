import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3 {
    public static void main(String[] args) {
        int [] a = new int [7];
        int numero, poscion;
        Scanner s = new Scanner (System.in);


        for (int i =0;i<a.length-1;i++){
            System.out.println("Ingrese numero");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Ingrese el numero a insertar");
        numero = s.nextInt();

        poscion =0;
        while (poscion<6 && numero > a[poscion]) {
            poscion++;
        }
        for (int i=a.length-2;i>=poscion;i--){
            a[i+1]= a[i];
        }

        a [poscion]= numero;
        System.out.println("Arreglo ordenado: ");
        for(int i=0;i<a.length;i++){
            System.out.println(i+" => "+a[i]);
        }
    }

}
