public abstract class ConteudoDigital {
    private String titulo;
    private double precoBase;

    public ConteudoDigital(String titulo, double precoBase) {
        this.titulo = (titulo == null || titulo.trim().isEmpty()) ? "Sem título" : titulo.trim();
        this.precoBase = Math.max(0.0, precoBase);
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularPrecoFinal();
}