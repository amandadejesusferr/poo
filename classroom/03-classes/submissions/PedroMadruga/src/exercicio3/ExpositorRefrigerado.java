public class ExpositorRefrigerado {
    private double temperatura;

    public ExpositorRefrigerado() {
        this(4.0);
    }

    public ExpositorRefrigerado(double temperaturaInicial) {
        if (temperaturaInicial < -273.15) {
            this.temperatura = 4.0;
        } else {
            this.temperatura = temperaturaInicial;
        }
    }

    public void setTemperatura(double novaTemperatura) {
        if (novaTemperatura >= -273.15) {
            this.temperatura = novaTemperatura;
        }
    }

    public double getTemperatura() {
        return temperatura;
    }

    public boolean isFaixaSegura() {
        return temperatura >= 2.0 && temperatura <= 8.0;
    }
}