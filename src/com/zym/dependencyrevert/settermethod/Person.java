package com.zym.dependencyrevert.settermethod;

import com.zym.dependencyrevert.common.TV;

/**
 * @ClassName : Person
 * @Author : Wang Liang
 * @Date: 2021-10-21 11:27
 * @Description : 实现依赖的三种方式
 *                  3. 通过setter方法依赖
 */
public class Person {
    /**
     * 定义需要依赖的接口
     */
    private TV tv;

    /**
     * setter方法依赖
     * @param tv 接口
     */
    public void set(TV tv){
        this.tv = tv;
    }

    /**
     * 会执行通过构造方法传递进来的TV实现类的对应的方法
     */
    public void option(){
        tv.openTV();
    }

}
