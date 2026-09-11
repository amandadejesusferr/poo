public class Carteira {
    private String titular;
    private double saldo;

    public Carteira(String titular, double saldoInicial) {
        this.titular = (titular == null || titular.isBlank()) ? "Sem nome" : titular;
        this.saldo = saldoInicial < 0 ? 0.0 : saldoInicial;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(Carteira destino, double valor) {
        if (destino != null && destino != this && valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}