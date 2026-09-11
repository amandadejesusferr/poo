public class OrcamentoPisoApp {
    public static void main(String[] args) {
        OrcamentoPiso comodo1 = new OrcamentoPiso(5.0, 3.0, 80.00);
        OrcamentoPiso comodoInvalido = new OrcamentoPiso(-5.0, 3.0, 80.00);

        System.out.println("--- Cômodo Válido (5.0m x 3.0m) ---");
        System.out.printf("Área: %.2f m²\n", comodo1.calcularArea());
        System.out.printf("Rodapé: %.2f m\n", comodo1.calcularComprimentoRodape());
        System.out.printf("Preço Total: R$ %.2f\n\n", comodo1.calcularPrecoTotal());

        System.out.println("--- Cômodo com Dimensão Inválida (-5.0m normalizado para 1.0m) ---");
        System.out.printf("Comprimento Ajustado: %.1f m\n", comodoInvalido.getComprimento());
        System.out.printf("Área: %.2f m²\n", comodoInvalido.calcularArea());
        System.out.printf("Preço Total: R$ %.2f\n", comodoInvalido.calcularPrecoTotal());
    }
}