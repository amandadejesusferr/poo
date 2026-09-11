public class AssinaturaAcademia implements Cobravel, Cancelavel {
    private double mensalidade;
    private boolean cancelada;

    public AssinaturaAcademia(double mensalidade) {
        this.mensalidade = Math.max(0.0, mensalidade);
        this.cancelada = false;
    }

    @Override
    public double calcularValorDevido() {
        return mensalidade;
    }

    @Override
    public boolean cancelar() {
        if (!cancelada) {
            cancelada = true;
            return true;
        }
        return false;
    }
}