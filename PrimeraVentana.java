package CapaGrafica; // Define el paquete en el que se encuentra la clase

// Importa las clases necesarias para el manejo de excepciones de entrada/salida, la aplicación JavaFX, el cargador FXML, la clase Parent, la clase Scene y la clase Stage
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimeraVentana extends Application { // Define la clase PrimeraVentana que extiende la clase Application

    @Override // Indica que el siguiente método sobrescribe un método de su superclase
    public void start(Stage ventana) throws IOException { // Método para iniciar la aplicación, recibe un objeto Stage como parámetro y puede lanzar una excepción de entrada/salida
        Parent root = FXMLLoader.load(getClass().getResource("/CapaGrafica/VentanaFXML1.fxml")); // Carga el archivo FXML para armar la ventana
        Scene scene = new Scene(root); // Crea una nueva escena con el objeto root como nodo raíz
        ventana.setScene(scene); // Establece la escena de la ventana
        ventana.setTitle("DATOS CLIENTES"); // Establece el título de la ventana
        ventana.setResizable(false); // Establece que la ventana no se puede redimensionar
        //ventana.setOnCloseRequest(event -> {event.consume();}); // Comentario: código para manejar la solicitud de cierre de la ventana
        ventana.show(); // Muestra la ventana
    }

    public static void main(String[] args) { // Método principal de la aplicación
        launch(args); // Lanza la aplicación JavaFX
    }
    
    public void funcion(){ // Método adicional llamado funcion
        launch(); // Lanza la aplicación JavaFX sin argumentos
    }

} // Fin de la clase PrimeraVentana
