package com.zym.singleton.type6;

/**
 * @ClassName : SingletonType1
 * @Author : Wang Liang
 * @Date: 2021-10-22 16:03
 * @Description : 单例模式(线程安全(双重检查)的懒汉式)
 * 优点：效率高，线程安全
 * 缺点：
 * 总结：开发中推荐使用
 */
public class SingletonType6 {
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton == singleton1);  //返回true
    }
}


class Singleton{

    /**
     * 添加volatile关键字主要防止指令重排序而产生一个空对象
     */
    private static volatile Singleton instance;

    //私有化构造器，防止new对象
    private Singleton(){ }

    /**
     * 懒汉式创建(线程不安全)
     * @return 实例
     */
    public static Singleton getSingleton(){
        if(instance == null){   //在这个地方可能同时进来两个线程  导致创建两个实例
            synchronized (Singleton.class){
                if(instance == null){    //双重检查 防止线程的安全问题
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
