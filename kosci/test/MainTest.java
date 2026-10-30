import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void WyrzuconaWartosc(){
        Kosc kosc = new Kosc();
        boolean czyWZakresie;

        if(kosc.liczbaOczek>=1 && kosc.liczbaOczek<=6){
            czyWZakresie = true;
            System.out.println(kosc.liczbaOczek);
        }else {
            czyWZakresie = false;
        }

        assertTrue(czyWZakresie);
    }

    @Test
    public void WartoscKosciNiedostepnej(){
        Kosc kosc = new Kosc();
        System.out.println(kosc.liczbaOczek);
        int wylosowanaWartosc = kosc.liczbaOczek;
        kosc.blokadaKosci();
        System.out.println(kosc.liczbaOczek);
        assertEquals(kosc.liczbaOczek, wylosowanaWartosc);


    }

}