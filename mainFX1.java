package primeraventana;

// Importamos las clases necesarias
import java.util.ArrayList;
import javax.swing.JOptionPane;
import CapaGrafica.PrimeraVentana;
import javafx.stage.Stage;

// Definimos la clase principal
public class mainFX1 {
    
    public static void main(String[] args) {
        
        //Se crea una lista para agregar la lista de libros a los archivos txt
        ArrayList<Libro> listaLibrosDisponibles = datosLibrosDisponibles();
        listaLibrosDisponibles = datosLibrosReservados(listaLibrosDisponibles);
        listaLibrosDisponibles = datosLibrosPrestamo(listaLibrosDisponibles);
        
        //Se crea una lista para agregar la lista de cliente a los archivos txt
        ArrayList<Cliente> listaClientes = datosClientes();
        ArrayList<Bibliotecario> listaBibliotecarios = datosBibliotecarios();
        
        //Se le asignan nombres a cada archivo de cada clase
        String nombre_archivo1 = "Libro.txt";
        String nombre_archivo2 = "Cliente.txt";
        String nombre_archivo3 = "Bibliotecario.txt";

        //Hay un problema aca
        Archivoss.createFile(nombre_archivo1);
        Archivoss.createFile(nombre_archivo2);
        Archivoss.createFile(nombre_archivo3);
        
        //Se escriben los archivos con el ArrayList creado anteriormente, esto para cada clase la cual se define en nombre_archivo
        Archivoss.writeToFile1(nombre_archivo1, listaLibrosDisponibles);
        Archivoss.writeToFile2(nombre_archivo2, listaClientes);
        Archivoss.writeToFile3(nombre_archivo3, listaBibliotecarios);
        
        //  Menu principal
        int menuPrincipal = Integer.parseInt(JOptionPane.showInputDialog("""
                                             ====MENU PRINCIPAL====
                                             1. Menu bibliotecario
                                             2. Menu cliente
                                             3. Salir"""));
        switch (menuPrincipal) {
            case 1:
                Acceso acceso1= new Acceso();
                acceso1.verificarAccesoBibliotecario();
                int menu_bibliotecario;
                do{
                    // Se muestra el menú del bibliotecario y se solicita al usuario que elija una opción
                    menu_bibliotecario = Integer.parseInt(JOptionPane.showInputDialog("""
                                                    ====MENU BIBLIOTECARIO====
                                                    1. Agregar un libro al sistema
                                                    2. Consultar informacion libro
                                                    3. Eliminar libro
                                                    4. Informe libros disponibles
                                                    5. Informe libros prestados
                                                    6. Informe libros reservados
                                                    7. Salir"""));
                    switch (menu_bibliotecario) {
                        case 1: 
                            // Si el usuario elige la opción 1, se registra un nuevo libro
                            Libro libro0 = new Libro();
                            Bibliotecario bibliotecario0 = new Bibliotecario();
                            listaLibrosDisponibles.add(bibliotecario0.registrarLibro(libro0));
                            break;
                        case 2:
                            // Si el usuario elige la opción 2, se consulta la información de un libro
                            Bibliotecario bibliotecario = new Bibliotecario();
                            Libro libroConsulta = new Libro();
                            bibliotecario.consultarInformacionLibro(libroConsulta, listaLibrosDisponibles);
                            break;
                        case 3:
                            // Si el usuario elige la opción 3, se elimina un libro
                            Bibliotecario bibliotecario4 = new Bibliotecario();
                            Libro libroConsulta1 = new Libro();
                            bibliotecario4.eliminarLibro(libroConsulta1, listaLibrosDisponibles);
                        case 4: 
                            // Si el usuario elige la opción 4, se obtienen los libros disponibles
                            Bibliotecario bibliotecario1 = new Bibliotecario();
                            bibliotecario1.obtenerLibrosDisponibles(listaLibrosDisponibles);
                            break;
                        case 5:
                            // Si el usuario elige la opción 5, se obtienen los libros prestados
                            Bibliotecario bibliotecario2 = new Bibliotecario();
                            bibliotecario2.obtenerLibrosPrestados(listaLibrosDisponibles);
                            break;
                        case 6:
                            // Si el usuario elige la opción 6, se obtienen los libros reservados
                            Bibliotecario bibliotecario3 = new Bibliotecario();
                            bibliotecario3.obtenerLibrosReservados(listaLibrosDisponibles);
                            break;
                        case 7:
                            // Si el usuario elige la opción 7, se actualiza el archivo de libros disponibles y se sale del programa
                            Archivoss.writeToFile1(nombre_archivo1, listaLibrosDisponibles);
                            salir();
                        default:
                            // Si el usuario elige una opción no válida, se muestra un mensaje de error
                            System.out.println("Opcion invalida");
                    }
                }while (menu_bibliotecario != 7);
                // Se repite el ciclo hasta que el usuario elija la opción 7 para salir
                break;
            case 2: 
                // Se crea un nuevo objeto de la clase Acceso y se verifica el acceso del cliente
                Acceso acceso2= new Acceso();
                acceso2.verificarAccesoCliente();
                int menu2;
                do{ 
                // Se muestra el menú del cliente y se solicita al usuario que elija una opción
                   menu2 = Integer.parseInt(JOptionPane.showInputDialog("""
                                                     ====MENU CLIENTE====
                                                     1. Realizar prestamo
                                                     2. Realizar devolucion
                                                     3. Realizar reserva
                                                     4. Consultar libros prestados
                                                     5. Consultar libros reservados
                                                     6. Salir"""));
                    switch (menu2) {
                        case 1:
                            // Si el usuario elige la opción 1, se realiza un préstamo de libro
                            System.out.println("PRESTAR LIBRO");                       
                            Cliente cliente = new Cliente();
                            Libro libro = new Libro();
                            cliente.realizarPrestamo(libro, listaLibrosDisponibles);
                            break;                  
                        case 2:
                            // Si el usuario elige la opción 2, se realiza una devolución de libro
                            System.out.println("DEVOLVER LIBRO");
                            Cliente cliente1 = new Cliente();
                            Libro libro1 = new Libro();
                            cliente1.realizarDevolucion(libro1, listaLibrosDisponibles);
                            break;
                        case 3:
                            // Si el usuario elige la opción 3, se realiza una reserva de libro
                            System.out.println("RESERVAR LIBRO");
                            Libro libro2 = new Libro();
                            libro2.reservarLibro(libro2, listaLibrosDisponibles);
                            break;
                        case 4:
                            // Si el usuario elige la opción 4, se consultan los libros prestados
                            Cliente cliente2 = new Cliente();
                            cliente2.consultarLibrosPrestados(listaLibrosDisponibles);
                            break;
                        case 5:
                            // Si el usuario elige la opción 5, se consultan los libros reservados
                            Cliente cliente3 = new Cliente();
                            cliente3.consultarLibrosReservados(listaLibrosDisponibles);
                            break;
                        case 6:
                            // Si el usuario elige la opción 6, se actualiza el archivo de libros disponibles y se sale del programa
                            Archivoss.writeToFile1(nombre_archivo1, listaLibrosDisponibles);
                            salir();
                        default:
                            // Si el usuario elige una opción no válida, se muestra un mensaje de error 
                            System.out.println("Opción inválida");
                    }
                }while (menu2 != 6);
                // El ciclo del menú del cliente continúa hasta que el usuario selecciona la opción 6 para salir
                break;
            case 3: 
                // Si el usuario selecciona la opción 3 en el menú principal, se ejecuta la función salir() para terminar el programa
                salir();
                break;
            default:
                System.out.println("Opción inválida");
                // Fin del switch para el menú principal
        }
    }
    
