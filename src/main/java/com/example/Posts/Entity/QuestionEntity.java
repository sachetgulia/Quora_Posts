package com.example.Posts.Entity;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Entity
@Document(collection = "posts")
public class QuestionEntity {


    @MongoId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private String questionId;
    private Integer userId;

    private String question;

    private String categoryName;
    private String date;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public QuestionEntity(Integer userId, String question, String categoryName, String date) {
        this.userId = userId;
        this.question = question;
        this.categoryName = categoryName;
        SimpleDateFormat formatDate = new SimpleDateFormat(
                "dd/MM/yyyy  hh:mm:ss  z");
        Date d = new Date();
        formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
        this.date =formatDate.format(d);
//        this.date = date;
    }

    public Integer getUserId() {
        return userId;
    }
    public QuestionEntity(){}

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public QuestionEntity(Integer userId, String question, String catogoryName) {
        this.userId = userId;
        this.question = question;
        this.categoryName = catogoryName;
    }



    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCatogoryName() {
        return categoryName;
    }

    public void setCatogoryName(String catogoryName) {
        this.categoryName = catogoryName;
    }

}

