package com.ikeapp.entity;

import java.io.Serializable;

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
 * @author shenw123
 * @since 2018-09-14
 */
@TableName("t_test")
public class TTest extends Model<TTest> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * ???
     */
    private String mobile;
    /**
     * ??
     */
    @TableField("real_name")
    private String realName;
    /**
     * ??
     */
    private String introduce;
    /**
     * ????
     */
    private String status;
    /**
     * ???
     */
    @TableField("created_by")
    private String createdBy;
    /**
     * ????
     */
    @TableField("created_date")
    private Date createdDate;
    @TableField("last_modified_by")
    private String lastModifiedBy;
    @TableField("last_modified_date")
    private Date lastModifiedDate;
    private Integer tttt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Integer getTttt() {
        return tttt;
    }

    public void setTttt(Integer tttt) {
        this.tttt = tttt;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TTest{" +
        ", id=" + id +
        ", mobile=" + mobile +
        ", realName=" + realName +
        ", introduce=" + introduce +
        ", status=" + status +
        ", createdBy=" + createdBy +
        ", createdDate=" + createdDate +
        ", lastModifiedBy=" + lastModifiedBy +
        ", lastModifiedDate=" + lastModifiedDate +
        ", tttt=" + tttt +
        "}";
    }
}
