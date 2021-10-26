package com.zym.prototype.deepcopy;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

/**
 * @ClassName : Person
 * @Author : Wang Liang
 * @Date: 2021-10-26 14:25
 * @Description : 深拷贝 采用序列化与反序列化的方式
 */
public class Person implements Serializable{

    private String name;

    private int age;

    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Object deepCopy(){
        Person copy = null;
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            copy = (Person) ois.readObject();
            return copy;
        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }finally {
            try {
                assert ois != null;
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            }catch (Exception e){
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
        }
        return copy;
    }
}
