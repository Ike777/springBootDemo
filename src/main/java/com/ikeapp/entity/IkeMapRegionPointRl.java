package com.ikeapp.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 区域-坐标关联表
 * </p>
 *
 * @author 龙朝飞
 * @since 2018-08-23
 */
@TableName("ike_map_region_point_rl")
public class IkeMapRegionPointRl extends Model<IkeMapRegionPointRl> {

    private static final long serialVersionUID = 1L;

	@TableId(value="ID", type= IdType.AUTO)
	private Integer id;
    /**
     * MAP_REGION.ID
     */
	@TableField("REGION_ID")
	private Integer regionId;
    /**
     * MAP_POINTS.ID
     */
	@TableField("POINT_ID")
	private Integer pointId;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public Integer getPointId() {
		return pointId;
	}

	public void setPointId(Integer pointId) {
		this.pointId = pointId;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
