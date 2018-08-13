package com.cdut.b2p.modules.shop.po;

import java.io.Serializable;
import java.util.Date;

/**
 * shop_workorder
 * @author 
 */
public class ShopWorkorder implements Serializable {
    /**
     * 编号
     */
    private String id;

    /**
     * 对应用户id
     */
    private String workorderUserId;

    /**
     * 申请理由
     */
    private String workorderReason;

    /**
     * 申请状态
     */
    private String workorderStatus;

    /**
     * 申请种类
     */
    private String workorderTypeId;

    /**
     * 申请对方
     */
    private String workorderReceiverId;

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

    public String getWorkorderUserId() {
        return workorderUserId;
    }

    public void setWorkorderUserId(String workorderUserId) {
        this.workorderUserId = workorderUserId;
    }

    public String getWorkorderReason() {
        return workorderReason;
    }

    public void setWorkorderReason(String workorderReason) {
        this.workorderReason = workorderReason;
    }

    public String getWorkorderStatus() {
        return workorderStatus;
    }

    public void setWorkorderStatus(String workorderStatus) {
        this.workorderStatus = workorderStatus;
    }

    public String getWorkorderTypeId() {
        return workorderTypeId;
    }

    public void setWorkorderTypeId(String workorderTypeId) {
        this.workorderTypeId = workorderTypeId;
    }

    public String getWorkorderReceiverId() {
        return workorderReceiverId;
    }

    public void setWorkorderReceiverId(String workorderReceiverId) {
        this.workorderReceiverId = workorderReceiverId;
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
        ShopWorkorder other = (ShopWorkorder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWorkorderUserId() == null ? other.getWorkorderUserId() == null : this.getWorkorderUserId().equals(other.getWorkorderUserId()))
            && (this.getWorkorderReason() == null ? other.getWorkorderReason() == null : this.getWorkorderReason().equals(other.getWorkorderReason()))
            && (this.getWorkorderStatus() == null ? other.getWorkorderStatus() == null : this.getWorkorderStatus().equals(other.getWorkorderStatus()))
            && (this.getWorkorderTypeId() == null ? other.getWorkorderTypeId() == null : this.getWorkorderTypeId().equals(other.getWorkorderTypeId()))
            && (this.getWorkorderReceiverId() == null ? other.getWorkorderReceiverId() == null : this.getWorkorderReceiverId().equals(other.getWorkorderReceiverId()))
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
        result = prime * result + ((getWorkorderUserId() == null) ? 0 : getWorkorderUserId().hashCode());
        result = prime * result + ((getWorkorderReason() == null) ? 0 : getWorkorderReason().hashCode());
        result = prime * result + ((getWorkorderStatus() == null) ? 0 : getWorkorderStatus().hashCode());
        result = prime * result + ((getWorkorderTypeId() == null) ? 0 : getWorkorderTypeId().hashCode());
        result = prime * result + ((getWorkorderReceiverId() == null) ? 0 : getWorkorderReceiverId().hashCode());
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
        sb.append(", workorderUserId=").append(workorderUserId);
        sb.append(", workorderReason=").append(workorderReason);
        sb.append(", workorderStatus=").append(workorderStatus);
        sb.append(", workorderTypeId=").append(workorderTypeId);
        sb.append(", workorderReceiverId=").append(workorderReceiverId);
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