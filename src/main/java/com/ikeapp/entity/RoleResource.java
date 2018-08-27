package com.ikeapp.entity;

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
@TableName("role_resource")
public class RoleResource extends Model<RoleResource> {

    private static final long serialVersionUID = 1L;

	@TableField("resource_id")
	private String resourceId;
	@TableField("role_id")
	private String roleId;


	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@Override
	protected Serializable pkVal() {
		return this.resourceId;
	}

}
