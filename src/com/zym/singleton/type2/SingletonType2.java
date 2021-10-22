package com.zym.singleton.type2;

/**
 * @ClassName : SingletonType1
 * @Author : Wang Liang
 * @Date: 2021-10-22 16:03
 * @Description : 单例模式(静态代码块饿汉式)
 * 优点：写法简单，类装载的时候就完成了实例化，避免了线程同步问题
 * 缺点：类装载的时候就完成了实例化，没有lazy load，假如自始至终都没有使用这个对象，就会造成内存浪费的可能
 *
 */
public class SingletonType2 {
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
    //私有化构造器，防止new对象
    private Singleton(){
    }

    /**
     * 本类创建实例对象
     */
    private static Singleton singleton;

    //在静态代码块中创建实例对象
    static {
        singleton = new Singleton();
    }

    /**
     * 提供共有的静态的获取实例对象的方法
     * @return 实例对象
     */
    public static Singleton getSingleton(){
        return singleton;
    }
}
