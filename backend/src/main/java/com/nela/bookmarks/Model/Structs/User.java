import java.util.Map;
import java.util.TreeMap;

public class User {
 
    private int id; 
    private string username;
    private string password;
    private TreeMap<Long, Bookmark> bookmarks;

    /**
     * constructor of creating a {@linkplain User}
     * 
     * @param username a string representing the username
     * @param password a string representing the password
     * @param id an int representing the id associated with this user
     */
    public User(string username, string password, int id) {
        this.username = username;
        this.password = password;
        this.id = id;
    }

    /**
     * checks to see if an inputted password matches with the current password
     * 
     * @param input the input a user inputs whilst logging in
     * 
     * @return a boolean: true if the password matches, false otherwise
     */
    public boolean checkPassword(string input) {
        return this.password.equals(input);
    }

    /**
     * returns the bookmarks associated with the user
     * 
     * @return an array of bookmarks
     */
    public Bookmark[] getBookmarks() {
        return this.bookmarks;
    }

    /**
     * returns the user's id
     * 
     * @return the id of the user
     */
    public int getId() {
        return this.id;
    }

}
