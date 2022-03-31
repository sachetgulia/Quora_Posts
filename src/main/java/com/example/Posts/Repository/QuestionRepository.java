package com.example.Posts.Repository;
import com.example.Posts.Entity.QuestionEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends MongoRepository<QuestionEntity,String> {

   List<QuestionEntity> findByUserId(Integer userId);
   List<QuestionEntity> findByCategoryName(String category);
}
