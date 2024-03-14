import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
Calendar calendario = Calendar.getInstance();

//calendario.set(2023,10,14,19,54,3);
calendario.set(Calendar.YEAR, 2023);
calendario.set(Calendar.MONTH, 7);
calendario.set(Calendar.DAY_OF_MONTH,25);
//calendario.set(Calendar.HOUR_OF_DAY, 15);
calendario.set(Calendar.HOUR, 7);
calendario.set(Calendar.AM_PM, Calendar.PM);
calendario.set(Calendar.MINUTE, 59);
calendario.set(Calendar.SECOND, 10);
calendario.set(Calendar.MILLISECOND, 125);

Date fecha = calendario.getTime();
System.out.println("Calendario = "+fecha);
SimpleDateFormat formato = new SimpleDateFormat("yyyy-MMMM-dd hh:mm:ss:SSS a");
String fechaConFormato = formato.format(fecha);
System.out.println("Fecha con formato: "+fechaConFormato);


    }
}