public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
         System.out.println("Iniciamos el metodo main con i = "+i);
         test(i);
         System.out.println("Finaliza el metodo manin con I = "+i);
    }

    public static void test(int i){
System.out.println("Iniciamos el metodo test con I = "+i);
i =34;
System.out.println("Finaliza el metodo test con I = "+i);
    }
}
