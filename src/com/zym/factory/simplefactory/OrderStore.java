package com.zym.factory.simplefactory;

/**
 * @ClassName OrderStore
 * @Author 王亮
 * @Date 2021/10/23 11:26
 * @Description 聚合简单工厂
 **/
public class OrderStore {

    /**
     * 聚合简单工厂
     */
    private PizzaFactory pizzaFactory;

    public void setPizzaFactory(PizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    public void order(String type){
        System.out.println("开始订购Pizza");
        Pizza pizza = pizzaFactory.createInstance(type);
        if(pizza != null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }else {
            System.out.println("没有找到相关pizza");
        }

    }

}
