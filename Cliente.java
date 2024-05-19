package primeraventana; // Define el paquete en el que se encuentra la clase

// Importación de la clase ArrayList 
import java.util.ArrayList;
import javax.swing.JOptionPane; // Importación de la clase JOptionPane para mostrar cuadros de diálogo

// Declaración de la clase Cliente que hereda el atributo nombre y id de la clase Persona
public class Cliente extends Persona{
    // Atributos de la clase Cliente
    private String telefono; // Número de teléfono del cliente
    private String email; // Dirección de correo electrónico del cliente
    private ArrayList<Libro> prestamo = new ArrayList<Libro>(); // Lista de libros prestados al cliente
    private ArrayList<Libro> reserva = new ArrayList<Libro>(); // Lista de libros reservados por el cliente
    
    // Constructor de la clase Cliente que inicializa los atributos idCliente, nombre, telefono y email
    public Cliente(int id, String nombre, String telefono, String email) {
        super(nombre, id); // Llama al constructor de la clase padre (Persona)
        this.telefono = telefono; // Inicializa el atributo telefono
        this.email = email; // Inicializa el atributo email
    }
    
    // Constructor vacío de la clase Cliente
    public Cliente(){
    }
    
    // Método para realizar un préstamo de un libro al cliente
    public void realizarPrestamo(Libro libro, ArrayList<Libro> listaLibrosDisponibles) {
        // Solicita al usuario que ingrese el ID del libro que desea pedir prestado
        int libroPedido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Id del libro que quiere pedir prestado"));
        // Itera sobre la lista de libros disponibles
        for (int i = 0; i < listaLibrosDisponibles.size(); i++) {  
            // Si el ID del libro en la lista coincide con el ID ingresado por el usuario
            if(libroPedido == listaLibrosDisponibles.get(i).getIdLibro()){
                // Si el estado del libro es 'D' (Disponible)
                if(listaLibrosDisponibles.get(i).getEstado() == 'D'){
                    // Cambia el estado del libro a 'P' (Prestado)
                    listaLibrosDisponibles.get(i).prestarLibro();
                    // Imprime un mensaje en la consola indicando que el libro ha sido prestado
                    System.out.println("El libro ha sido prestado al usuario" );
                    // Agrega el libro a la lista de préstamos del cliente
                    prestamo.add(libro); 
                    break; // Termina la ejecución del bucle
                }
                else{
                    // Imprime un mensaje en la consola indicando que el libro no está disponible
                    System.out.println("No esta disponible ese libro");
                }
            }else{
                // Imprime un mensaje en la consola indicando que el libro no existe
                System.out.println("No existe ese libro");
            }
        }
    }

    // Método para realizar la devolución de un libro por parte del cliente
    public void realizarDevolucion(Libro libro, ArrayList<Libro> listaLibrosDisponibles) {
        // Solicita al usuario que ingrese el ID del libro que desea devolver
        int libroDevuelto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Id del libro que quiere devolver"));
        // Itera sobre la lista de libros disponibles
        for (int i = 0; i < listaLibrosDisponibles.size(); i++) {  
            // Si el ID del libro en la lista coincide con el ID ingresado por el usuario
            if(libroDevuelto == listaLibrosDisponibles.get(i).getIdLibro()){
                // Si el estado del libro es 'P' (Prestado)
                if(listaLibrosDisponibles.get(i).getEstado() == 'P'){
                    // Cambia el estado del libro a 'D' (Disponible)
                    listaLibrosDisponibles.get(i).devolverLibro();
                    // Imprime un mensaje en la consola indicando que el libro ha sido devuelto
                    System.out.println("El libro ha sido devuelto" );
                    // Elimina el libro de la lista de préstamos del cliente
                    prestamo.remove(libro); 
                    break; // Termina la ejecución del bucle
                }
                else{
                    // Imprime un mensaje en la consola indicando que el libro no está prestado
                    System.out.println("No esta prestado ese libro");
                }
            }   
        }
    }
    
    // Método para consultar los libros prestados al cliente
    public void consultarLibrosPrestados(ArrayList<Libro> listaLibros) {
        // Itera sobre la lista de libros
        for (int i = 0; i < listaLibros.size(); i++) {
            // Si el estado del libro es 'P' (Prestado)
            if(listaLibros.get(i).getEstado() == 'P'){
               // Imprime la información del libro en la consola
               listaLibros.get(i).imprimirLibro();
            }
        }
    }
    
    // Método para consultar los libros reservados por el cliente
    public void consultarLibrosReservados(ArrayList<Libro> listaLibros) {
        // Itera sobre la lista de libros
        for (int i = 0; i < listaLibros.size(); i++) {
            // Si el estado del libro es 'R' (Reservado)
            if(listaLibros.get(i).getEstado() == 'R'){
               // Imprime la información del libro en la consola
               listaLibros.get(i).imprimirLibro();
            }
        }
    }
    // Getters y setters para los atributos privados de la clase Cliente
    public String getTelefono() {
        return telefono; // Devuelve el número de teléfono del cliente
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono; // Establece el número de teléfono del cliente
    }

    public String getEmail() {
        return email; // Devuelve la dirección de correo electrónico del cliente
    }

    public void setEmail(String email) {
        this.email = email; // Establece la dirección de correo electrónico del cliente
    }
}