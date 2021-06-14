package com.company.models;

import java.util.Objects;

public class AnswerModel {
    // Instance Variables
    private int id;
    private String question;
    private String answer;
    // Default Constructor
    public AnswerModel() {
    }
    // Constructor
    public AnswerModel(int id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }
    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnswerModel that = (AnswerModel) o;
        return id == that.id && Objects.equals(question, that.question) && Objects.equals(answer, that.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, answer);
    }

    @Override
    public String toString() {
        return "Magic8BallModel{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
