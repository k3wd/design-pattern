package com.k3wd.template;

import com.k3wd.wrapper.CachingExecutor;
import com.k3wd.wrapper.Executor;

/**
 * @author k3wd
 * @date 2023/2/13
 */
public abstract class BaseExecutor implements Executor {
    protected Executor wrapper;
    /**
     * 模板方法
     */
    public void queryFromDatabase() {
        // 真正进行执行是实现类
        doQuery();
    }


    @Override
    public void setExecutorWrapper(CachingExecutor cachingExecutor) {
        System.out.println();
    }
}
