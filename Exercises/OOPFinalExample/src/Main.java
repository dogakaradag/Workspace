import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static LibraryManager libraryManager = new LibraryManager();

    public static void main(String[] args) {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> addItem();
                case 2 -> removeItem();
                case 3 -> searchItem();
                case 4 -> updateItem();
                case 5 -> displayAllItems();
                case 6 -> checkoutItem();
                case 7 -> returnItem();
                case 0 -> System.out.println("Exiting...");
                default ->System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0);
    }

    private static void addItem() {
        System.out.println("\nChoose item type:");
        System.out.println("1. Book");
        System.out.println("2. Magazine");
        System.out.println("3. DVD");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter copies available: ");
        int copies = scanner.nextInt();
        scanner.nextLine();

        MediaItem item = null;
        switch (choice) {
            case 1:
                System.out.print("Enter author: ");
                String author = scanner.nextLine();
                item = new Book(title, year, copies, author);
                break;
            case 2:
                System.out.print("Enter issue number: ");
                int issueNumber = scanner.nextInt();
                scanner.nextLine();
                item = new Magazine(title, year, copies, issueNumber);
                break;
            case 3:
                System.out.print("Enter director: ");
                String director = scanner.nextLine();
                System.out.print("Enter genre: ");
                String genre = scanner.nextLine();
                item = new DVD(title, year, copies, director, genre);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        libraryManager.addItem(item);
    }

    private static void removeItem() {
        System.out.print("Enter the title of the item to remove: ");
        String title = scanner.nextLine();
        boolean removed = libraryManager.removeItem(title);
        if (removed) {
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    private static void searchItem() {
        System.out.print("Enter the title to search for: ");
        String title = scanner.nextLine();
        MediaItem item = libraryManager.searchItem(title);
        if (item != null) {
            System.out.println("Found item: " + item);
        } else {
            System.out.println("Item not found.");
        }
    }

    private static void updateItem() {
        System.out.print("Enter the title of the item to update: ");
        String title = scanner.nextLine();

        System.out.println("\nChoose item type:");
        System.out.println("1. Book");
        System.out.println("2. Magazine");
        System.out.println("3. DVD");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new title: ");
        String newTitle = scanner.nextLine();
        System.out.print("Enter new year: ");
        int newYear = scanner.nextInt();
        System.out.print("Enter new copies available: ");
        int newCopies = scanner.nextInt();
        scanner.nextLine(); // consume newline

        MediaItem newItem = null;
        switch (choice) {
            case 1:
                System.out.print("Enter new author: ");
                String newAuthor = scanner.nextLine();
                newItem = new Book(newTitle, newYear, newCopies, newAuthor);
                break;
            case 2:
                System.out.print("Enter new issue number: ");
                int newIssueNumber = scanner.nextInt();
                scanner.nextLine();
                newItem = new Magazine(newTitle, newYear, newCopies, newIssueNumber);
                break;
            case 3:
                System.out.print("Enter new director: ");
                String newDirector = scanner.nextLine();
                System.out.print("Enter new genre: ");
                String newGenre = scanner.nextLine();
                newItem = new DVD(newTitle, newYear, newCopies, newDirector, newGenre);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        libraryManager.updateItem(title, newItem);
    }

    private static void displayAllItems() {
        libraryManager.displayAllItems();
    }

    private static void checkoutItem() {
        System.out.print("Enter the title of the item to checkout: ");
        String title = scanner.nextLine();
        MediaItem item = libraryManager.searchItem(title);
        if (item != null) {
            item.checkout();
        } else {
            System.out.println("Item not available.");
        }
    }

    private static void returnItem() {
        System.out.print("Enter the title of the item to return: ");
        String title = scanner.nextLine();
        MediaItem item = libraryManager.searchItem(title);
        if (item != null) {
            item.returnItem();
        } else {
            System.out.println("Item not found.");
        }
    }

    private static void displayMenu() {
        System.out.println("\nLibrary Management System");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. Search Item");
        System.out.println("4. Update Item");
        System.out.println("5. Display All Items");
        System.out.println("6. Checkout Item");
        System.out.println("7. Return Item");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }
}
