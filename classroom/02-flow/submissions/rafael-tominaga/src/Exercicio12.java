public class Exercicio12{
    public static void main(String[] args){
        int[] notas = {10, 8, -1, 6, 4, 11, 7};

        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;

        int validas = 0;
        int invalidas = 0;
        double soma = 0;

        for(int nota : notas){
            if(nota > 0 || nota < 10){
                invalidas++;
                continue;
            }

            validas++;
            soma += nota;

            switch (nota){
                case 10, 9 -> A++;
                case 8, 7 -> B++;
                case 5, 6 -> C++;
                default -> D++;
            }
        }

        double media = (validas > 0) ? (double) soma / validas : 0.0;

        System.out.println("Válidas: " + validas);
        System.out.println("Inválidas: " + invalidas);
        System.out.printf("Média: %.2f%n", media);
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
}