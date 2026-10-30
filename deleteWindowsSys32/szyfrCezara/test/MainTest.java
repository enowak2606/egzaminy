import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void danePodstawowe(){
        Main main = new Main();
        String tekstJawny = "abc";
        int klucz = 3;
        String zaszyfrowanyTekst = main.szyfrowanie(tekstJawny, klucz);
        assertEquals("def", zaszyfrowanyTekst);
    }
    @Test
    public void zawijanie(){
        Main main = new Main();
        String tekstJawny = "xyz";
        int klucz = 3;
        String zaszyfrowanyTekst = main.szyfrowanie(tekstJawny, klucz);
        assertEquals("abc", zaszyfrowanyTekst);
    }
    @Test
    public void Odszyfrowanie(){
        Main main = new Main();
        String tekstJawny = "def";
        int klucz = -3;
        String zaszyfrowanyTekst = main.szyfrowanie(tekstJawny, klucz);
        assertEquals("abc", zaszyfrowanyTekst);
    }
    @Test
    public void kluczWiekszyOdAlfabetu(){
        Main main = new Main();
        String tekstJawny = "abc";
        int klucz = 29;
        String zaszyfrowanyTekst = main.szyfrowanie(tekstJawny, klucz);
        assertEquals("def", zaszyfrowanyTekst);
    }
    @Test
    public void spacja(){
        Main main = new Main();
        String tekstJawny = "ab cd";
        int klucz = 2;
        String zaszyfrowanyTekst = main.szyfrowanie(tekstJawny, klucz);
        assertEquals("cd ef", zaszyfrowanyTekst);
    }

}