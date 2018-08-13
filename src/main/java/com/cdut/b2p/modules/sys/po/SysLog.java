package com.cdut.b2p.modules.sys.po;

import java.io.Serializable;
import java.util.Date;

/**
 * sys_log
 * @author 
 */
public class SysLog implements Serializable {
    /**
     * 编号
     */
    private String id;

    /**
     * 日志类型
     */
    private String logType;

    /**
     * 日志标题
     */
    private String logTitle;

    /**
     * 操作IP地址
     */
    private String logRemoteAddr;

    /**
     * 用户代理
     */
    private String logUserAgent;

    /**
     * 请求URI
     */
    private String logRequestUri;

    /**
     * 操作方式
     */
    private String logMethod;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createDate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getLogTitle() {
        return logTitle;
    }

    public void setLogTitle(String logTitle) {
        this.logTitle = logTitle;
    }

    public String getLogRemoteAddr() {
        return logRemoteAddr;
    }

    public void setLogRemoteAddr(String logRemoteAddr) {
        this.logRemoteAddr = logRemoteAddr;
    }

    public String getLogUserAgent() {
        return logUserAgent;
    }

    public void setLogUserAgent(String logUserAgent) {
        this.logUserAgent = logUserAgent;
    }

    public String getLogRequestUri() {
        return logRequestUri;
    }

    public void setLogRequestUri(String logRequestUri) {
        this.logRequestUri = logRequestUri;
    }

    public String getLogMethod() {
        return logMethod;
    }

    public void setLogMethod(String logMethod) {
        this.logMethod = logMethod;
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
        SysLog other = (SysLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLogType() == null ? other.getLogType() == null : this.getLogType().equals(other.getLogType()))
            && (this.getLogTitle() == null ? other.getLogTitle() == null : this.getLogTitle().equals(other.getLogTitle()))
            && (this.getLogRemoteAddr() == null ? other.getLogRemoteAddr() == null : this.getLogRemoteAddr().equals(other.getLogRemoteAddr()))
            && (this.getLogUserAgent() == null ? other.getLogUserAgent() == null : this.getLogUserAgent().equals(other.getLogUserAgent()))
            && (this.getLogRequestUri() == null ? other.getLogRequestUri() == null : this.getLogRequestUri().equals(other.getLogRequestUri()))
            && (this.getLogMethod() == null ? other.getLogMethod() == null : this.getLogMethod().equals(other.getLogMethod()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLogType() == null) ? 0 : getLogType().hashCode());
        result = prime * result + ((getLogTitle() == null) ? 0 : getLogTitle().hashCode());
        result = prime * result + ((getLogRemoteAddr() == null) ? 0 : getLogRemoteAddr().hashCode());
        result = prime * result + ((getLogUserAgent() == null) ? 0 : getLogUserAgent().hashCode());
        result = prime * result + ((getLogRequestUri() == null) ? 0 : getLogRequestUri().hashCode());
        result = prime * result + ((getLogMethod() == null) ? 0 : getLogMethod().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", logType=").append(logType);
        sb.append(", logTitle=").append(logTitle);
        sb.append(", logRemoteAddr=").append(logRemoteAddr);
        sb.append(", logUserAgent=").append(logUserAgent);
        sb.append(", logRequestUri=").append(logRequestUri);
        sb.append(", logMethod=").append(logMethod);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}