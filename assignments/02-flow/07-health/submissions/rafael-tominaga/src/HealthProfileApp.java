import java.util.Locale;
import java.util.Scanner;

public class HealthProfileApp {
    private static final int CURRENT_YEAR = 2026;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu primeiro nome: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Digite seu sobrenome: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Digite seu gênero (M/F): ");
        char gender = scanner.next().trim().toUpperCase().charAt(0);

        System.out.print("Digite sua data de nascimento (dia, mês e ano separados por espaço): ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        System.out.print("Digite sua altura em polegadas: ");
        double height = scanner.nextDouble();

        System.out.print("Digite seu peso em libras: ");
        double weight = scanner.nextDouble();

        HealthProfile profile = new HealthProfile(firstName, lastName, gender, day, month, year, height, weight);

        int age = profile.calculateAge(CURRENT_YEAR);
        int maxHeartRate = profile.calculateMaxHeartRate(CURRENT_YEAR);
        String targetHeartRate = profile.calculateTargetHeartRate(CURRENT_YEAR);
        double bmi = profile.calculateBMI();

        String generoFormatado;
        if (profile.getGender() == 'M') {
            generoFormatado = "Masculino";
        } else if (profile.getGender() == 'F') {
            generoFormatado = "Feminino";
        } else {
            generoFormatado = "Não especificado";
        }

        System.out.println();
        System.out.println("Nome: " + profile.getFirstName() + " " + profile.getLastName());
        System.out.println("Gênero: " + generoFormatado);
        System.out.printf("Data de nascimento: %02d/%02d/%04d%n", 
                          profile.getDayOfBirth(), profile.getMonthOfBirth(), profile.getYearOfBirth());
        System.out.println("Idade: " + age + " anos");
        System.out.printf(Locale.US, "Altura: %.0f polegadas%n", profile.getHeightInInches());
        System.out.printf(Locale.US, "Peso: %.0f libras%n", profile.getWeightInPounds());
        System.out.printf(Locale.US, "Índice de Massa Corporal (BMI): %.1f%n", bmi);
        System.out.println("Frequência cardíaca máxima: " + maxHeartRate + " bpm");
        System.out.println("Faixa de frequência cardíaca alvo: " + targetHeartRate);

        System.out.println();
        System.out.printf("%-18s %s%n", "BMI", "Classificação");
        System.out.printf("%-18s %s%n", "Menos de 18.5", "Abaixo do peso");
        System.out.printf("%-18s %s%n", "18.5 – 24.9", "Peso normal");
        System.out.printf("%-18s %s%n", "25.0 – 29.9", "Sobrepeso");
        System.out.printf("%-18s %s%n", "30.0 ou mais", "Obesidade");

        scanner.close();
    }
}