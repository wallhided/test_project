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
    private String fulltext;

    @Column
    private int categoryId;

    @Column
    private String source;


    public News(){
    }

    public News(String title , Boolean isDeleted, String fulltext, String source , int categoryId) {
        this.title = title;
        this.fulltext = fulltext;
        this.source = source;
        this.isDeleted = isDeleted;
        this.categoryId = categoryId;

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

    public String getFulltext() {
        return fulltext;
    }

    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
