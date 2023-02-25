package com.k3wd.dessignpattern.base.strategy;

/**
 * @author k3wd
 * @date 2023/2/18
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
