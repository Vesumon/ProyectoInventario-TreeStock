import java.util.Scanner;

//Clase principal, contiene el menú interactivo del sistema
public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Instancia del árbol
        ArbolInventario inventario = new ArbolInventario();

        int opcion;

        do {

            // Menú principal
            System.out.println("\n===== TREE-STOCK INVENTARIO =====");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Inventario");
            System.out.println("3. Buscar Producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    // Registro de producto
                    System.out.print("Ingrese ID del producto: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Ingrese nombre del producto: ");
                    String nombre = sc.nextLine();

                    inventario.insertar(id, nombre);

                    System.out.println("Producto registrado correctamente.");

                    break;
                
                case 2:
                    // Mostrar inventario
                    System.out.println("\nInventario ordenado:");
                    inventario.mostrarInventario();

                    break;

                case 3:
                    // Buscar producto
                    System.out.print("Ingrese ID a buscar: ");
                    int buscarID = sc.nextInt();

                    if (inventario.buscarProducto(buscarID)) {
                        System.out.println("El producto existe en el inventario.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }

                    break;
                
                case 0:

                    System.out.println("Saliendo del sistema...");

                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 0);         
        
        sc.close();
    }
}
