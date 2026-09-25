import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n < 0){
            System.out.println("Numero invalido");
            return;
        }

        int numeroRestante = n;
        int soma = 0;
        int total = 0;

        while(numeroRestante > 0){
            soma += numeroRestante % 10;
            numeroRestante /= 10;
            total++;
        }

        System.out.printf("Algarismos: %d - Soma: %d%n", total, soma);
        
        scanner.close();
    }
}
