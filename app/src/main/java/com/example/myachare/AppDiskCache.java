package com.example.myachare;


/**
 * Created by win10 on 2017/5/23.
 */

public class AppDiskCache {
    /**
     * 用户的Login
     */
    public static void setLogin(LoginData data) {
        App.aCacheAPP.put(Flag.CACHE_LOGIN_DATA, data);
    }

    public static LoginData getLogin() {
        Object obj = App.aCacheAPP.getAsObject(Flag.CACHE_LOGIN_DATA);
        if (obj == null) {
            return null;
        }
        return (LoginData) obj;
    }

    public static void clearUser() {
        App.aCacheAPP.remove(Flag.CACHE_LOGIN_DATA);
    }
}
