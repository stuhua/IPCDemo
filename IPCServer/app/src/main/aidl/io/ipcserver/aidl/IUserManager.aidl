// IUserManager.aidl
package io.ipcserver.aidl;

import io.ipcserver.aidl.User;

// Declare any non-default types here with import statements

interface IUserManager {
void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
                                   double aDouble, String aString);
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    List<UserBean> getUserList();
    void addUser(in UserBean user);
}
