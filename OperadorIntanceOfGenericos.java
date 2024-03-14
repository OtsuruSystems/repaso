public class OperadorIntanceOfGenericos {
    public static void main(String[] args) {
        Object texto = "Creando un objeto de la clase String...";
        Number num = 7;

        Boolean b1 = texto instanceof String;
        System.out.println("El texto es de tipo String?? = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("El texto es de tipo String?? = " + b1);

        b1 = num instanceof Integer;
        System.out.println("Num es de tipo Integer?? = " + b1);

        b1 = num instanceof Number;
        System.out.println("Num es de tipo Number?? = " + b1);

         b1 = num instanceof Object;
        System.out.println("Num es de tipo Object?? = " + b1);

        Double decimal = 35.24;
           b1 = decimal instanceof Number;
        System.out.println("Decimal es de tipo Number?? = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("Num es de tipo Object?? = " + b1);

        b1 = decimal instanceof Number;
          System.out.println("Num es de tipo number?? = " + b1);
    }
}
