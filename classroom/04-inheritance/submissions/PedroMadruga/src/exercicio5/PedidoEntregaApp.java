public class PedidoEntregaApp {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("PED-1001", 350.0, "Av. Paulista, 1000", "São Paulo", "01310-100");
        Pedido pedido2 = new Pedido("", -50.0, null, "Brasília", null);

        System.out.println(pedido1.getResumo());
        System.out.println(pedido2.getResumo());
    }
}