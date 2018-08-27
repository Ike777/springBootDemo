package com.ikeapp.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 序列
 * </p>
 *
 * @author 龙朝飞
 * @since 2018-08-23
 */
@TableName("sys_sequence")
public class SysSequence extends Model<SysSequence> {

    private static final long serialVersionUID = 1L;

    /**
     * 表名
     */
    @TableId("table_name")
	private String tableName;
    /**
     * 日期
     */
	@TableField("start_date")
	private Date startDate;
	@TableField("next_val")
	private Integer nextVal;
	private Integer increment;
	@TableField("update_time")
	private Date updateTime;


	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Integer getNextVal() {
		return nextVal;
	}

	public void setNextVal(Integer nextVal) {
		this.nextVal = nextVal;
	}

	public Integer getIncrement() {
		return increment;
	}

	public void setIncrement(Integer increment) {
		this.increment = increment;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.tableName;
	}

}
