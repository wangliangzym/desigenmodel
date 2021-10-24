package com.zym.factory.factorymethod;

/**
 * @ClassName OrderFactory
 * @Author 王亮
 * @Date 2021/10/24 18:05
 * @Description 工厂方法模式(将具体的创建类放到子类中去实现)
 **/
public abstract class PizzaFactory {

    protected String type;

    /**
     * 有参构造
     */
    public PizzaFactory(String type){
        this.type = type;
        Pizza pizza = null;
        pizza = createInstance();
        if(pizza != null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }

    /**
     * 留给子类去实现具体的创建过程
     * @return Pizza
     */
    abstract Pizza createInstance();

}
