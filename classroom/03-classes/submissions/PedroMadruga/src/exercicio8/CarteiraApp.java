public class CarteiraApp {
    public static void main(String[] args) {
        Carteira c1 = new Carteira("Alice", 200.0);
        Carteira c2 = new Carteira("Bob", 50.0);

        System.out.println("--- Transferência Válida (R$ 50.00) ---");
        boolean ok1 = c1.transferir(c2, 50.0);
        System.out.printf("Transferido? %b | Saldo Alice: R$ %.2f | Saldo Bob: R$ %.2f\n\n", ok1, c1.getSaldo(), c2.getSaldo());

        System.out.println("--- Transferência sem Saldo Suficiente (R$ 300.00) ---");
        boolean ok2 = c1.transferir(c2, 300.0);
        System.out.printf("Transferido? %b | Saldo Alice: R$ %.2f | Saldo Bob: R$ %.2f\n\n", ok2, c1.getSaldo(), c2.getSaldo());

        System.out.println("--- Transferência com Destino Nulo ---");
        boolean ok3 = c1.transferir(null, 20.0);
        System.out.printf("Transferido? %b | Saldo Alice: R$ %.2f\n", ok3, c1.getSaldo());
    }
}