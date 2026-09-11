public class CobrancaServico extends Cobranca {

    public CobrancaServico(String descricao, double valorBase) {
        super(descricao, valorBase);
    }

    @Override
    public double calcularTotal() {
        return getValorBase() * 1.05; // +5% imposto
    }
}