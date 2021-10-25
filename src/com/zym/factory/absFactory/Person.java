package com.zym.factory.absFactory;

/**
 * @ClassName : Person
 * @Author : Wang Liang
 * @Date: 2021-10-25 11:21
 * @Description :
 */
public class Person {

    public static void main(String[] args) {
        OrderStore orderStore = new OrderStore(new BJFactory());
        orderStore.orderPizza("apple");
    }
}
