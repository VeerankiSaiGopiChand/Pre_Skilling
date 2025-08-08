import java.util.Scanner;

class Book {
    String title;
    String author;
    int year;

    void setDetails(String t, String a, int y) {
        title = t;
        author = a;
        year = y;
    }

    void displayDetails() {
        System.out.println("----- Book Details -----");
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Year  : " + year);
        System.out.println("------------------------");
    }

    String getTitle() {
        return title;
    }
}

public class Bookclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book myBook = new Book();

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author name: ");
        String author = scanner.nextLine();

        System.out.print("Enter year of publication: ");
        int year = scanner.nextInt();

        myBook.setDetails(title, author, year);

        myBook.displayDetails();
        
        System.out.println("You just added: " + myBook.getTitle());
        
        scanner.close();
    }
}
