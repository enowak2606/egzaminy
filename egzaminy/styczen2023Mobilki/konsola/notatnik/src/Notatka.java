public class Notatka {
    private static int licznik;
    private int id;
    protected String tresc;
    protected String tytul;

    public Notatka(String tytul, String tresc){
        licznik++;
        id=licznik;
        this.tresc = tresc;
        this.tytul = tytul;
    }

    public void wyswietlNotatke(){
        System.out.println("Tytuł: "+ tytul + "\n Treść: " + tresc);
    }
    public void diagnostyka(){
        System.out.println("licznik: " + licznik + " id: " + id + " treść: " + tresc + " tytul: " + tytul);
    }
}
