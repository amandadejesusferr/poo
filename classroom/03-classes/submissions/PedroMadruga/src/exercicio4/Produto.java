public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeInicial) {
        this.nome = (nome == null || nome.isBlank()) ? "Produto sem nome" : nome;
        this.preco = preco < 0 ? 0.0 : preco;
        this.quantidadeEstoque = quantidadeInicial < 0 ? 0 : quantidadeInicial;
    }

    public void darEntrada(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
        }
    }

    public boolean retirar(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}