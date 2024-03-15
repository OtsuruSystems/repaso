import java.util.Scanner;

public class EjemploArreglosBuscarNumeros {
    public static void main(String[] args) {
        int [] a = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i =0;i<a.length;i++){
            System.out.print("Ingrese in numero: ");
            a[i]=sc.nextInt(); 
        }


        System.out.println("\r\nIngrese en numero a buscar:");
        int numero = sc.nextInt();

        int i =0;

        while (i<a.length && a[i]!= numero){
            i++;
        }
        if (i == a.length){
            System.out.println("numero no encontrado");
        }else if(a[i]== numero){
            System.out.println("Encoontrado en la posicion: "+i);
        }

    }
}
