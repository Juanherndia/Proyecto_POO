package primeraventana; // Define el paquete en el que se encuentra la clase

// Importa las clases necesarias para el manejo de listas, cuadros de diálogo y las clases del paquete mainFX1
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static primeraventana.mainFX1.datosBibliotecarios;
import static primeraventana.mainFX1.datosClientes;
import static primeraventana.mainFX1.salir;

public class Acceso { // Define la clase Acceso
    //Esta mal ya que solo compara el primer cliente
    public void verificarAccesoCliente() { // Método para verificar el acceso de un cliente
    String nombreCliente = JOptionPane.showInputDialog("Ingrese su nombre:"); // Solicita al usuario que ingrese su nombre
    ArrayList<Cliente> compararDatosClientes = datosClientes(); // Obtiene la lista de clientes
    boolean clienteEncontrado = false; // Variable para indicar si se encontró al cliente
    for (Cliente cliente : compararDatosClientes) { // Itera sobre cada cliente en la lista
        if (cliente.getNombre().equalsIgnoreCase(nombreCliente)) { // Compara el nombre del cliente con el nombre ingresado
            clienteEncontrado = true; // Si los nombres coinciden, establece clienteEncontrado en true
            System.out.println("Bienvenido, cliente"); // Imprime un mensaje de bienvenida
            break; // Sale del bucle
        }
        else{ // Si los nombres no coinciden
            System.out.println("Nombre incorrecto"); // Imprime un mensaje de error
            salir(); // Llama al método salir
        }
    }
    } // Fin del método verificarAccesoCliente
    public void verificarAccesoBibliotecario() { // Método para verificar el acceso de un bibliotecario
    int idIngresadoBibliotecario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña:")); // Solicita al usuario que ingrese su contraseña

    ArrayList<Bibliotecario> compararDatosBibliotecarios = datosBibliotecarios(); // Obtiene la lista de bibliotecarios

    boolean BibliotecarioEncontrado = false; // Variable para indicar si se encontró al bibliotecario
    for (Bibliotecario cliente : compararDatosBibliotecarios) { // Itera sobre cada bibliotecario en la lista
        if (cliente.getContrasena() == idIngresadoBibliotecario) { // Compara la contraseña del bibliotecario con la contraseña ingresada
            BibliotecarioEncontrado = true; // Si las contraseñas coinciden, establece BibliotecarioEncontrado en true
            System.out.println("Bienvenido, bibliotecario "); // Imprime un mensaje de bienvenida
            break; // Sale del bucle
        }
        else{ // Si las contraseñas no coinciden
            System.out.println("Contrasena incorrecta"); // Imprime un mensaje de error
            salir(); // Llama al método salir
        }
    }
    } // Fin del método verificarAccesoBibliotecario
    public Acceso(){ // Constructor de la clase Acceso

    } // Fin del constructor
} // Fin de la clase Acceso


