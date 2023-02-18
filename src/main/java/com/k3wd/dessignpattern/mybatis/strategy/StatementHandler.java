package com.k3wd.dessignpattern.mybatis.strategy;

/**
 * @author k3wd
 * @date 2023/2/14
 */
public interface StatementHandler {
    /**
     * 定义公共方法
     */
    String prepare();
}
