package com.zym.factory.absFactory;

/**
 * @ClassName : OrderStore
 * @Author : Wang Liang
 * @Date: 2021-10-25 11:17
 * @Description :
 */
public class OrderStore {

    private ABSFactory factory;

    public OrderStore(ABSFactory factory){
        this.factory = factory;
    }

    public void orderPizza(String type){
        Pizza instance = factory.createInstance(type);
        instance.prepare();
        instance.bake();
        instance.cut();
        instance.box();
    }
}
