public class FrotaApp {
    public static void main(String[] args) {
        // Veiculo "tem um" Motor (Composição)
        Veiculo carro = new Veiculo("ABC-1234", "Flex", 120);

        // Caminhao "é um" Veiculo (Herança) e indiretamente "tem um" Motor
        Veiculo caminhao = new Caminhao("XYZ-9876", "Diesel", 450, 25.5);

        System.out.println(carro.getDescricao());
        System.out.println(caminhao.getDescricao());
    }
}