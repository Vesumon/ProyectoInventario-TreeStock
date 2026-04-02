public class ArbolInventario {
    producto raiz;

    public ArbolInventario(){
        raiz = null;
    }

    //insertar (recursivo)
    public producto insertarRecursivo(producto raiz, int id, String nombre) {
        if (raiz == null){
            return new producto(id, nombre);
        }

        if (id < raiz.id){
            raiz.izquierdo = insertarRecursivo(raiz.izquierdo, id, nombre);
        } else if (id > raiz.id) {
            raiz.derecho = insertarRecursivo(raiz.derecho, id, nombre);
        }

        return raiz;
    }

    public void insertar(int id, String nombre) {
        raiz = insertarRecursivo(raiz, id, nombre);
    }

    // Recorrido Inorden (muestra ordenado)
    public void recorridoInorden(producto raiz) {
        
        if (raiz != null) {
            
            recorridoInorden(raiz.izquierdo);

            System.out.println("ID: " + raiz.id + " Nombre: " + raiz.nombre);

            recorridoInorden(raiz.derecho);
        }
    }

    public void mostrarInventario(){
        recorridoInorden(raiz);
    }

    // Buscar producto
    public boolean buscar(producto raiz, int id){
        
        if (raiz == null) {
            return false;
        }

        if (raiz.id == id) {
            return true;
        }

        if (id < raiz.id){
            return buscar(raiz.izquierdo, id);
        } else {
            return buscar(raiz.derecho, id);
        }
    }

    public boolean buscarProducto(int id){
        return buscar(raiz, id);
    }
}
