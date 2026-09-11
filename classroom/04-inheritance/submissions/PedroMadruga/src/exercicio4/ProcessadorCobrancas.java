public class ProcessadorCobrancas {
    public void processar(Cobranca cobranca) {
        System.out.printf("Processando Cobrança: %s | Base: R$ %.2f | Total c/ Imposto: R$ %.2f%n",
                cobranca.getDescricao(), cobranca.getValorBase(), cobranca.calcularTotal());
    }
}