public class Iluminacao {
    private String setor;
    private double potenciaWatts;
    private boolean ligada;

    public Iluminacao(String setor, double potenciaWatts) {
        this.setor = (setor == null || setor.isBlank()) ? "Setor não informado" : setor;
        this.potenciaWatts = potenciaWatts <= 0 ? 10.0 : potenciaWatts;
        this.ligada = false;
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public String getSetor() {
        return setor;
    }

    public double getPotenciaWatts() {
        return potenciaWatts;
    }

    public boolean isLigada() {
        return ligada;
    }

    public String getStatus() {
        return String.format("Setor: %s | Potência: %.1f W | Estado: %s",
                setor, potenciaWatts, ligada ? "Ligada" : "Desligada");
    }
}
