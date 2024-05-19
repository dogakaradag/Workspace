import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<LibraryItem> items;

    public LibraryManager() {
        items = new ArrayList<LibraryItem>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Item added successfully: " + item.getTitle());
    }

    public void removeItem(int id) {
        for (LibraryItem item : items) {
            if (item.getId() == id) {
                items.remove(item);
                System.out.println("Item removed successfully: " + item.getTitle());
                return;
            }
        }
        System.out.println("Item not found with id: " + id);
    }
    
    // The beautiful mind
    // The imitation game
    
    public LibraryItem getItem(int id) {
        for (LibraryItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        System.out.println("No item found. ");
        return null;
    }

    public void displayAllItems() {
        for (LibraryItem item : items) {
            item.displayInfo();
        }
        System.out.println();
    }
}
