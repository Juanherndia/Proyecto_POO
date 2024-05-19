package CapaGrafica; // Define el paquete en el que se encuentra la clase

// Importa las clases necesarias para el manejo de URLs, listas, recursos, eventos de acción, FXML, etiquetas y paneles de cuadrícula
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import primeraventana.mainFX1; // Importa la clase mainFX1 del paquete primeraventana
import primeraventana.Cliente; // Importa la clase Cliente del paquete primeraventana

public class VentanaFXMLController implements Initializable { // Define la clase VentanaFXMLController que implementa la interfaz Initializable

    // Atributos agregados por Gabriel Soche
    private int np = 0; // Define un atributo privado de tipo int llamado np e inicializa su valor en 0
    @FXML // Anotación que indica que el siguiente miembro debe ser inyectado con un objeto del archivo FXML
    private GridPane matriz_cliente; // Define un panel de cuadrícula privado llamado matriz_cliente

    @Override // Indica que el siguiente método sobrescribe un método de su superclase
    public void initialize(URL url, ResourceBundle rb) { // Método para inicializar la clase controladora
        // No se realiza ninguna operación en este método
    } 

    @SuppressWarnings("unchecked") // Suprime las advertencias de tipo unchecked para este método
    @FXML // Anotación que indica que el siguiente miembro debe ser inyectado con un objeto del archivo FXML
    private void modelarClientes(){ // Método para modelar clientes
        // Crea etiquetas para los encabezados de las columnas y las añade al panel de cuadrícula
        Label id = new Label("                   ID");
        Label nombre = new Label("            NOMBRE");
        Label telefono = new Label("          TELEFONO");
        Label email = new Label("                EMAIL");

        matriz_cliente.add(id, 0, 0);
        matriz_cliente.add(nombre, 1, 0);
        matriz_cliente.add(telefono, 2, 0);
        matriz_cliente.add(email, 3, 0);

        // Establece el estilo de las etiquetas de los encabezados
        id.setStyle("-fx-font-family: 'Microsoft JhengHei'; -fx-font-weight: bold");
        nombre.setStyle("-fx-font-family: 'Microsoft JhengHei'; -fx-font-weight: bold");
        telefono.setStyle("-fx-font-family: 'Microsoft JhengHei'; -fx-font-weight: bold");
        email.setStyle("-fx-font-family: 'Microsoft JhengHei'; -fx-font-weight: bold");

        // Obtiene la lista de clientes
        ArrayList<Cliente> clientes = mainFX1.datosClientes();

        // Itera sobre cada cliente en la lista
        for(int i =0; i < clientes.size();i++){
            // Obtiene los datos del cliente
            String idCliente = Integer.toString(clientes.get(i).getId());
            String nombreCliente = clientes.get(i).getNombre();
            String telefonoCliente = clientes.get(i).getTelefono();
            String emailCliente = clientes.get(i).getEmail();

            // Crea etiquetas para los datos del cliente
            Label labelID = new Label(idCliente);
            Label labelNombre = new Label(nombreCliente);
            Label labelTelefono = new Label(telefonoCliente);
            Label labelEmail = new Label(emailCliente);

            // Añade las etiquetas al panel de cuadrícula
            matriz_cliente.add(labelID, 0, i + 1);            
            matriz_cliente.add(labelNombre, 1, i + 1);
            matriz_cliente.add(labelTelefono, 2, i + 1);
            matriz_cliente.add(labelEmail, 3, i + 1);
        }
    }

    @FXML // Anotación que indica que el siguiente miembro debe ser inyectado con un objeto del archivo FXML
    private void salida(ActionEvent event) { // Método para manejar el evento de salida, recibe un evento de acción como parámetro
        // No se realiza ninguna operación en este método
    }
} // Fin de la clase VentanaFXMLController



