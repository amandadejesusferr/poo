//Subclasse "é um"

public class CaoGrande extends Cao{
    public CaoGrande(String nome, String raca, int diaNascimento, int mesNascimento, int anoNascimento, boolean vacinado, Tutor tutor){
    super(nome, raca, diaNascimento, mesNascimento, anoNascimento, vacinado, tutor);
    }

    @Override 
    public String emitirSom(){
        return "AU AU (Latido grave)";
    }

    @Override 
    public double calcularDiariaBase(){
        return 70.0;
    }
}