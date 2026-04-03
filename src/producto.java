public class producto {
    int id;
    String nombre;

    producto izquierdo;
    producto derecho;

    public producto(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        this.izquierdo = null;
        this.derecho = null;
    }
}
