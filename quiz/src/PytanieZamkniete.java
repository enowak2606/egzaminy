public class PytanieZamkniete extends Pytanie {

    private String odpA;
    private String odpB;
    private String odpC;
    private char poprawnaOdp;

    public PytanieZamkniete(String trescPytania, String nazwaPliku, String odpA, String odpB, String odpC, char poprawnaOdp) {
        super(trescPytania, nazwaPliku);
        this.odpA = odpA;
        this.odpB = odpB;
        this.odpC = odpC;
        this.poprawnaOdp = poprawnaOdp;
    }

    @Override
    public boolean sprawdzenieOdpowiedzi(char odpowiedz) {
        if(poprawnaOdp == odpowiedz){
            czyPoprawna = true;
        }else{
            czyPoprawna = false;
        }
        return czyPoprawna;
    }

}
