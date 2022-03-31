package com.example.Posts.Controller;

import com.example.Posts.Dto.AnswerDto;
import com.example.Posts.Dto.QuestionDto;
import com.example.Posts.Entity.AnswerEntity;
import com.example.Posts.Entity.QuestionEntity;
import com.example.Posts.PostService.Answer;
import com.example.Posts.PostService.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    Question question;

    @Autowired
    Answer answer;

    @GetMapping(path="/question")
    public QuestionDto getQuestion(@RequestParam  String questionId){
        return question.getQuestion(questionId);
    }

    @GetMapping(path="/allquestions")
    public List<QuestionDto> getAllQuestions(@RequestParam  Integer userId){
        return question.getAllQuestions(userId);
    }

    @PostMapping(path="/addquestion")
    public void addQuestion(@RequestParam  Integer userId,@RequestParam  String ques,@RequestParam  String category){
        question.createQuestion(userId,ques,category);
    }
    @PostMapping(path="/upvote")
    public void upVote(@RequestParam  String answerId){
        answer.upvote(answerId);
    }
    @PostMapping(path="/downvote")
    public void downVote(@RequestParam  String answerId){
        answer.downvote(answerId);
    }
    @GetMapping(path="/answer")
    public AnswerDto getAnswer(@RequestParam  String answerId){
        return answer.getAnswer(answerId);
    }
    @PostMapping(path="/addanswer")
    public void addAnswer(@RequestParam  String questionId,@RequestParam  String ans,@RequestParam  int userId,@RequestParam  int upvote,@RequestParam  int downvote,@RequestParam  String[]comments){
        answer.createAnswer(questionId,ans,userId,upvote,downvote,comments);
    }
    @GetMapping(path="/allanswers")
    public List<AnswerEntity> getAnswer(@RequestParam  int userId){
        return answer.getAllAnswer(userId);
    }

    @GetMapping(path="/questionbycategory")
    public List<QuestionDto> getAllQuestionsByCategory(@RequestParam  String category){
        return question.getQuestionByCategory(category);
    }
}
