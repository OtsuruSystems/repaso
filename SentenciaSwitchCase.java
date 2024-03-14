import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Escribe el numero del mes");
int mes = sc.nextInt();
String nombreMes = null;

switch(mes){
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
System.out.println(nombreMes);


        int  a = 2;
switch(a){
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
switch(nombre){
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
