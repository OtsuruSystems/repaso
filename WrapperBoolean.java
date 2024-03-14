public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2;
        Boolean objetoBoolean = Boolean.valueOf(primBoolean);
        Boolean objetoBoolean2 = Boolean.valueOf(false);
        Boolean objetBoolean3 = false;
        System.out.println("primBoolean " + primBoolean);
        System.out.println("ObjetoBoolean " + objetoBoolean);
        System.out.println("ObjetoBoolean2 " + objetoBoolean2);

        System.out.println("Comparando dos Objetos boolean: " + (objetoBoolean == objetoBoolean2));
System.out.println("Comparando dos Objetos boolean: " + (objetoBoolean.equals(objetoBoolean2)));
System.out.println("Comparando dos Objetos boolean: " + (objetoBoolean == objetBoolean3));
System.out.println("Comparando dos Objetos boolean: " + (objetoBoolean2 == objetBoolean3));

boolean primBoolean2 = objetoBoolean2.booleanValue();
System.out.println("primBoolean2 "+primBoolean2);
    }
}
