package com.zym.builder;

/**
 * @ClassName : Cilent
 * @Author : Wang Liang
 * @Date: 2021-10-26 16:12
 * @Description : 建造者模式
 * 概念：又叫生成器模式，是一种对象构建模式，可以将复杂对象的构建抽象出来，是这个抽象过程的不同实现方法可以构造出不同的对象
 * 建造者模式的四个角色
 * 1.  Product（产品角色）：一个具体的产品对象
 * 2. Builder(抽象建造者)：创建一个product对象的各个部件指定的接口/抽象类
 * 3. ConcreteBuilder(具体的创建者)：实现接口，构建和装配各个部件。
 * 4. Director(指挥者)： 构建一个使用builder对象的接口，主要用于创建一个复杂的对象，主要有两个作用：
 *    4.1 隔离了客户与对象的生产过程
 *    4.2 负责控制产品对象的生产过程
 */
public class Client {

    public static void main(String[] args) {

        //建造普通的房子
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();
        System.out.println(house);
        System.out.println("-------------------------");
        //建造高层的房子
        HighHouse highHouse = new HighHouse();
        HouseDirector houseDirector1 = new HouseDirector(highHouse);
        House house1 = houseDirector1.constructHouse();
        System.out.println(house1);
    }
}
