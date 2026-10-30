/*
******************************************************
nazwa klasy: Film
pola: tytul - tytul filmu
 liczbaWypozyczen - liczbe wypozyczen filmu
metody: setTytul, getTytul, getliczbaWypozyczen, inkrementacja - ustawia tytul, pobiera tytul, pobiera liczbe wypozyczen, inkrementuje (zwieksza o 1) liczbe wypozyczen.
informacje: <Klasa film przechowuje informacje o tytule oraz liczbie wypozyczen
autor: <numer zdającego>
*****************************************************
*/
public class Film{

    protected String tytul="";
    protected int liczbaWypozyczen=0;

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getTytul() {
        return tytul;
    }

    public int getLiczbaWypozyczen() {
        return liczbaWypozyczen;
    }

    public void inkrementacja(){
        liczbaWypozyczen++;
    }

}


