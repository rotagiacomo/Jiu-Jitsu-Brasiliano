public class Main {
    public static void main(String[] args) {
        Tecnica primaTecnica = new Tecnica(Tecnica.Difficolta.UNO);
        Tecnica secondTecnica = new Tecnica(Tecnica.Difficolta.TRE);
        Tecnica terzTecnica = new Tecnica(Tecnica.Difficolta.QUATTRO);
        Tecnica quarTecnica = new Tecnica(Tecnica.Difficolta.CINQUE);

        Lista lista = new Lista();
        lista.aggiungiOrdinato(terzTecnica);
        lista.aggiungiOrdinato(primaTecnica);
        lista.aggiungiOrdinato(quarTecnica);
        lista.aggiungiOrdinato(secondTecnica);
        System.out.println(lista);

        Iteratore iteratore = lista.getIteratore();
        while (iteratore.hasNext()){
            System.out.println(iteratore.next());

        }
    }
}
