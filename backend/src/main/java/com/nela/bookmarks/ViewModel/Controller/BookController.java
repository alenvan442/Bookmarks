package com.nela.bookmarks.ViewModel.Controller;

import java.util.logging.Logger;

import com.nela.bookmarks.Model.Persistence.UserFileDAO;
import com.nela.bookmarks.Model.Structs.Series;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
    public ResponseEntity<Series[]> getBookmarks(@RequestParam int userid) {
        LOG.info("GET /bookmarks");
        //GET ALL 
        return null;
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Series> getBookmark(@RequestParam int userid, @RequestParam long id) {
        LOG.info("GET /bookmarks/" + id);
        //GET ONE
        return null;
    }

    @PostMapping("")
    public ResponseEntity<Boolean> createBookmark(@RequestParam int userid, @RequestBody Series bookmark) {
        LOG.info("POST /bookmarks/" + bookmark);
        //CREATE
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteBookmark(@RequestParam int userid, @RequestParam long id) {
        LOG.info("DELETE /bookmarks/" + id);
        //DELETE
        return null;
    }

    @PutMapping("")
    public ResponseEntity<Boolean> updateBookmark(@RequestParam int userid, @RequestBody Series bookmark) {
        LOG.info("PUT /bookmarks/" + bookmark);
        //UPDATE
        return null;
    }


}
