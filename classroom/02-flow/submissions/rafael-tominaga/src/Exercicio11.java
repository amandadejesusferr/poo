import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int proximo = a + b;
            a = b;
            b = proximo;
        }

        input.close();
    }
}
