import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        boolean ehPrimo = true;

        if(n <= 1){
            ehPrimo = false;
        } else{
            for(int i = 2; i <= n /i; i++){
                if(n % i == 0){
                    ehPrimo = false;
                    break;
                }
            }
        }

        if(ehPrimo){
            System.out.println("PRIMO");
        } else{
            System.out.println("NAO PRIMO");
        }

        input.close();
    }
}
