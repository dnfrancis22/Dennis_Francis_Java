package com.company.models;

import java.util.Objects;

public class DefinitionModel {
    // Instance Variables
    private int id;
    private String word;
    private String definition;
    // Default Constructor
    public DefinitionModel() {
    }
    // Constructor
    public DefinitionModel(int id, String word, String definition) {
        this.id = id;
        this.word = word;
        this.definition = definition;
    }
    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DefinitionModel that = (DefinitionModel) o;
        return id == that.id && Objects.equals(word, that.word) && Objects.equals(definition, that.definition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, word, definition);
    }

    @Override
    public String toString() {
        return "WordsModel{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                '}';
    }
}
