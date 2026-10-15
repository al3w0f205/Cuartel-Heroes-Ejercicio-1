public class Heroe {
    private String nombre;
    private String origen;
    private int nivelPoder;

    // Constructor por defecto
    public Heroe() {
        this.nombre = "Desconocido";
        this.origen = "Tierra-616";
        this.nivelPoder = 1;
    }

    // Constructor con parámetros
    public Heroe(String nombre, String origen, int nivelPoder) {
        this.nombre = nombre;
        this.origen = origen;
        this.nivelPoder = nivelPoder;
    }

    // RETO 1: Getter para el nombre
    public String getNombre() {
        return this.nombre;
    }

    public void presentarse() {
        System.out.println("Soy " + nombre + " de " + origen + " (poder " + nivelPoder + ")");
    }
}
