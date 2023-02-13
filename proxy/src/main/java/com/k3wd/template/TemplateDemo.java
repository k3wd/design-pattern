package com.k3wd.template;

/**
 * @author k3wd
 * @date 2023/2/13
 */
public class TemplateDemo {
    public static void main(String[] args) {
        BaseExecutor baseExecutor1 = new ReuseExecutor();
        baseExecutor1.queryFromDatabase();
        BaseExecutor baseExecutor2 = new SimpleExecutor();
        baseExecutor2.queryFromDatabase();
    }
}
