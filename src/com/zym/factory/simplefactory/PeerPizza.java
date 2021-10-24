package com.zym.factory.simplefactory;

/**
 * @ClassName ApplePizza
 * @Author 王亮
 * @Date 2021/10/23 11:12
 * @Description TODO
 **/
public class PeerPizza extends Pizza{
    @Override
    public void prepare() {
        super.name = "Peer";
        System.out.println("准备 Peer Pizza");
    }
}
