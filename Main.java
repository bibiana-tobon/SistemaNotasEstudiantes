//clase principal
public class Main {
    // metodo donde comienza a ejecutar
    public static void main(String[] args) {
        System.out.println("Sistema de estudiantes");
    //este crea una persona con nombre y documento
        persona persona1 = new persona("juan", "123456");
        persona1.mostrarInformacion();
        // se crea un estudiante con sus tres notas y sus datos
        estudiante estudiante1 = new estudiante("juan", "123456", "11", 4.5, 3.0, 2.2);
        estudiante1.mostrarInformacion();
        // calcula y muestra el promedio
        System.out.println("promedio: " + estudiante1.calcularPromedio());
        estudiante1.verificarEstado();
    }
}