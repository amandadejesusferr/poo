public class PlanoProfissional extends PlanoAssinatura {
    private int maxUsuarios;

    public PlanoProfissional(String nome, double mensalidade, int maxUsuarios) {
        super(nome, mensalidade);
        this.maxUsuarios = maxUsuarios <= 0 ? 1 : maxUsuarios;
    }

    public int getMaxUsuarios() {
        return maxUsuarios;
    }

    @Override
    public String getDescricao() {
        return String.format("%s (Limite: %d usuários)", super.getDescricao(), maxUsuarios);
    }
}