package ejerciciolista.pq2;
/**
 * Author :  Vinni vinni_@yahoo.com
 */
public class Lista {
    public Nodo nodoPrincipal;

    /**
     * Adiciona un nodo al final de la lista
     * @param nodo Nodo
     */
    public void adicionarNodo(Nodo nodo){
        if (nodo != null){
            //si nodo tiene algo esta lleno sino no existe lista 
            if (nodoPrincipal == null){
                this.nodoPrincipal = nodo;
            }else{
                this.nodoPrincipal.siguienteNodo = nodo;
            }
        }
    }
    public void adicionarNodoInicio(Nodo nodo){
        if (nodoPrincipal == null){
            nodoPrincipal = nodo;
        }else{
            nodo.siguienteNodo = nodoPrincipal;
            nodoPrincipal = nodo;
        }
    }
    /**
     * imprime toda la lista
     */
    public void imprimir(){
        Nodo nodoAuxiliar = new Nodo("");
        nodoAuxiliar = nodoPrincipal;
        while(nodoAuxiliar != null) {
            System.out.println(nodoAuxiliar.informacion);
            nodoAuxiliar = nodoAuxiliar.siguienteNodo;
        }
    }
    /**
     * borra el primer nodo de la lista y la reorganiza, El nodo nodo 2 queda de primero.
     * Si solo hay uno queda vacia
     */
    public void borrarPrimero(Nodo nodo){
        if(nodo != null){
            if(nodoPrincipal.siguienteNodo == null){
                nodoPrincipal = null;
            }else{
                nodoPrincipal = nodoPrincipal.siguienteNodo;
            }
        }
    }
    /**
     * Borra el ultimo nodo de la lista y reorganiza. EL penultimo nodo queda de primero 
     * Si solo hay uno queda vacia
     */
    public void borrarUltimo(){

    }
    /**
     * borra el nodo de la posicion
     */
    public void borrarNodoIntermedio(int posicion){

    }
}
