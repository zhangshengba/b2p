package com.cdut.b2p.modules.sys.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SysMenuExample() {
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

        public Criteria andMenuParentIdIsNull() {
            addCriterion("menu_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdIsNotNull() {
            addCriterion("menu_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdEqualTo(String value) {
            addCriterion("menu_parent_id =", value, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdNotEqualTo(String value) {
            addCriterion("menu_parent_id <>", value, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdGreaterThan(String value) {
            addCriterion("menu_parent_id >", value, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("menu_parent_id >=", value, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdLessThan(String value) {
            addCriterion("menu_parent_id <", value, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdLessThanOrEqualTo(String value) {
            addCriterion("menu_parent_id <=", value, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdLike(String value) {
            addCriterion("menu_parent_id like", value, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdNotLike(String value) {
            addCriterion("menu_parent_id not like", value, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdIn(List<String> values) {
            addCriterion("menu_parent_id in", values, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdNotIn(List<String> values) {
            addCriterion("menu_parent_id not in", values, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdBetween(String value1, String value2) {
            addCriterion("menu_parent_id between", value1, value2, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdNotBetween(String value1, String value2) {
            addCriterion("menu_parent_id not between", value1, value2, "menuParentId");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdsIsNull() {
            addCriterion("menu_parent_ids is null");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdsIsNotNull() {
            addCriterion("menu_parent_ids is not null");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdsEqualTo(String value) {
            addCriterion("menu_parent_ids =", value, "menuParentIds");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdsNotEqualTo(String value) {
            addCriterion("menu_parent_ids <>", value, "menuParentIds");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdsGreaterThan(String value) {
            addCriterion("menu_parent_ids >", value, "menuParentIds");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdsGreaterThanOrEqualTo(String value) {
            addCriterion("menu_parent_ids >=", value, "menuParentIds");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdsLessThan(String value) {
            addCriterion("menu_parent_ids <", value, "menuParentIds");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdsLessThanOrEqualTo(String value) {
            addCriterion("menu_parent_ids <=", value, "menuParentIds");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdsLike(String value) {
            addCriterion("menu_parent_ids like", value, "menuParentIds");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdsNotLike(String value) {
            addCriterion("menu_parent_ids not like", value, "menuParentIds");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdsIn(List<String> values) {
            addCriterion("menu_parent_ids in", values, "menuParentIds");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdsNotIn(List<String> values) {
            addCriterion("menu_parent_ids not in", values, "menuParentIds");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdsBetween(String value1, String value2) {
            addCriterion("menu_parent_ids between", value1, value2, "menuParentIds");
            return (Criteria) this;
        }

        public Criteria andMenuParentIdsNotBetween(String value1, String value2) {
            addCriterion("menu_parent_ids not between", value1, value2, "menuParentIds");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuSortIsNull() {
            addCriterion("menu_sort is null");
            return (Criteria) this;
        }

        public Criteria andMenuSortIsNotNull() {
            addCriterion("menu_sort is not null");
            return (Criteria) this;
        }

        public Criteria andMenuSortEqualTo(Long value) {
            addCriterion("menu_sort =", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotEqualTo(Long value) {
            addCriterion("menu_sort <>", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortGreaterThan(Long value) {
            addCriterion("menu_sort >", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortGreaterThanOrEqualTo(Long value) {
            addCriterion("menu_sort >=", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortLessThan(Long value) {
            addCriterion("menu_sort <", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortLessThanOrEqualTo(Long value) {
            addCriterion("menu_sort <=", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortIn(List<Long> values) {
            addCriterion("menu_sort in", values, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotIn(List<Long> values) {
            addCriterion("menu_sort not in", values, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortBetween(Long value1, Long value2) {
            addCriterion("menu_sort between", value1, value2, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotBetween(Long value1, Long value2) {
            addCriterion("menu_sort not between", value1, value2, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuHrefIsNull() {
            addCriterion("menu_href is null");
            return (Criteria) this;
        }

        public Criteria andMenuHrefIsNotNull() {
            addCriterion("menu_href is not null");
            return (Criteria) this;
        }

        public Criteria andMenuHrefEqualTo(String value) {
            addCriterion("menu_href =", value, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefNotEqualTo(String value) {
            addCriterion("menu_href <>", value, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefGreaterThan(String value) {
            addCriterion("menu_href >", value, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefGreaterThanOrEqualTo(String value) {
            addCriterion("menu_href >=", value, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefLessThan(String value) {
            addCriterion("menu_href <", value, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefLessThanOrEqualTo(String value) {
            addCriterion("menu_href <=", value, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefLike(String value) {
            addCriterion("menu_href like", value, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefNotLike(String value) {
            addCriterion("menu_href not like", value, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefIn(List<String> values) {
            addCriterion("menu_href in", values, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefNotIn(List<String> values) {
            addCriterion("menu_href not in", values, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefBetween(String value1, String value2) {
            addCriterion("menu_href between", value1, value2, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuHrefNotBetween(String value1, String value2) {
            addCriterion("menu_href not between", value1, value2, "menuHref");
            return (Criteria) this;
        }

        public Criteria andMenuTargetIsNull() {
            addCriterion("menu_target is null");
            return (Criteria) this;
        }

        public Criteria andMenuTargetIsNotNull() {
            addCriterion("menu_target is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTargetEqualTo(String value) {
            addCriterion("menu_target =", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetNotEqualTo(String value) {
            addCriterion("menu_target <>", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetGreaterThan(String value) {
            addCriterion("menu_target >", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetGreaterThanOrEqualTo(String value) {
            addCriterion("menu_target >=", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetLessThan(String value) {
            addCriterion("menu_target <", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetLessThanOrEqualTo(String value) {
            addCriterion("menu_target <=", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetLike(String value) {
            addCriterion("menu_target like", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetNotLike(String value) {
            addCriterion("menu_target not like", value, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetIn(List<String> values) {
            addCriterion("menu_target in", values, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetNotIn(List<String> values) {
            addCriterion("menu_target not in", values, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetBetween(String value1, String value2) {
            addCriterion("menu_target between", value1, value2, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuTargetNotBetween(String value1, String value2) {
            addCriterion("menu_target not between", value1, value2, "menuTarget");
            return (Criteria) this;
        }

        public Criteria andMenuIconIsNull() {
            addCriterion("menu_icon is null");
            return (Criteria) this;
        }

        public Criteria andMenuIconIsNotNull() {
            addCriterion("menu_icon is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIconEqualTo(String value) {
            addCriterion("menu_icon =", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotEqualTo(String value) {
            addCriterion("menu_icon <>", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThan(String value) {
            addCriterion("menu_icon >", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThanOrEqualTo(String value) {
            addCriterion("menu_icon >=", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThan(String value) {
            addCriterion("menu_icon <", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThanOrEqualTo(String value) {
            addCriterion("menu_icon <=", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLike(String value) {
            addCriterion("menu_icon like", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotLike(String value) {
            addCriterion("menu_icon not like", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconIn(List<String> values) {
            addCriterion("menu_icon in", values, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotIn(List<String> values) {
            addCriterion("menu_icon not in", values, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconBetween(String value1, String value2) {
            addCriterion("menu_icon between", value1, value2, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotBetween(String value1, String value2) {
            addCriterion("menu_icon not between", value1, value2, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIsShowIsNull() {
            addCriterion("menu_is_show is null");
            return (Criteria) this;
        }

        public Criteria andMenuIsShowIsNotNull() {
            addCriterion("menu_is_show is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIsShowEqualTo(String value) {
            addCriterion("menu_is_show =", value, "menuIsShow");
            return (Criteria) this;
        }

        public Criteria andMenuIsShowNotEqualTo(String value) {
            addCriterion("menu_is_show <>", value, "menuIsShow");
            return (Criteria) this;
        }

        public Criteria andMenuIsShowGreaterThan(String value) {
            addCriterion("menu_is_show >", value, "menuIsShow");
            return (Criteria) this;
        }

        public Criteria andMenuIsShowGreaterThanOrEqualTo(String value) {
            addCriterion("menu_is_show >=", value, "menuIsShow");
            return (Criteria) this;
        }

        public Criteria andMenuIsShowLessThan(String value) {
            addCriterion("menu_is_show <", value, "menuIsShow");
            return (Criteria) this;
        }

        public Criteria andMenuIsShowLessThanOrEqualTo(String value) {
            addCriterion("menu_is_show <=", value, "menuIsShow");
            return (Criteria) this;
        }

        public Criteria andMenuIsShowLike(String value) {
            addCriterion("menu_is_show like", value, "menuIsShow");
            return (Criteria) this;
        }

        public Criteria andMenuIsShowNotLike(String value) {
            addCriterion("menu_is_show not like", value, "menuIsShow");
            return (Criteria) this;
        }

        public Criteria andMenuIsShowIn(List<String> values) {
            addCriterion("menu_is_show in", values, "menuIsShow");
            return (Criteria) this;
        }

        public Criteria andMenuIsShowNotIn(List<String> values) {
            addCriterion("menu_is_show not in", values, "menuIsShow");
            return (Criteria) this;
        }

        public Criteria andMenuIsShowBetween(String value1, String value2) {
            addCriterion("menu_is_show between", value1, value2, "menuIsShow");
            return (Criteria) this;
        }

        public Criteria andMenuIsShowNotBetween(String value1, String value2) {
            addCriterion("menu_is_show not between", value1, value2, "menuIsShow");
            return (Criteria) this;
        }

        public Criteria andMenuPermissionIsNull() {
            addCriterion("menu_permission is null");
            return (Criteria) this;
        }

        public Criteria andMenuPermissionIsNotNull() {
            addCriterion("menu_permission is not null");
            return (Criteria) this;
        }

        public Criteria andMenuPermissionEqualTo(String value) {
            addCriterion("menu_permission =", value, "menuPermission");
            return (Criteria) this;
        }

        public Criteria andMenuPermissionNotEqualTo(String value) {
            addCriterion("menu_permission <>", value, "menuPermission");
            return (Criteria) this;
        }

        public Criteria andMenuPermissionGreaterThan(String value) {
            addCriterion("menu_permission >", value, "menuPermission");
            return (Criteria) this;
        }

        public Criteria andMenuPermissionGreaterThanOrEqualTo(String value) {
            addCriterion("menu_permission >=", value, "menuPermission");
            return (Criteria) this;
        }

        public Criteria andMenuPermissionLessThan(String value) {
            addCriterion("menu_permission <", value, "menuPermission");
            return (Criteria) this;
        }

        public Criteria andMenuPermissionLessThanOrEqualTo(String value) {
            addCriterion("menu_permission <=", value, "menuPermission");
            return (Criteria) this;
        }

        public Criteria andMenuPermissionLike(String value) {
            addCriterion("menu_permission like", value, "menuPermission");
            return (Criteria) this;
        }

        public Criteria andMenuPermissionNotLike(String value) {
            addCriterion("menu_permission not like", value, "menuPermission");
            return (Criteria) this;
        }

        public Criteria andMenuPermissionIn(List<String> values) {
            addCriterion("menu_permission in", values, "menuPermission");
            return (Criteria) this;
        }

        public Criteria andMenuPermissionNotIn(List<String> values) {
            addCriterion("menu_permission not in", values, "menuPermission");
            return (Criteria) this;
        }

        public Criteria andMenuPermissionBetween(String value1, String value2) {
            addCriterion("menu_permission between", value1, value2, "menuPermission");
            return (Criteria) this;
        }

        public Criteria andMenuPermissionNotBetween(String value1, String value2) {
            addCriterion("menu_permission not between", value1, value2, "menuPermission");
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

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
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