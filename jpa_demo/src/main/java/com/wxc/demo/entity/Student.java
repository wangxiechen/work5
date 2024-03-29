package com.wxc.demo.entity;



import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Table(name = "student")
@Entity
@Data
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键自增
    @Id
    private Integer id;
    private String name;
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
