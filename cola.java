import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cola {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> cola = new LinkedList<>(); // Crear una cola utilizando LinkedList

        boolean continuar = true;
        while (continuar) {
            // Menú de opciones
            System.out.println("Selecciona una opción:");
            System.out.println("1. Agregar elemento a la cola");
            System.out.println("2. Mostrar la cola");
            System.out.println("3. Eliminar un elemento de la cola");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt(); // Leer la opción ingresada por el usuario
            scanner.nextLine(); // Limpiar el buffer del scanner después de nextInt()

            switch (opcion) {
                case 1:
                    // Agregar un elemento a la cola
                    System.out.println("Ingresa un elemento para agregar a la cola:");
                    String elemento = scanner.nextLine();
                    cola.offer(elemento); // Agregar el elemento a la cola
                    System.out.println("Elemento agregado a la cola.");
                    break;
                case 2:
                    // Mostrar el contenido de la cola
                    System.out.println("Contenido de la cola: " + cola);
                    break;
                case 3:
                    // Eliminar un elemento de la cola
                    if (!cola.isEmpty()) {
                        String elementoEliminado = cola.poll(); // Eliminar y obtener el primer elemento de la cola (FIFO)
                        System.out.println("Elemento eliminado de la cola: " + elementoEliminado);
                    } else {
                        System.out.println("La cola está vacía, no se puede eliminar ningún elemento.");
                    }
                    break;
                case 4:
                    // Salir del programa
                    continuar = false;
                    break;
                default:
                    // Opción inválida
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }
        }

        scanner.close(); // Cerrar el Scanner al salir del programa
    }
}
