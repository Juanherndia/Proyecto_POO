
package primeraventana;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Libro {
    // Atributos
    private int idLibro;
    private String titulo;
    private String autor;
    private String genero;
    private int anioPublicacion;
    private char estado; 
    
    // Este es el constructor de la clase Libro que toma varios parámetros.
    public Libro(int idLibro, String titulo, String autor, String genero, int anioPublicacion, char estado, int cliente){
    // Se verifica si el idLibro es menor o igual a 0 y si el año de publicación es mayor a 2024.
    // Si alguna de estas condiciones se cumple, se imprime un mensaje de error.
    if (idLibro <= 0 && anioPublicacion > 2024) {
            System.out.println("Id no valido y año equivocado");
    }
    // Se asignan los valores de los parámetros a las variables de instancia de la clase.
        this.idLibro = idLibro; // Se asigna el valor del parámetro idLibro a la variable de instancia idLibro.
        this.titulo = titulo; // Se asigna el valor del parámetro titulo a la variable de instancia titulo.
        this.autor = autor; // Se asigna el valor del parámetro autor a la variable de instancia autor.
        this.genero = genero; // Se asigna el valor del parámetro genero a la variable de instancia genero.
        this.anioPublicacion = anioPublicacion; // Se asigna el valor del parámetro anioPublicacion a la variable de instancia anioPublicacion.
        this.estado = estado; // Se asigna el valor del parámetro estado a la variable de instancia estado. Este valor representa el estado inicial del libro, que por defecto es 'D' (disponible).  
    }
    // Este es el constructor vacío de la clase Libro. No toma ningún parámetro y no realiza ninguna operación.
    // Se utiliza para crear un objeto de la clase Libro sin inicializar sus variables de instancia.
    public Libro(){
    
    }
    // Método para obtener la información de un libro
    
    public void getInformacion(Libro libroConsulta) {
        // Muestra un cuadro de diálogo con la información del libro
        JOptionPane.showMessageDialog(null, 
            "ID: " + libroConsulta.getIdLibro() + "\n" +// Muestra el ID del libro
            "Titulo: " + libroConsulta.getTitulo() + "\n" + // Muestra el título del libro
            "Autor: " + libroConsulta.getAutor() + "\n" + // Muestra el autor del libro
            "Género: " + libroConsulta.getGenero() + "\n" + // Muestra el género del libro
            "Anio de Publicacion: " + libroConsulta.getAnioPublicacion() + "\n" + // Muestra el año de publicación del libro
            "Estado: " + libroConsulta.getEstado()); // Muestra el estado del libro
    }
    
    // Método para prestar un libro
    public void prestarLibro() {
        this.setEstado('P');// Cambia el estado del libro a 'P' (Prestado)
    }

    // Método para imprimir la información del libro en la consola
    public void imprimirLibro(){
        // Imprime la información del libro en la consola
        System.out.println("LIBRO:" + this.idLibro + "," + this.titulo + "," + this.autor + "," + this.genero + "," + this.anioPublicacion + "," + this.estado);
    }

    // Método para reservar un libro
    public void reservarLibro(Libro libro, ArrayList<Libro> libros) {
        // Solicita al usuario que ingrese el ID del libro que desea reservar
        int libroReserva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Id del libro que quiere reservar"));
        // Itera sobre la lista de libros
        for (int i = 0; i < libros.size(); i++) {
        // Si el ID del libro en la lista coincide con el ID ingresado por el usuario
            if (libroReserva == libros.get(i).getIdLibro()) {
            // Si el estado del libro es 'D' (Disponible)
                if (libros.get(i).getEstado() == 'D') { // Verificar si el libro está disponible
                    libros.get(i).setEstado('R'); // Cambiar el estado del libro a "reservado"
                    JOptionPane.showMessageDialog(null, "El libro " + libros.get(i).getTitulo() + " lo has reservado.");
                    return;
                }
                else if (libros.get(i).getEstado() == 'P') { // Verificar si el libro está disponible
                    libros.get(i).setEstado('R'); // Cambiar el estado del libro a "reservado"
                    JOptionPane.showMessageDialog(null, "El libro " + libros.get(i).getTitulo() + " lo has reservado.");
                    return;  // Termina la ejecución del método
                }
            // Si el estado del libro no es ni 'D' ni 'P'
                else {
                // Muestra un mensaje al usuario indicando que el libro no está disponible para reservar
                    JOptionPane.showMessageDialog(null, "El libro " + libros.get(i).getTitulo() + " no está disponible para reservar en este momento.");
                    return;// Termina la ejecución del método
                }
            }
        }// Si no se encontró ningún libro con el ID ingresado por el usuario, muestra un mensaje al usuario
        JOptionPane.showMessageDialog(null, "No se encontró ningún libro con el ID.");
    }

    // Método para devolver un libro
    public void devolverLibro() {
        this.setEstado('D'); // Cambia el estado del libro a 'D' (Disponible)
    }

    //Getter y setter
    public int getIdLibro() {
        
        return this.idLibro; // Devuelve el ID del libro
    }

    // Método setter para establecer el ID del libro
    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro; // Establece el ID del libro
    }

    // Método getter para obtener el título del libro
    public String getTitulo() {
        return titulo; // Devuelve el título del libro
    }

    // Método setter para establecer el título del libro
    public void setTitulo(String titulo) {
        this.titulo = titulo; // Establece el título del libro
    }


    // Método getter para obtener el autor del libro
    public String getAutor() {
        return autor; // Devuelve el autor del libro
    }

    // Método setter para establecer el autor del libro
    public void setAutor(String autor) {
        this.autor = autor; // Establece el autor del libro
    }

    // Método getter para obtener el género del libro
    public String getGenero() {
        return genero; // Devuelve el género del libro
    }

    // Método setter para establecer el género del libro
    public void setGenero(String genero) {
        this.genero = genero; // Establece el género del libro
    }

    // Método getter para obtener el año de publicación del libro
    public int getAnioPublicacion() {
        return anioPublicacion; // Devuelve el año de publicación del libro
    } 

    // Método setter para establecer el año de publicación del libro
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion; // Establece el año de publicación del libro
    }

    // Método getter para obtener el estado del libro
    public char getEstado() {
        return estado; // Devuelve el estado del libro
    }

    // Método setter para establecer el estado del libro
    public void setEstado(char estado) {
        this.estado = estado; // Establece el estado del libro
    }
}