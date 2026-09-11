import java.util.Scanner;

public class MaquinaVendasApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaquinaVendas maquina = new MaquinaVendas("Refrigerante", 5.00, 2);

        boolean executando = true;

        while (executando) {
            System.out.println("\n=== MÁQUINA DE VENDAS ===");
            System.out.printf("Produto: %s | Preço: R$ %.2f | Estoque: %d | Crédito: R$ %.2f\n",
                    maquina.getProduto(), maquina.getPreco(), maquina.getEstoque(), maquina.getCredito());
            System.out.println("1 - Inserir Dinheiro");
            System.out.println("2 - Comprar");
            System.out.println("3 - Cancelar (Receber Troco)");
            System.out.println("0 - Encerrar Operação");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Informe o valor a inserir: R$ ");
                    double valor = scanner.nextDouble();
                    if (!maquina.inserirDinheiro(valor)) {
                        System.out.println(">> Valor inválido para inserção.");
                    }
                }
                case 2 -> {
                    if (maquina.comprar()) {
                        System.out.println(">> Compra efetuada com sucesso! Retire seu produto.");
                    } else {
                        System.out.println(">> Compra recusada! Verifique seu crédito ou o estoque do produto.");
                    }
                }
                case 3 -> {
                    double troco = maquina.cancelar();
                    System.out.printf(">> Operação cancelada. Crédito devolvido: R$ %.2f\n", troco);
                }
                case 0 -> {
                    double trocoFinal = maquina.cancelar();
                    System.out.printf(">> Encerrando. Crédito restante devolvido: R$ %.2f\n", trocoFinal);
                    executando = false;
                }
                default -> System.out.println(">> Opção inválida.");
            }
        }
        scanner.close();
    }
}