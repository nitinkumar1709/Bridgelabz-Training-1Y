import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class LibraryMain {
    public static void main(String[] args) {

        
        Book b = new Book(1, "Java Programming", "James Gosling");
        System.out.println("=== Book Details ===");
        b.displayBook();

        System.out.println();

        
        Member m = new Member(101, "Amit");
        System.out.println("=== Member Details ===");
        m.displayMember();

        System.out.println();

        
        Transaction t = new Transaction(b, m);
        System.out.println("=== Transaction ===");
        t.issueBook();
    }
}