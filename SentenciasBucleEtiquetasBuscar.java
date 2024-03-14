public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "Tres tristes tigres, tragaban trigo en un trigal, en tres tristes trastos, tragaban trigo tres tristes tigrestrigo. A cuesta le cuesta subir la cuesta, y en medio de la cuesta, va y se acuesta.";
        String palabra = "trigo";
        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        int cantidad = 0;
        /*
         * char letra = 'c';
         * for(int i=0;i<maxFrase;i++){
         * if(frase.charAt(i)!=letra){
         * continue;
         * }
         * cantidad++;
         * 
         * }
         * System.out.println("Encontrado = "+cantidad+
         * " veces el caracter '"+letra+"' en la frase.");
         */

        buscar: for (int i = 0; i <= maxFrase; i++) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;

        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra '" + palabra + "' en la frase.");

    }
}
