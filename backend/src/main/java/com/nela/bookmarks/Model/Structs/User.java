package com.nela.bookmarks.Model.Structs;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class User {

    private int id;
    private String username;
    private String password;
    private TreeMap<Long, Series> bookmarks;

    /**
     * constructor of creating a {@linkplain User}
     * 
     * @param username a String representing the username
     * @param password a String representing the password
     * @param id       an int representing the id associated with this user
     */
    public User(String username, String password, int id) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.bookmarks = new TreeMap<>();
    }

    /**
     * checks to see if an inputted password matches with the current password
     * 
     * @param input the input a user inputs whilst logging in
     * 
     * @return a boolean: true if the password matches, false otherwise
     */
    public boolean checkPassword(String input) {
        return this.password.equals(input);
    }

    /**
     * returns the bookmarks associated with the user
     * 
     * @return an array of bookmarks
     */
    public Series[] getBookmarks() {
        Series[] result;
        ArrayList<Series> temp = new ArrayList<>(); 
        for (Series i : this.bookmarks.values()) {
            temp.add(i);
        }

        result = new Series[temp.size()];
        temp.toArray(result);
        return result;
        
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
