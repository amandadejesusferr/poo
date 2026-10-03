public class BookApp {
    public static void main(String[] args) {
        Book genericBook = new Book("Dom Casmurro", 1899, "Machado de Assis");
        
        PrintBook printBook = new PrintBook(
                "Java: How to Program", 
                2017, 
                "Paul Deitel & Harvey Deitel", 
                "Pearson", 
                "978-0134743356"
        );

        AudioBook audioBook = new AudioBook(
                "O Hobbit", 
                1937, 
                "J.R.R. Tolkien", 
                320.5, 
                660, 
                "Rob Inglis"
        );

        System.out.println("--- Livro Genérico ---");
        System.out.println(genericBook);

        System.out.println("\n--- Livro Impresso ---");
        System.out.println(printBook);

        System.out.println("\n--- Audiolivro ---");
        System.out.println(audioBook);
    }
}
