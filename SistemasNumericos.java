import javax.swing.JOptionPane;

public class SistemasNumericos {
    public static void main(String[] args) {
                String numeroStr = JOptionPane.showInputDialog(null, "ingrese un numero entero");
   int numeroDecimal = 0;
        try{
        numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
    JOptionPane.showMessageDialog(null, "debe ingresar un numero entero"+e.getMessage());
main(args);
System.exit(0);
}
        System.out.println("numeroDecimal "+numeroDecimal);

        System.out.println("numero bnario de "+numeroDecimal+" = "+Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("numero Binario = "+numeroBinario);

        System.out.println("numero octal de "+ numeroDecimal +" = "+Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764;

        System.out.println("numeroOctal = "+numeroOctal);

        System.out.println("numero Hexadecimal de "+ numeroDecimal +" = "+Integer.toHexString(numeroDecimal));

int numeroHexadecimal = 0x1f4;
System.out.println("numerHexadecimal "+numeroHexadecimal);

String mensaje = "\nnumero bnario de "+numeroDecimal+" = "+Integer.toBinaryString(numeroDecimal);
mensaje += "\nnumero octal de "+ numeroDecimal +" = "+Integer.toOctalString(numeroDecimal);
mensaje += "\numero Hexadecimal de "+ numeroDecimal +" = "+Integer.toHexString(numeroDecimal);
JOptionPane.showMessageDialog(null, mensaje);

    }
    
}
