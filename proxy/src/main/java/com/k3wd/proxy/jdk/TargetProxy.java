package com.k3wd.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author k3wd
 * @date 2023/1/31
 */
public class TargetProxy implements InvocationHandler {
    // 持有目标接口的引用，动态代理为了适配各种目标类型，把引用使用Object
    private Object target;

    /**
     * 使用构造方法对目标接口的引用实现初始化
     *
     * @param target
     */
    public TargetProxy(Object target) {
        this.target = target;
    }

    /**
     * 获取真代理对象
     *
     * @param interfaces 代理类的接口
     */
    public <T> T getProxy(Class interfaces) {
        // 1、jvm内存中生成一个class类；
        // 2、根据该class类反射创建一个代理对象 $Proxy@564546548
        // h的作用：将方法调用调度到的调用处理程序
        return (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class<?>[]{interfaces}, this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理操作");
        Object result = method.invoke(target, args);
        return result;
    }
}
