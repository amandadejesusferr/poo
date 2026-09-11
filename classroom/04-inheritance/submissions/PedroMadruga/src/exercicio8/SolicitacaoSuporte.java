public public abstract class SolicitacaoSuporte {
    private String protocolo;
    private String descricao;

    public SolicitacaoSuporte(String protocolo, String descricao) {
        this.protocolo = (protocolo == null || protocolo.trim().isEmpty()) ? "PROTO-000" : protocolo.trim();
        this.descricao = (descricao == null || descricao.trim().isEmpty()) ? "Sem descrição" : descricao.trim();
    }

    public String getProtocolo() {
        return protocolo;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract int calcularPrioridade();
} {
    
}
