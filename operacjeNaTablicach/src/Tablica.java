import java.util.Random;

public class Tablica {
    private int[] tablica;
    private int liczbaElementow;

    public Tablica(int rozmiarTablicy) {
        this.liczbaElementow = rozmiarTablicy;
        Random random = new Random();
        this.tablica = new int[rozmiarTablicy];
        for(int i = 0; i < this.liczbaElementow; i++){
            this.tablica[i] = random.nextInt(1, 1001);
        }
    }

    public void wyswietl(){
        for(int i = 0; i < this.liczbaElementow; i++){
            System.out.println(i+": " + this.tablica[i]);
        }
    }

    public int wyszukuj(int szukana){
        for(int i = 0; i < this.liczbaElementow; i++){
            if(this.tablica[i] == szukana){
                return i;
            }
        }
        return -1;
    }

    public int nieparzyste(){
        System.out.println("Liczby nieparzyste: ");
        int licznik = 0;
        for(int i = 0; i < this.liczbaElementow; i++){
            if(this.tablica[i] % 2 == 1){
                System.out.println(this.tablica[i]);
                licznik++;
            }
        }
        return licznik;
    }

    public double srednia(){
        int sredniaPomocnicza = 0;
        int licznik = 0;
        for(int i = 0; i < this.liczbaElementow ; i++){
            sredniaPomocnicza += this.tablica[i];
            licznik++;
        }
        return (double) sredniaPomocnicza / licznik;
    }
}



