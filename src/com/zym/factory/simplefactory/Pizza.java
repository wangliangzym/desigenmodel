package com.zym.factory.simplefactory;

/**
 * @ClassName Pizza
 * @Author 王亮
 * @Date 2021/10/23 11:05
 * @Description
 **/
public abstract class Pizza {
    /**
     * 名称
     */
    protected String name;

    /**
     * 准备
     */
    public abstract void prepare();

    /**
     * 烘焙
     */
    public void bake(){
        System.out.println(name + " pizza 正在烘焙！");
    }

    /**
     * 切割
     */
    public void cut(){
        System.out.println(name + " pizza 正在切割！");
    }

    /**
     *
     */
    public void box(){
        System.out.println(name + " pizza 正在打包！");
    }


}
