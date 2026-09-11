public class CobrancasApp {
    public static void main(String[] args) {
        ProcessadorCobrancas processador = new ProcessadorCobrancas();

        Cobranca prod = new CobrancaProduto("Teclado Mecânico", 300.0);
        Cobranca serv = new CobrancaServico("Manutenção de Servidor", 500.0);

        processador.processar(prod);
        processador.processar(serv);
    }
}