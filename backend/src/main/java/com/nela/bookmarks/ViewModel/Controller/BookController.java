package com.nela.bookmarks.viewmodel.controller;

import java.lang.System.Logger;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The controller class that handles the http
 * protocols in handling any action in regards to
 * a user's bookmarks
*/
@RestController
@RequestMapping("/{userid}/bookmarks")
public class BookController {
    private static final Logger LOG = Logger.getLogger(BookController.class.getName());
    private UserFileDAO userDAO;

    /**
     * Constructor
     * 
     * Creates the {@linkplain BookController} by dependency injection 
     * of a {@link UserFileDAO}
     * 
     * @param userDAO a DAO file that will aid the controller in delegating tasks in regards
     * to {@link User} objects
     */
    public BookController(UserFileDAO userDAO) {
        this.userDAO = userDAO;
    }

    /**
     * Gets and returns an array of all {@linkplain Bookmark} associated with the current
     * {@link User}
     *  
     * @return and array of {@link Bookmark}
     */
    @GetMapping("")
    public ResponseEntity<BookmarkNode[]> getBookmarks(@RequestParam int userid) {
        LOG.info("GET /bookmarks");
       //GET ALL 
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<BookmarkNode> getBookmark(@RequestParam int userid, @RequestParam long id) {
        LOG.info("GET /bookmarks/" + id);
        //GET ONE
    }

    @PostMapping("")
    public ResponseEntity<Boolean> createBookmark(@RequestParam int userid, @RequestBody Bookmark bookmark) {
        LOG.info("POST /bookmarks/" + bookmark);
        //CREATE
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteBookmark(@RequestParam int userid, @RequestParam long id) {
        LOG.info("DELETE /bookmarks/" + id);
        //DELETE
    }

    @PutMapping("")
    public ResponseEntity<Boolean> updateBookmark(@RequestParam int userid, @RequestBody Bookmark bookmark) {
        LOG.info("PUT /bookmarks/" + bookmark);
        //UPDATE
    }


}
