package com.ikeapp.dao;

import com.ikeapp.entity.domain.PointDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * created by wei.shen
 * 2018/5/2
 */
public interface PointsRepository extends JpaRepository<PointDomain,Long>,JpaSpecificationExecutor<PointDomain> {
}
