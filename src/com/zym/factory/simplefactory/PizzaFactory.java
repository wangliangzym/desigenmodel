package com.zym.factory.simplefactory;

/**
 * @ClassName PizzaFactory
 * @Author 王亮
 * @Date 2021/10/23 11:15
 * @Description 简单工厂(在工厂中创建实例)
 **/
public class PizzaFactory {

    public Pizza createInstance(String type){
        Pizza pizza = null;
        if(type.equalsIgnoreCase("apple")){
            pizza = new ApplePizza();
        } else if (type.equalsIgnoreCase("banana")){
            pizza = new BananaPizza();
        } else if (type.equalsIgnoreCase("peer")) {
            pizza = new PeerPizza();
        }
        return pizza;
    }
}
