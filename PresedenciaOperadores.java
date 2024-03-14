public class PresedenciaOperadores {
    public static void main(String[] args) {
        int i =654;
int j = 4548;
int k = 56;

double  promedio = (i+j+k) /3d;
System.out.println("Promedio = "+promedio);

  promedio = (i+j+k )/(3d * 10);
  System.out.println("Promedio = "+promedio);


   promedio = ++i + j-- +k /(3d * 10);
  System.out.println("Promedio = "+promedio);
  System.out.println("i.. "+i);
  System.out.println("j.."+j);
    }
}
