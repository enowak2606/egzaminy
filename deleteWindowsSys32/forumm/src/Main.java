import java.util.Scanner;

public class Main {
    void main() {
        System.out.println("Liczba zarejestrowanych osob to: "+Osoba.instancje);
        Osoba osobaBezParametrow = new Osoba();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("podaj id:");
        int id = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("podaj imie: ");
        String imie = scanner2.nextLine();

        Osoba osobaDwaParametry = new Osoba(id, imie);

        Osoba osobaKopia = new Osoba(osobaDwaParametry);

        osobaBezParametrow.wypisanie("Jan");
        osobaDwaParametry.wypisanie("Jan");
        osobaKopia.wypisanie("Jan");
        System.out.println("Liczba zarejestrowanych osob to: "+Osoba.instancje);
    }
}