package com.ikeapp.entity.domain;



import javax.persistence.*;

/**
 * created by wei.shen
 * 2018/4/19
 */
@Entity
@Table(name = "t_user")
public class UserDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
