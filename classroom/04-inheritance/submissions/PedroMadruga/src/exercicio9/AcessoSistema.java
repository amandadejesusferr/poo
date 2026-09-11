public class AcessoSistema implements Auditavel {
    private String codigoAcesso;
    private String usuario;

    public AcessoSistema(String codigoAcesso, String usuario) {
        this.codigoAcesso = (codigoAcesso == null || codigoAcesso.trim().isEmpty()) ? "LOG-000" : codigoAcesso.trim();
        this.usuario = (usuario == null || usuario.trim().isEmpty()) ? "anônimo" : usuario.trim();
    }

    @Override
    public String getIdentificador() {
        return codigoAcesso;
    }

    @Override
    public String getDescricaoAuditoria() {
        return "Autenticação efetuada pelo usuário: " + usuario;
    }
}