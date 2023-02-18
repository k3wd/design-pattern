package com.k3wd.dessignpattern.mybatis.strategy;

import com.k3wd.dessignpattern.mybatis.wrapper.Executor;

/**
 * @author k3wd
 * @date 2023/2/14
 */
public abstract class BaseStatementHandler implements StatementHandler {
    /**
     * 抽出公共属性
     */
    protected String boundSql;

    @Override
    public String prepare() {
        // 模板模式执行处理逻辑
        System.out.println("模板方法执行");
        String sql = instantiateStatement();
        return sql;
    }

    /**
     * 实现一些操作公共属性的方法
     */
    protected abstract String instantiateStatement();
}
