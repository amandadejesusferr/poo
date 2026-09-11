public class AuditoriaApp {
    public static void main(String[] args) {
        ServicoAuditoria servico = new ServicoAuditoria();

        Auditavel contrato = new ContratoComercial("CTR-2026/01", "Tech Solutions Ltda");
        Auditavel login = new AcessoSistema("SES-98213", "pedro.costa");

        servico.registrarLog(contrato);
        servico.registrarLog(login);
    }
}