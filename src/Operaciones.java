import java.util.Scanner;
public class Operaciones {
    //Insertar N nodos
    public Lista insertarN(Lista L){
        Scanner leer = new Scanner(System.in);
        System.out.print("No. de Nodos: "); int nn = leer.nextInt();
        double d;
        for(int i=1; i<=nn; i++){
            System.out.print("dato= "); d = leer.nextDouble();
            L.insertar(d);
        }
        return L;
    }
    //Mostrar(recorrer) la lista
    public void mostrar(Lista L){
        Nodo p = L.primero;
        while(p != null){
            System.out.println(p.dato);
            p = p.sig;
        }
    }
}
