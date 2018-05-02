package com.ikeapp.entity.view;

import com.ikeapp.entity.domain.MapRegionDomain;
import com.ikeapp.entity.domain.PointDomain;

import java.util.List;

/**
 * created by wei.shen
 * 2018/5/2
 */
public class RegionPointsVo {

    private MapRegionDomain region;

    private List<PointDomain> points;

    public MapRegionDomain getRegion() {
        return region;
    }

    public void setRegion(MapRegionDomain region) {
        this.region = region;
    }

    public List<PointDomain> getPoints() {
        return points;
    }

    public void setPoints(List<PointDomain> points) {
        this.points = points;
    }
}
