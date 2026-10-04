//Subclasse "é um"

public class CaoPequeno extends Cao{
    public CaoPequeno(String nome, String raca, int diaNascimento, int mesNascimento, int anoNascimento, boolean vacinado, Tutor tutor){
    super(nome, raca, diaNascimento, mesNascimento, anoNascimento, vacinado, tutor);
    }

    @Override 
    public String emitirSom(){
        return "au au (Latido agudo";
    }

    @Override 
    public double calcularDiariaBase(){
        return 50.0;
    }
}