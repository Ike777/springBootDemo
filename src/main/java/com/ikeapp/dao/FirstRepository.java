package com.ikeapp.dao;

import com.ikeapp.entity.domain.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * created by wei.shen
 * 2018/4/19
 */
public interface FirstRepository extends JpaRepository<UserDomain,Long>,JpaSpecificationExecutor<UserDomain> {

}
