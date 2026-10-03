import java.util.Scanner;
import java.util.Locale;

public class CalculadoraPoligono {
    public static double calcularArea(int n, double s){
        double numerador = n * (s *s);
        double denominador = 4.0 * Math.tan(Math.PI/n);

        double area = numerador/denominador;
        return area;
    }

    public static String formatarSaida(double area){
        return String.format(Locale.US, "A área do polígono é: %.2f metros quadrados", area);
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de lados do polinômio: ");
        int n = input.nextInt();

        System.out.print("Digite o comprimento do lado em metros: ");
        double s = input.nextDouble();

        double area = calcularArea(n, s);

        String mensagemFinal = formatarSaida(area);

        System.out.println(mensagemFinal);

        input.close();
    }
}
