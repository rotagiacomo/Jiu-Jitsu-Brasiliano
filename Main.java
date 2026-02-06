public class Main {
    public static void main(String[] args) {
        Tecnica primaTecnica = new Tecnica(Tecnica.Difficolta.UNO);
        Tecnica secondTecnica = new Tecnica(Tecnica.Difficolta.TRE);
        Tecnica terzTecnica = new Tecnica(Tecnica.Difficolta.QUATTRO);

        Lista lista = new Lista();
        lista.aggiungiInTesta(new Nodo(primaTecnica));
        lista.aggiungiInTesta(new Nodo(secondTecnica));
        lista.aggiungiInTesta(new Nodo(terzTecnica));
        System.out.println(lista);
    }
}
