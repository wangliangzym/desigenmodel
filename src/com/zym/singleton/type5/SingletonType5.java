package com.zym.singleton.type5;

/**
 * @ClassName : SingletonType1
 * @Author : Wang Liang
 * @Date: 2021-10-22 16:03
 * @Description : 单例模式(线程不安全安全的懒汉式)
 * 优点：相比较type4 效率有所提高
 * 缺点：线程不安全，
 * 总结：开发中不能使用
 */
public class SingletonType5 {
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

    private static Singleton instance;

    //私有化构造器，防止new对象
    private Singleton(){ }

    /**
     * 懒汉式创建(线程不安全)
     * @return 实例
     */
    public static Singleton getSingleton(){
        if(instance == null){   //在这个地方可能同时进来两个线程  导致创建两个实例
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
