public final class EstudianteDeportista extends Estudiante {

    private String deporteQuePractica;
    private int horasDeEntrenamiento;

    public EstudianteDeportista(String nombre, String rut, int edad, String nivelAcademico, String direccionEscuela,
                                String deporteQuePractica, int horasDeEntrenamiento) {
        super(nombre, rut, edad, nivelAcademico, direccionEscuela);
        this.deporteQuePractica = deporteQuePractica;
        this.horasDeEntrenamiento = horasDeEntrenamiento;
    }
    @Override
    public String toString() {
        return super.toString() + "\n - Estudiante Deportista: [Deporte que Practica: " + deporteQuePractica + "\n Horas de Entrenamiento: " + horasDeEntrenamiento + "]";
    }
}
