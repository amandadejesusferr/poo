import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args){
        Scanner valor = new Scanner(System.in);

        int N = valor.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(N + "x" + i + "=" + (N * i));
        }

        valor.close();
    }
    
}
