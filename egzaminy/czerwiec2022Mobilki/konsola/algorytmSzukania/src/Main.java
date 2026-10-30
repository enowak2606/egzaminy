import java.util.Random;
import java.util.Scanner;

public class Main {
    void main(){
        int[] tablica = new int[50];
        wypelnijTablice(tablica);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę do wyszukania: ");
        int szukana = scanner.nextInt();

        int indexSzukanej = szukaj(tablica, szukana);

        System.out.println("Tablica psedolosowych liczb w zakresie od 1 do 100: ");

        for(int x: tablica){
            System.out.print(x+" ");
        }
        if (indexSzukanej==-1){
            System.out.println("\nNie znaleziono szukanej liczby w tablicy");
        }else {
            System.out.println("\nIndex szukanej liczby: "+ indexSzukanej + " \nSzukana liczba: " + tablica[indexSzukanej]);
        }
    }

    public void wypelnijTablice(int[] tab){
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i]= random.nextInt(100)+1;
        }
    }
    public int szukaj(int[] tab, int szukana){
        int[] temp = new int[tab.length+1];
        System.arraycopy(tab, 0, temp, 0, tab.length);
        int indexOstatniej = temp.length-1;
        temp[indexOstatniej] = szukana; //wartownik
        int i=0;

        while (temp[i]!=szukana){
            i++;
        }


        if (i== temp.length-1){
            return -1;
        }

        return i;
    }
}
