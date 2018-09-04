package com.miroshnik.model;

import javax.persistence.*;

@Entity
@Table(name = "uploadedNews")

public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column
    private String title;

    @Column
    private String fullText;

    @Column
    private String source;


    public News(){
    }

    public News(String title ,Boolean isDeleted,  String fullText, String source) {
        this.title = title;
        this.isDeleted = isDeleted;
        this.fullText = fullText;
        this.source = source;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
