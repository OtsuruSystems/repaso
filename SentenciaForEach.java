class SentenciaForEach{
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,9,8,7,10,14};
        
for (int num:numeros){
    System.out.println("num = "+num);
}
        String [] nombres = {"Samuel", "Andres", "Pepe", "Maria", "Paco"};
        for(String nom:nombres){
            System.out.println("nombres = "+nom);
        }
    }
}