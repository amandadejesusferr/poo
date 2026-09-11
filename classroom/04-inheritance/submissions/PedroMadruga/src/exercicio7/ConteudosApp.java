public class ConteudosApp {
    public static void main(String[] args) {
        ConteudoDigital livro = new LivroDigital("Clean Code", 80.0, 15.0);
        ConteudoDigital curso = new CursoOnline("Java Completo", 100.0, 2.50, 40);

        ConteudoDigital[] catalogo = { livro, curso };
        for (ConteudoDigital item : catalogo) {
            System.out.printf("Conteúdo: %-20s | Preço Final: R$ %.2f%n",
                    item.getTitulo(), item.calcularPrecoFinal());
        }
    }
}