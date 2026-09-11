public class Endereco {
    private String logradouro;
    private String cidade;
    private String cep;

    public Endereco(String logradouro, String cidade, String cep) {
        this.logradouro = (logradouro == null || logradouro.trim().isEmpty()) ? "Logradouro não informado" : logradouro.trim();
        this.cidade = (cidade == null || cidade.trim().isEmpty()) ? "Cidade não informada" : cidade.trim();
        this.cep = (cep == null || cep.trim().isEmpty()) ? "00000-000" : cep.trim();
    }

    public String formatar() {
        return String.format("%s, %s - CEP: %s", logradouro, cidade, cep);
    }
}