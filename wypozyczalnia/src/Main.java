public class Main {
    void main() {

        Film film = new Film();
        System.out.println("Tytul: "+film.tytul+"\nLiczba wypozyczen: "+film.liczbaWypozyczen);

        film.setTytul("hary poter");
        System.out.println("Test uzycia metody get i set");
        System.out.println("Tytul: "+film.getTytul());

        System.out.println("Inkrementacja przed: " +film.getLiczbaWypozyczen());
        film.inkrementacja();
        System.out.println("Inkrementacja po: " +film.getLiczbaWypozyczen());


    }
}
