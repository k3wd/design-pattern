package com.k3wd.proxy.jdk;

import com.k3wd.proxy.jdk.RealImage;

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
