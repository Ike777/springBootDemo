package com.ikeapp.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: wei.shen
 * @date: 2019/3/13
 */
public class RoutingDataSource extends AbstractRoutingDataSource {
    private AtomicInteger count = new AtomicInteger(0);

    private int readsize;

    public RoutingDataSource(int readsize) {
        this.readsize = readsize;
    }

    @Override
    protected Object determineCurrentLookupKey() {
        String typeKey = DataSourceContextHolder.getJdbcType();
        if (typeKey == null) {
            logger.error("无法确定数据源");
        }
        if (typeKey.equals(DataSourceType.WRITE.getType())) {
            return DataSourceType.WRITE.getType();
        }
        //读库进行负载均衡
        int a = count.getAndAdd(1);
        int lookupkey = a % readsize;
        return lookupkey;
    }

}
