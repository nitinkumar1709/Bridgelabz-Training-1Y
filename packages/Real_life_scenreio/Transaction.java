package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    Book book;
    Member member;

    public Transaction(Book book, Member member) {
        this.book = book;
        this.member = member;
    }

    public void issueBook() {
        System.out.println("Book Issued Successfully!");
        System.out.println("Issued To: " + member.name);
        System.out.println("Book Title: " + book.title);
    }
}