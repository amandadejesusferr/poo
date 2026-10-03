import java.util.Locale;
import java.util.Scanner;

public class SavingsAccountApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        System.out.print("Informe a taxa de juros anual (%): ");
        double taxaInicialPercentual = scanner.nextDouble();

        SavingsAccount conta = new SavingsAccount(saldoInicial);

        SavingsAccount.setAnnualInterestRate(taxaInicialPercentual / 100.0);

        System.out.printf(Locale.US, "%nSaldos com taxa de juros de %.1f%%%n", taxaInicialPercentual);

        for (int mes = 1; mes <= 12; mes++) {
            conta.calculateMonthlyInterest();
            System.out.printf(Locale.US, "Mês %d: R$%.2f%n", mes, conta.getSavingsBalance());
        }

        System.out.print("\nInforme a nova taxa de juros anual: ");
        String novaTaxaEntrada = scanner.next().trim();

        novaTaxaEntrada = novaTaxaEntrada.replace("%", "").replace(",", ".");
        double novaTaxaPercentual = Double.parseDouble(novaTaxaEntrada);

        SavingsAccount.setAnnualInterestRate(novaTaxaPercentual / 100.0);

        System.out.printf(Locale.US, "%nAlterando taxa de juros anual para %.0f%%...%n%n", novaTaxaPercentual);

        conta.calculateMonthlyInterest();
        System.out.printf(Locale.US, "Mês 13: R$%.2f%n", conta.getSavingsBalance());

        scanner.close();
    }
}