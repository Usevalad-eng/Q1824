package classTasks.lessonSevenLibrarySystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibrarySystem {

    Map<String,Book> bookInventory = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    private void addBook(){
        System.out.println("Enter title of the book");
        String title = scanner.nextLine();
        System.out.println("Enter author of the book");
        String author = scanner.nextLine();
        System.out.println("Enter quantity of copies");
        Integer copies = Integer.parseInt(scanner.nextLine());  //int copies = ...

        Book book = new Book(title,author,copies);
        bookInventory.put(title.toLowerCase(),book);
        System.out.println("Book is added");
    }

    public void removeBook(){
        System.out.println("Enter title of the book to remove");
        String title = scanner.nextLine().toLowerCase();
        if (bookInventory.remove(title) != null){
            System.out.println("Book is removed");
        }else {
            System.out.println("Book is not found");
        }
    }

    public void updateCopies(){
        System.out.println("Enter title of the book");
        String title = scanner.nextLine().toLowerCase();
        Book book = bookInventory.get(title);
        if (book != null){
            System.out.println("Enter new quantity");
            Integer newCopies = Integer.parseInt(scanner.nextLine());  //int newCopies = ...
            book.copies = newCopies;
            System.out.println("Quantity is updated");
        }else {
            System.out.println("Book is not found");
        }
    }

    public void searchBook(){
        System.out.println("Enter title of the book");
        String title = scanner.nextLine().toLowerCase();
        Book book = bookInventory.get(title);
        if (book != null){
            System.out.println("Book is found " + book);
        }else {
            System.out.println("Book is not found");
        }
    }

    public void listBookByAuthor(){
        System.out.println("Enter author of the book");
        String author = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (Book book : bookInventory.values()){
            if (book.author.equalsIgnoreCase(author)){
                System.out.println(book);
                found = true;
            }
        }if (!found){
            System.out.println("Book is not found");
        }
    }

    public void listAllBook(){
        if (bookInventory.isEmpty()){
            System.out.println("Library is empty");
        }else {
            for (Book book : bookInventory.values()){
                System.out.println(book);
            }
        }
    }

    public void run(){
        while (true){
            System.out.println("\n----Menu----");
            System.out.println("1 Add book");
            System.out.println("2 Remove book");
            System.out.println("3 Update quantity");
            System.out.println("4 Search book");
            System.out.println("5 List of all authors");
            System.out.println("6 List of all books");
            System.out.println("0 Exit");

            Integer choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    updateCopies();
                    break;
                case 4:
                    searchBook();
                    break;
                case 5:
                    listBookByAuthor();
                    break;
                case 6:
                    listAllBook();
                    break;
                case 0:
                    System.out.println("Program is finished");
                    return;
                default:
                    System.out.println("Not right choice");

            }
        }
    }

}
