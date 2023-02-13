package com.k3wd.template;

import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/**
 * @author k3wd
 * @date 2023/2/13
 */
public class ReuseExecutor extends BaseExecutor {

    @Override
    public void doQuery() {
        System.out.println("可复用的查询");
    }
}
