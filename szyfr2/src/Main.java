

public class Main {
    public static String alfabet = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        // Zmień też nagłówek main na tradycyjny z (String[] args)
        while (true){
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.println("Podaj tekst: ");
            String tekst = scanner.nextLine();
            System.out.println("Podaj przesunięcie: ");
            int klucz = scanner.nextInt();

            System.out.println("Zaszyfrowany tekst: "+ szyfrowanie(tekst, klucz));
        }
    }

    public static String szyfrowanie(String tekst, int klucz){
        char[] tekstZnaki = tekst.toCharArray();
        StringBuilder zaszyfrowanyTekst = new StringBuilder();

        for (int i = 0; i<tekstZnaki.length; i++){
            char znak = tekstZnaki[i];
            int index = alfabet.indexOf(znak);
            int nowyIndex = (index+klucz)%alfabet.length();
            if (nowyIndex<0){
                nowyIndex+=alfabet.length();
            }
            if (znak==' '){
                zaszyfrowanyTekst.append(' ');
            }else{
                zaszyfrowanyTekst.append(alfabet.charAt(nowyIndex));
            }
        }

        return zaszyfrowanyTekst.toString();
    }
}