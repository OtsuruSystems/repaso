public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Samuel";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Samuel\") = " + nombre.equals("Samuel"));
        System.out.println("nombre.equals(\"samuel\")" + nombre.equals("samuel"));
        System.out.println("nombre.equalsIgnoreCase(\"samuel\")" + nombre.equalsIgnoreCase("samuel"));
        System.out.println("nonbre.compareTo(\"Samuel\") = " + nombre.compareTo("Samuel"));
        System.out.println("nombre.compareTo(\"Samuel\") = " + nombre.compareTo("Saul"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nobre.length()-1) = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre.sub = " + nombre.substring(1));
        System.out.println("nombre.sub = " + nombre.substring(1, 5));
        System.out.println("nombre.sub = " + nombre.substring(nombre.length() - 1));

        String trabalengua = "trabalenguas";
        System.out.println("trabalenguas = " + trabalengua.replace("a", "."));
        System.out.println("trabalenguas");
        System.out.println("trabalenguas.indexf(a) = " + trabalengua.indexOf('a'));
        System.out.println("trabalenguas.lastindexof(a) = " + trabalengua.lastIndexOf('a'));
        System.out.println("trabalenguas.lastindexof(z) = " + trabalengua.lastIndexOf('z'));
        System.out.println("trabalenguas.contains('t') = " + trabalengua.contains("lengu"));
        System.out.println("trabalenguas.starWith(\"traba\") " + trabalengua.startsWith("traba"));
        System.out.println("trabalenguas.endWith(\"s\") " + trabalengua.endsWith("s"));
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim());

    }

}
