public class Notatka {
    private static int licznikNotatek = 0;
    private int id = 0;
    protected String tytulNotatki;
    protected String trescNotatki;


    public Notatka(String tytulNotatki, String trescNotatki){
        licznikNotatek++;
        this.id = licznikNotatek;
        this.tytulNotatki = tytulNotatki;
        this.trescNotatki = trescNotatki;
    }
    public void wyswietlanieNotatki(){
        System.out.println(tytulNotatki);
        System.out.println(trescNotatki);
    }
    public void diagnostyka(){
        System.out.println(licznikNotatek+" ; "+id+" ; "+tytulNotatki+" ; "+trescNotatki);
    }
}
