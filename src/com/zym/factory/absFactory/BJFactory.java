package com.zym.factory.absFactory;

/**
 * @ClassName : BJFactory
 * @Author : Wang Liang
 * @Date: 2021-10-25 11:11
 * @Description :
 */
public class BJFactory implements ABSFactory{
    @Override
    public Pizza createInstance(String type) {
        System.out.println("使用工厂模式创建");
        Pizza pizza = null;
        if(type.equalsIgnoreCase("apple")){
            pizza = new BJApplePizza();
        }else if(type.equalsIgnoreCase("banana")){
            pizza = new BJBananaPizza();
        }
        return pizza;
    }
}


