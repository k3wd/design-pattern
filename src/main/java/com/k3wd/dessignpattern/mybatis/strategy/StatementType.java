package com.k3wd.dessignpattern.mybatis.strategy;

/**
 * @author k3wd
 * @date 2023/2/14
 */
public enum StatementType {
    /**
     * 普通语句，预编译语句类型，存储过程语句类型
     */
    STATEMENT, PREPARED, CALLABLE
}
