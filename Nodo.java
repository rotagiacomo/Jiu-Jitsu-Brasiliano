public class Nodo {
    private Nodo nextNodo;
    private Tecnica contenuto;

    public Nodo(Tecnica contenuto){
        this.contenuto = contenuto;
    }

    public void setNextNodo(Nodo nextNodo) {
        this.nextNodo = nextNodo;
    }

    public void setContenuto(Tecnica contenuto) {
        this.contenuto = contenuto;
    }

    public Nodo getNextNodo() {
        return nextNodo;
    }

    public Tecnica getContenuto() {
        return contenuto;
    }

    public String toString(){
        return contenuto.toString();
    }

    public int compareTo(Nodo nodo){
        return contenuto.compareTo(nodo.contenuto);
    }
}
