package com.ikeapp.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 龙朝飞
 * @since 2018-08-23
 */
@TableName("ike_map_project")
public class IkeMapProject extends Model<IkeMapProject> {

    private static final long serialVersionUID = 1L;

	@TableId(value="ID", type= IdType.AUTO)
	private Integer id;
    /**
     * 项目名称
     */
	@TableField("PROJECT_NAME")
	private String projectName;
    /**
     * 区
     */
	@TableField("AREA")
	private String area;
    /**
     * MAP_REGION.ID
     */
	@TableField("REGION_ID")
	private Integer regionId;
    /**
     * 区域名 冗余字段
     */
	@TableField("REGION_NAME")
	private String regionName;
    /**
     * 占地面积
     */
	@TableField("AREA_AMOUNT")
	private Integer areaAmount;
	@TableField("PRICE")
	private Integer price;
	@TableField("VERSION")
	private Integer version;
	@TableField("CREATE_DATE")
	private Date createDate;
    /**
     * 1 已删除 
     */
	@TableField("DISABLED")
	private Integer disabled;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public Integer getAreaAmount() {
		return areaAmount;
	}

	public void setAreaAmount(Integer areaAmount) {
		this.areaAmount = areaAmount;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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
