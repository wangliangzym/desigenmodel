package com.zym.factory.factorymethod;

/**
 * @ClassName MethodClient
 * @Author 王亮
 * @Date 2021/10/24 18:22
 * @Description TODO
 **/
public class MethodClient {

    public static void main(String[] args) {
        PizzaFactory bjPizzaFactory = new BJPizzaFactory("apple");
        bjPizzaFactory.createInstance();

        PizzaFactory pizzaFactory = new LDPizzaFactory("banana");
        pizzaFactory.createInstance();
    }
}
