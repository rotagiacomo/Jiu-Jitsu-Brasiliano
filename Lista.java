public class Lista {
    private Nodo head;

    public void aggiungiInTesta(Nodo nodo){
        nodo.setNextNodo(head);
        head = nodo;
    }

    private void inizializzaHead(Nodo nodo){
        head = nodo;
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
