package com.ikeapp.annocation;

import com.ikeapp.config.DataSourceContextHolder;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: wei.shen
 * @date: 2019/3/13
 */
@Aspect
@Component
@Order(1)
public class DataSourceAspect {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution(* com.ikeapp..*Impl.find*(..))" +
        "|| execution(* com.ikeapp..*Impl.count*(..))" +
        "|| execution(* com.ikeapp..*Impl.sel*(..))" +
        "|| execution(* com.ikeapp..*Impl.get*(..))" +
        "|| execution(* com.ikeapp..*Impl.query*(..))"
    )
    public void setReadDataSourceType() {
        logger.debug("拦截[read]方法");
        DataSourceContextHolder.read();
    }

    @Before("execution(* com.ikeapp..*Impl.insert*(..))" +
        "|| execution(* com.ikeapp..*Impl.save*(..))" +
        "|| execution(* com.ikeapp..*Impl.update*(..))" +
        "|| execution(* com.ikeapp..*Impl.set*(..))" +
        "|| execution(* com.ikeapp..*Impl.del*(..))")
    public void setWriteDataSourceType() {
        logger.debug("拦截[write]操作");
        DataSourceContextHolder.write();
    }

}
