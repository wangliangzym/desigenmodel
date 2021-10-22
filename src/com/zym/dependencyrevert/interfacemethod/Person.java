package com.zym.dependencyrevert.interfacemethod;

import com.zym.dependencyrevert.common.TV;

/**
 * @ClassName : Person
 * @Author : Wang Liang
 * @Date: 2021-10-21 11:27
 * @Description : 实现依赖的三种方式
 *                  1. 接口依赖
 */
public class Person {
    /**
     * 接口依赖
     * @param tv 借口
     *           精髓在这里：将接口通过方法参数传递，从而产生依赖
     */
    public void option(TV tv){
        tv.openTV();
    }


}
