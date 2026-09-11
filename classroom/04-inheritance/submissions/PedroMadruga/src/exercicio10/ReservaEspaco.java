public class ReservaEspaco implements Cobravel, Cancelavel {
    private int horas;
    private double valorPorHora;
    private boolean utilizada;
    private boolean cancelada;

    public ReservaEspaco(int horas, double valorPorHora, boolean utilizada) {
        this.horas = Math.max(0, horas);
        this.valorPorHora = Math.max(0.0, valorPorHora);
        this.utilizada = utilizada;
        this.cancelada = false;
    }

    @Override
    public double calcularValorDevido() {
        return horas * valorPorHora;
    }

    @Override
    public boolean cancelar() {
        if (!utilizada && !cancelada) {
            cancelada = true;
            return true;
        }
        return false;
    }
}