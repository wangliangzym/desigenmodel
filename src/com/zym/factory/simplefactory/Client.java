package com.zym.factory.simplefactory;

/**
 * @ClassName Client
 * @Author 王亮
 * @Date 2021/10/23 11:31
 * @Description TODO
 **/
public class Client {

    public static void main(String[] args) {
        OrderStore orderStore = new OrderStore();
        orderStore.setPizzaFactory(new PizzaFactory());
        orderStore.order("apple");
    }
}
