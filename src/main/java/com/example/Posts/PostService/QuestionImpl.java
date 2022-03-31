package com.example.Posts.PostService;

import com.example.Posts.Dto.QuestionDto;
import com.example.Posts.Entity.QuestionEntity;
import com.example.Posts.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionImpl implements Question{

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public void createQuestion(Integer userId,String question,String categoryName){
        boolean flag=false;
        if(question.length()>100){
            question=question.substring(0,100);
        }
        List<QuestionEntity>list=questionRepository.findByUserId(userId);
        for(QuestionEntity q:list){
            if(q.getQuestion().equals(question)){
                flag=true;
                break;
            }
        }
        if(flag==false) {
            QuestionEntity entity = new QuestionEntity(userId, question, categoryName,"");
            questionRepository.save(entity);
        }
    }

    @Override
    public QuestionDto getQuestion(String questionId){
        QuestionEntity questionEntity= questionRepository.findById(questionId).get();
        return new QuestionDto(questionEntity.getQuestionId(),questionEntity.getUserId(),questionEntity.getQuestion(),questionEntity.getCatogoryName());
    }

    @Override
    public List<QuestionDto> getAllQuestions(Integer userId){

        List<QuestionEntity> list= questionRepository.findByUserId(userId);
        List<QuestionDto>listDto=new ArrayList<>();
        for(QuestionEntity q:list){
            listDto.add(new QuestionDto(q.getQuestionId(),q.getUserId(),q.getQuestion(),q.getCatogoryName()));
        }
        return listDto;
    }
    @Override
   public List<QuestionDto> getQuestionByCategory(String category){
        List<QuestionEntity>list=questionRepository.findByCategoryName(category);
        List<QuestionDto>listDto=new ArrayList<>();
        for(QuestionEntity q:list){
            listDto.add(new QuestionDto(q.getQuestionId(),q.getUserId(),q.getQuestion(),q.getCatogoryName()));
        }
        return listDto;
    }

}
