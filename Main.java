public class Main {
    public static void main(String[] args) {
        Tecnica primaTecnica = new Tecnica(Tecnica.Difficolta.UNO);
        Tecnica secondTecnica = new Tecnica(Tecnica.Difficolta.TRE);
        Tecnica terzTecnica = new Tecnica(Tecnica.Difficolta.QUATTRO);
        Tecnica quarTecnica = new Tecnica(Tecnica.Difficolta.CINQUE);

        Lista lista = new Lista();
        lista.aggiungiOrdinato(new Nodo(quarTecnica));
        lista.aggiungiOrdinato(new Nodo(secondTecnica));
        lista.aggiungiOrdinato(new Nodo(terzTecnica));
        lista.aggiungiOrdinato(new Nodo(primaTecnica));
        System.out.println(lista);
    }
}
