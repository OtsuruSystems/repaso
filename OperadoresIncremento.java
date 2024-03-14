public class OperadoresIncremento {
    public static void main(String[] args) {

        //Pre-incremento
        int i = 1;
        int j = ++i;

        System.out.println("i = "+i );
        System.out.println("j = "+j);


        //Post-Incremento
        i =2;
        i= i++;
        System.out.println("i = "+i);
        System.out.println("j = "+j);

        //Pre Drecremento
        i = 2;
        System.out.println("i = "+i);
        j = --i;
        System.out.println("i = "+i);
        System.out.println("j = "+j);

        //Post Decremento
        i = 4;
        j = i--;
        System.out.println("i = "+i);
        System.out.println("j = "+j);

        System.out.println("(j = "+(j++)+")");
        System.out.println("(j = "+(++j)+")");
    }
    
}
