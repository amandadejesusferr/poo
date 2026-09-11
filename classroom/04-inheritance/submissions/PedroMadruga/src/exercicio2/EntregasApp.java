public class EntregasApp {
    public static void main(String[] args) {
        Entrega convencional = new Entrega(250.0, 10.0);
        Entrega expressa = new EntregaExpressa(250.0, 10.0);

        System.out.println(convencional.getDescricao());
        System.out.println(expressa.getDescricao());
    }
}