package com.example.hp.baseadapter;

/**
 * Created by hp on 16/02/2017.
 */

public class Users {
    private String name;
    private String tel;

    public String getName() {
        return name;
    }

    public Users(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
