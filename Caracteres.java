public class Caracteres {

    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal= 64;
        System.out.println("Caracter: "+caracter);
    System.out.println("Decimal: "+decimal);
    System.out.println("decimal = caracter = "+(decimal==caracter));
    char simbolo ='@';
        System.out.println("Caracter: "+simbolo);
    System.out.println("simbolo = caracter = "+(simbolo==caracter));
//char espacio = '\u0020';
//char retoceso = '\b';
//char tabulador ='\t';
//char nuevaLinea = '\n';
char retornoCarro = '\r';
             System.out.println("char coresponde en byte a:"+retornoCarro+Character.BYTES);
        System.out.println("Char corresponde en bites a = "+Character.SIZE);
        System.out.println("Maximo valor: "+Character.MAX_VALUE);
        System.out.println("Minimo valor: "+Character.MIN_VALUE);
    }
    
}
