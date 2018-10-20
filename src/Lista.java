public class Lista {
    //Campo (referencia externa)
    Nodo primero;
    //Constructor por defecto
    public Lista(){
        primero = null;
    }
    //Inicializar
    public void inicializar(){
        primero = null;
    }
    //Verificar si la lista está vacia
    public boolean listaVacia(){
        return primero==null;
    }
    //Insertar un nodo al principio de la lista
    public void insertar(double x){
        //Crear el nuevo nodo
        Nodo nuevo = new Nodo(x);
        nuevo.sig = primero;
        primero = nuevo;
    }
    //Insertar un nodo en una posicion distinta de la primera
    //Eliminar el 1er Nodo
    public void insertar2(Nodo pos, double x){
        Nodo nuevo = new Nodo(x);
        nuevo.sig = pos.sig;
        pos.sig = nuevo;
    }
    public void eliminer(){
        if(!listaVacia()){//Lista no vacia
            primero = primero.sig;
        }
    }
}
