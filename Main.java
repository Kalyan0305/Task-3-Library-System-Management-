import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding some default books and users
        library.addBook(new Book("Java Basics", "John Doe"));
        library.addBook(new Book("Python 101", "Jane Smith"));
        library.addUser(new User(1, "Alice"));
        library.addUser(new User(2, "Bob"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Display Books");
            System.out.println("2. Display Users");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    library.displayUsers();
                    break;
                case 3:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = scanner.nextLine();
                    library.issueBook(issueTitle);
                    break;
                case 4:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 5:
                    System.out.println("Exiting Library System.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        scanner.close();
    }
}
