public class OperadorsAsignacion {
public static void main(String[] args) {
    int i = 5;
    int j = i+4;
    System.out.println("i = "+i);
    System.out.println("j = "+j);

    i += 2;
System.out.println("i = "+i);

i += 6;
System.out.println("i = "+i);

i-=4;
System.out.println("i = "+i);

i*=4;
System.out.println("i = "+i);

String sqlString = "select * from clientes as c";
sqlString +=" where c.nombre = 'Samuel'";
sqlString += "and c.activo =1 ";
System.out.println("SqlString "+sqlString);


}


    
}
