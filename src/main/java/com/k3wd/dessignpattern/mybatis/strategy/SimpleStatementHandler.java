package com.k3wd.dessignpattern.mybatis.strategy;

/**
 * @author k3wd
 * @date 2023/2/14
 */
public class SimpleStatementHandler extends BaseStatementHandler {
    @Override
    protected String instantiateStatement() {
        System.out.println("普通语句处理器执行处理逻辑");
        return this.boundSql;
    }
}
