public abstract class Persona {
    private String nombre;
    private String rut;
    private int edad;

    public Persona(String nombre, String rut, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Persona: [Nombre: " + nombre + ", RUT: " + rut + ", Edad: " + edad + "]";
    }

    protected abstract String metodo();
}
