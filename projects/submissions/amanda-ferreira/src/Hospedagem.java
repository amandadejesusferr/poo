public class Hospedagem {
    private Cao cao;
    private int diarias;
    private boolean temBanho;
    private boolean temTosa;
    private boolean temAdestramento;

    public Hospedagem(Cao cao, int diarias, boolean temBanho, boolean temTosa, boolean temAdestramento) {
        this.cao = cao;
        if (diarias <= 0) {
            throw new HospedagemInvalidaException("Erro! A quantidade de diárias não pode ser menor ou igual a zero.");
        }
        this.diarias = diarias;
        this.temBanho = temBanho;
        this.temTosa = temTosa;
        this.temAdestramento = temAdestramento;
    }

    public double calcularValorTotal() {
        double subtotalDiarias = this.cao.calcularDiariaBase() * diarias;
        double valorTotalServicos = 0.0;

        if (this.cao.ehIdoso()) {
            subtotalDiarias *= 1.10;
        }

        if (this.cao.ehAniversariante()) {
            subtotalDiarias *= 0.90;
        }

        if (temBanho) valorTotalServicos += 50.0;
        if (temTosa) valorTotalServicos += 30.0;
        if (temAdestramento) valorTotalServicos += 80.0;

        return subtotalDiarias + valorTotalServicos;
    }

    public String emitirNotaFiscal() {
        double diariaBaseUnit = this.cao.calcularDiariaBase();
        double subtotalDiarias = diariaBaseUnit * diarias;
        double taxaIdoso = 0.0;
        double descontoAniversario = 0.0;

        if (this.cao.ehIdoso()) {
            taxaIdoso = subtotalDiarias * 0.10;
        }
        if (this.cao.ehAniversariante()) {
            descontoAniversario = (subtotalDiarias + taxaIdoso) * 0.10;
        }

        double totalServicos = 0.0;
        StringBuilder sbServicos = new StringBuilder();
        if (temBanho) { totalServicos += 40.0; sbServicos.append("\n  - Banho: R$ 40,00"); }
        if (temTosa) { totalServicos += 50.0; sbServicos.append("\n  - Tosa: R$ 50,00"); }
        if (temAdestramento) { totalServicos += 100.0; sbServicos.append("\n  - Adestramento: R$ 100,00"); }
        if (totalServicos == 0) { sbServicos.append("\n  - Nenhum serviço extra selecionado"); }

        double valorFinal = (subtotalDiarias + taxaIdoso - descontoAniversario) + totalServicos;

        return "\n========================================\n" +
               "           NOTA FISCAL - AU AU PALACE    \n" +
               "========================================\n" +
               " Hóspede: " + this.cao.getNome() + " (" + this.cao.getRaca() + ")\n" +
               " Tutor: " + this.cao.getTutor().getNome() + "\n" +
               "----------------------------------------\n" +
               " Diárias (" + diarias + "x R$ " + diariaBaseUnit + "): R$ " + String.format("%.2f", subtotalDiarias) + "\n" +
               (this.cao.ehIdoso() ? " (+) Taxa Cão Idoso (10%): R$ " + String.format("%.2f", taxaIdoso) + "\n" : "") +
               (this.cao.ehAniversariante() ? " (-) Desconto Aniversariante (10%): R$ " + String.format("%.2f", descontoAniversario) + "\n" : "") +
               " Serviços Extras:" + sbServicos.toString() + "\n" +
               "----------------------------------------\n" +
               " VALOR TOTAL A PAGAR: R$ " + String.format("%.2f", valorFinal) + "\n" +
               "========================================";
    }

    public Cao getCao(){
        return cao;
    }

    public int getDiarias(){
        return diarias;
    }
}
