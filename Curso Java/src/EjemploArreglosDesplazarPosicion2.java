import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {
        int []a = new int [10];
        int elemento, psicion;
        Scanner s = new Scanner(System.in);

        for (int i =0;i<a.length-1;i++){
            System.out.print("ingrese el numero");
            a[i]=s.nextInt();
        }

        System.out.println();
        System.out.println("Nuevo elemento: ");
        elemento = s.nextInt();

        System.out.println("Posicion donde agregar el elemento (de 0-9) ");
        psicion = s.nextInt();

        for (int i=a.length-2;i>=psicion;i--){
            a[i+1]=a[i];
        }
        a[psicion]= elemento; 

        System.out.println("El arreglo:");
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
