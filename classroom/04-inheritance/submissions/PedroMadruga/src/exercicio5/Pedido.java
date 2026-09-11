public class Pedido {
    private String numero;
    private double valorTotal;
    private Endereco enderecoEntrega; // Composição: ciclo de vida gerenciado pelo Pedido

    public Pedido(String numero, double valorTotal, String logradouro, String cidade, String cep) {
        this.numero = (numero == null || numero.trim().isEmpty()) ? "Pedido sem número" : numero.trim();
        this.valorTotal = Math.max(0.0, valorTotal);
        this.enderecoEntrega = new Endereco(logradouro, cidade, cep);
    }

    public String getNumero() {
        return numero;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getEnderecoFormatado() {
        return enderecoEntrega.formatar();
    }

    public String getResumo() {
        return String.format("Pedido: %s | Valor: R$ %.2f | Entrega em: %s",
                numero, valorTotal, getEnderecoFormatado());
    }
}