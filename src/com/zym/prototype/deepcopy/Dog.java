package com.zym.prototype.deepcopy;

import java.io.Serializable;

/**
 * @ClassName : Dog
 * @Author : Wang Liang
 * @Date: 2021-10-26 14:25
 * @Description :
 */
public class Dog implements Serializable {

    private String color;

    private String hobby;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
