public class IngressoCinema {
    private String filme;
    private double precoInteira;
    private boolean vendido;

    public IngressoCinema(String filme, double precoInteira) {
        this.filme = (filme == null || filme.isBlank()) ? "Filme não informado" : filme;
        this.precoInteira = precoInteira <= 0 ? 1.0 : precoInteira;
        this.vendido = false;
    }

    public double venderInteira() {
        if (!vendido) {
            vendido = true;
            return precoInteira;
        }
        return 0.0;
    }

    public double venderMeia() {
        if (!vendido) {
            vendido = true;
            return precoInteira / 2.0;
        }
        return 0.0;
    }

    public String getFilme() {
        return filme;
    }

    public double getPrecoInteira() {
        return precoInteira;
    }

    public boolean isVendido() {
        return vendido;
    }
}