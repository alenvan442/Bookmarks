package com.nela.bookmarks.Model.Structs;

import java.util.ArrayList;
import java.util.TreeMap;


public class Series {

    private String title;
    private TreeMap<Integer, Books> books;
    private int id;

    /**
     * constructor for the series class,
     * this object can be seen as an overarching bookmark 
     * that can categorize either a series of books,
     * or one book in particular
     * 
     * When this series or bookmark, is created
     * we initialize an empty book, and add it to the series with the id of 0
     * 
     * @param title the title of the series
     * @param id an int to be saved to become this series' id
     */
    public Series(String title, int id) {
        this.title = title;
        this.books = new TreeMap<>();
        this.id = id;
        
        this.books.put(0, new Books(title, 0));
    }

    /**
     * getter for the id of this object
     * 
     * @return an int representing the id of this object
     */
    public int getId() {
        return this.id;
    }

    /**
     * setter for the title of this object
     * if the new title is of length 0, then
     * the title will not change
     * 
     * @param newValue the new title
     */
    public void setTitle(String newValue) {
        if(newValue.length() > 0) {
            this.title = newValue;
        }
    }

    /**
     * getter for the title of this object
     * 
     * @return a string representing the title of this series
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * a getter for the list of books in this series
     * 
     * @return an array of books
     */
    public Books[] getBooks() {
        ArrayList<Books> temp = new ArrayList<>();
        for (Books i : this.books.values()) {
            temp.add(i);
        }

        Books[] result = new Books[temp.size()];
        temp.toArray(result);

        return result;
    }

    /**
     * add a new book to this series
     * 
     * @param book the book to be added
     */
    public void addBook(Books book) {
        this.books.put(book.getId(), book);
    }

    /**
     * delete a book from this series
     * 
     * @param id the id of the book to search for and delete
     */
    public void deleteBook(int id) {
        this.books.remove(id);
    }


}
