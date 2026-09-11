public class ClienteFidelidade {
    private String nome;
    private int pontos;
    private boolean ativo;

    public ClienteFidelidade(String nome) {
        this.nome = (nome == null || nome.isBlank()) ? "Cliente não identificado" : nome;
        this.pontos = 0;
        this.ativo = true;
    }

    public boolean acumularPontos(int quantidade) {
        if (ativo && quantidade > 0) {
            this.pontos += quantidade;
            return true;
        }
        return false;
    }

    public boolean resgatarPontos(int quantidade) {
        if (ativo && quantidade > 0 && quantidade <= pontos) {
            this.pontos -= quantidade;
            return true;
        }
        return false;
    }

    public void desativar() {
        this.ativo = false;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public boolean isAtivo() {
        return ativo;
    }
}