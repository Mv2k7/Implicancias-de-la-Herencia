public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Marcelo", "218231306",21,
                "nivel4","Universidad de la Frontera");

        EstudianteDeportista estudianteDeportista1 = new EstudianteDeportista("Juan",
                "123456789",23,"nivel5","Universidad de la Frontera",
                "Voley",4);

        System.out.println("--------Prueba---------");
        System.out.println("ESTUDIANTE 1: ");
        System.out.println(estudiante1.toString());
        System.out.println("Método: " + estudiante1.metodo());
        System.out.println("ESTUDIANTE DEPORTISTA 1:");
        System.out.println(estudianteDeportista1.toString());
        System.out.println("Método: " + estudianteDeportista1.metodo());


    }
}
