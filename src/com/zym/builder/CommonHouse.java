package com.zym.builder;

/**
 * @ClassName : CommonHouse
 * @Author : Wang Liang
 * @Date: 2021-10-26 16:04
 * @Description : 普通房子
 */
public class CommonHouse extends HouseBuilder{
    @Override
    protected void buildBasic() {
        super.house.setBasic("5m");
        System.out.println("建造普通房子地基为5m");
    }

    @Override
    protected void buildWall() {
        super.house.setWall("10cm");
        System.out.println("建造普通房子强厚为10cm");
    }

    @Override
    protected void roofed() {
        super.house.setRoofed("普通屋顶");
        System.out.println("建造普通房子的屋顶");
    }
}
