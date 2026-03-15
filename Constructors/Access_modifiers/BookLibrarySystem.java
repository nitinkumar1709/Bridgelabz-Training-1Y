class Book {
    
    public String ISBN;        
    protected String title;    
    private String author;    

    
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    
    public void setAuthor(String author) {
        this.author = author;
    }

   
    public String getAuthor() {
        return author;
    }

   
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}


class EBook extends Book {
    String fileFormat;

    EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    
    public void displayEBookDetails() {
        
        System.out.println("EBook ISBN: " + ISBN);
        System.out.println("EBook Title: " + title);
        System.out.println("File Format: " + fileFormat);
        System.out.println("Author: " + getAuthor()); 
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        
        Book b1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        System.out.println("--- Book Details ---");
        b1.displayDetails();
        System.out.println();

       
        b1.setAuthor("J. Bloch");
        System.out.println("Updated Book Details:");
        b1.displayDetails();
        System.out.println();

        
        EBook ebook = new EBook("978-0596009205", "Head First Java", "Kathy Sierra", "PDF");
        System.out.println("--- EBook Details ---");
        ebook.displayEBookDetails();
    }
}