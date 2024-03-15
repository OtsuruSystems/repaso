import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3b {
    public static void main(String[] args) {
        int [] a = new int [7];
        int numero, poscion, ultimo;
        Scanner s = new Scanner (System.in);


        for (int i =0;i<a.length;i++){
            System.out.println("Ingrese numero");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Ingrese el numero a insertar");
        numero = s.nextInt();

        ultimo= a[a.length-1];
        poscion =0;
        while (poscion<6 && numero > a[poscion]) {
            poscion++;
        }
        for (int i=a.length-2;i>=poscion;i--){
            a[i+1]= a[i];
        }

        int []b = new int [a.length+1];
        System.arraycopy(a,0,b,0,a.length);

if(numero>ultimo){
    b[b.length-1] = numero;
}
else {
    b[b.length - 1] = ultimo;
    b[poscion] = numero;
}
           System.out.println("Arreglo ordenado: ");
        for(int i=0;i<b.length;i++){
            System.out.println(i+" => "+b[i]);
        }
    }

}
