package io.ipcdemo.mvp.model.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by liulh on 2017/4/28 13:52 星期五
 */

public class UserParcel implements Parcelable {
    private String name;
    private String sex;
    private int age;

    public UserParcel(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    /**
     * 反序列化
     *
     * @param in
     * @return
     */
    protected UserParcel(Parcel in) {
        name = in.readString();
        sex = in.readString();
        age = in.readInt();
    }

    public static final Creator<UserParcel> CREATOR = new Creator<UserParcel>() {

        @Override
        public UserParcel createFromParcel(Parcel in) {

            return new UserParcel(in);
        }

        @Override
        public UserParcel[] newArray(int size) {
            return new UserParcel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * 序列化
     *
     * @param parcel
     * @param i
     */
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(sex);
        parcel.writeInt(age);
    }
}
