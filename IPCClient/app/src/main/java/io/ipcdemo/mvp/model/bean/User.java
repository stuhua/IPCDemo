package io.ipcdemo.mvp.model.bean;

import java.io.Serializable;

/**
 * Created by liuliuh on 2017/4/28.
 */

public class User implements Serializable {
    private String name;
    private int age;
    private String sex;
    private static final long serialVersionUID = 518789897897897L;

    public User(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
