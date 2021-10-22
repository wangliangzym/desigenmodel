package com.zym.singleton.type7;

/**
 * @ClassName : SingletonType1
 * @Author : Wang Liang
 * @Date: 2021-10-22 16:03
 * @Description : 单例模式(静态内部类模式)
 * 优点：效率高，线程安全
 * 缺点：
 * 总结：类的静态属性只会在第一次加载类的时候初始化，所以在这路，jvm帮我们保证了线程安全
 */
public class SingletonType7 {
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
     * 静态内部类，利用jvm的类加载机制，可以保证线程安全
     */
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 懒汉式创建(线程安全)
     * @return 实例
     */
    public static Singleton getSingleton(){
        return SingletonInstance.INSTANCE;
    }
}
