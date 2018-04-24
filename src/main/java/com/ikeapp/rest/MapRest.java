package com.ikeapp.rest;

import com.ikeapp.entity.domain.MapRegionDomain;
import com.ikeapp.service.MapRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by wei.shen
 * 2018/4/24
 */
@RestController
@RequestMapping("/api/map")
public class MapRest {

    @Autowired
    private MapRegionService mapRegionService;

    /**
     * 获取区域列表
     * @return
     */
    @RequestMapping("/regionList")
    public List<MapRegionDomain> regionList(){
        return mapRegionService.listAllRegions();
    }

}
