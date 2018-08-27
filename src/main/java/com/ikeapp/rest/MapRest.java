package com.ikeapp.rest;

import com.ikeapp.entity.BizException;
import com.ikeapp.entity.domain.MapRegionDomain;
import com.ikeapp.entity.dto.AscResponse;
import com.ikeapp.service.MapRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/allRegion")
    public List<MapRegionDomain> listAllRegion(){
        try {
            return mapRegionService.listAllRegions();
        } catch (BizException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取区域列表
     * @return
     */
    @RequestMapping(value = "/region/list")
    public AscResponse<List<MapRegionDomain>> getRegionList() {
        AscResponse<List<MapRegionDomain>> response = new AscResponse<>("", false);
        try {
            List<MapRegionDomain> regionDict = mapRegionService.listAllRegions();
            response.setSuccess(true);
            response.setT(regionDict);
            response.setMessage("查询成功");
        } catch (BizException e) {
            response.setMessage(e.getMes());
        } catch (Exception e) {
            response.setMessage("服务异常");
        }
        return response;
    }

}
