package com.k3wd.dessignpattern.base.proxy.jdk;

/**
 * @author k3wd
 * @date 2023/1/31
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        TargetProxy targetProxy = new TargetProxy(new RealImage("test_10mb.jpg"));
        Image proxyObj = targetProxy.getProxy(Image.class);
        proxyObj.display();
    }
}
