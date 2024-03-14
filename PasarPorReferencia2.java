class Persona {
    private String nombre;

    public void modificarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String leerNombre() {
        return nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("Samuel");
        System.out.println("Iniciamos el metodo main ");
        System.out.println("Persona.nombre = " + persona.leerNombre());
        System.out.println("Antes de llamar el metodo test");
        test(persona);
        System.out.println("Despues de llamar el metodo test");
        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Finaliza el metodo manin con los datos del arreglo modificados");
    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("Pepe");
        System.out.println();
        System.out.println("Finaliza el metodo test");
    }
}
