package Activty1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Solo leveling";
        book1.author = "J Torres";
        book1.isbn = "978-1975319434";
        book1.publicationDate = "March 2, 2021";
        
        book1.printBookInfo();

        Book book2 = new Book();
        book2.title = "The Book of Five Rings";
        book2.author = "Miyamoto Musashi";
        book2.isbn = "1590309847";
        book2.publicationDate = "1645";

         book2.printBookInfo();

        Book book3 = new Book("The Begining after the end","TurtleMe (Tae Ha Lee)","978-1-9753-4563-1","August 2, 2022");
        book3.printBookInfo();
    
        Book book4 = new Book("Noli Me Tángere","José Protasio Rizal Mercado y Alonso Realonda","9791195163861 ","1887");
        book4.printBookInfo();
    
    }

}