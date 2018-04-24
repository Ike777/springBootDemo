package com.ikeapp.service;

import com.ikeapp.dao.FirstRepository;
import com.ikeapp.dao.MapRegionRepository;
import com.ikeapp.entity.domain.MapRegionDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional(readOnly = true)
    public List<MapRegionDomain> listAllRegions(){
        return mapRegionRepository.findAll();
    }
}
