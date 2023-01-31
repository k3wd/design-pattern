package com.k3wd.proxy.statics;

/**
 * @author k3wd
 * @date 2023/1/31
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("展示文件：" + fileName);
    }
}
