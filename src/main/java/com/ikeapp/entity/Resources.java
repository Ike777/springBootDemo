package com.ikeapp.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 序列
 * </p>
 *
 * @author 龙朝飞
 * @since 2018-08-23
 */
public class Resources extends Model<Resources> {

    private static final long serialVersionUID = 1L;

    /**
     * 表名
     */
	private Long id;
    /**
     * 日期
     */
	private String url;
	private String description;
    /**
     * 日期
     */
	@TableField("created_time")
	private Date createdTime;
	@TableField("update_time")
	private Date updateTime;
	private String name;
	@TableField("parent_id")
	private Integer parentId;
	@TableField("res_key")
	private String resKey;
	@TableField("res_url")
	private String resUrl;
	private String type;
	private String level;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getResKey() {
		return resKey;
	}

	public void setResKey(String resKey) {
		this.resKey = resKey;
	}

	public String getResUrl() {
		return resUrl;
	}

	public void setResUrl(String resUrl) {
		this.resUrl = resUrl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
