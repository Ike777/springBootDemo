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
 * 区域表：地图上显示的区块
 * </p>
 *
 * @author 龙朝飞
 * @since 2018-08-23
 */
@TableName("ike_map_region")
public class IkeMapRegion extends Model<IkeMapRegion> {

    private static final long serialVersionUID = 1L;

	@TableId(value="ID", type= IdType.AUTO)
	private Integer id;
    /**
     * 区域名称
     */
	@TableField("REGION_NAME")
	private String regionName;
    /**
     * 区域码 WX0001
     */
	@TableField("REGION_CODE")
	private String regionCode;
    /**
     * 成熟度Code 候选项：起步 成长 成熟
     */
	@TableField("LEVEL_ST")
	private String levelSt;
    /**
     * yyyy-MM-dd 成立时间 手填
     */
	@TableField("CREATE_DATE")
	private Date createDate;
    /**
     * 区域均价 单位：元
     */
	@TableField("PRICE")
	private Long price;
    /**
     *  最高价 单位：元
     */
	@TableField("TOP_PRICE")
	private Long topPrice;
    /**
     * 人口密度Code 候选项：待定
     */
	@TableField("POPULATION_ST")
	private String populationSt;
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

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getLevelSt() {
		return levelSt;
	}

	public void setLevelSt(String levelSt) {
		this.levelSt = levelSt;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getTopPrice() {
		return topPrice;
	}

	public void setTopPrice(Long topPrice) {
		this.topPrice = topPrice;
	}

	public String getPopulationSt() {
		return populationSt;
	}

	public void setPopulationSt(String populationSt) {
		this.populationSt = populationSt;
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
