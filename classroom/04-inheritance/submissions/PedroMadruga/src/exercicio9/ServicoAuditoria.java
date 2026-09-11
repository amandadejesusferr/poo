public class ServicoAuditoria {
    public void registrarLog(Auditavel auditavel) {
        System.out.printf("[LOG AUDITORIA] ID: %s | Detalhe: %s%n",
                auditavel.getIdentificador(), auditavel.getDescricaoAuditoria());
    }
}