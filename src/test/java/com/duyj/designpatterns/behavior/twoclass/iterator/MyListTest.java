package com.duyj.designpatterns.behavior.twoclass.iterator;

import org.junit.Test;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/19
 */
public class MyListTest {

    @Test
    public void myListTest() {
        MyList<Integer> integers = new MyList<>(10);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        for (Integer integer : integers) {
            System.out.print(integer);
        }
        System.out.println();
        integers.forEach(System.out::print);
    }

}