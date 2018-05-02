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

    /**
     * 根等级获取地图大区列表
     * @param levelSt
     * @param pageable
     * @return
     */
    @Query(value = "SELECT * FROM ike_map_region WHERE level_st = ?1",
        countQuery = "SELECT count(*) FROM ike_map_region WHERE level_st = ?1",
        nativeQuery = true)
    Page<MapRegionDomain> findByLevelSt(String levelSt,Pageable pageable);
}
