//una clase que representa una persona
public class persona {
    private String nombre;
    private String documento;
    //recibe y guarda los datos
    public persona(String nombre, String documento){
        this.nombre = nombre;
        this.documento = documento;
    }
public void mostrarInformacion(){
    System.out.println("nombre: " + nombre);
    System.out.println("documento: " + documento);
    }
    // permite obtener el nombre
    public String getnombre() {
    return nombre;
    }
    // permite obtener el documento
    public String getdocumento() {
        return documento;
    }
}
