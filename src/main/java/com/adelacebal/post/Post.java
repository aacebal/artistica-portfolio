package com.adelacebal.post;

import com.adelacebal.core.BaseEntity;
import com.adelacebal.user.User;

import javax.persistence.*;

@Entity
public class Post extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String description;

    @ManyToOne
    private User creator;

    //---------------------------------------------------------------------------------------------------------------

    protected Post() {
        super();
    }

    public Post(String title, String description) {
        this();
        this.title = title;
        this.description = description;
    }

    //---------------------------------------------------------------------------------------------------------------

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }
}
