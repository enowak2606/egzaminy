import java.lang.classfile.instruction.SwitchCase;
import java.util.Random;
import java.util.Scanner;

public class Main{
void main() {
    while(true){
        System.out.println("==========LOSOWANIE KOSCI==========");
        System.out.println("Podaj liczbę oczek dla kosci nr 1: ");
        Scanner scanner = new Scanner(System.in);
        Kosc kosc1 = new Kosc(scanner.nextInt());
        System.out.println("KOSC 1-----------------------------");
        System.out.println("Liczba instancji: "+ Kosc.instancje);
        System.out.println("Liczba oczek: "+kosc1.liczbaOczek+" \nSłownie: "+ kosc1.zwracanieTekstu()+" \nZdjęcie odpowiadające: "+kosc1.obrazy[kosc1.indeks]);
        Kosc kosc2 = new Kosc();
        System.out.println("KOSC 2-----------------------------");
        System.out.println("Liczba instancji: "+ Kosc.instancje);
        System.out.println("Liczba oczek: "+kosc2.liczbaOczek+" \nSlownie: "+kosc2.zwracanieTekstu()+" \nZdjecie odpowiadajace: "+ kosc2.obrazy[kosc2.indeks]);
    }


    }
}
class Kosc{
    public static int instancje;
    public String[] obrazy = {"kosc0.png", "kosc1.png", "kosc2.png", "kosc3.png", "kosc4.png", "kosc5.png", "kosc6.png", };
    public int liczbaOczek;
    public int indeks;
    public boolean dostepnosc;

    public Kosc(int wartosc){
        if(wartosc < 1 || wartosc > 6){
            this.liczbaOczek = 0;
        }else {
            this.liczbaOczek = wartosc;
            this.indeks = wartosc;
            instancje++;
        }
    }
    public Kosc(){
        Random losowanie = new Random();
        int liczba = losowanie.nextInt(6)+1;
        this.liczbaOczek= liczba;
        this.indeks=liczba;
        this.dostepnosc = true;
        instancje++;
    }

    public void rzutKoscia(){
        Random losowanie = new Random();
        int liczba = losowanie.nextInt(6)+1;
        if(this.dostepnosc){
            this.liczbaOczek= liczba;
            this.indeks=liczba;
        }
    }
    public void blokadaKosci(){
        this.dostepnosc = false;
    }

    public String zwracanieTekstu() {
        return switch (liczbaOczek) {
            case 0 -> "zero";
            case 1 -> "jeden";
            case 2 -> "dwa";
            case 3 -> "trzy";
            case 4 -> "cztery";
            case 5 -> "piec";
            case 6 -> "szesc";
            default -> "blad";
        };
    }
}
