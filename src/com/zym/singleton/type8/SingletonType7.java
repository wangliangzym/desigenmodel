package com.zym.singleton.type8;

/**
 * @ClassName : SingletonType1
 * @Author : Wang Liang
 * @Date: 2021-10-22 16:03
 * @Description : 单例模式(枚举方式创建)
 * 优点：效率高，线程安全
 * 总结：推荐使用
 */
public class SingletonType7 {
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton1 = Singleton.INSTANCE;
        System.out.println(singleton == singleton1);  //返回true
        singleton.sayok();
    }
}

enum Singleton{
    INSTANCE;
    public void sayok(){
        System.out.println("hello");
    }
}
