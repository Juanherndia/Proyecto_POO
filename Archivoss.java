package primeraventana; // Define el paquete en el que se encuentra la clase

// Importa las clases necesarias para el manejo de archivos y excepciones
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Archivoss { // Define la clase Archivoss
    
    // Método para crear un archivo
    public static void createFile(String nameFile){
        File file = new File(nameFile); // Crea una instancia de File con el nombre proporcionado
        // Se usa try y catch para crear el archivo y evitar errores de codigo
        try {
            PrintWriter output = new PrintWriter(file); // Crea un PrintWriter para escribir en el archivo
            output.close(); // Cierra el PrintWriter
            System.out.println("El archivo ha sido creado!"); // Imprime un mensaje indicando que el archivo ha sido creado
        } catch (FileNotFoundException ex){
            ex.printStackTrace(System.out); // Imprime la traza de la excepción si el archivo no se encuentra
        }
    }
    // Método para leer archivos
    public static void leerArchivo() {

        // Leer contenido del archivo "Libros.txt"
        String linea1 = readFromFile("Libros.txt"); // Llama al método readFromFile con el nombre del archivo
        System.out.println("["+linea1+"]"); // Imprime el contenido del archivo
        
        // Leer contenido del archivo "Clientes.txt"
        String linea2 = readFromFile("Clientes.txt"); // Llama al método readFromFile con el nombre del archivo
        System.out.println("["+linea2+"]"); // Imprime el contenido del archivo
        
        // Leer contenido del archivo "Bibliotecario.txt"
        String linea3 = readFromFile("Bibliotecario.txt"); // Llama al método readFromFile con el nombre del archivo
        System.out.println("["+linea3+"]"); // Imprime el contenido del archivo
    }
    
    // Método para limpiar un archivo
    public static void clearFile(String nombreArchivo) {
        try (FileWriter fw = new FileWriter(nombreArchivo, false); // Crea un FileWriter para escribir en el archivo
             BufferedWriter bw = new BufferedWriter(fw)) { // Crea un BufferedWriter para escribir en el archivo
            
            bw.write(""); // Escribir una cadena vacía para limpiar el archivo
            
        } catch (IOException miError) {
            System.out.println("Error al limpiar el archivo " + nombreArchivo); // Imprime un mensaje de error si ocurre una excepción
            System.out.println(miError.getMessage()); // Imprime el mensaje de la excepción
        }
    }
    
    // Método para escribir en el archivo "Libro"
    public static boolean writeToFile1(String nombreArchivo, ArrayList<Libro> listaLibros) {
        try (FileWriter fw = new FileWriter(nombreArchivo, true); // Crea un FileWriter para escribir en el archivo
             BufferedWriter bw = new BufferedWriter(fw)) { // Crea un BufferedWriter para escribir en el archivo
            
            // Recorrer la lista de libros y escribir cada libro en una nueva línea
            for (Libro libro : listaLibros) { // Itera sobre cada libro en la lista
                String linea = "Id libro: " + libro.getIdLibro() + " , " + // Crea una cadena con los datos del libro
                               "Titulo: " + libro.getTitulo() + " , " +
                               "Autor: " + libro.getAutor() + " , " +
                               "Genero: " + libro.getGenero() + " , " +
                               "Año publicacion: " + libro.getAnioPublicacion();
                bw.write(linea); // Escribe la cadena en el archivo
                bw.newLine(); // Escribe una nueva línea después de cada libro
            }
            
            return true; // Indicar que la escritura fue exitosa
            
        } catch (IOException miError) {
            System.out.println("Error en la escritura del archivo"); // Imprime un mensaje de error si ocurre una excepción
            System.out.println(miError.getMessage()); // Imprime el mensaje de la excepción
            return false; // Indicar que hubo un error en la escritura
        }
    }
    
    // Método para escribir en el archivo "Cliente"
    public static boolean writeToFile2(String nombreArchivo, ArrayList<Cliente> listaClientes) {
        try (FileWriter fw = new FileWriter(nombreArchivo, true); // Crea un FileWriter para escribir en el archivo
             BufferedWriter bw = new BufferedWriter(fw)) { // Crea un BufferedWriter para escribir en el archivo
            
            // Recorrer la lista de clientes y escribir cada cliente en una nueva línea
            for (Cliente cliente : listaClientes) { // Itera sobre cada cliente en la lista
                String linea = "Id cliente: " + cliente.getId() + " , " + // Crea una cadena con los datos del cliente
                               "Nombre: " + cliente.getNombre() + " , " +
                               "Telefono: " + cliente.getTelefono() + " , " +
                               "Email: " + cliente.getEmail();
                bw.write(linea); // Escribe la cadena en el archivo
                bw.newLine(); // Escribe una nueva línea después de cada cliente
            }
            
            return true; // Indicar que la escritura fue exitosa
            
        } catch (IOException miError) {
            System.out.println("Error en la escritura del archivo"); // Imprime un mensaje de error si ocurre una excepción
            System.out.println(miError.getMessage()); // Imprime el mensaje de la excepción
            return false; // Indicar que hubo un error en la escritura
        }
    }
    
    // Método para escribir en el archivo "Bibliotecario"
    public static boolean writeToFile3(String nombreArchivo, ArrayList<Bibliotecario> listaBibliotecarios) {
        try (FileWriter fw = new FileWriter(nombreArchivo, true); // Crea un FileWriter para escribir en el archivo
             BufferedWriter bw = new BufferedWriter(fw)) { // Crea un BufferedWriter para escribir en el archivo
            
            // Recorrer la lista de bibliotecarios y escribir cada bibliotecario en una nueva línea
            for (Bibliotecario bibliotecario : listaBibliotecarios) { // Itera sobre cada bibliotecario en la lista
                String linea = "Nombre:" + bibliotecario.getNombre() + " , " + // Crea una cadena con los datos del bibliotecario
                               "Usuario: " + bibliotecario.getUsuario() + " , " +
                               "Contraseña: " + bibliotecario.getContrasena();
                bw.write(linea); // Escribe la cadena en el archivo
                bw.newLine(); // Escribe una nueva línea después de cada bibliotecario
            }
            
            return true; // Indicar que la escritura fue exitosa
            
        } catch (IOException miError) {
            System.out.println("Error en la escritura del archivo"); // Imprime un mensaje de error si ocurre una excepción
            System.out.println(miError.getMessage()); // Imprime el mensaje de la excepción
            return false; // Indicar que hubo un error en la escritura
        }
    }
    
    // Método para leer contenido de un archivo
    public static String readFromFile(String archivo) {
        try (FileReader fr = new FileReader(archivo); // Crea un FileReader para leer el archivo
             BufferedReader br = new BufferedReader(fr)) { // Crea un BufferedReader para leer el archivo
            
            String text = br.readLine(); // Leer la primera línea del archivo
            return text; // Devolver la línea leída
            
        } catch (IOException miError) {
            System.err.println("Error al leer el archivo"); // Imprime un mensaje de error si ocurre una excepción
            System.out.println(miError.getMessage()); // Imprime el mensaje de la excepción
            return null; // Indicar que hubo un error en la lectura
        }
    }
}

