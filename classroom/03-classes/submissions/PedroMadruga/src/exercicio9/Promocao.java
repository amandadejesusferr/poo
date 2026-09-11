public class Promocao {
    public static void aplicarBonus(ClienteFidelidade cliente, int pontosBonus) {
        if (cliente != null) {
            cliente.acumularPontos(pontosBonus);
        }
    }

    public static void tentarSubstituirCliente(ClienteFidelidade cliente) {
        cliente = new ClienteFidelidade("Outro Cliente");
        cliente.acumularPontos(999);
    }
}