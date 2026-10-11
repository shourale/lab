package q.practice2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Лев Толстой", "old@example.com", 'm');
        System.out.println(author);
        author.setEmail("new@example.com");
        System.out.println(author);
    }
}
