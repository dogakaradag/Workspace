import java.util.ArrayList;
import java.util.List;

public class LibraryManager implements LibraryOperations {
    private List<MediaItem> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(MediaItem item) {
        items.add(item);
        System.out.println("Item added: " + item.getTitle());
    }

    @Override
    public boolean removeItem(String title) {
        for (MediaItem item : items) {
            if (item.getTitle().equals(title)) {
                items.remove(item);
                System.out.println("Item removed: " + title);
                return true;
            }
        }
        System.out.println("Item not found: " + title);
        return false;
    }


    @Override
    public MediaItem searchItem(String title) {
        for (MediaItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Item found: " + title);
                return item;
            }
        }
        System.out.println("Item not found: " + title);
        return null;
    }

    @Override
    public void updateItem(String title, MediaItem newItem) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getTitle().equals(title)) {
                items.set(i, newItem);
                System.out.println("Item updated: " + title);
                return;
            }
        }
        System.out.println("Item not found: " + title);

    }

    @Override
    public void displayAllItems() {
        for(MediaItem item : items){
            System.out.println(item);
        }
    }
}
