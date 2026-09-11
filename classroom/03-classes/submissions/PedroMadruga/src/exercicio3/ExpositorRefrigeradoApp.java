public class ExpositorRefrigeradoApp {
    public static void main(String[] args) {
        ExpositorRefrigerado expositor = new ExpositorRefrigerado();

        System.out.printf("Temperatura Inicial: %.1f °C | Segura? %b\n", expositor.getTemperatura(), expositor.isFaixaSegura());

        expositor.setTemperatura(5.5);
        System.out.printf("Leitura Segura (5.5 °C): %.1f °C | Segura? %b\n", expositor.getTemperatura(), expositor.isFaixaSegura());

        expositor.setTemperatura(10.0);
        System.out.printf("Leitura Fora da Faixa (10.0 °C): %.1f °C | Segura? %b\n", expositor.getTemperatura(), expositor.isFaixaSegura());

        expositor.setTemperatura(-300.0);
        System.out.printf("Tentativa de Ajuste Inválido (-300 °C - Mantém Anterior): %.1f °C\n", expositor.getTemperatura());
    }
}