import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
/* 
        String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "samuel";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345"; */

           String[] usernames = {"samuel","admin","pepe"};
        String[] passwords = {"12345","12345","12345"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el username ");
        String u = sc.next();

        System.out.println("Ingrese el password ");
        String c = sc.next();

        boolean esAuntenticado = false;

        for(int i=0;i<usernames.length;i++){
/* if (usernames[i].equals(u) && passwords[i].equals(c)) {
            esAuntenticado = true;
            break;
        } */
        esAuntenticado = (usernames[i].equals(u) && passwords[i].equals(c)) ? true : esAuntenticado;
        }
       
        /*if (esAuntenticado) {
            System.out.println("Biemvenido usuario " + usernames);
        } else {
             System.out.println("Usuario o contraseña incorrectos");
            System.out.println("lo siento se requiere auntenticacion");
        }*/

        String mensaje = esAuntenticado ? "Biemvenido usuario ".concat(u).concat("!"): "Usuario o contraseña incorrectos";
        System.out.println("Mensaje = "+mensaje);
        sc.close();
    }
}
