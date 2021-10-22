package com.zym.singleton.type3;

/**
 * @ClassName : SingletonType1
 * @Author : Wang Liang
 * @Date: 2021-10-22 16:03
 * @Description : 单例模式(非线程安全的懒汉式)
 * 优点：达到了lazy load的目的
 * 缺点：在多线程的情况下，假如线程 通过instance==null判断true，后面的程序还没来得及执行完，然后线程而也通过instance == null判断true，
 *      则再会去创建一个实例，这样就会导致有两个实例
 * 总结：线程不安全，只能在单线程下使用，一般不推荐使用
 */
public class SingletonType3 {
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
     * 懒汉式创建
     * @return 实例
     */
    public static Singleton getSingleton(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
