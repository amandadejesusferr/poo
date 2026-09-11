public class IluminacaoLojaApp {
    public static void main(String[] args) {
        Iluminacao vitrine = new Iluminacao("Vitrine", 150.0);
        Iluminacao estoque = new Iluminacao("Estoque", 200.0);

        vitrine.ligar();

        System.out.println("--- Estado da Iluminação ---");
        System.out.println(vitrine.getStatus());
        System.out.println(estoque.getStatus());
    }
}