package com.zym.dependencyrevert.common;

/**
 * @ClassName : ChangWeiTV
 * @Author : Wang Liang
 * @Date: 2021-10-21 11:26
 * @Description :
 */
public class ChangWeiTV implements TV {
    @Override
    public void openTV() {
        System.out.println("打开创维电视");
    }
}
