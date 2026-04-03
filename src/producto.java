/**
 Clase Producto, representa un nodo dentro del árbol binario de búsqueda.
 */
public class producto {

    // Identificador único del producto
    int id;

    // Nombre del producto
    String nombre;

    // Referencias a los nodos hijos
    producto izquierdo; // Subárbol con IDs menores
    producto derecho; // Subárbol con IDs mayores

    // Constructor que inicializa el producto
    public producto(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        this.izquierdo = null;
        this.derecho = null;
    }
}
