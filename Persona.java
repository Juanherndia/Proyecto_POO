// Declaramos el paquete al que pertenece nuestra clase
package primeraventana;

// Definimos la clase pública Persona
public class Persona {

    // Declaramos dos variables privadas: id de tipo entero y nombre de tipo String
    private int id;
    private String nombre;

    // Constructor de la clase Persona que toma un nombre y un id como parámetros
    // Este constructor se utiliza cuando queremos crear una nueva instancia de Persona con un nombre y un id específicos
    public Persona(String nombre, int id) {
        // La palabra clave 'this' se refiere a la instancia actual de la clase
        // Estamos asignando el valor del parámetro 'id' a la variable de instancia 'id'
        this.id = id;
        // Estamos asignando el valor del parámetro 'nombre' a la variable de instancia 'nombre'
        this.nombre = nombre;
    }

    // Constructor de la clase Persona sin parámetros
    // Este constructor se utiliza cuando queremos crear una nueva instancia de Persona sin especificar un nombre o un id
    // En este caso, las variables de instancia 'nombre' e 'id' no se inicializan
    public Persona() {
    }

    // Método getter para la variable de instancia 'id'
    // Este método se utiliza para obtener (get) el valor de 'id' de una instancia de Persona
    public int getId() {
        return id;
    }

    // Método setter para la variable de instancia 'id'
    // Este método se utiliza para establecer (set) el valor de 'id' de una instancia de Persona
    public void setId(int id) {
        this.id = id;
    }

    // Método getter para la variable de instancia 'nombre'
    // Este método se utiliza para obtener (get) el valor de 'nombre' de una instancia de Persona
    public String getNombre() {
        return nombre;
    }

    // Método setter para la variable de instancia 'nombre'
    // Este método se utiliza para establecer (set) el valor de 'nombre' de una instancia de Persona
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
