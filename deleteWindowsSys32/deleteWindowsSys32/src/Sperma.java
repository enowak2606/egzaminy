public class Sperma {
    int[] tablica;
    public Sperma(int[] tablica){
        this.tablica=tablica;
    }

    //szukanie najwiekszej liczby
    private int najwieksza(int index){
        int duzaPala = index;
        for (int i = duzaPala; i< tablica.length; i++){
            if(tablica[i]>tablica[duzaPala]){
                duzaPala = i;
            }
        }
        return duzaPala;
    }

    public void sortowanie(){
        for(int i = 0; i<tablica.length-1; i++){
            int gigaIndex = najwieksza(i);
            int guwno = tablica[i];
            tablica[i] = tablica[gigaIndex];
            tablica[gigaIndex] = guwno;
        }
    }
}
