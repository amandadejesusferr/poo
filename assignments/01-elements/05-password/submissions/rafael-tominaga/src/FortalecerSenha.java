import java.util.Scanner;

public class FortalecerSenha {
    public static int calcularTempoDigitacao(String senha) {
        if (senha == null || senha.isEmpty()) {
            return 0;
        }

        int tempo = 2;
        for (int i = 1; i < senha.length(); i++) {
            if (senha.charAt(i) == senha.charAt(i - 1)) {
                tempo += 1;
            } else {
                tempo += 2;
            }
        }
        return tempo;
    }

    public static String fortalecerSenha(String s) {
        if (s == null || s.length() < 1 || s.length() > 10) {
            throw new IllegalArgumentException("O comprimento da senha deve estar entre 1 e 10 caracteres.");
        }

        int melhorTempo = -1;
        String melhorSenha = "";

        for (int i = 0; i <= s.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                String candidata = s.substring(0, i) + c + s.substring(i);
                int tempoAtual = calcularTempoDigitacao(candidata);

                if (tempoAtual > melhorTempo) {
                    melhorTempo = tempoAtual;
                    melhorSenha = candidata;
                }
            }
        }

        return melhorSenha;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String s = scanner.nextLine().trim();

        String senhaFortalecida = fortalecerSenha(s);
        System.out.println("Senha fortalecida: " + senhaFortalecida);

        scanner.close();
    }
}
