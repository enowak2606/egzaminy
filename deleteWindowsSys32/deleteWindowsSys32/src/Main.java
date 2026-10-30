import java.util.Scanner;

public class Main {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tablicy elementy");
        int[] tab = new int[5];
        for(int i = 0; i < tab.length; i++){
            System.out.print(i+1 + ": ");
            tab[i] = scanner.nextInt();
        }

        Sperma sperma = new Sperma(tab);
        System.out.println("tablica przed:");
        for(int x: sperma.tablica){
            System.out.print(x + " ");
        }

        System.out.println("tablica po: ");
        sperma.sortowanie();
        for(int x: sperma.tablica){
            System.out.print(x + " ");
        }

    }
}