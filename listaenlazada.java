import java.util.LinkedList;
import java.util.Scanner;

public class listaenlazada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> listaEnlazada = new LinkedList<>(); // Crear una lista enlazada

        boolean continuar = true;
        while (continuar) {
            // Menú de opciones
            System.out.println("Selecciona una opción:");
            System.out.println("1. Agregar elemento a la lista");
            System.out.println("2. Mostrar la lista");
            System.out.println("3. Eliminar un elemento de la lista");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt(); // Leer la opción ingresada por el usuario
            scanner.nextLine(); // Limpiar el buffer del scanner después de nextInt()

            switch (opcion) {
                case 1:
                    // Agregar un elemento a la lista enlazada
                    System.out.println("Ingresa un elemento para agregar a la lista:");
                    String elemento = scanner.nextLine();
                    listaEnlazada.add(elemento); // Agregar el elemento a la lista
                    System.out.println("Elemento agregado a la lista.");
                    break;
                case 2:
                    // Mostrar el contenido de la lista enlazada
                    System.out.println("Contenido de la lista: " + listaEnlazada);
                    break;
                case 3:
                    // Eliminar un elemento de la lista enlazada
                    if (!listaEnlazada.isEmpty()) {
                        System.out.println("Ingresa el índice del elemento a eliminar:");
                        int indice = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer del scanner después de nextInt()

                        if (indice >= 0 && indice < listaEnlazada.size()) {
                            String elementoEliminado = listaEnlazada.remove(indice); // Eliminar el elemento en el índice dado
                            System.out.println("Elemento eliminado de la lista: " + elementoEliminado);
                        } else {
                            System.out.println("Índice fuera de rango. No se puede eliminar ningún elemento.");
                        }
                    } else {
                        System.out.println("La lista está vacía, no se puede eliminar ningún elemento.");
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
