import java.util.Scanner;

public class Main {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst do zaszyfrowania: ");
        String tekstJawny = scanner.nextLine();
        System.out.println("Podaj klucz: ");
        int klucz = scanner.nextInt();
        String tekstSzyfr = szyfrowanie(tekstJawny, klucz);
        System.out.println(tekstSzyfr);
    }
    String szyfrowanie(String tekstJawny, int klucz){
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder zaszyfrowanyTekst = new StringBuilder();
        for(int i = 0 ; i<tekstJawny.length() ; i++){
            char znak = tekstJawny.charAt(i);
            int index = alfabet.indexOf(znak);
            int nowyIndex = (index+klucz)%alfabet.length();
            if(nowyIndex<0){
                nowyIndex+=alfabet.length();
            }
            if(znak == ' '){
                zaszyfrowanyTekst.append(' ');
            }else{
                zaszyfrowanyTekst.append(alfabet.charAt(nowyIndex));
            }
        }return zaszyfrowanyTekst.toString();
    }
}
