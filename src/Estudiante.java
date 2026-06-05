public class Estudiante extends Persona {

    protected String nivelAcademico;
    protected String direccionEscuela;

    public Estudiante(String nombre, String rut, int edad, String nivelAcademico, String direccionEscuela) {

        super(nombre, rut, edad);
        this.nivelAcademico = nivelAcademico;
        this.direccionEscuela = direccionEscuela;
    }

    @Override
    protected String metodo() {
        return "La clase de este objeto es: " + this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return super.toString() + " - Estudiante: [Nivel Académico: " + nivelAcademico + ", Dirección de Escuela: " + direccionEscuela + "]";
    }
}
