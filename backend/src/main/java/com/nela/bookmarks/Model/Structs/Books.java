package com.nela.bookmarks.Model.Structs;

public class Books {
    
    private String title;
    private int totalPages;
    private int currPages;
    private int id;

    /**
     * constructor for creating a book object
     * Gets a string passed in to identify the book
     * Initializes the total and current pages to 0.
     * 
     * @param title the title of the book
     */
    public Books(String title, int id) {
        this.title = title;
        this.totalPages = 0;
        this.currPages = 0;
        this.id = id;
    }

    /**
     * sets the total pages of the book
     * 
     * @param newValue the value to set the total pages to
     */
    public void setTotalPages(int newValue) {
        this.totalPages = newValue;
    }

    /**
     * sets the current page of the book
     * 
     * @param newValue the value to set the current page to
     */
    public void setCurrPages(int newValue) {
        this.currPages = newValue;
    }

    /**
     * incrementer for the current page
     */
    public void addCurrPages() {
        this.currPages++;
    }

    /**
     * setter for the title
     * 
     * @param newTitle the new title
     */
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    /**
     * getter for the title
     * 
     * @return a string representing the title of the book
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * getter for the total pages
     * 
     * @return an int representing the total pages of the book
     */
    public int getTotalPages() {
        return this.totalPages;
    }

    /**
     * getter for the current pages
     * 
     * @return an int representing the current pages of the book
     */
    public int getCurrPages() {
        return this.currPages;
    }
    
    /**
     * getter for the id
     * 
     * @return an int representing this book's id
     */
    public int getId() {
        return this.id;
    }

}
