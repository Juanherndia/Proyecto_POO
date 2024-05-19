package MenuPrincipal; // Define el paquete en el que se encuentra la clase

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

// Importa las clases necesarias para el manejo de URLs, recursos, eventos de acción, FXML y botones
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author JUAN HENAO
 */
public class MenuController implements Initializable { // Define la clase MenuController que implementa la interfaz Initializable

    @FXML // Anotación que indica que el siguiente miembro debe ser inyectado con un objeto del archivo FXML
    private Button boton_cliente; // Define un botón privado llamado boton_cliente

    /**
     * Initializes the controller class.
     */
    @Override // Indica que el siguiente método sobrescribe un método de su superclase
    public void initialize(URL url, ResourceBundle rb) { // Método para inicializar la clase controladora
        // TODO
    }    

    @FXML // Anotación que indica que el siguiente miembro debe ser inyectado con un objeto del archivo FXML
    private void modelarClientes(ActionEvent event) { // Método para modelar clientes, recibe un evento de acción como parámetro
    }
    
} // Fin de la clase MenuController


