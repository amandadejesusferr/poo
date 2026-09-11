public class CursoOnline extends ConteudoDigital {
    private double valorHora;
    private int duracaoHoras;

    public CursoOnline(String titulo, double precoBase, double valorHora, int duracaoHoras) {
        super(titulo, precoBase);
        this.valorHora = Math.max(0.0, valorHora);
        this.duracaoHoras = Math.max(0, duracaoHoras);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + (valorHora * duracaoHoras);
    }
}