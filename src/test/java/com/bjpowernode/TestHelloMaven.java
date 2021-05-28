package com.bjpowernode;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author
 * @create2021-05-193:01 下午
 */
public class TestHelloMaven {
    @Test
    public void testAdd() {
        System.out.println("testAdd执行");
        HelloMaven helloMaven = new HelloMaven();
        int add = helloMaven.add(10, 20);
        Assert.assertEquals(30, add);
    }

    public void testAdd2() {
        System.out.println("testAdd2执行");
        HelloMaven helloMaven = new HelloMaven();
        int add = helloMaven.add(10, 20);
        Assert.assertEquals(30, add);
    }
}
