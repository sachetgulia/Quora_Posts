package com.example.Posts.Dto;

public class QuestionDto {
    private String questionId;
    private Integer userId;
    private String question;
    private String catogoryName;

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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCatogoryName() {
        return catogoryName;
    }

    public void setCatogoryName(String catogoryName) {
        this.catogoryName = catogoryName;
    }

    public QuestionDto(String questionId, Integer userId, String question, String catogoryName) {
        this.questionId = questionId;
        this.userId = userId;
        this.question = question;
        this.catogoryName = catogoryName;
    }
}
