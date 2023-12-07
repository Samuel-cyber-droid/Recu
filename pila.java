import java.util.Scanner;
import java.util.Stack;

public class pila {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> pila = new Stack<>(); // Crear una pila utilizando Stack

        boolean continuar = true;
        while (continuar) {
            // Menú de opciones
            System.out.println("Selecciona una opción:");
            System.out.println("1. Agregar elemento a la pila");
            System.out.println("2. Mostrar la pila");
            System.out.println("3. Eliminar un elemento de la pila");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt(); // Leer la opción ingresada por el usuario
            scanner.nextLine(); // Limpiar el buffer del scanner después de nextInt()

            switch (opcion) {
                case 1:
                    // Agregar un elemento a la pila
                    System.out.println("Ingresa un elemento para agregar a la pila:");
                    String elemento = scanner.nextLine();
                    pila.push(elemento); // Agregar el elemento a la pila
                    System.out.println("Elemento agregado a la pila.");
                    break;
                case 2:
                    // Mostrar el contenido de la pila
                    System.out.println("Contenido de la pila: " + pila);
                    break;
                case 3:
                    // Eliminar un elemento de la pila
                    if (!pila.isEmpty()) {
                        String elementoEliminado = pila.pop(); // Eliminar y obtener el último elemento de la pila (LIFO)
                        System.out.println("Elemento eliminado de la pila: " + elementoEliminado);
                    } else {
                        System.out.println("La pila está vacía, no se puede eliminar ningún elemento.");
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

