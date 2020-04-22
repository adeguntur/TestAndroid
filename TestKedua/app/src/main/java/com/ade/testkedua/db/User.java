package com.ade.testkedua.db;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("AccessToken")
    private String AccessToken;

    public User(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    public String getAccessToken() {
        return AccessToken;
    }
}
