package com.k3wd.dessignpattern.base.strategy;

/**
 * @author k3wd
 * @date 2023/2/18
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
