package com.ikeapp.service;

import com.ikeapp.dao.FirstRepository;
import com.ikeapp.dao.MapRegionRepository;
import com.ikeapp.dao.PointsRepository;
import com.ikeapp.entity.BizException;
import com.ikeapp.entity.domain.MapRegionDomain;
import com.ikeapp.entity.view.RegionPointsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.util.StringUtils;

import java.util.List;

/**
 * created by wei.shen
 * 2018/4/24
 */
@Service
@Transactional
public class MapRegionService {

    @Autowired
    private MapRegionRepository mapRegionRepository;

    @Autowired
    private PointsRepository pointsRepository;

    @Transactional(readOnly = true)
    public List<MapRegionDomain> listAllRegions() throws BizException {
        return mapRegionRepository.findAll();
    }

    public Page<MapRegionDomain> listPageableRegion(String st){
        if(StringUtils.isEmpty(st)){

        }
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    public void createdRegion(RegionPointsVo regionPointsVo){
        MapRegionDomain region = mapRegionRepository.save(regionPointsVo.getRegion());
        regionPointsVo.getPoints().stream().forEach(item -> {
            item.setRegionId(region.getId());
        });
        pointsRepository.save(regionPointsVo.getPoints());
    }
}
