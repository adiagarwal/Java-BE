package com.first_app.first_app.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.first_app.first_app.models.PostEntity;

@Repository
public interface PostRepository extends MongoRepository<PostEntity, String>{
}
