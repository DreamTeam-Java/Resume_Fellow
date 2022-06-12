package com.resume.fellow.model;


import javax.persistence.*;

@Entity
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String text;

    @ManyToOne
    SiteUser postsOfUser;

    public Posts(){}
    public Posts(String text){
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public SiteUser getPostsOfUser() {
        return postsOfUser;
    }

    public String getText() {
        return text;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPostsOfUser(SiteUser postsOfUser) {
        this.postsOfUser = postsOfUser;
    }

    public void setText(String text) {
        this.text = text;
    }

}
