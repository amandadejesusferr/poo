public class IngressoCinemaApp {
    public static void main(String[] args) {
        IngressoCinema ingresso = new IngressoCinema("Inception", 40.00);

        System.out.println("Status Inicial - Vendido? " + ingresso.isVendido());

        double valorCobrado1 = ingresso.venderMeia();
        System.out.printf("Venda Meia-Entrada realizada por R$ %.2f | Vendido? %b\n", valorCobrado1, ingresso.isVendido());

        double valorCobrado2 = ingresso.venderInteira();
        System.out.printf("Tentativa de Re-venda cobrou R$ %.2f | Vendido? %b\n", valorCobrado2, ingresso.isVendido());
    }
}