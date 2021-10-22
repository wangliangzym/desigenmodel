package com.zym.dependencyrevert.constuctmethod;

import com.zym.dependencyrevert.common.TV;

/**
 * @ClassName : Person
 * @Author : Wang Liang
 * @Date: 2021-10-21 11:27
 * @Description : 实现依赖的三种方式
 *                  2. 构造方法依赖
 */
public class Person {
    /**
     * 定义需要依赖的接口
     */
    private TV tv;

    /**
     * 构造方法
     * @param tv 需要依赖的对象
     *           精髓：需要依赖的对象通过构造方法传递，并且赋值为私有变量
     */
    public Person(TV tv){
        this.tv = tv;
    }

    /**
     * 会执行通过构造方法传递进来的TV实现类的对应的方法
     */
    public void option(){
        tv.openTV();
    }

}
