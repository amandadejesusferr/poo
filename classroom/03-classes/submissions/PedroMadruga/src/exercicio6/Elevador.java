public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public Elevador(int totalAndares, int capacidade) {
        this.totalAndares = totalAndares <= 0 ? 1 : totalAndares;
        this.capacidade = capacidade <= 0 ? 1 : capacidade;
        this.andarAtual = 0; // Térreo
        this.pessoasPresentes = 0;
    }

    public boolean entrar(int pessoas) {
        if (pessoas > 0 && (pessoasPresentes + pessoas) <= capacidade) {
            pessoasPresentes += pessoas;
            return true;
        }
        return false;
    }

    public boolean sair(int pessoas) {
        if (pessoas > 0 && pessoas <= pessoasPresentes) {
            pessoasPresentes -= pessoas;
            return true;
        }
        return false;
    }

    public boolean subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            return true;
        }
        return false;
    }

    public boolean descer() {
        if (andarAtual > 0) {
            andarAtual--;
            return true;
        }
        return false;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }
}