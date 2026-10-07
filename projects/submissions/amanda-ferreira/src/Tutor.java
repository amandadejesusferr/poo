//Classe de domínio

public class Tutor{
    private String nome;
    private String telefone;
    private String cpf;

    public Tutor(String nome, String telefone, String cpf){
        if (telefone == null || telefone.length() < 10 || telefone.length() > 11) {
            throw new IllegalArgumentException("Erro: Telefone inválido! Deve conter 11 dígitos.");
        }

        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.length() < 10 || telefone.length() > 11) {
            throw new IllegalArgumentException("Erro: Telefone inválido! Deve conter 11 dígitos.");
        }
        this.telefone = telefone;
    }

    public String getCpf(){
        return cpf;
    }

}