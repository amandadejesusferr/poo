import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isValidInput(String input) {
        if (input == null) {
            return false;
        }

        return !input.trim().isEmpty();
    }

    public static boolean isPalindrome(String input) {
        if (!isValidInput(input)) {
            return false;
        }

        String cleaned = clean(input);

        int start = 0;
        int end = cleaned.length() - 1;

        while (start < end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
                return false;
            }
            start = start + 1;
            end = end - 1;
        }

        return true;
    }

    private static String clean(String input) {
        String lowerCase = input.toLowerCase();
        String result = "";

        for (int i = 0; i < lowerCase.length(); i++) {
            char character = lowerCase.charAt(i);

            if (Character.isLetterOrDigit(character)) {
                result = result + character;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        boolean valid = false;

        while (!valid) {
            System.out.print("Digite uma sequência: ");
            input = scanner.nextLine();

            valid = isValidInput(input);

            if (!valid) {
                System.out.println("Erro: A entrada não pode estar vazia.");
            }
        }

        if (isPalindrome(input)) {
            System.out.println("A sequência \"" + input + "\" é um palíndromo.");
        } else {
            System.out.println("A sequência \"" + input + "\" não é um palíndromo.");
        }

        scanner.close();
    }
}

