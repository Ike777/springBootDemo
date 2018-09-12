package com.ikeapp.dao;

import com.ikeapp.entity.domain.MapRegionDomain;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

/**
 * created by wei.shen
 * 2018/4/24
 */
public interface MapRegionRepository extends JpaRepository<MapRegionDomain,Long>,JpaSpecificationExecutor<MapRegionDomain> {


}
