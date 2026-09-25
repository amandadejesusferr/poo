import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner data = new Scanner(System.in);

        System.out.print("Digite o mês: ");
        int mes = data.nextInt();

        System.out.print("Digite o ano: ");
        int ano = data.nextInt();

        switch(mes){
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 dias");
            case 4, 6, 9, 11 -> System.out.println("30 dias");
            case 2 -> {
                boolean bissexto = (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0);
                System.out.println(bissexto ? "29 dias" : "28 dias");
            }
            default -> System.out.print("Mes invalido!");
        }

        data.close();
    }
}
