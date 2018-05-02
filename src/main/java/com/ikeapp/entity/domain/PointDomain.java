package com.ikeapp.entity.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * created by wei.shen
 * 2018/5/2
 */
@Entity
@Table(name = "ike_map_points")
public class PointDomain {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 经度
     */
    private BigDecimal lng;

    /**
     * 纬度
     */
    private BigDecimal lat;

    /**
     * 地图点坐标类型Code 候选项： 区域 坐标物
     */
    private String typeSt;

    /**
     * 顺序
     */
    private Integer mapOrder;

    /**
     * 系统创建时间
     */
    private Date sysCreateDate;

    /**
     * 记录的版本 乐观锁
     */
    private Integer version;

    /**
     * 1 已逻辑删除 0 启用中
     */
    private Integer disabled;

    /**
     * 外键 区域ID
     */
    private int regionId;

    /**
     * 项目ID
     */
    private int projectId;

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }



    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }



    public String getTypeSt() {
        return typeSt;
    }

    public void setTypeSt(String typeSt) {
        this.typeSt = typeSt == null ? null : typeSt.trim();
    }



    public Integer getMapOrder() {
        return mapOrder;
    }

    public void setMapOrder(Integer mapOrder) {
        this.mapOrder = mapOrder;
    }



    public Date getSysCreateDate() {
        return sysCreateDate;
    }

    public void setSysCreateDate(Date sysCreateDate) {
        this.sysCreateDate = sysCreateDate;
    }



    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }



    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
}
