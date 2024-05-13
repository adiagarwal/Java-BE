package com.first_app.first_app.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.first_app.first_app.constants.Post;
import com.first_app.first_app.constants.PostsService;



@RestController
@RequestMapping("/posts")
public class Postcontroller {

    @Autowired 
    PostsService postsService;

    @GetMapping("all")
    public ResponseEntity<List<Post>> getAllPosts(){
        try{
            return ResponseEntity.ok(postsService.getAllPosts());
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PostMapping("add")
    public ResponseEntity<Post> createNewPost(@RequestBody Post Post){
        try{
            return ResponseEntity.ok(postsService.createNewPost(Post));
        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
