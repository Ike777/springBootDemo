package com.ikeapp.service;

import com.ikeapp.entity.TTest;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author shenw123
 * @since 2018-09-14
 */
public interface ITTestService extends IService<TTest> {

    TTest queryById(Long id);

}
