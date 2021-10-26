package com.zym.prototype.deepcopy;

import javax.sound.midi.Soundbank;

/**
 * @ClassName : Client
 * @Author : Wang Liang
 * @Date: 2021-10-26 14:39
 * @Description : 深拷贝
 */
public class Client {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(3);
        Dog dog = new Dog();
        dog.setColor("yellow");
        dog.setColor("play");
        person1.setDog(dog);

        Person person2 = (Person)person1.deepCopy();

        System.out.println("person1.name" + person1.getName() + "dog hash" + person1.getDog().hashCode());
        System.out.println("person2.name" + person2.getName() + "dog hash" + person2.getDog().hashCode());


    }
}
