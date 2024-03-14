import javax.swing.JOptionPane;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int i = 4, j = 5;
        int suma = i + j;
        System.out.println(suma);
        System.out.println("suma = " + (i + j));

        int resta = i - j;
        System.out.println("Resta  = " + resta);
        System.out.println("resta = " + (i - j));

        int multi = i * j;
        System.out.println("multiplicacon = " + multi);

        int div = i / j;
        float div2 = (float) i / (float) j;
        System.out.println("Divicion = " + div);
        System.out.println("Divicion 2 = " + div2);

        int resto = i % j;
        System.out.println("Modulo = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un nuero"));
        if (numero%2==0){
            System.out.println("Numero par");
        }else{
            System.out.println("Es impar");
        }

    }
}
