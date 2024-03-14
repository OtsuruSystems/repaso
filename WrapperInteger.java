public class WrapperInteger {
    public static void main(String[] args) {
        int primitivo = 325411;
        Integer intObjeto =  Integer.valueOf(primitivo);
        Integer intObjeto2 = 325411;

    

        int num = intObjeto;
    System.out.println("num"+num);
        int num2 = intObjeto2.intValue();
        System.out.println(num2);

String valotTvLcd = "6584564";
Integer valor = Integer.valueOf(valotTvLcd);
System.out.println(valor+1);

Short shortObjeto = intObjeto.shortValue();//32767;
System.out.println("shortObjeto = "+shortObjeto);

Byte byteObjeto = intObjeto.byteValue();
System.out.println("ByteObjeto = "+byteObjeto);

Long longObjeto = intObjeto.longValue();
System.out.println("LongObjeto = "+longObjeto);
    }
}
