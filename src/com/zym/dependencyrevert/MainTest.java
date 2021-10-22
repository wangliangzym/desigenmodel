package com.zym.dependencyrevert;

import java.math.BigDecimal;
import java.sql.SQLOutput;

/**
 * @ClassName : MainTest
 * @Author : Wang Liang
 * @Date: 2021-10-21 14:14
 * @Description :
 */
public class MainTest {

    public static void main(String[] args) {
        boolean i = new Double(1634785396343801340d).equals(new Double(1634785396343801342d));
        System.out.println(i);


        boolean b = Double.doubleToLongBits(1634785396343801340D) == Double.doubleToLongBits(1634785396343801342D);
        System.out.println(b);

        int i1 = new BigDecimal(1634785396343801340D).compareTo(new BigDecimal(1634785396343801342D));
        System.out.println(i1);

        int i2 = String.valueOf(new Double(1634785396343801340d)).compareTo(String.valueOf(new Double(1634785396343801342d)));
        System.out.println(i2);
    }
}
//1634785396343801340d
//1634785396343801342
