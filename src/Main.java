import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        int C;
        int D;

        System.out.println("digite o valor de A ");
        A = sc.nextInt();
        System.out.println("digite o valor de B ");
        B = sc.nextInt();
        System.out.println("digite o valor de C ");
        C = sc.nextInt();
        System.out.println("digite o valor de D ");
        D = sc.nextInt();

        int diferenca = A*B-C*D;


        System.out.println("Diferenca "+ diferenca);

        sc.close();
    }
}