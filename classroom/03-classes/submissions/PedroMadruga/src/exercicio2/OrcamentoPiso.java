public class OrcamentoPiso {
    private final double comprimento;
    private final double largura;
    private final double precoMetroQuadrado;

    public OrcamentoPiso(double comprimento, double largura, double precoMetroQuadrado) {
        this.comprimento = comprimento <= 0 ? 1.0 : comprimento;
        this.largura = largura <= 0 ? 1.0 : largura;
        this.precoMetroQuadrado = precoMetroQuadrado < 0 ? 0.0 : precoMetroQuadrado;
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularComprimentoRodape() {
        return 2 * (comprimento + largura);
    }

    public double calcularPrecoTotal() {
        return calcularArea() * precoMetroQuadrado;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public double getPrecoMetroQuadrado() {
        return precoMetroQuadrado;
    }
}