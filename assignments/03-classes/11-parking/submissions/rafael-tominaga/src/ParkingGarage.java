import java.util.Locale;
import java.util.Scanner;

public class ParkingGarage {
    private static final double MINIMUM_FEE = 2.00;
    private static final double HOURLY_RATE = 0.50;
    private static final double MAXIMUM_FEE = 10.00;
    private static final double BASE_HOURS = 3.0;

    public static double calculateCharges(double hours) {
        if (hours <= 0) {
            return 0.0;
        }

        double fee = MINIMUM_FEE;

        if (hours > BASE_HOURS) {
            double extraHours = Math.ceil(hours - BASE_HOURS);
            fee += extraHours * HOURLY_RATE;
        }

        return Math.min(fee, MAXIMUM_FEE);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double totalRevenue = 0.0;
        int clientCount = 0;

        while (true) {
            System.out.print("Digite o número de horas estacionadas para o cliente (ou -1 para sair): ");
            double hours = scanner.nextDouble();

            if (hours == -1) {
                break;
            }

            clientCount++;
            double charge = calculateCharges(hours);
            totalRevenue += charge;

            System.out.printf(Locale.US, "Cliente %d: Taxa de estacionamento: $%.2f%n", clientCount, charge);
        }

        System.out.printf(Locale.US, "Total arrecadado ontem: $%.2f%n", totalRevenue);

        scanner.close();
    }
}