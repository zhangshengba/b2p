package com.cdut.b2p.modules.sys.po;

import java.io.Serializable;
import java.util.Date;

/**
 * sys_menu
 * @author 
 */
public class SysMenu implements Serializable {
    /**
     * 编号
     */
    private String id;

    /**
     * 父级编号
     */
    private String menuParentId;

    /**
     * 所有父级编号
     */
    private String menuParentIds;

    /**
     * 名称
     */
    private String menuName;

    /**
     * 排序
     */
    private Long menuSort;

    /**
     * 链接
     */
    private String menuHref;

    /**
     * 目标
     */
    private String menuTarget;

    /**
     * 图标
     */
    private String menuIcon;

    /**
     * 是否在菜单中显示
     */
    private String menuIsShow;

    /**
     * 权限标识
     */
    private String menuPermission;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 删除标记
     */
    private String delFlag;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenuParentId() {
        return menuParentId;
    }

    public void setMenuParentId(String menuParentId) {
        this.menuParentId = menuParentId;
    }

    public String getMenuParentIds() {
        return menuParentIds;
    }

    public void setMenuParentIds(String menuParentIds) {
        this.menuParentIds = menuParentIds;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Long getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(Long menuSort) {
        this.menuSort = menuSort;
    }

    public String getMenuHref() {
        return menuHref;
    }

    public void setMenuHref(String menuHref) {
        this.menuHref = menuHref;
    }

    public String getMenuTarget() {
        return menuTarget;
    }

    public void setMenuTarget(String menuTarget) {
        this.menuTarget = menuTarget;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getMenuIsShow() {
        return menuIsShow;
    }

    public void setMenuIsShow(String menuIsShow) {
        this.menuIsShow = menuIsShow;
    }

    public String getMenuPermission() {
        return menuPermission;
    }

    public void setMenuPermission(String menuPermission) {
        this.menuPermission = menuPermission;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysMenu other = (SysMenu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMenuParentId() == null ? other.getMenuParentId() == null : this.getMenuParentId().equals(other.getMenuParentId()))
            && (this.getMenuParentIds() == null ? other.getMenuParentIds() == null : this.getMenuParentIds().equals(other.getMenuParentIds()))
            && (this.getMenuName() == null ? other.getMenuName() == null : this.getMenuName().equals(other.getMenuName()))
            && (this.getMenuSort() == null ? other.getMenuSort() == null : this.getMenuSort().equals(other.getMenuSort()))
            && (this.getMenuHref() == null ? other.getMenuHref() == null : this.getMenuHref().equals(other.getMenuHref()))
            && (this.getMenuTarget() == null ? other.getMenuTarget() == null : this.getMenuTarget().equals(other.getMenuTarget()))
            && (this.getMenuIcon() == null ? other.getMenuIcon() == null : this.getMenuIcon().equals(other.getMenuIcon()))
            && (this.getMenuIsShow() == null ? other.getMenuIsShow() == null : this.getMenuIsShow().equals(other.getMenuIsShow()))
            && (this.getMenuPermission() == null ? other.getMenuPermission() == null : this.getMenuPermission().equals(other.getMenuPermission()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMenuParentId() == null) ? 0 : getMenuParentId().hashCode());
        result = prime * result + ((getMenuParentIds() == null) ? 0 : getMenuParentIds().hashCode());
        result = prime * result + ((getMenuName() == null) ? 0 : getMenuName().hashCode());
        result = prime * result + ((getMenuSort() == null) ? 0 : getMenuSort().hashCode());
        result = prime * result + ((getMenuHref() == null) ? 0 : getMenuHref().hashCode());
        result = prime * result + ((getMenuTarget() == null) ? 0 : getMenuTarget().hashCode());
        result = prime * result + ((getMenuIcon() == null) ? 0 : getMenuIcon().hashCode());
        result = prime * result + ((getMenuIsShow() == null) ? 0 : getMenuIsShow().hashCode());
        result = prime * result + ((getMenuPermission() == null) ? 0 : getMenuPermission().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", menuParentId=").append(menuParentId);
        sb.append(", menuParentIds=").append(menuParentIds);
        sb.append(", menuName=").append(menuName);
        sb.append(", menuSort=").append(menuSort);
        sb.append(", menuHref=").append(menuHref);
        sb.append(", menuTarget=").append(menuTarget);
        sb.append(", menuIcon=").append(menuIcon);
        sb.append(", menuIsShow=").append(menuIsShow);
        sb.append(", menuPermission=").append(menuPermission);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", remarks=").append(remarks);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}