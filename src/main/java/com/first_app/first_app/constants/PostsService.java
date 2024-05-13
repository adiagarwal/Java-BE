package com.first_app.first_app.constants;
import java.util.List;


public interface PostsService {
    List<Post> getAllPosts();
    Post createNewPost(Post post);
}
