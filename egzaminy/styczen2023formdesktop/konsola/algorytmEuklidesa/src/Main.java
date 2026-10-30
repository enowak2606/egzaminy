import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadz liczbę a: ");
        a = scanner.nextInt();
        System.out.print("Wprowadz liczbę b: ");
        b = scanner.nextInt();

        int dzielnik = NWD(a, b);
        System.out.println(dzielnik);

    }

    public static int NWD(int a, int b){

        while (a!=b){
            if (a>b){
                a-=b;
            }else {
                b-=a;
            }
        }

        return a;
    }
}
