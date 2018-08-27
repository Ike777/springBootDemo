package com.ikeapp.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 地图点
 * </p>
 *
 * @author 龙朝飞
 * @since 2018-08-23
 */
@TableName("ike_map_points")
public class IkeMapPoints extends Model<IkeMapPoints> {

    private static final long serialVersionUID = 1L;

	@TableId(value="ID", type= IdType.AUTO)
	private Integer id;
    /**
     * 经度
     */
	@TableField("LNG")
	private BigDecimal lng;
    /**
     * 纬度
     */
	@TableField("LAT")
	private BigDecimal lat;
    /**
     * 地图点坐标类型Code 候选项： 区域 坐标物
     */
	@TableField("TYPE_ST")
	private String typeSt;
    /**
     * 顺序
     */
	@TableField("MAP_ORDER")
	private Integer mapOrder;
    /**
     * 系统创建时间
     */
	@TableField("SYS_CREATE_DATE")
	private Date sysCreateDate;
    /**
     * 记录的版本 乐观锁
     */
	@TableField("VERSION")
	private Integer version;
    /**
     * 1 已逻辑删除 0 启用中
     */
	@TableField("DISABLED")
	private Integer disabled;


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
		this.typeSt = typeSt;
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

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
