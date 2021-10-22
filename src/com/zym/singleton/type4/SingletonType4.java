package com.zym.singleton.type4;

/**
 * @ClassName : SingletonType1
 * @Author : Wang Liang
 * @Date: 2021-10-22 16:03
 * @Description : 单例模式(线程安全的懒汉式)
 * 优点：线程安全
 * 缺点：效率低，每次获取实例的时候，都要进行同步
 * 总结：开发中不推荐使用
 */
public class SingletonType4 {
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
     * 懒汉式创建(线程安全)
     * @return 实例
     */
    public static synchronized Singleton getSingleton(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
