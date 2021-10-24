package com.zym.factory.simplefactory;

/**
 * @ClassName ApplePizza
 * @Author 王亮
 * @Date 2021/10/23 11:12
 * @Description TODO
 **/
public class BananaPizza extends Pizza{
    @Override
    public void prepare() {
        super.name = "Banana";
        System.out.println("准备 Banana Pizza");
    }
}
