package com.bjpowernode;

/**
 * @author
 * @create2021-05-192:59 下午
 */
public class HelloMaven {
    public static void main(String[] args) {
        HelloMaven helloMaven = new HelloMaven();
        int ans = helloMaven.add(10, 20);
        System.out.println("10 + 20 = " + ans);
        System.out.println("10 + 20 = " + ans);
        System.out.println("10 + 20 = " + ans);
        System.out.println("10 + 201 = " + ans);
        System.out.println("10 + 203 = " + ans);

    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}
