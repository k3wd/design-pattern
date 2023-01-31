package com.k3wd.proxy.statics;

/**
 * @author k3wd
 * @date 2023/1/31
 */
public class ProxyImage implements Image {
    // 持有真实对象
    private RealImage realImage;

    public ProxyImage(RealImage realImage) {
        this.realImage = realImage;
    }

    @Override
    public void display() {
        // 代理操作
        System.out.println("代理：对图片进行脱敏操作");
        // 真实方法执行
        realImage.display();
    }
}
