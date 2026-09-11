public class MaquinaVendas {
    private String produto;
    private double preco;
    private int estoque;
    private double credito;

    public MaquinaVendas(String produto, double preco, int estoque) {
        this.produto = (produto == null || produto.isBlank()) ? "Produto não informado" : produto;
        this.preco = preco <= 0 ? 1.0 : preco;
        this.estoque = estoque < 0 ? 0 : estoque;
        this.credito = 0.0;
    }

    public boolean inserirDinheiro(double valor) {
        if (valor > 0) {
            this.credito += valor;
            return true;
        }
        return false;
    }

    public boolean comprar() {
        if (estoque > 0 && credito >= preco) {
            estoque--;
            credito -= preco;
            return true;
        }
        return false;
    }

    public double cancelar() {
        double valorDevolvido = credito;
        credito = 0.0;
        return valorDevolvido;
    }

    public String getProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public double getCredito() {
        return credito;
    }
}