package com.zym.builder;

/**
 * @ClassName : House
 * @Author : Wang Liang
 * @Date: 2021-10-26 15:56
 * @Description : 房子(产品)
 */
public class House {

    private String basic;

    private String wall;

    private String roofed;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    @Override
    public String toString() {
        return "House{" +
                "basic='" + basic + '\'' +
                ", wall='" + wall + '\'' +
                ", roofed='" + roofed + '\'' +
                '}';
    }
}
