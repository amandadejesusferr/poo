public class SolicitacaoServico extends SolicitacaoSuporte {
    private int usuariosAfetados;

    public SolicitacaoServico(String protocolo, String descricao, int usuariosAfetados) {
        super(protocolo, descricao);
        this.usuariosAfetados = Math.max(0, usuariosAfetados);
    }

    @Override
    public int calcularPrioridade() {
        int prioridade = 1 + (usuariosAfetados / 10);
        return Math.min(25, prioridade);
    }
}