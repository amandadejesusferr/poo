public class PlanoAssinatura {
    private String nome;
    private double mensalidade;

    public PlanoAssinatura(String nome, double mensalidade) {
        this.nome = (nome == null || nome.trim().isEmpty()) ? "Plano sem nome" : nome.trim();
        this.mensalidade = Math.max(0.0, mensalidade);
    }

    public String getNome() {
        return nome;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public String getDescricao() {
        return String.format("%s - Mensalidade: R$ %.2f", nome, mensalidade);
    }
}