    public static void salir() {
        // Imprime un mensaje de despedida y termina la ejecución del programa
        System.out.println("Gracias por usar nuestra aplicacion");
        System.exit(0);
    }
    public static ArrayList<Cliente> datosClientes(){
        // Crea una lista de clientes con datos predefinidos
        ArrayList<Cliente> clientes = new ArrayList<>();

        // Creación de clientes y asignación de sus propiedades
        //Cliente1
        Cliente cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNombre("luis");
        cliente1.setTelefono("342529");
        cliente1.setEmail("luis@hjgsa.com");
        //Cliente2
        Cliente cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setNombre("jose");
        cliente2.setTelefono("87453");
        cliente2.setEmail("jose@ghui.com");
        //Cliente3
        Cliente cliente3 = new Cliente();
        cliente3.setId(3);
        cliente3.setNombre("ana");
        cliente3.setTelefono("98765");
        cliente3.setEmail("ana@email.com");
        //Cliente4
        Cliente cliente4 = new Cliente();
        cliente4.setId(4);
        cliente4.setNombre("carlos");
        cliente4.setTelefono("12345");
        cliente4.setEmail("carlos@dominio.com");
        //Cliente3
        Cliente cliente5 = new Cliente();
        cliente5.setId(5);
        cliente5.setNombre("laura");
        cliente5.setTelefono("67890");
        cliente5.setEmail("laura@correo.com");
        // Añade los clientes a la lista
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        // Retorna la lista de clientes
        return clientes;
    }
    public static ArrayList<Bibliotecario> datosBibliotecarios(){
        // Crea una lista de bibliotecarios con datos predefinidos
        ArrayList<Bibliotecario> bibliotecarios = new ArrayList<>();

        // Creación de bibliotecarios y asignación de sus propiedades
        Bibliotecario bibliotecario1 = new Bibliotecario();
        bibliotecario1.setNombre("jose");
        bibliotecario1.setUsuario("Admin1");
        bibliotecario1.setContrasena(123);
        
        Bibliotecario bibliotecario2 = new Bibliotecario();
        bibliotecario2.setNombre("santiago");
        bibliotecario2.setUsuario("Admin2");
        bibliotecario2.setContrasena(321);

        //Se anade a el arraylist el bibliotecario1
        bibliotecarios.add(bibliotecario1);
        bibliotecarios.add(bibliotecario2);
        // Retorna la lista de bibliotecarios
        return bibliotecarios;
    }   
    public static ArrayList<Libro> datosLibrosDisponibles( ){
        // Crea una lista de libros disponibles con datos predefinidos
        ArrayList<Libro> librosDisponibles = new ArrayList<>();

        // Creación de libros y asignación de sus propiedades
        Libro libro1 = new Libro();
        libro1.setIdLibro(100);
        libro1.setTitulo("El jardin de las mariposas");
        libro1.setAutor("Patricia Smith");
        libro1.setGenero("Drama");
        libro1.setAnioPublicacion(2020);
        libro1.setEstado('D');
        
        Libro libro2 = new Libro();
        libro2.setIdLibro(101);
        libro2.setTitulo("La sombra del viento");
        libro2.setAutor("Carlos Ruiz");
        libro2.setGenero("Misterio");
        libro2.setAnioPublicacion(2001);
        libro2.setEstado('D');

        Libro libro3 = new Libro();
        libro3.setIdLibro(102);
        libro3.setTitulo("Cien años de soledad");
        libro3.setAutor("Gabriel García Márquez");
        libro3.setGenero("Realismo mágico");
        libro3.setAnioPublicacion(1967);
        libro3.setEstado('D');
    
        Libro libro4 = new Libro();
        libro4.setIdLibro(103);
        libro4.setTitulo("1984");
        libro4.setAutor("George Orwell");
        libro4.setGenero("Ciencia ficción");
        libro4.setAnioPublicacion(1949);
        libro4.setEstado('D');

        Libro libro5 = new Libro();
        libro5.setIdLibro(104);
        libro5.setTitulo("El alquimista");
        libro5.setAutor("Paulo Coelho");
        libro5.setGenero("Ficción espiritual");
        libro5.setAnioPublicacion(1988);
        libro5.setEstado('D');
        
        // Añade los libros a la lista
        librosDisponibles.add(libro1);
        librosDisponibles.add(libro2);
        librosDisponibles.add(libro3);
        librosDisponibles.add(libro4);
        librosDisponibles.add(libro5);
        // Retorna la lista de libros disponibles
        return librosDisponibles;
    }
        public static ArrayList<Libro> datosLibrosReservados(ArrayList<Libro> librosDisponibles){
        // Crea una lista de libros reservados con datos predefinidos y los añade a la lista de libros disponibles
        Libro libro6 = new Libro();
        libro6.setIdLibro(105);
        libro6.setTitulo("Moby-Dick");
        libro6.setAutor("Herman Melville");
        libro6.setGenero("Novela");
        libro6.setAnioPublicacion(1851);
        libro6.setEstado('R');

        Libro libro7 = new Libro();
        libro7.setIdLibro(106);
        libro7.setTitulo("Don Quijote de la Mancha");
        libro7.setAutor("Miguel de Cervantes");
        libro7.setGenero("Novela");
        libro7.setAnioPublicacion(1605);
        libro7.setEstado('R');
        // Añade los libros reservados a la lista de libros disponibles
        librosDisponibles.add(libro6);
        librosDisponibles.add(libro7);
        // Retorna la lista de libros disponibles actualizada
        return librosDisponibles;

    }
        public static ArrayList<Libro> datosLibrosPrestamo(ArrayList<Libro> librosDisponibles){

        // Crea una lista de libros prestados con datos predefinidos y los añade a la lista de libros disponibles
        Libro libro8 = new Libro();
        libro8.setIdLibro(107);
        libro8.setTitulo("Hamlet");
        libro8.setAutor("William Shakespeare");
        libro8.setGenero("Tragedia");
        libro8.setAnioPublicacion(1601);
        libro8.setEstado('P');

        Libro libro9 = new Libro();
        libro9.setIdLibro(108);
        libro9.setTitulo("Orgullo y prejuicio");
        libro9.setAutor("Jane Austen");
        libro9.setGenero("Romance");
        libro9.setAnioPublicacion(1813);
        libro9.setEstado('P');

        Libro libro10 = new Libro();
        libro10.setIdLibro(109);
        libro10.setTitulo("Las aventuras de Tom Sawyer");
        libro10.setAutor("Mark Twain");
        libro10.setGenero("Novela");
        libro10.setAnioPublicacion(1876);
        libro10.setEstado('P');
        
        // Añade los libros prestados a la lista de libros disponibles
        librosDisponibles.add(libro8);
        librosDisponibles.add(libro9);
        librosDisponibles.add(libro10);

        // Retorna la lista de libros disponibles actualizada
        return librosDisponibles;
    }        
}

