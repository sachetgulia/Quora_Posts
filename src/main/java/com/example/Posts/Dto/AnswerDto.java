package com.example.Posts.Dto;

import java.util.Date;

public class AnswerDto {

    private String questionId;
    private int userId;
    private String answer;
    private int upvote;
    private int downvote;
    private String[] comments;
    private Date date;

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getUpvote() {
        return upvote;
    }

    public void setUpvote(int upvote) {
        this.upvote = upvote;
    }

    public int getDownvote() {
        return downvote;
    }

    public void setDownvote(int downvote) {
        this.downvote = downvote;
    }

    public String[] getComments() {
        return comments;
    }

    public void setComments(String[] comments) {
        this.comments = comments;
    }

    public AnswerDto(String questionId, int userId, String answer, int upvote, int downvote, String[] comments) {
        this.questionId = questionId;
        this.userId = userId;
        this.answer = answer;
        this.upvote = upvote;
        this.downvote = downvote;
        this.comments = comments;
    }
}
