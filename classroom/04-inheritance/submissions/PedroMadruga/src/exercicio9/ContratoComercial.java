public class ContratoComercial implements Auditavel {
    private String numeroContrato;
    private String parteContratada;

    public ContratoComercial(String numeroContrato, String parteContratada) {
        this.numeroContrato = (numeroContrato == null || numeroContrato.trim().isEmpty()) ? "CTR-000" : numeroContrato.trim();
        this.parteContratada = (parteContratada == null || parteContratada.trim().isEmpty()) ? "Não informada" : parteContratada.trim();
    }

    @Override
    public String getIdentificador() {
        return numeroContrato;
    }

    @Override
    public String getDescricaoAuditoria() {
        return "Contrato formalizado com a parte: " + parteContratada;
    }
}