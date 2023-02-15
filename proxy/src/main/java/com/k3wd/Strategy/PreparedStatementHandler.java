package com.k3wd.Strategy;

/**
 * @author k3wd
 * @date 2023/2/14
 */
public class PreparedStatementHandler extends BaseStatementHandler {
    @Override
    protected String instantiateStatement() {
        System.out.println("预编译语句处理器执行处理逻辑");
        return this.boundSql;
    }
}
