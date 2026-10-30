import java.util.Scanner;

public class Main {
    void main() {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę a: ");
        a = scanner.nextInt();
        System.out.println("Wprowadz b : ");
        b= scanner.nextInt();
        int wynik = szukanieNWD(a,b);
        System.out.println(wynik);
    }
    static int szukanieNWD(int a, int b){
        while(a!=b){
            if (a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }return a;
    }
}
