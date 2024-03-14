import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String separador = "_";

        System.out.println("Ingresa el primer nombre: ");
        String nombre1 = sc.nextLine();
        System.out.println("Ingresa el segundo nombre: ");
        String nombre2 = sc.nextLine();
        System.out.println("Ingresa el tercer nombre: ");
        String nombre3 = sc.nextLine();

        char[] arr1 = nombre1.toCharArray();
        int i1 = arr1.length;
           for (int i = 0; i < i1; i++) {
            System.out.print(arr1[i]);
        }
        char s1 = nombre1.charAt(2);
        


        System.out.println(""+"."+nombre1.lastIndexOf("2"));

        sc.close();
    }
}
