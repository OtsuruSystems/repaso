public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

bucle:for (int i = 1; i <= 7; i++) {
        System.out.println();
        for(int j =0;j<=8;j++){
            if (i == 6 || i==7) {
                System.out.println("No se trabajan los fines de semana");
                continue bucle;
            }
            System.out.println("Dias trabajados = " + i+" con las horas "+j+" hrs.");
        } 
        }

     System.out.println("\n==================================================");

       bucle1:for (int i = 0; i < 5; i++) {
        System.out.println();
        for(int j =0;j<5;j++){
            if (i == 2) {
                continue bucle1;
            }
            System.out.print("[i = " + i+" j, "+j+"],");
        } 
        }

        System.out.println("\n==================================================");

         etiqueta:for (int i = 0; i < 5; i++) {
        System.out.println();
        for(int j =0;j<5;j++){
            if (i == 2) {
               break etiqueta;
            }
            System.out.print("[i = " + i+" j, "+j+"],");
        } 
        }
    }
}
