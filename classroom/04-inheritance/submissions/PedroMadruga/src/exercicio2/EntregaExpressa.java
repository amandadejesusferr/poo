public class EntregaExpressa extends Entrega {

    public EntregaExpressa(double distanciaKm, double pesoKg) {
        super(distanciaKm, pesoKg);
    }

    @Override
    public double calcularFrete() {
        return super.calcularFrete() + 20.00;
    }

    @Override
    public int calcularPrazoDias() {
        int prazoOriginal = super.calcularPrazoDias();
        int prazoExpresso = (int) Math.ceil(prazoOriginal / 2.0);
        return Math.max(1, prazoExpresso);
    }

    @Override
    public String getDescricao() {
        return String.format("Entrega Expressa [Distância: %.1f km, Peso: %.1f kg, Frete: R$ %.2f, Prazo: %d dias]",
                getDistanciaKm(), getPesoKg(), calcularFrete(), calcularPrazoDias());
    }
}