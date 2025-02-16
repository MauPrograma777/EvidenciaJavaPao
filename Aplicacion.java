import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("Gabriel García Márquez", "100 años de soledad", "Novela", "00001"));
        libros.add(new Libro("J.K. Rowling", "Harry Potter y la piedra filosofal", "Ciencia ficcion", "00002"));
        libros.add(new Libro("Baldor", "Operaciones aritméticas", "Educacion", "00003"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Opción 1: Registrar un libro");
            System.out.println("Opción 2: Buscar por código");
            System.out.println("Opción 3: Mostrar todos los libros");
            System.out.println("Opción 4: Buscar por género");
            System.out.println("Opción 5: Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el código de barras: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Ingrese el género: ");
                    String genero = scanner.nextLine();
                    libros.add(new Libro(autor, titulo, genero, codigo));
                    System.out.println("Libro registrado exitosamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el código de barras: ");
                    String codigoBusqueda = scanner.nextLine();
                    boolean encontrado = false;
                    for (Libro libro : libros) {
                        if (libro.getCodigoBarras().equals(codigoBusqueda)) {
                            System.out.println(libro);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró el código de barras solicitado: " + codigoBusqueda);
                    }
                    break;
                case 3:
                    if (libros.isEmpty()) {
                        System.out.println("No hay libros registrados.");
                    } else {
                        for (Libro libro : libros) {
                            System.out.println(libro);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el género: ");
                    String generoBusqueda = scanner.nextLine().trim(); // Limpia la cadena
                    List<Libro> librosEncontrados = new ArrayList<>();
                    for (Libro libro : libros) {
                        if (libro.getGenero().trim().equalsIgnoreCase(generoBusqueda)) {
                            librosEncontrados.add(libro);
                        }
                    }
                    if (librosEncontrados.isEmpty()) {
                        System.out.println("No se encontró el género solicitado: " + generoBusqueda);
                    } else {
                        for (Libro libro : librosEncontrados) {
                            System.out.println(libro);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
