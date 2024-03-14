public class ConvercionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroint = Integer.parseInt(numeroStr);
        System.out.println("numeroInt " + numeroint);

        String realStr = "45487.21e-54"; 
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble "+realDouble);

        String logicoStr = "F";
        boolean logico = Boolean.parseBoolean(logicoStr);
        System.out.println("Logico "+logico);

        int intNumero=100;
        String Stringintnumero = Integer.toString(intNumero);
        System.out.println("IntNumero "+Stringintnumero);
        String otrooNueString = String.valueOf(intNumero);
        System.out.println("OtroNumeroString"+otrooNueString);

        double otroDouble = 15445.125e5;
        String otroRealStr = Double.toString(otroDouble);
        System.out.println("OtroDouble "+otroRealStr);

        String otroFloat = String.valueOf(658456.564f);
        System.out.println("OtroFlotante"+otroFloat);

        int i = 22768;
        short s = (short)i;
        System.out.println("s = "+s);
        long l = i;
        System.out.println("l = "+l);
        System.out.println(Short.MAX_VALUE);
char b = (char)i;
System.out.println("b = "+b);
    }
}
