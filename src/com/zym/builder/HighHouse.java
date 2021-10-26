package com.zym.builder;

/**
 * @ClassName : HighHouse
 * @Author : Wang Liang
 * @Date: 2021-10-26 16:06
 * @Description :
 */
public class HighHouse extends HouseBuilder{

    @Override
    protected void buildBasic() {
        house.setBasic("100m");
        System.out.println("建造高层房子地基为100m");
    }

    @Override
    protected void buildWall() {
        house.setWall("20cm");
        System.out.println("建造高层房子墙厚为20cm");
    }

    @Override
    protected void roofed() {
        house.setRoofed("高层楼顶");
        System.out.println("建造高层楼的楼顶");
    }
}
