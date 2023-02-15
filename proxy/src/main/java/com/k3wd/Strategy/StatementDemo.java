package com.k3wd.Strategy;

/**
 * @author k3wd
 * @date 2023/2/15
 */
public class StatementDemo {
    public static void main(String[] args) throws Exception {
        // 策略者模式选择不同的statementHandler
        StatementHandler statementHandler = new RoutingStatementHandler(StatementType.PREPARED);
        statementHandler.prepare();
    }
}
