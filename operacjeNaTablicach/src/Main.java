public class Main {
    void main() {
        Tablica tablica = new Tablica(29);
        tablica.wyswietl();

        int szukaj = tablica.wyszukuj(25);
        if(szukaj != -1){
            System.out.println("Indeks wyszukanej liczby: "+szukaj);
        }

        int iloscNieparzystych = tablica.nieparzyste();

        System.out.println("Razem nieparzystych: "+iloscNieparzystych);

        double srednia = tablica.srednia();
        System.out.println("Srednia wszystkich elementow: "+srednia);

    }
}
