package com.zym.builder;

/**
 * @ClassName : HouseBuilder
 * @Author : Wang Liang
 * @Date: 2021-10-26 15:58
 * @Description : 建造者（抽象）
 */
public abstract class HouseBuilder {

    protected House house = new House();

    protected abstract void buildBasic();

    protected abstract void buildWall();

    protected abstract void roofed();

    //建造好房子，将产品返回
    public House buildHouse(){
        return house;
    }
}
