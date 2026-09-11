public class ClienteFidelidadeApp {
    public static void main(String[] args) {
        ClienteFidelidade cliente = new ClienteFidelidade("Pedro Madruga");

        cliente.acumularPontos(100);
        System.out.println("Pontos acumulados (100): " + cliente.getPontos());

        boolean resgateSucesso = cliente.resgatarPontos(40);
        System.out.println("Resgate de 40 pontos realizado? " + resgateSucesso + " | Saldo: " + cliente.getPontos());

        boolean resgateInvalido = cliente.resgatarPontos(100);
        System.out.println("Resgate de 100 pontos realizado? " + resgateInvalido + " | Saldo: " + cliente.getPontos());

        cliente.desativar();
        System.out.println("Cadastro desativado.");

        boolean acimuloAposDesativar = cliente.acumularPontos(50);
        System.out.println("Tentativa de acumular pontos após desativação? " + acimuloAposDesativar + " | Saldo: " + cliente.getPontos());
    }
}