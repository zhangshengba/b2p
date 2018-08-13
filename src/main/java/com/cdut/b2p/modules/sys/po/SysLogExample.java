package com.cdut.b2p.modules.sys.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SysLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNull() {
            addCriterion("log_type is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("log_type is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(String value) {
            addCriterion("log_type =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(String value) {
            addCriterion("log_type <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(String value) {
            addCriterion("log_type >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("log_type >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(String value) {
            addCriterion("log_type <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(String value) {
            addCriterion("log_type <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLike(String value) {
            addCriterion("log_type like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotLike(String value) {
            addCriterion("log_type not like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<String> values) {
            addCriterion("log_type in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<String> values) {
            addCriterion("log_type not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(String value1, String value2) {
            addCriterion("log_type between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(String value1, String value2) {
            addCriterion("log_type not between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTitleIsNull() {
            addCriterion("log_title is null");
            return (Criteria) this;
        }

        public Criteria andLogTitleIsNotNull() {
            addCriterion("log_title is not null");
            return (Criteria) this;
        }

        public Criteria andLogTitleEqualTo(String value) {
            addCriterion("log_title =", value, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleNotEqualTo(String value) {
            addCriterion("log_title <>", value, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleGreaterThan(String value) {
            addCriterion("log_title >", value, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleGreaterThanOrEqualTo(String value) {
            addCriterion("log_title >=", value, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleLessThan(String value) {
            addCriterion("log_title <", value, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleLessThanOrEqualTo(String value) {
            addCriterion("log_title <=", value, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleLike(String value) {
            addCriterion("log_title like", value, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleNotLike(String value) {
            addCriterion("log_title not like", value, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleIn(List<String> values) {
            addCriterion("log_title in", values, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleNotIn(List<String> values) {
            addCriterion("log_title not in", values, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleBetween(String value1, String value2) {
            addCriterion("log_title between", value1, value2, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogTitleNotBetween(String value1, String value2) {
            addCriterion("log_title not between", value1, value2, "logTitle");
            return (Criteria) this;
        }

        public Criteria andLogRemoteAddrIsNull() {
            addCriterion("log_remote_addr is null");
            return (Criteria) this;
        }

        public Criteria andLogRemoteAddrIsNotNull() {
            addCriterion("log_remote_addr is not null");
            return (Criteria) this;
        }

        public Criteria andLogRemoteAddrEqualTo(String value) {
            addCriterion("log_remote_addr =", value, "logRemoteAddr");
            return (Criteria) this;
        }

        public Criteria andLogRemoteAddrNotEqualTo(String value) {
            addCriterion("log_remote_addr <>", value, "logRemoteAddr");
            return (Criteria) this;
        }

        public Criteria andLogRemoteAddrGreaterThan(String value) {
            addCriterion("log_remote_addr >", value, "logRemoteAddr");
            return (Criteria) this;
        }

        public Criteria andLogRemoteAddrGreaterThanOrEqualTo(String value) {
            addCriterion("log_remote_addr >=", value, "logRemoteAddr");
            return (Criteria) this;
        }

        public Criteria andLogRemoteAddrLessThan(String value) {
            addCriterion("log_remote_addr <", value, "logRemoteAddr");
            return (Criteria) this;
        }

        public Criteria andLogRemoteAddrLessThanOrEqualTo(String value) {
            addCriterion("log_remote_addr <=", value, "logRemoteAddr");
            return (Criteria) this;
        }

        public Criteria andLogRemoteAddrLike(String value) {
            addCriterion("log_remote_addr like", value, "logRemoteAddr");
            return (Criteria) this;
        }

        public Criteria andLogRemoteAddrNotLike(String value) {
            addCriterion("log_remote_addr not like", value, "logRemoteAddr");
            return (Criteria) this;
        }

        public Criteria andLogRemoteAddrIn(List<String> values) {
            addCriterion("log_remote_addr in", values, "logRemoteAddr");
            return (Criteria) this;
        }

        public Criteria andLogRemoteAddrNotIn(List<String> values) {
            addCriterion("log_remote_addr not in", values, "logRemoteAddr");
            return (Criteria) this;
        }

        public Criteria andLogRemoteAddrBetween(String value1, String value2) {
            addCriterion("log_remote_addr between", value1, value2, "logRemoteAddr");
            return (Criteria) this;
        }

        public Criteria andLogRemoteAddrNotBetween(String value1, String value2) {
            addCriterion("log_remote_addr not between", value1, value2, "logRemoteAddr");
            return (Criteria) this;
        }

        public Criteria andLogUserAgentIsNull() {
            addCriterion("log_user_agent is null");
            return (Criteria) this;
        }

        public Criteria andLogUserAgentIsNotNull() {
            addCriterion("log_user_agent is not null");
            return (Criteria) this;
        }

        public Criteria andLogUserAgentEqualTo(String value) {
            addCriterion("log_user_agent =", value, "logUserAgent");
            return (Criteria) this;
        }

        public Criteria andLogUserAgentNotEqualTo(String value) {
            addCriterion("log_user_agent <>", value, "logUserAgent");
            return (Criteria) this;
        }

        public Criteria andLogUserAgentGreaterThan(String value) {
            addCriterion("log_user_agent >", value, "logUserAgent");
            return (Criteria) this;
        }

        public Criteria andLogUserAgentGreaterThanOrEqualTo(String value) {
            addCriterion("log_user_agent >=", value, "logUserAgent");
            return (Criteria) this;
        }

        public Criteria andLogUserAgentLessThan(String value) {
            addCriterion("log_user_agent <", value, "logUserAgent");
            return (Criteria) this;
        }

        public Criteria andLogUserAgentLessThanOrEqualTo(String value) {
            addCriterion("log_user_agent <=", value, "logUserAgent");
            return (Criteria) this;
        }

        public Criteria andLogUserAgentLike(String value) {
            addCriterion("log_user_agent like", value, "logUserAgent");
            return (Criteria) this;
        }

        public Criteria andLogUserAgentNotLike(String value) {
            addCriterion("log_user_agent not like", value, "logUserAgent");
            return (Criteria) this;
        }

        public Criteria andLogUserAgentIn(List<String> values) {
            addCriterion("log_user_agent in", values, "logUserAgent");
            return (Criteria) this;
        }

        public Criteria andLogUserAgentNotIn(List<String> values) {
            addCriterion("log_user_agent not in", values, "logUserAgent");
            return (Criteria) this;
        }

        public Criteria andLogUserAgentBetween(String value1, String value2) {
            addCriterion("log_user_agent between", value1, value2, "logUserAgent");
            return (Criteria) this;
        }

        public Criteria andLogUserAgentNotBetween(String value1, String value2) {
            addCriterion("log_user_agent not between", value1, value2, "logUserAgent");
            return (Criteria) this;
        }

        public Criteria andLogRequestUriIsNull() {
            addCriterion("log_request_uri is null");
            return (Criteria) this;
        }

        public Criteria andLogRequestUriIsNotNull() {
            addCriterion("log_request_uri is not null");
            return (Criteria) this;
        }

        public Criteria andLogRequestUriEqualTo(String value) {
            addCriterion("log_request_uri =", value, "logRequestUri");
            return (Criteria) this;
        }

        public Criteria andLogRequestUriNotEqualTo(String value) {
            addCriterion("log_request_uri <>", value, "logRequestUri");
            return (Criteria) this;
        }

        public Criteria andLogRequestUriGreaterThan(String value) {
            addCriterion("log_request_uri >", value, "logRequestUri");
            return (Criteria) this;
        }

        public Criteria andLogRequestUriGreaterThanOrEqualTo(String value) {
            addCriterion("log_request_uri >=", value, "logRequestUri");
            return (Criteria) this;
        }

        public Criteria andLogRequestUriLessThan(String value) {
            addCriterion("log_request_uri <", value, "logRequestUri");
            return (Criteria) this;
        }

        public Criteria andLogRequestUriLessThanOrEqualTo(String value) {
            addCriterion("log_request_uri <=", value, "logRequestUri");
            return (Criteria) this;
        }

        public Criteria andLogRequestUriLike(String value) {
            addCriterion("log_request_uri like", value, "logRequestUri");
            return (Criteria) this;
        }

        public Criteria andLogRequestUriNotLike(String value) {
            addCriterion("log_request_uri not like", value, "logRequestUri");
            return (Criteria) this;
        }

        public Criteria andLogRequestUriIn(List<String> values) {
            addCriterion("log_request_uri in", values, "logRequestUri");
            return (Criteria) this;
        }

        public Criteria andLogRequestUriNotIn(List<String> values) {
            addCriterion("log_request_uri not in", values, "logRequestUri");
            return (Criteria) this;
        }

        public Criteria andLogRequestUriBetween(String value1, String value2) {
            addCriterion("log_request_uri between", value1, value2, "logRequestUri");
            return (Criteria) this;
        }

        public Criteria andLogRequestUriNotBetween(String value1, String value2) {
            addCriterion("log_request_uri not between", value1, value2, "logRequestUri");
            return (Criteria) this;
        }

        public Criteria andLogMethodIsNull() {
            addCriterion("log_method is null");
            return (Criteria) this;
        }

        public Criteria andLogMethodIsNotNull() {
            addCriterion("log_method is not null");
            return (Criteria) this;
        }

        public Criteria andLogMethodEqualTo(String value) {
            addCriterion("log_method =", value, "logMethod");
            return (Criteria) this;
        }

        public Criteria andLogMethodNotEqualTo(String value) {
            addCriterion("log_method <>", value, "logMethod");
            return (Criteria) this;
        }

        public Criteria andLogMethodGreaterThan(String value) {
            addCriterion("log_method >", value, "logMethod");
            return (Criteria) this;
        }

        public Criteria andLogMethodGreaterThanOrEqualTo(String value) {
            addCriterion("log_method >=", value, "logMethod");
            return (Criteria) this;
        }

        public Criteria andLogMethodLessThan(String value) {
            addCriterion("log_method <", value, "logMethod");
            return (Criteria) this;
        }

        public Criteria andLogMethodLessThanOrEqualTo(String value) {
            addCriterion("log_method <=", value, "logMethod");
            return (Criteria) this;
        }

        public Criteria andLogMethodLike(String value) {
            addCriterion("log_method like", value, "logMethod");
            return (Criteria) this;
        }

        public Criteria andLogMethodNotLike(String value) {
            addCriterion("log_method not like", value, "logMethod");
            return (Criteria) this;
        }

        public Criteria andLogMethodIn(List<String> values) {
            addCriterion("log_method in", values, "logMethod");
            return (Criteria) this;
        }

        public Criteria andLogMethodNotIn(List<String> values) {
            addCriterion("log_method not in", values, "logMethod");
            return (Criteria) this;
        }

        public Criteria andLogMethodBetween(String value1, String value2) {
            addCriterion("log_method between", value1, value2, "logMethod");
            return (Criteria) this;
        }

        public Criteria andLogMethodNotBetween(String value1, String value2) {
            addCriterion("log_method not between", value1, value2, "logMethod");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}