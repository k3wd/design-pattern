package com.k3wd.proxy.statics;

/**
 * @author k3wd
 * @date 2023/1/31
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage(new RealImage("test_10mb.jpg"));
        image.display();
    }
}
