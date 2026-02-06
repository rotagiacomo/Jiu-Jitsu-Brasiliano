public class Tecnica{
    private Difficolta difficolta;

    public enum Difficolta{
        UNO, DUE, TRE, QUATTRO, CINQUE; //sempre maiuscolo per enum
    }

    public Tecnica(Difficolta difficolta){
        this.difficolta = difficolta;
    }

    public void setDifficolta(Difficolta difficolta){
        this.difficolta = difficolta;
    }

    public Difficolta getDifficolta() {
        return difficolta;
    }

    public int compareTo(Tecnica tecnica){
        return this.difficolta.compareTo(tecnica.difficolta); // <0 se this viene prima di tecnica, = 0 se uguale, >0 se viene dopo
    }

    public String toString(){
        return difficolta.toString();
    }
}