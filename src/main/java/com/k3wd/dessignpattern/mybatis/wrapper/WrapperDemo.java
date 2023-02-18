package com.k3wd.dessignpattern.mybatis.wrapper;

import com.k3wd.dessignpattern.mybatis.template.ReuseExecutor;
import com.k3wd.dessignpattern.mybatis.template.SimpleExecutor;

/**
 * @author k3wd
 * @date 2023/2/13
 */
public class WrapperDemo {
    public static void main(String[] args) {
        // 和代理方法有些像
        // 静态代理是一种编译期增强,还没运行就已经知道增强的目标对象。 装饰者是运行时增强，只有运行时才知道具体增强的目标
        Executor executor = new CachingExecutor(new SimpleExecutor());
        executor.doQuery();

        Executor reuseExecutor = new CachingExecutor(new ReuseExecutor());
        reuseExecutor.doQuery();
    }
}
