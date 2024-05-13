package com.first_app.first_app.services;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.first_app.first_app.constants.Post;
import com.first_app.first_app.constants.PostsService;
import com.first_app.first_app.models.PostEntity;
import com.first_app.first_app.repositories.PostRepository;


@Service
public class PostServiceImp implements PostsService{

    List<Post> posts = new ArrayList<>();

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPosts() {
        List<PostEntity> postsEntity = postRepository.findAll();
        for(PostEntity Post : postsEntity){
            Post post = new Post();
            post.setProfile(Post.getProfile());
            post.setDesc(Post.getDesc());
            post.setExp(Post.getExp());
            post.setTech(Post.getTech());
            posts.add(post);
        }
        return posts;
    }

    @Override
    public Post createNewPost(Post post) {
        PostEntity postEntity = new PostEntity();
        BeanUtils.copyProperties(post, postEntity);
        postRepository.save(postEntity);
        return post;
    }    
}
