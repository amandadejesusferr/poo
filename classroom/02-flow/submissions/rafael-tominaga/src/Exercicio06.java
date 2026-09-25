import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int N = entrada.nextInt();
        int total = 0;

        if(N <= 0){
            System.out.println("VALOR INVALIDO");
        } else {
            for(int i = 1; i <= N; i++){
                total += i;
            } 
            System.out.printf("%d", total);
        }

        entrada.close();
    }
}
