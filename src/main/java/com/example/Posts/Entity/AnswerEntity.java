package com.example.Posts.Entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


@Entity
@Document(collection = "answers")
public class AnswerEntity {


    //    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id",nullable = false)
    @Id
    private String id;

    private String questionId;

    private int userId;
    private String answer;
    private int upvote;
    private int downvote;
    private String[] comments;
    private String date;

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUpvote(int upvote) {
        this.upvote = upvote;
    }

    public void setDownvote(int downvote) {
        this.downvote = downvote;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getUpvote() {
        return upvote;
    }

    public void setUpvote(Integer upvote) {
        this.upvote = upvote;
    }

    public Integer getDownvote() {
        return downvote;
    }

    public void setDownvote(Integer downvote) {
        this.downvote = downvote;
    }

    public String[] getComments() {
        return comments;
    }

    public void setComments(String[] comments) {
        this.comments = comments;
    }

    public AnswerEntity( String questionId, int userId, String answer, int upvote, int downvote, String[] comments) {
        this.questionId = questionId;
        this.userId = userId;
        this.answer = answer;
        this.upvote = upvote;
        this.downvote = downvote;
        this.comments = comments;
    }

    public AnswerEntity(String questionId, int userId, String answer, int upvote, int downvote, String[] comments, String date) {
        this.questionId = questionId;
        this.userId = userId;
        this.answer = answer;
        this.upvote = upvote;
        this.downvote = downvote;
        this.comments = comments;
        SimpleDateFormat formatDate = new SimpleDateFormat(
                "dd/MM/yyyy  hh:mm:ss  z");
        Date d = new Date();
        formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
        this.date =formatDate.format(d);
//        this.date=date;

    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public AnswerEntity() {

    }


}
