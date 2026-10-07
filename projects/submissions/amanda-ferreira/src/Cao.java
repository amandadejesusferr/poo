//Superclasse Abstrata
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Cao{
    private String nome;
    private String raca;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private boolean vacinado;
    private Tutor tutor;

    public Cao(String nome, String raca, int diaNascimento, int mesNascimento, int anoNascimento, boolean vacinado, Tutor tutor){
        this.nome = nome;
        this.raca = raca;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.tutor = tutor;

        if(vacinado == false){
            System.out.println("Hospedagem negada!\n O cão precisa estar vacinado para se hospedar.");
        } else{
            this.vacinado = vacinado;
        }
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public int getDiaNascimento(){
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento){
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento(){
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento){
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento(){
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public Tutor getTutor(){
        return tutor;
    }

    public void setTutor(Tutor tutor){
        this.tutor = tutor;
    }

    public int calcularIdade(){
        return LocalDate.now().getYear() - anoNascimento;
    }

    public boolean ehIdoso(){
        return calcularIdade() >= 7;
    }

    public void setVacinado(boolean vacinado){
        this.vacinado = vacinado;
    }

    public boolean getVacinado(){
        return vacinado;
    }

    public boolean ehAniversariante(){
        return LocalDate.now().getMonthValue() == mesNascimento;
    }

    public String getDataNascimentoFormatada() {
        return String.format("%02d/%02d/%04d", diaNascimento, mesNascimento, anoNascimento);
    }

    public abstract String emitirSom();

    public abstract double calcularDiariaBase();

    @Override
    public String toString(){
        return "Nome: " + nome + 
               ", Raça: " + raca + 
               ", Data de Nascimento: " + getDataNascimentoFormatada() + 
               ", Idade: " + calcularIdade() + " anos" + 
               (ehIdoso() ? " (Idoso)" : "") +
               ", Vacinado: " + (vacinado ? "Sim" : "Não") + 
               ", Tutor: " + (tutor != null ? tutor.getNome() : "N/A");
    }
}