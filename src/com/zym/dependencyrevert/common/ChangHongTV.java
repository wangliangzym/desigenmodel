package com.zym.dependencyrevert.common;

/**
 * @ClassName : ChangHongTV
 * @Author : Wang Liang
 * @Date: 2021-10-21 11:25
 * @Description :
 */
public class ChangHongTV implements TV {
    @Override
    public void openTV() {
        System.out.println("打开长虹电视");
    }
}
