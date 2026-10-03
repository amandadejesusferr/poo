import java.util.Scanner;

public class Fibonacci {
    public static long calcularFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        if (n == 0) return 0L;
        if (n == 1) return 1L;

        long a = 0L;
        long b = 1L;

        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

    public static String formatarSaida(long fibonacci, int n) {
        return "O " + n + "º número de Fibonacci é: " + fibonacci;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int n = scanner.nextInt();

        long resultado = calcularFibonacci(n);
        System.out.println(formatarSaida(resultado, n));

        scanner.close();
    }
}