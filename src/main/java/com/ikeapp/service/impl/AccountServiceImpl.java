package com.ikeapp.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ikeapp.entity.Account;
import com.ikeapp.mapper.AccountDao;
import com.ikeapp.service.AccountService;
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
public class AccountServiceImpl extends ServiceImpl<AccountDao, Account> implements AccountService {
	
}
