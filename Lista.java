public class Lista {
    private Nodo head;

    public void aggiungiInTesta(Nodo nodo){
        nodo.setNextNodo(head);
        head = nodo;
    }

    public void aggiungiInCoda(Nodo nodo){
        if (head == null) {
            aggiungiInTesta(nodo);
        }else{
            Nodo cursor = raggiungiIndice(getSize()-1);
            cursor.setNextNodo(nodo);
        }
    }

    public void aggiungiOrdinato(Nodo nodo){
        if(head == null || nodo.compareTo(head) < 0){
            aggiungiInTesta(nodo);
        }else{
            Nodo cursor = head;
            while (cursor.getNextNodo() != null) {
                if (nodo.compareTo(cursor.getNextNodo()) < 0) {
                    nodo.setNextNodo(cursor.getNextNodo());
                    cursor.setNextNodo(nodo);
                    return;
                }
                cursor = cursor.getNextNodo();
            }
            cursor.setNextNodo(nodo);
        }
    }

    public Nodo raggiungiIndice(int indice){
        Nodo cursor = head;
        for(int i=0; i<indice; i++){
            cursor = cursor.getNextNodo();
        }
        return cursor;
    }

    public int getSize(){
        Nodo cursor = head;
        int size = 0;
        while (cursor != null) {
            cursor = cursor.getNextNodo();
            size++;
        }
        return size;
    }

    public String toString(){
        Nodo cursor = head;
        String string = "";
        while (cursor != null) {
            string += cursor.getContenuto();
            if (cursor.getNextNodo() != null) {
                string += ",";
            }
            cursor = cursor.getNextNodo();
        }
        return string;
    }
}
