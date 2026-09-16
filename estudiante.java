// Aca creamos una clase de un estudiante, que hereda de una persona
public class estudiante extends persona {
   //estos son los atributos del estudiantes
   private String curso;
    private double nota;
    private double nota2;
    private double nota3;

    // aca se reciben y se guardan los datos del estudiante
    public estudiante(String nombre, String documento, String curso, double nota, double nota2, double nota3) {
        //pasa los datos de la persona
        super(nombre, documento);
        this.curso = curso;
        this.nota = nota;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
        // modifica la forma para mostrar cada informacion del estudiante
    @Override
    public void mostrarInformacion() {
        System.out.println("nombre: " + getnombre());
        System.out.println("documento: " + getdocumento());
        System.out.println("curso: " + curso);
        System.out.println("nota: " + nota);
    }
    // calcula el promedio de las tres notas
    public double calcularPromedio() {
        return (nota + nota2 + nota3) / 3;
    }
    // verifica el estado del estudiante, si gano o perdio dependiendo el promedio
    public void verificarEstado() {
        if (calcularPromedio()>=3.0) {
            System.out.println("Estado: aprobo");
        } else{
            System.out.println("Estado: reprobado");
        }
    }
}
