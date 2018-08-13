package com.cdut.b2p.modules.sys.po;

import java.io.Serializable;

/**
 * sys_log
 * @author 
 */
public class SysLogWithBLOBs extends SysLog implements Serializable {
    /**
     * 操作提交的数据
     */
    private String logParams;

    /**
     * 异常信息
     */
    private String logException;

    private static final long serialVersionUID = 1L;

    public String getLogParams() {
        return logParams;
    }

    public void setLogParams(String logParams) {
        this.logParams = logParams;
    }

    public String getLogException() {
        return logException;
    }

    public void setLogException(String logException) {
        this.logException = logException;
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
        SysLogWithBLOBs other = (SysLogWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLogType() == null ? other.getLogType() == null : this.getLogType().equals(other.getLogType()))
            && (this.getLogTitle() == null ? other.getLogTitle() == null : this.getLogTitle().equals(other.getLogTitle()))
            && (this.getLogRemoteAddr() == null ? other.getLogRemoteAddr() == null : this.getLogRemoteAddr().equals(other.getLogRemoteAddr()))
            && (this.getLogUserAgent() == null ? other.getLogUserAgent() == null : this.getLogUserAgent().equals(other.getLogUserAgent()))
            && (this.getLogRequestUri() == null ? other.getLogRequestUri() == null : this.getLogRequestUri().equals(other.getLogRequestUri()))
            && (this.getLogMethod() == null ? other.getLogMethod() == null : this.getLogMethod().equals(other.getLogMethod()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getLogParams() == null ? other.getLogParams() == null : this.getLogParams().equals(other.getLogParams()))
            && (this.getLogException() == null ? other.getLogException() == null : this.getLogException().equals(other.getLogException()));
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
        result = prime * result + ((getLogParams() == null) ? 0 : getLogParams().hashCode());
        result = prime * result + ((getLogException() == null) ? 0 : getLogException().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logParams=").append(logParams);
        sb.append(", logException=").append(logException);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}