import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJAvaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();


System.out.println("Fecha = "+fecha);
SimpleDateFormat df = new SimpleDateFormat("EEEE dd ' de ' MMMM ' del 'yyyy");
String fechaStr = df.format(fecha);
long j = 0;
for(int i =0;i<100000;i++){
j += i;
}
System.out.println("j = "+j);
     Date fecha2 = new Date();
     long tiempoFinal = fecha2.getTime()-fecha.getTime();
     System.out.println("tiempoFinal = "+tiempoFinal);

System.out.println("fechaStr = "+fechaStr);

    }
}
