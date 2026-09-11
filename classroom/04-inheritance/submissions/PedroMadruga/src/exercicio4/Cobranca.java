public class Cobranca {
    private String descricao;
    private double valorBase;

    public Cobranca(String descricao, double valorBase) {
        this.descricao = (descricao == null || descricao.trim().isEmpty()) ? "Cobrança Geral" : descricao.trim();
        this.valorBase = Math.max(0.0, valorBase);
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorBase() {
        return valorBase;
    }

    public double calcularTotal() {
        return valorBase;
    }
}