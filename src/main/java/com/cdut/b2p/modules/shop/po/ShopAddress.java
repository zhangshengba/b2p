package com.cdut.b2p.modules.shop.po;

import java.io.Serializable;
import java.util.Date;

/**
 * shop_address
 * @author 
 */
public class ShopAddress implements Serializable {
    /**
     * 编号
     */
    private String id;

    /**
     * 地址用户id
     */
    private String addressUserId;

    /**
     * 地区id
     */
    private String addressAreaId;

    /**
     * 详细地址
     */
    private String addressDetail;

    /**
     * 收货人名字
     */
    private String addressReceiverName;

    /**
     * 收货人电话
     */
    private String addressTelphone;

    /**
     * 邮政编码
     */
    private String addressZipcode;

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

    public String getAddressUserId() {
        return addressUserId;
    }

    public void setAddressUserId(String addressUserId) {
        this.addressUserId = addressUserId;
    }

    public String getAddressAreaId() {
        return addressAreaId;
    }

    public void setAddressAreaId(String addressAreaId) {
        this.addressAreaId = addressAreaId;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getAddressReceiverName() {
        return addressReceiverName;
    }

    public void setAddressReceiverName(String addressReceiverName) {
        this.addressReceiverName = addressReceiverName;
    }

    public String getAddressTelphone() {
        return addressTelphone;
    }

    public void setAddressTelphone(String addressTelphone) {
        this.addressTelphone = addressTelphone;
    }

    public String getAddressZipcode() {
        return addressZipcode;
    }

    public void setAddressZipcode(String addressZipcode) {
        this.addressZipcode = addressZipcode;
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
        ShopAddress other = (ShopAddress) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAddressUserId() == null ? other.getAddressUserId() == null : this.getAddressUserId().equals(other.getAddressUserId()))
            && (this.getAddressAreaId() == null ? other.getAddressAreaId() == null : this.getAddressAreaId().equals(other.getAddressAreaId()))
            && (this.getAddressDetail() == null ? other.getAddressDetail() == null : this.getAddressDetail().equals(other.getAddressDetail()))
            && (this.getAddressReceiverName() == null ? other.getAddressReceiverName() == null : this.getAddressReceiverName().equals(other.getAddressReceiverName()))
            && (this.getAddressTelphone() == null ? other.getAddressTelphone() == null : this.getAddressTelphone().equals(other.getAddressTelphone()))
            && (this.getAddressZipcode() == null ? other.getAddressZipcode() == null : this.getAddressZipcode().equals(other.getAddressZipcode()))
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
        result = prime * result + ((getAddressUserId() == null) ? 0 : getAddressUserId().hashCode());
        result = prime * result + ((getAddressAreaId() == null) ? 0 : getAddressAreaId().hashCode());
        result = prime * result + ((getAddressDetail() == null) ? 0 : getAddressDetail().hashCode());
        result = prime * result + ((getAddressReceiverName() == null) ? 0 : getAddressReceiverName().hashCode());
        result = prime * result + ((getAddressTelphone() == null) ? 0 : getAddressTelphone().hashCode());
        result = prime * result + ((getAddressZipcode() == null) ? 0 : getAddressZipcode().hashCode());
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
        sb.append(", addressUserId=").append(addressUserId);
        sb.append(", addressAreaId=").append(addressAreaId);
        sb.append(", addressDetail=").append(addressDetail);
        sb.append(", addressReceiverName=").append(addressReceiverName);
        sb.append(", addressTelphone=").append(addressTelphone);
        sb.append(", addressZipcode=").append(addressZipcode);
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