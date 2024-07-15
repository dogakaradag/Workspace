/**
 * Database
 */
public class Database {

    // Singleton instance
    private static Database instance = null;

    // Private constructor
    private Database() {
        // Initialize database
    }

    // Get instance
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
}