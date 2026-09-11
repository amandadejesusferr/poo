public class CobrancaProduto extends Cobranca {

    public CobrancaProduto(String descricao, double valorBase) {
        super(descricao, valorBase);
    }

    @Override
    public double calcularTotal() {
        return getValorBase() * 1.10; // +10% imposto
    }
}