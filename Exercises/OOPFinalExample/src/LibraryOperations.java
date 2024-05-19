public interface LibraryOperations {
    public void addItem(MediaItem item);
    boolean removeItem(String title);
    public MediaItem searchItem(String title);

    public void updateItem(String title, MediaItem newItem);

    public void displayAllItems();
}
