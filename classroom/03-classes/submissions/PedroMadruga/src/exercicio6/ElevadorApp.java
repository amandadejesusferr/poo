public class ElevadorApp {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(3, 4);

        System.out.println("--- Teste de Lotação ---");
        System.out.println("Entrada de 3 pessoas: " + elevador.entrar(3));
        System.out.println("Tentativa de entrar mais 2 pessoas (Lotação max 4): " + elevador.entrar(2));
        System.out.println("Pessoas no elevador: " + elevador.getPessoasPresentes());

        System.out.println("\n--- Teste de Subida até o Topo ---");
        for (int i = 0; i < 4; i++) {
            boolean subiu = elevador.subir();
            System.out.printf("Tentativa %d de subir -> Sucesso: %b | Andar Atual: %d\n", i + 1, subiu, elevador.getAndarAtual());
        }

        System.out.println("\n--- Teste de Descida até o Térreo ---");
        for (int i = 0; i < 4; i++) {
            boolean desceu = elevador.descer();
            System.out.printf("Tentativa %d de descer -> Sucesso: %b | Andar Atual: %d\n", i + 1, desceu, elevador.getAndarAtual());
        }
    }
}