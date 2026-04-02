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
}
