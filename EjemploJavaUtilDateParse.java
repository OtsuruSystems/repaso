import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        SimpleDateFormat  format = new  SimpleDateFormat ("yyy-MM-dd");
        System.out.println("ingrese una fecha con formato 'yyy-MM-dd' ");
        try {
            Date fecha = format.parse(sc.next());
            System.out.println("fecha = "+fecha);
              System.out.println("format = "+format.format(fecha));

Date fecha2 = new Date();
 System.out.println("Fecha actual "+fecha2);
if (fecha.after(fecha2)){
 System.out.println("Fecha (del usuario) es despues que fecha2");
}else if(fecha.before(fecha2)){
 System.out.println("Fecha es arterior que fecha2");
}else if(fecha.equals(fecha2)){
 System.out.println("Fecha es igual que fecha2");
}

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

sc.close();

    }
}
