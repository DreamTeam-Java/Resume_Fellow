package com.resume.fellow.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class SiteUser {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) long id;
    String username;
    String password;

    @OneToMany(mappedBy = "postsOfUser", cascade = CascadeType.ALL)
    @OrderBy("text")
    List<Posts> postsList;

    public SiteUser(){}
    public SiteUser(String username, String password)
    {
        this.username = username;
        this.password = password;
    }


    public long getId() {
        return id;
    }

    public List<Posts> getPostsList() {
        return postsList;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPostsList(List<Posts> postsList) {
        this.postsList = postsList;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
