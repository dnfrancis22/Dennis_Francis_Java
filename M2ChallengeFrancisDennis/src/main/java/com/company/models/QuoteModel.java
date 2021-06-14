package com.company.models;

import java.util.Objects;

public class QuoteModel {
    // Instance Variables
    private int id;
    private String author;
    private String quote;
    // Default Constructor
    public QuoteModel() {
    }
    // Constructor
    public QuoteModel(int id, String author, String quote) {
        this.id = id;
        this.author = author;
        this.quote = quote;
    }
    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuoteModel that = (QuoteModel) o;
        return id == that.id && Objects.equals(author, that.author) && Objects.equals(quote, that.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, quote);
    }

    @Override
    public String toString() {
        return "QuotesModel{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", quote='" + quote + '\'' +
                '}';
    }
}
