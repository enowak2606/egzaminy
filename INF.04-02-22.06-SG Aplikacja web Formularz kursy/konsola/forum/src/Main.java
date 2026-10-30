import java.util.Scanner;

public class Main {
    void main(){

        System.out.println("Liczba zarejestrowanych osób to "+ Osoba.instancje);

        Osoba osoba0 = new Osoba();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię użytkownika: ");
        Osoba osoba1 = new Osoba(1, scanner.nextLine());

        Osoba osoba2 = new Osoba(osoba1);

        osoba0.wypiszImie("Jan");
        osoba1.wypiszImie("Jan");
        osoba2.wypiszImie("Jan");

        System.out.println("Liczba zarejestrowanych osób to "+ Osoba.instancje);
    }
}
