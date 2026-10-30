import java.util.Scanner;

public class Main{
    void main() {
        System.out.println("Podaj elementy tablicy: ");
        int[] tab = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            System.out.print((i+1)+". ");
            tab[i]=scanner.nextInt();
        }


        Tablica tablica = new Tablica(tab);
        System.out.println("Nieposortowana tablica: ");
        for (int x: tablica.tab){
            System.out.print(x+" ");
        }
        System.out.println("\nPosortowana tablica: ");
        tablica.sortuj();
        for (int x: tablica.tab){
            System.out.print(x+" ");
        }

    }
}

