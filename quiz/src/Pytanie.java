public abstract class Pytanie {
    protected String trescPytania;
    protected String nazwaPliku;
    protected boolean czyPoprawna;

    public Pytanie(String trescPytania, String nazwaPliku){
        this.trescPytania = trescPytania;
        this.nazwaPliku = nazwaPliku;
        this.czyPoprawna = false;
    }

    public abstract boolean sprawdzenieOdpowiedzi(char odpowiedz);
}
