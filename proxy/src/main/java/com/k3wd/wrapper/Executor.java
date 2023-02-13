package com.k3wd.wrapper;

/**
 * @author k3wd
 * @date 2023/2/13
 */
public interface Executor {
    /**
     * 查询
     */
    void doQuery();

    void setExecutorWrapper(CachingExecutor cachingExecutor);
}
