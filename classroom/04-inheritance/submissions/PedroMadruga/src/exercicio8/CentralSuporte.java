public class CentralSuporte {
    public void processar(SolicitacaoSuporte solicitacao) {
        System.out.printf("Chamado [%s] - %s | Prioridade calculada: %d%n",
                solicitacao.getProtocolo(), solicitacao.getDescricao(), solicitacao.calcularPrioridade());
    }
}