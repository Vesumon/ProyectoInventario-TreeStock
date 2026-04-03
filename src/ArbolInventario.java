/**
 Clase ArbolInventario, contiene la lógica del árbol binario de búsqueda.
 */
public class ArbolInventario {

    // Nodo raíz del árbol
    producto raiz;

    public ArbolInventario(){
        raiz = null;
    }

    // Método recursivo para insertar un producto en el árbol
    public producto insertarRecursivo(producto raiz, int id, String nombre) {

        // Si el árbol está vacío, se crea un nuevo nodo
        if (raiz == null){
            return new producto(id, nombre);
        }

        // Si el ID es menor, se inserta en el subárbol izquierdo
        if (id < raiz.id){
            raiz.izquierdo = insertarRecursivo(raiz.izquierdo, id, nombre);
        } 
        
        // Si el ID es mayor, se inserta en el subárbol derecho
        else if (id > raiz.id) {
            raiz.derecho = insertarRecursivo(raiz.derecho, id, nombre);
        }

        return raiz;
    }

    // Método público para insertar un producto
    public void insertar(int id, String nombre) {
        raiz = insertarRecursivo(raiz, id, nombre);
    }

    /**
     * Recorrido Inorden: izquierda -> raíz -> derecha
     * Permite mostrar los productos ordenados por ID
     */
    public void recorridoInorden(producto raiz) {
        
        if (raiz != null) {
            
            // Recorre el subárbol izquierdo
            recorridoInorden(raiz.izquierdo);

            // Muestra el nodo actual
            System.out.println("ID: " + raiz.id + " Nombre: " + raiz.nombre);

            // Recorre el subárbol derecho
            recorridoInorden(raiz.derecho);
        }
    }

    // Método público para mostrar el inventario
    public void mostrarInventario(){
        recorridoInorden(raiz);
    }

    // Método recursivo para buscar un producto por ID
    public boolean buscar(producto raiz, int id){
        
        // Si no se encuentra el nodo
        if (raiz == null) {
            return false;
        }

        // Si se encuentra el producto
        if (raiz.id == id) {
            return true;
        }

        // Si el ID es menor, buscar en la izquierda
        if (id < raiz.id){
            return buscar(raiz.izquierdo, id);
        } 
        
        // Si es mayor, buscar en la derecha
        else {
            return buscar(raiz.derecho, id);
        }
    }

    // Método público para buscar un producto
    public boolean buscarProducto(int id){
        return buscar(raiz, id);
    }
}
