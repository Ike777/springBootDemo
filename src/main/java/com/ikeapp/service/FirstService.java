package com.ikeapp.service;

import com.ikeapp.dao.FirstRepository;
import com.ikeapp.entity.domain.UserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * created by wei.shen
 * 2018/4/19
 */
@Service
@Transactional
public class FirstService {

    @Autowired
    private FirstRepository firstRepository;

    /**
     * 根据Id获取用户对象
     * @param userId
     * @return
     */
    @Transactional(readOnly = true)
    public UserDomain getUserDomain(long userId){
        return firstRepository.getOne(userId);
    }

    public UserDomain saveUser(){
        UserDomain user = new UserDomain();
        user.setName("Tom");
        firstRepository.save(user);
        return user;
    }
}
