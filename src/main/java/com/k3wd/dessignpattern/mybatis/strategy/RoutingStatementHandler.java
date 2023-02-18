package com.k3wd.dessignpattern.mybatis.strategy;

/**
 * 包装类
 *
 * @author k3wd
 * @date 2023/2/14
 */
public class RoutingStatementHandler implements StatementHandler {
    private final StatementHandler delegate;

    public RoutingStatementHandler(StatementType type) throws Exception {
        System.out.println("策略者");
        switch (type) {
            case STATEMENT:
                delegate = new SimpleStatementHandler();
                break;
            case PREPARED:
                delegate = new PreparedStatementHandler();
                break;
            default:
                throw new Exception("Unknown statement type: " + type);
        }
    }

    @Override
    public String prepare() {
        return delegate.prepare();
    }
}
