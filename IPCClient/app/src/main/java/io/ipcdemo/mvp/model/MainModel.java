package io.ipcdemo.mvp.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import io.ipcdemo.mvp.model.bean.User;

/**
 * Created by liulianhua on 2017/4/28.
 */

public class MainModel {
    private void readUser() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("cache.txt"));
            User newUser = (User) in.readObject();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void wirteUser(User user) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cache.txt"));
            out.writeObject(user);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
