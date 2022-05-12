package com.nela.bookmarks.Model.Structs;

import java.util.ArrayList;


public class Series {

    private String title;
    private ArrayList<Books> books;

    public Series(String title) {
        this.title = title;
        this.books = new ArrayList<>();
    }


}
