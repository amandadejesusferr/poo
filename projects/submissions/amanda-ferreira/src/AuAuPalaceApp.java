import java.util.Scanner;

public class AuAuPalaceApp {
    private static int totalCaesCadastrados = 0;

    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            Cao[] caes = new Cao[15];
            Hospedagem[] hospedagens = new Hospedagem[15];
            int totalHospedagens = 0;

            int opcao = 0;

            do{
                System.out.println("\n===== BEM-VINDO AO AU AU PALACE =====");
                System.out.println("1. Cadastrar Tutor e Cão");
                System.out.println("2. Registrar Hospedagem");
                System.out.println("3. Listar Hóspedes");
                System.out.println("4. Consultar Estatísticas");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");

                if(scanner.hasNextInt()){
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                } else{
                    System.out.println("Opção inválida! Digite um número válido.");
                    scanner.nextLine();
                    continue;
                }

                switch(opcao){
                    case 1:
                        if(totalCaesCadastrados >= caes.length){
                            System.out.println("Erro: capacidade máxima atingida!");
                            break;
                        }

                        System.out.println("\n--- Cadastro do Tutor ---");
                        System.out.print("Nome do Tutor: ");
                        String nomeTutor = scanner.nextLine();
                        System.out.print("Telefone: ");
                        String telefone = scanner.nextLine();
                        System.out.print("CPF: ");
                        String cpf = scanner.nextLine();
                        Tutor tutor = new Tutor(nomeTutor, telefone, cpf);  

                        System.out.println("\n--- Cadastro do Cão ---");
                        System.out.print("Nome do Cão: ");
                        String nomeCao = scanner.nextLine();
                        System.out.print("Raça: ");
                        String raca = scanner.nextLine();
                        System.out.print("Data de nascimento (dia mes ano separados por espaço): ");
                        int dia = scanner.nextInt();
                        int mes = scanner.nextInt();
                        int ano = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Está vacinado? (sim/não): ");
                        String respostaVacina = scanner.nextLine().trim();
                        boolean vacinado = respostaVacina.equalsIgnoreCase("sim") || respostaVacina.equalsIgnoreCase("s");

                        if (!vacinado) {
                            System.out.println("\nERRO: Hospedagem negada! O cão precisa estar vacinado para se hospedar.");
                            break; // Interrompe o cadastro aqui e volta para o menu
                        }

                        System.out.print("Porte do cão (1 - Pequeno, 2 - Médio, 3 - Grande): ");
                        int porte = scanner.nextInt();
                        scanner.nextLine();

                        Cao novoCao = null;

                        if (porte == 1) {
                            novoCao = new CaoPequeno(nomeCao, raca, dia, mes, ano, vacinado, tutor);
                        } else if (porte == 2) {
                            novoCao = new CaoMedio(nomeCao, raca, dia, mes, ano, vacinado, tutor);
                        } else {
                            novoCao = new CaoGrande(nomeCao, raca, dia, mes, ano, vacinado, tutor);
                        }

                        caes[totalCaesCadastrados] = novoCao;
                        totalCaesCadastrados++;
                        System.out.println("Cão cadastrado com sucesso!");
                        break;

                        case 2:
                            if (totalCaesCadastrados == 0) {
                                System.out.println("Não há cães cadastrados!");
                                break;
                            }

                            System.out.println("\n--- Registrar Hospedagem ---");
                            System.out.println("Selecione o cão pelo índice:");
                            for (int i = 0; i < totalCaesCadastrados; i++) {
                                System.out.println(i + " - " + caes[i].getNome() + " (" + caes[i].getRaca() + ")");
                            }

                            int indiceCao = scanner.nextInt();
                            System.out.print("Quantidade de diárias: ");
                            int diarias = scanner.nextInt();

                            System.out.println("Serviço Extra:");
                            System.out.println("0 - Nenhum");
                            System.out.println("1 - Banho (R$ 40,00)");
                            System.out.println("2 - Tosa (R$ 50,00)");
                            System.out.println("3 - Adestramento (R$ 100,00)");
                            System.out.print("Escolha o serviço extra: ");
                            int servicoOpcao = scanner.nextInt();
                            scanner.nextLine();

                            try {
                                Hospedagem h = new Hospedagem(caes[indiceCao], diarias, servicoOpcao);
                                hospedagens[totalHospedagens] = h;
                                totalHospedagens++;
                                System.out.println("Hospedagem registrada com sucesso! " + h.getResumoHospedagem());
                            } catch (HospedagemInvalidaException e) {
                                System.out.println("Erro na validação: " + e.getMessage());
                            }
                            break;

                        case 3:
                            System.out.println("\n--- Lista de Hóspedes ---");
                            if (totalCaesCadastrados == 0) {
                                System.out.println("Nenhum cão cadastrado!");
                            } else {
                                for (Cao c : caes) {
                                    if (c != null) {
                                        System.out.println(c.toString());
                                        System.out.println("Latido: " + c.emitirSom());
                                        System.out.println("Diária Base: R$ " + c.calcularDiariaBase());
                                        System.out.println("-----------------------------------");
                                    }
                                }
                            }
                            break;

                        case 4:
                            System.out.println("\n--- Estatísticas do Sistema ---");
                            System.out.println("Total de cães cadastrados: " + totalCaesCadastrados);
                            break;

                        case 5:
                            System.out.println("Encerrando o sistema. Até logo!");
                            break;

                        default:
                            System.out.println("Opção inválida! Escolha entre 1 e 5.");
                }

            } while (opcao != 5);
        }
    }
}