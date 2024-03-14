import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola que tal";
        Class cStrClass =texto.getClass();
        System.out.println("cStrClass.getName() "+cStrClass.getName());
        System.out.println("cStrClass.gertSimpleName() = "+cStrClass.getSimpleName ());
        System.out.println("cStrClass.getPackage() "+cStrClass.getPackage());
        System.out.println("cStrClass "+ cStrClass);

        for(Method m :cStrClass.getMethods()){
            System.out.println("m.getName() "+m.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
      
Class objClass = intClass.getSuperclass().getSuperclass();
  System.out.println("intClass.getSuperclass() "+intClass.getSuperclass());
  System.out.println("intClass.getSuperclass().getSuperclass() "+intClass.getSuperclass().getSuperclass());

  for(Method m :objClass.getMethods()){
            System.out.println("m.getName() "+m.getName());
        }

    }
}
