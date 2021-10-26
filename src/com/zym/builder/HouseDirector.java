package com.zym.builder;

/**
 * @ClassName : HouseDirector
 * @Author : Wang Liang
 * @Date: 2021-10-26 16:09
 * @Description : 指挥者
 */
public class HouseDirector {

    private HouseBuilder houseBuilder;

    //构造方法注入
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    //通过set方法注入
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
