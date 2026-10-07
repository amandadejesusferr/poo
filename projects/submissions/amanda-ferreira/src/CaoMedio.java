public class CaoMedio extends Cao {
    public CaoMedio(String nome, String raca, int diaNascimento, int mesNascimento, int anoNascimento, boolean vacinado, Tutor tutor){
    super(nome, raca, diaNascimento, mesNascimento, anoNascimento, vacinado, tutor);
    }

    @Override 
    public String emitirSom(){
        return "Au Au (Latido normal)";
    }

    @Override 
    public double calcularDiariaBase(){
        return 60.0;
    }
}
