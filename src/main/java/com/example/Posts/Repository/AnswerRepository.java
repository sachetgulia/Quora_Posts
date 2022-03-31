package com.example.Posts.Repository;
import com.example.Posts.Entity.AnswerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AnswerRepository extends MongoRepository<AnswerEntity,String> {

    List<AnswerEntity> findByUserIdAndQuestionId(int userId,String questionId);
}
