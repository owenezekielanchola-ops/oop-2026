package Activty1;

public class Book {
    String title;
    String author;
    String isbn;
    String publicationDate;

    void printBookInfo() {
        System.out.println();
        System.out.printf("""
                Title: %s
                Author: %s
                isbn: %s
                Publication Date: %s
                """, title, author, isbn, publicationDate);
            System.out.println();
    }

    public Book() {

    }

    public Book(String title1, String author1, String isbn1, String publication1) {
        title = title1;
        author = author1;
        isbn = isbn1;
        publicationDate = publication1;

    }

}