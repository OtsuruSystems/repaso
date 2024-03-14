import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        int a = sc.nextInt();
        System.out.println("Ingresa el segundo numero");
        int b = sc.nextInt();
String resul = (a>b) ? a+","+b : b+","+a;
System.out.println(resul);
sc.close();*/ 

Scanner sc = new Scanner( System.in);
 System.out.println("Ingresa el numero de litros");
        int a = sc.nextInt();

if(a == 70){
    System.out.println("Estanque lleno");
}if(a<70 && a >=60){
      System.out.println("Estanque casi lleno");
}if(a<60 && a >=40){
      System.out.println("Estanque a 3/4");
}if(a<40 && a >=35){
      System.out.println("Medio Estanque ");
}if(a<35 && a >=20){
      System.out.println("Suficiente");
}if(a<20 && a >=1){
      System.out.println("Insuficiente");
}else{
    System.out.println("Numero no encontrado");
}
sc.close();
    }
}
