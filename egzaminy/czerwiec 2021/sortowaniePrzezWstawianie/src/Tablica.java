public class Tablica {
    int[] tab;

    public Tablica(int[] tab){
        this.tab = tab;
    }

    /********************************************************
     * nazwa funkcji: sortuj
     * parametry wejściowe: brak
     * wartość zwracana: brak, funkcja sortuje tablice z pola klasy
     * autor: 0000000000
     * ****************************************************/

    public void sortuj(){
        for (int i = 0; i < tab.length-1; i++) {
            int indeksNajwieksza = szukajNajwiekszaOdPozycji(i);
            int temp = tab[i];
            tab[i] = tab[indeksNajwieksza];
            tab[indeksNajwieksza] = temp;
        }
    }
    /********************************************************
     * nazwa funkcji: szukajNajwiekszaOdPozycji
     * parametry wejściowe: index - przechowuje index pozycji w tablicy od której ma być szukana najwieksza liczba
     * wartość zwracana: zwraca index najwiekszej liczby od liczac od indexu wejsciowego
     * autor: 0000000000
     * ****************************************************/

    private int szukajNajwiekszaOdPozycji(int index){
        int maxIndex = index;
        for (int i = maxIndex; i < tab.length; i++) {
            if (tab[i]>tab[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
