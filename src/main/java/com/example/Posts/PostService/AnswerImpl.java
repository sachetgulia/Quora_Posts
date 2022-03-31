package com.example.Posts.PostService;

import com.example.Posts.Dto.AnswerDto;
import com.example.Posts.Entity.AnswerEntity;
import com.example.Posts.Repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AnswerImpl implements Answer{

    @Autowired
    AnswerRepository answerRepository;

    @Override
    public void createAnswer(String questionId,String answer,int userId,int upvote,int downvote,String []comments){
        List<AnswerEntity>list=answerRepository.findByUserIdAndQuestionId(userId,questionId);
        if(list.size()==0) {
            answerRepository.save(new AnswerEntity(questionId, userId, answer,upvote,downvote,comments,""));
        }
    }

    @Override
    public void upvote(String answerId){
        Optional<AnswerEntity>list=answerRepository.findById(answerId);
        list.get().setUpvote(list.get().getUpvote()+1);
        answerRepository.save(list.get());
    }
    @Override
    public void downvote(String answerId){
        Optional<AnswerEntity>list=answerRepository.findById(answerId);
        list.get().setDownvote(list.get().getDownvote()-1);
        answerRepository.save(list.get());
    }
    @Override
    public AnswerDto getAnswer(String answerId){

        AnswerEntity temp= answerRepository.findById(answerId).get();
        return new AnswerDto(temp.getQuestionId(),temp.getUserId(),temp.getAnswer(),temp.getUpvote(),temp.getDownvote(),temp.getComments());
    }
    @Override
    public List<AnswerEntity> getAllAnswer(int userId){
//        return answerRepository.findByUserId(userId);

        return new ArrayList<>();
    }

}
