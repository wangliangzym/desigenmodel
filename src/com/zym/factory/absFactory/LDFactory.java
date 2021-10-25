package com.zym.factory.absFactory;

/**
 * @ClassName : BJFactory
 * @Author : Wang Liang
 * @Date: 2021-10-25 11:11
 * @Description :
 */
public class LDFactory implements ABSFactory{
    @Override
    public Pizza createInstance(String type) {
        System.out.println("使用工厂模式创建");
        Pizza pizza = null;
        if(type.equalsIgnoreCase("apple")){
            pizza = new LDApplePizza();
        }else if(type.equalsIgnoreCase("banana")){
            pizza = new LDBananaPizza();
        }
        return pizza;
    }
}


