public class ProdutoApp {
    public static void main(String[] args) {
        Produto caderneta = new Produto("Caderno A5", 15.00, 10);

        System.out.println("Estoque inicial: " + caderneta.getQuantidadeEstoque());

        caderneta.darEntrada(5);
        System.out.println("Após entrada de 5 unidades: " + caderneta.getQuantidadeEstoque());

        boolean sucessoRetirada1 = caderneta.retirar(8);
        System.out.println("Retirada de 8 unidades realizada? " + sucessoRetirada1 + " | Estoque: " + caderneta.getQuantidadeEstoque());

        boolean sucessoRetirada2 = caderneta.retirar(20);
        System.out.println("Retirada de 20 unidades realizada? " + sucessoRetirada2 + " | Estoque: " + caderneta.getQuantidadeEstoque());
    }
}