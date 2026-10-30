import java.util.Scanner;

public class Main {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tytul notatki:");
        String tytulNotatki1 = scanner.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj tresc notatki:");
        String trescNotatki2 = scanner2.nextLine();
        Notatka notatka1 = new Notatka(tytulNotatki1, trescNotatki2);
        notatka1.diagnostyka();
        notatka1.wyswietlanieNotatki();
        Notatka notatka2 = new Notatka("Tytul drugiej notatki", "Tresc drugiej notatki");
        notatka2.diagnostyka();
        notatka2.wyswietlanieNotatki();
    }
}