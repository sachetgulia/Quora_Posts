package com.example.Posts.PostService;

import com.example.Posts.Dto.QuestionDto;
import com.example.Posts.Entity.QuestionEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface Question {
    void createQuestion(Integer userId,String question,String categoryName);
    List<QuestionDto> getAllQuestions(Integer userId);
    List<QuestionDto> getQuestionByCategory(String category);
    QuestionDto getQuestion(String qid);
}

