package com.zym.factory.absFactory;

/**
 * @ClassName : ABSFactory
 * @Author : Wang Liang
 * @Date: 2021-10-25 11:09
 * @Description : 抽象工厂模式(new具体的类是在子类中去实现)
 */
public interface ABSFactory {

    /**
     * 抽象创建实例
     * @param type 类型
     * @return Pizza
     */
    Pizza createInstance(String type);
}
