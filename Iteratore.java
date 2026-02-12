public class Iteratore {
    private Lista iterabile;
    private Nodo cursor;

    public Iteratore(Lista lista){
        iterabile = lista;
        cursor = lista.getHead();
    }

    public boolean hasNext(){
        return cursor.getNextNodo() != null;
    }

    public Nodo next(){
        Nodo thisNodo = cursor;
        cursor = cursor.getNextNodo();
        return thisNodo;
    }
}
