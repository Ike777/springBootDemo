package com.ikeapp.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 序列
 * </p>
 *
 * @author 龙朝飞
 * @since 2018-08-23
 */
@Data
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

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
