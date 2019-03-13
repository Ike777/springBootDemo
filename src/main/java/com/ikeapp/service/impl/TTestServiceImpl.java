package com.ikeapp.service.Impl;

import com.ikeapp.entity.TTest;
import com.ikeapp.mapper.TTestDao;
import com.ikeapp.service.ITTestService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shenw123
 * @since 2018-09-14
 */
@Service
public class TTestServiceImpl extends ServiceImpl<TTestDao, TTest> implements ITTestService {

    @Override
    public TTest queryById(Long id) {
        return this.selectById(id);
    }
}
