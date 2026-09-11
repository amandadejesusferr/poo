public class Entrega {
    private double distanciaKm;
    private double pesoKg;

    public Entrega(double distanciaKm, double pesoKg) {
        this.distanciaKm = Math.max(0.0, distanciaKm);
        this.pesoKg = Math.max(0.0, pesoKg);
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public double calcularFrete() {
        return (distanciaKm * 0.50) + (pesoKg * 1.00);
    }

    public int calcularPrazoDias() {
        int dias = (int) Math.ceil(distanciaKm / 100.0);
        return Math.max(1, dias);
    }

    public String getDescricao() {
        return String.format("Entrega Convencional [Distância: %.1f km, Peso: %.1f kg, Frete: R$ %.2f, Prazo: %d dias]",
                distanciaKm, pesoKg, calcularFrete(), calcularPrazoDias());
    }
}