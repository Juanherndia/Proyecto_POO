package primeraventana; // Define el paquete en el que se encuentra la clase

import java.util.ArrayList; // Importación de la clase ArrayList
import javax.swing.JOptionPane; // Importación de la clase JOptionPane para mostrar cuadros de diálogo

// Declaración de la clase Bibliotecario que hereda el atributo nombre de la clase Persona
public class Bibliotecario extends Persona {
    // Atributos
    private String usuario; // Nombre de usuario del bibliotecario
    private int contrasena; // Contraseña del bibliotecario

    // Constructor
    public Bibliotecario(int id, String nombre, String usuario, int contrasena) {
        super(nombre, id); // Llama al constructor de la clase padre (Persona)
        this.usuario = usuario; // Inicializa el atributo usuario
        this.contrasena = contrasena; // Inicializa el atributo contrasena
    }
    
    // Constructor vacío de la clase Bibliotecario
    public Bibliotecario (){
        
    }
    
    // Método para registar un libro, este llamada a la clase libro y toma los atributos de esta
    public Libro registrarLibro(Libro libro) {
        //Se empiezan a pedir los datos del libro que se desea agregar por parte del bibliotecario
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Id del libro:")); // Solicita el ID del libro
        libro.setIdLibro(id); // Establece el ID del libro
        String titulo = JOptionPane.showInputDialog("Ingrese el titulo del libro:"); // Solicita el título del libro
        libro.setTitulo(titulo); // Establece el título del libro
        String autor = JOptionPane.showInputDialog("Ingrese el autor del libro:"); // Solicita el autor del libro
        libro.setAutor(autor); // Establece el autor del libro
        String genero = JOptionPane.showInputDialog("Ingrese el genero del libro:"); // Solicita el género del libro
        libro.setGenero(genero); // Establece el género del libro
        int anioPublicacio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese anio de publicacion")); // Solicita el año de publicación del libro
        libro.setAnioPublicacion(anioPublicacio); // Establece el año de publicación del libro
        libro.setEstado('D'); // Establece el estado del libro como 'D' (Disponible)
        return libro; // Devuelve el libro
    }
    
    // Método para consultar la información de un libro
    public String consultarInformacionLibro(Libro libroConsulta, ArrayList<Libro> listaLibrosDisponibles) {
        int idLibro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Id del libro que quiere consultar")); // Solicita el ID del libro a consultar
        for (int i = 0; i < listaLibrosDisponibles.size(); i++) {  // Itera sobre la lista de libros disponibles
            if(idLibro == listaLibrosDisponibles.get(i).getIdLibro()){ // Si el ID del libro en la lista coincide con el ID ingresado por el usuario
               listaLibrosDisponibles.get(i); // Obtiene el libro de la lista
               libroConsulta.getInformacion(listaLibrosDisponibles.get(i)); // Obtiene la información del libro
               libroConsulta.setEstado('P'); // Cambia el estado del libro a 'P' (Prestado)
               break; // Termina la ejecución del bucle
            }
        }
        return "No se encontró información para el libro con ID " + idLibro; // Devuelve un mensaje indicando que no se encontró información para el libro
    }
    
    // Método para eliminar un libro
    public String eliminarLibro(Libro libroConsulta1, ArrayList<Libro> listaLibrosDisponibles) {
        int idLibro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Id del libro que quiere eliminar")); // Solicita el ID del libro a eliminar
        for (int i = 0; i < listaLibrosDisponibles.size(); i++) {  // Itera sobre la lista de libros disponibles
            if(idLibro == listaLibrosDisponibles.get(i).getIdLibro()){ // Si el ID del libro en la lista coincide con el ID ingresado por el usuario
               listaLibrosDisponibles.get(i); // Obtiene el libro de la lista
               libroConsulta1.getInformacion(listaLibrosDisponibles.get(i)); // Obtiene la información del libro
               listaLibrosDisponibles.remove(listaLibrosDisponibles.get(i)); // Elimina el libro de la lista
               break; // Termina la ejecución del bucle
            }
        }
        return "No se encontró información para el libro con ID " + idLibro; // Devuelve un mensaje indicando que no se encontró información para el libro
    }

    // Método para obtener los libros disponibles
    public void obtenerLibrosDisponibles(ArrayList<Libro> listaLibros) {
         for (int i = 0; i < listaLibros.size(); i++) { // Itera sobre la lista de libros
            if(listaLibros.get(i).getEstado() == 'D'){ // Si el estado del libro es 'D' (Disponible)
                listaLibros.get(i).imprimirLibro(); // Imprime la información del libro
            }
        }
    }

    // Método para obtener los libros prestados
    public void obtenerLibrosPrestados(ArrayList<Libro> listaLibros) {
       for (int i = 0; i < listaLibros.size(); i++) { // Itera sobre la lista de libros
            if(listaLibros.get(i).getEstado() == 'P'){ // Si el estado del libro es 'P' (Prestado)
                listaLibros.get(i).imprimirLibro(); // Imprime la información del libro
            }
        }
    }
    
    // Método para obtener los libros reservados
    public void obtenerLibrosReservados(ArrayList<Libro> listaLibros1) {
       for (int i = 0; i < 10; i++) { // Itera sobre la lista de libros
            if(listaLibros1.get(i).getEstado() == 'R'){ // Si el estado del libro es 'R' (Reservado)
                listaLibros1.get(i).imprimirLibro(); // Imprime la información del libro
            }
        }
    }

    // Métodos adicionales para modificar atributos si es necesario
    public void setUsuario(String usuario) {
        this.usuario = usuario; // Establece el nombre de usuario del bibliotecario
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena; // Establece la contraseña del bibliotecario
    }

    public String getUsuario() {
        return usuario; // Devuelve el nombre de usuario del bibliotecario
    }

    public int getContrasena() {
        return contrasena; // Devuelve la contraseña del bibliotecario
    }
}

