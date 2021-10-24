package com.zym.factory.factorymethod;

/**
 * @ClassName ApplePizza
 * @Author 王亮
 * @Date 2021/10/23 11:12
 * @Description TODO
 **/
public class BJApplePizza extends Pizza {
    @Override
    public void prepare() {
        super.name = "Apple";
        System.out.println("准备北京 Apple Pizza");
    }
}
