public class Hospedagem {
    private Cao cao;
    private int diarias;

    public Hospedagem(Cao cao, int diarias){
        this.cao = cao;
        if(diarias <= 0){
            throw new HospedagemInvalidaException("Erro! Hospedagem não pode ser menor ou igual a zero.");
        } else{
            this.diarias = diarias;
        }
    }

    @Override 
    public double calcularDiariaBase(){
        return this.cao.calcularDiariaBase() * diarias;
    }
}
