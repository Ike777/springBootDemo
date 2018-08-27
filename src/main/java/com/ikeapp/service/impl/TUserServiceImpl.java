package com.ikeapp.service.impl;

import com.ikeapp.entity.TUser;
import com.ikeapp.mapper.TUserDao;
import com.ikeapp.service.TUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lzf
 * @since 2018-08-23
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserDao, TUser> implements TUserService {
	
}
