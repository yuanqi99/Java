package com.rtcroom.project.system.user.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author yuanqi
 * @since 2024-01-15
 */
@TableName("sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    //@ApiModelProperty("用户ID")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    //@ApiModelProperty("部门ID")
    private Long deptId;

    //@ApiModelProperty("登录账号")
    private String loginName;

   // @ApiModelProperty("用户昵称")
    private String userName;

    ///@ApiModelProperty("用户类型（00系统用户 01注册用户）")
    private String userType;

    //@ApiModelProperty("用户邮箱")
    private String email;

    ///@ApiModelProperty("手机号码")
    private String phonenumber;

    //@ApiModelProperty("用户性别（0男 1女 2未知）")
    private String sex;

    //@ApiModelProperty("头像路径")
    private String avatar;

    ///@ApiModelProperty("密码")
    private String password;

    //@ApiModelProperty("盐加密")
    private String salt;

   // @ApiModelProperty("帐号状态（0正常 1停用）")
    private String status;

    //@ApiModelProperty("删除标志（0代表存在 2代表删除）")
    private String delFlag;

    //@ApiModelProperty("最后登录IP")
    private String loginIp;

   // @ApiModelProperty("最后登录时间")
    private LocalDateTime loginDate;

   // @ApiModelProperty("密码最后更新时间")
    private LocalDateTime pwdUpdateDate;

   // @ApiModelProperty("创建者")
    private String createBy;

    //@ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    //@ApiModelProperty("更新者")
    private String updateBy;

    //@ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    //@ApiModelProperty("备注")
    private String remark;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public LocalDateTime getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(LocalDateTime loginDate) {
        this.loginDate = loginDate;
    }

    public LocalDateTime getPwdUpdateDate() {
        return pwdUpdateDate;
    }

    public void setPwdUpdateDate(LocalDateTime pwdUpdateDate) {
        this.pwdUpdateDate = pwdUpdateDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "SysUser{" +
            "userId = " + userId +
            ", deptId = " + deptId +
            ", loginName = " + loginName +
            ", userName = " + userName +
            ", userType = " + userType +
            ", email = " + email +
            ", phonenumber = " + phonenumber +
            ", sex = " + sex +
            ", avatar = " + avatar +
            ", password = " + password +
            ", salt = " + salt +
            ", status = " + status +
            ", delFlag = " + delFlag +
            ", loginIp = " + loginIp +
            ", loginDate = " + loginDate +
            ", pwdUpdateDate = " + pwdUpdateDate +
            ", createBy = " + createBy +
            ", createTime = " + createTime +
            ", updateBy = " + updateBy +
            ", updateTime = " + updateTime +
            ", remark = " + remark +
        "}";
    }
}
