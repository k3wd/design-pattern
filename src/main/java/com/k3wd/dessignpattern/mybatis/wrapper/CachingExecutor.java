package com.k3wd.dessignpattern.mybatis.wrapper;

/**
 * 包装器
 *
 * @author k3wd
 * @date 2023/2/13
 */
public class CachingExecutor implements Executor {
    Executor delegate;

    public CachingExecutor(Executor delegate) {
        // 要包装的对象
        this.delegate = delegate;
        // 告诉被包装的对象，是谁包装了你
        delegate.setExecutorWrapper(this);
    }

    @Override
    public void doQuery() {
        System.out.println("缓存了结果的查询");
        delegate.doQuery();
    }

    @Override
    public void setExecutorWrapper(CachingExecutor cachingExecutor) {
        throw new UnsupportedOperationException("This method should not be called");
    }
}
