package io.ipcdemo.mvp.model.bean;

import java.io.Serializable;

/**
 * Created by liuliuh on 2017/4/28.
 */

public class User implements Serializable {
    private String mName;
    private int mAge;
    private String mSex;
    private static final long serialVersionUID = 518789897897897L;

    public String getmName() {
        return mName;
    }

    public int getmAge() {
        return mAge;
    }

    public String getmSex() {
        return mSex;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    public void setmSex(String mSex) {
        this.mSex = mSex;
    }

    public User(String mName, int mAge, String mSex) {
        this.mName = mName;
        this.mAge = mAge;
        this.mSex = mSex;
    }

}
