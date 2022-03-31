package com.example.Posts.PostService;

import com.example.Posts.Dto.AnswerDto;
import com.example.Posts.Entity.AnswerEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface Answer {
    void createAnswer(String questionId,String answer,int userId,int upvote,int downvote,String []comments);
    void upvote(String answerId);
    void downvote(String answerId);
    AnswerDto getAnswer(String answerId);
    List<AnswerEntity> getAllAnswer(int userId);

}
