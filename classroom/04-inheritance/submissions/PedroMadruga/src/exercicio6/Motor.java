public class Motor {
    private String combustivel;
    private int potenciaCv;

    public Motor(String combustivel, int potenciaCv) {
        this.combustivel = (combustivel == null || combustivel.trim().isEmpty()) ? "Gasolina" : combustivel.trim();
        this.potenciaCv = Math.max(0, potenciaCv);
    }

    public String getDescricao() {
        return String.format("Motor %s de %d CV", combustivel, potenciaCv);
    }
}