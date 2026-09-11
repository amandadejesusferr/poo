public class Veiculo {
    private String placa;
    private Motor motor; // Composição: "tem um"

    public Veiculo(String placa, String combustivel, int potenciaCv) {
        this.placa = (placa == null || placa.trim().isEmpty()) ? "SEM-PLACA" : placa.trim();
        this.motor = new Motor(combustivel, potenciaCv);
    }

    public String getPlaca() {
        return placa;
    }

    public String getDescricao() {
        return String.format("Veículo [Placa: %s, %s]", placa, motor.getDescricao());
    }
}