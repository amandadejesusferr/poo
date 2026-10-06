public class Hospedagem {
    private Cao cao;
    private int diarias;
    private String servicoExtra;
    private double valorServicoExtra;

    public Hospedagem(Cao cao, int diarias, int opcaoServico){
        this.cao = cao;
        if(diarias <= 0){
            throw new HospedagemInvalidaException("Erro! Hospedagem não pode ser menor ou igual a zero.");
        } else{
            this.diarias = diarias;
            configurarServicoExtra(opcaoServico);
        }
    }

    private void configurarServicoExtra(int opcao){
        switch (opcao) {
            case 1:
                this.servicoExtra = "Banho";
                this.valorServicoExtra = 40.0;
                break;
            case 2:
                this.servicoExtra = "Tosa";
                this.valorServicoExtra = 30.0;
                break;
            case 3:
                this.servicoExtra = "Adestramento";
                this.valorServicoExtra = 70.0;
                break;
            default:
                this.servicoExtra = "Nenhum";
                this.valorServicoExtra = 0.0;
                break;
        }
    }

    public double calcularValorTotal(){
        double subtotalDiarias = this.cao.calcularDiariaBase() * diarias;
        if(this.cao.ehIdoso()){
            subtotalDiarias *= 1.10;
        }

        if(this.cao.ehAniversariante()){
            subtotalDiarias *= 0.90;
        }

        return subtotalDiarias + valorServicoExtra;
    }

    public String getResumoHospedagem(){
        return "Diárias: " + diarias +
                " | Serviço Extra: " + servicoExtra + "(R$" + valorServicoExtra + ")" +
                " | Valor Total: R$" + calcularValorTotal();
    }

    public Cao getCao(){
        return cao;
    }

    public int getDiarias(){
        return diarias;
    }
}
