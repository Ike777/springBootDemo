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
 * 地图标物表-学校 商场等等
 * </p>
 *
 * @author 龙朝飞
 * @since 2018-08-23
 */
@TableName("ike_map_icon")
public class IkeMapIcon extends Model<IkeMapIcon> {

    private static final long serialVersionUID = 1L;

	@TableId(value="ID", type= IdType.AUTO)
	private Integer id;
    /**
     * 标物名称
     */
	@TableField("ICON_NAME")
	private String iconName;
    /**
     * MAP_REGION.ID
     */
	@TableField("REGION_ID")
	private Integer regionId;
    /**
     * POINT_ID.ID
     */
	@TableField("POINT_ID")
	private Integer pointId;
    /**
     * 标物类型Code 候选项： 学校 商场 医院 产业园 重点企业 物业 交通站点
     */
	@TableField("ICON_ST")
	private String iconSt;
    /**
     * 物业类型Code 候选项： 住宅、商业、办公、公寓
     */
	@TableField("REAL_ESTATE_ST")
	private String realEstateSt;
    /**
     * 公寓类型Code 候选项： 普通住宅，洋房，别墅
     */
	@TableField("APARTMENT_ST")
	private String apartmentSt;
    /**
     * 是否土地 0 否 1 是
     */
	@TableField("IS_ESTATE")
	private Integer isEstate;
    /**
     * yyyy-MM-dd 成立时间 手填
     */
	@TableField("CREATE_DATE")
	private Date createDate;
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

	public String getIconName() {
		return iconName;
	}

	public void setIconName(String iconName) {
		this.iconName = iconName;
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

	public String getIconSt() {
		return iconSt;
	}

	public void setIconSt(String iconSt) {
		this.iconSt = iconSt;
	}

	public String getRealEstateSt() {
		return realEstateSt;
	}

	public void setRealEstateSt(String realEstateSt) {
		this.realEstateSt = realEstateSt;
	}

	public String getApartmentSt() {
		return apartmentSt;
	}

	public void setApartmentSt(String apartmentSt) {
		this.apartmentSt = apartmentSt;
	}

	public Integer getIsEstate() {
		return isEstate;
	}

	public void setIsEstate(Integer isEstate) {
		this.isEstate = isEstate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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
