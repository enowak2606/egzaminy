import java.util.Random;
import java.util.Scanner;

public class Main {
    void main() {
        int[] tablica = new int[50];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj szukaną liczbę");
        int szukana = scanner.nextInt();
        wypelnijTablice(tablica);
        int indeksSzukanej = przeszukuj(tablica, szukana);

        for(int x:tablica){
            System.out.print(x+", ");
        }
        if(indeksSzukanej==-1){
            System.out.println("\nnei znaleziono liczby");
        }else{
            System.out.println("\nIndeks szukanej: "+indeksSzukanej);
        }
    }

   public int przeszukuj(int[] tab, int szukana){
        int[] pomocnicza = new int[tab.length+1];
        System.arraycopy(tab, 0, pomocnicza, 0, tab.length);
        pomocnicza[pomocnicza.length-1] = szukana;

        for(int i = 0; i < pomocnicza.length; i++){
            if(pomocnicza[i] == szukana && i!=pomocnicza.length-1){
                return i;
            }
        }return -1;
   }




    public void wypelnijTablice(int[] tab){
        Random random = new Random();
        for(int i = 0; i < tab.length; i++){
            tab[i] = random.nextInt(1, 101);
        }
    }
}
