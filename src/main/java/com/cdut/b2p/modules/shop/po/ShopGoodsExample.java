package com.cdut.b2p.modules.shop.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ShopGoodsExample() {
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

        public Criteria andGoodsCategoryIdIsNull() {
            addCriterion("goods_category_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdIsNotNull() {
            addCriterion("goods_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdEqualTo(String value) {
            addCriterion("goods_category_id =", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdNotEqualTo(String value) {
            addCriterion("goods_category_id <>", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdGreaterThan(String value) {
            addCriterion("goods_category_id >", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_category_id >=", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdLessThan(String value) {
            addCriterion("goods_category_id <", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("goods_category_id <=", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdLike(String value) {
            addCriterion("goods_category_id like", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdNotLike(String value) {
            addCriterion("goods_category_id not like", value, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdIn(List<String> values) {
            addCriterion("goods_category_id in", values, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdNotIn(List<String> values) {
            addCriterion("goods_category_id not in", values, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdBetween(String value1, String value2) {
            addCriterion("goods_category_id between", value1, value2, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryIdNotBetween(String value1, String value2) {
            addCriterion("goods_category_id not between", value1, value2, "goodsCategoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdIsNull() {
            addCriterion("goods_seller_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdIsNotNull() {
            addCriterion("goods_seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdEqualTo(String value) {
            addCriterion("goods_seller_id =", value, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdNotEqualTo(String value) {
            addCriterion("goods_seller_id <>", value, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdGreaterThan(String value) {
            addCriterion("goods_seller_id >", value, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_seller_id >=", value, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdLessThan(String value) {
            addCriterion("goods_seller_id <", value, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdLessThanOrEqualTo(String value) {
            addCriterion("goods_seller_id <=", value, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdLike(String value) {
            addCriterion("goods_seller_id like", value, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdNotLike(String value) {
            addCriterion("goods_seller_id not like", value, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdIn(List<String> values) {
            addCriterion("goods_seller_id in", values, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdNotIn(List<String> values) {
            addCriterion("goods_seller_id not in", values, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdBetween(String value1, String value2) {
            addCriterion("goods_seller_id between", value1, value2, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdNotBetween(String value1, String value2) {
            addCriterion("goods_seller_id not between", value1, value2, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsAreaIdIsNull() {
            addCriterion("goods_area_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAreaIdIsNotNull() {
            addCriterion("goods_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAreaIdEqualTo(String value) {
            addCriterion("goods_area_id =", value, "goodsAreaId");
            return (Criteria) this;
        }

        public Criteria andGoodsAreaIdNotEqualTo(String value) {
            addCriterion("goods_area_id <>", value, "goodsAreaId");
            return (Criteria) this;
        }

        public Criteria andGoodsAreaIdGreaterThan(String value) {
            addCriterion("goods_area_id >", value, "goodsAreaId");
            return (Criteria) this;
        }

        public Criteria andGoodsAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_area_id >=", value, "goodsAreaId");
            return (Criteria) this;
        }

        public Criteria andGoodsAreaIdLessThan(String value) {
            addCriterion("goods_area_id <", value, "goodsAreaId");
            return (Criteria) this;
        }

        public Criteria andGoodsAreaIdLessThanOrEqualTo(String value) {
            addCriterion("goods_area_id <=", value, "goodsAreaId");
            return (Criteria) this;
        }

        public Criteria andGoodsAreaIdLike(String value) {
            addCriterion("goods_area_id like", value, "goodsAreaId");
            return (Criteria) this;
        }

        public Criteria andGoodsAreaIdNotLike(String value) {
            addCriterion("goods_area_id not like", value, "goodsAreaId");
            return (Criteria) this;
        }

        public Criteria andGoodsAreaIdIn(List<String> values) {
            addCriterion("goods_area_id in", values, "goodsAreaId");
            return (Criteria) this;
        }

        public Criteria andGoodsAreaIdNotIn(List<String> values) {
            addCriterion("goods_area_id not in", values, "goodsAreaId");
            return (Criteria) this;
        }

        public Criteria andGoodsAreaIdBetween(String value1, String value2) {
            addCriterion("goods_area_id between", value1, value2, "goodsAreaId");
            return (Criteria) this;
        }

        public Criteria andGoodsAreaIdNotBetween(String value1, String value2) {
            addCriterion("goods_area_id not between", value1, value2, "goodsAreaId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdIsNull() {
            addCriterion("goods_brand_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdIsNotNull() {
            addCriterion("goods_brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdEqualTo(String value) {
            addCriterion("goods_brand_id =", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdNotEqualTo(String value) {
            addCriterion("goods_brand_id <>", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdGreaterThan(String value) {
            addCriterion("goods_brand_id >", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_brand_id >=", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdLessThan(String value) {
            addCriterion("goods_brand_id <", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdLessThanOrEqualTo(String value) {
            addCriterion("goods_brand_id <=", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdLike(String value) {
            addCriterion("goods_brand_id like", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdNotLike(String value) {
            addCriterion("goods_brand_id not like", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdIn(List<String> values) {
            addCriterion("goods_brand_id in", values, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdNotIn(List<String> values) {
            addCriterion("goods_brand_id not in", values, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdBetween(String value1, String value2) {
            addCriterion("goods_brand_id between", value1, value2, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdNotBetween(String value1, String value2) {
            addCriterion("goods_brand_id not between", value1, value2, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandModelIsNull() {
            addCriterion("goods_brand_model is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandModelIsNotNull() {
            addCriterion("goods_brand_model is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandModelEqualTo(String value) {
            addCriterion("goods_brand_model =", value, "goodsBrandModel");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandModelNotEqualTo(String value) {
            addCriterion("goods_brand_model <>", value, "goodsBrandModel");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandModelGreaterThan(String value) {
            addCriterion("goods_brand_model >", value, "goodsBrandModel");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandModelGreaterThanOrEqualTo(String value) {
            addCriterion("goods_brand_model >=", value, "goodsBrandModel");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandModelLessThan(String value) {
            addCriterion("goods_brand_model <", value, "goodsBrandModel");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandModelLessThanOrEqualTo(String value) {
            addCriterion("goods_brand_model <=", value, "goodsBrandModel");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandModelLike(String value) {
            addCriterion("goods_brand_model like", value, "goodsBrandModel");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandModelNotLike(String value) {
            addCriterion("goods_brand_model not like", value, "goodsBrandModel");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandModelIn(List<String> values) {
            addCriterion("goods_brand_model in", values, "goodsBrandModel");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandModelNotIn(List<String> values) {
            addCriterion("goods_brand_model not in", values, "goodsBrandModel");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandModelBetween(String value1, String value2) {
            addCriterion("goods_brand_model between", value1, value2, "goodsBrandModel");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandModelNotBetween(String value1, String value2) {
            addCriterion("goods_brand_model not between", value1, value2, "goodsBrandModel");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIsNull() {
            addCriterion("goods_title is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIsNotNull() {
            addCriterion("goods_title is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleEqualTo(String value) {
            addCriterion("goods_title =", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotEqualTo(String value) {
            addCriterion("goods_title <>", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleGreaterThan(String value) {
            addCriterion("goods_title >", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("goods_title >=", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLessThan(String value) {
            addCriterion("goods_title <", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLessThanOrEqualTo(String value) {
            addCriterion("goods_title <=", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLike(String value) {
            addCriterion("goods_title like", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotLike(String value) {
            addCriterion("goods_title not like", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIn(List<String> values) {
            addCriterion("goods_title in", values, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotIn(List<String> values) {
            addCriterion("goods_title not in", values, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleBetween(String value1, String value2) {
            addCriterion("goods_title between", value1, value2, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotBetween(String value1, String value2) {
            addCriterion("goods_title not between", value1, value2, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceIsNull() {
            addCriterion("goods_original_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceIsNotNull() {
            addCriterion("goods_original_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceEqualTo(BigDecimal value) {
            addCriterion("goods_original_price =", value, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_original_price <>", value, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_original_price >", value, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_original_price >=", value, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceLessThan(BigDecimal value) {
            addCriterion("goods_original_price <", value, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_original_price <=", value, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceIn(List<BigDecimal> values) {
            addCriterion("goods_original_price in", values, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_original_price not in", values, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_original_price between", value1, value2, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_original_price not between", value1, value2, "goodsOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPresentPriceIsNull() {
            addCriterion("goods_present_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPresentPriceIsNotNull() {
            addCriterion("goods_present_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPresentPriceEqualTo(BigDecimal value) {
            addCriterion("goods_present_price =", value, "goodsPresentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPresentPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_present_price <>", value, "goodsPresentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPresentPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_present_price >", value, "goodsPresentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPresentPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_present_price >=", value, "goodsPresentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPresentPriceLessThan(BigDecimal value) {
            addCriterion("goods_present_price <", value, "goodsPresentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPresentPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_present_price <=", value, "goodsPresentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPresentPriceIn(List<BigDecimal> values) {
            addCriterion("goods_present_price in", values, "goodsPresentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPresentPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_present_price not in", values, "goodsPresentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPresentPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_present_price between", value1, value2, "goodsPresentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPresentPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_present_price not between", value1, value2, "goodsPresentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldLevelIsNull() {
            addCriterion("goods_old_level is null");
            return (Criteria) this;
        }

        public Criteria andGoodsOldLevelIsNotNull() {
            addCriterion("goods_old_level is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsOldLevelEqualTo(String value) {
            addCriterion("goods_old_level =", value, "goodsOldLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsOldLevelNotEqualTo(String value) {
            addCriterion("goods_old_level <>", value, "goodsOldLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsOldLevelGreaterThan(String value) {
            addCriterion("goods_old_level >", value, "goodsOldLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsOldLevelGreaterThanOrEqualTo(String value) {
            addCriterion("goods_old_level >=", value, "goodsOldLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsOldLevelLessThan(String value) {
            addCriterion("goods_old_level <", value, "goodsOldLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsOldLevelLessThanOrEqualTo(String value) {
            addCriterion("goods_old_level <=", value, "goodsOldLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsOldLevelLike(String value) {
            addCriterion("goods_old_level like", value, "goodsOldLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsOldLevelNotLike(String value) {
            addCriterion("goods_old_level not like", value, "goodsOldLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsOldLevelIn(List<String> values) {
            addCriterion("goods_old_level in", values, "goodsOldLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsOldLevelNotIn(List<String> values) {
            addCriterion("goods_old_level not in", values, "goodsOldLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsOldLevelBetween(String value1, String value2) {
            addCriterion("goods_old_level between", value1, value2, "goodsOldLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsOldLevelNotBetween(String value1, String value2) {
            addCriterion("goods_old_level not between", value1, value2, "goodsOldLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNull() {
            addCriterion("goods_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNotNull() {
            addCriterion("goods_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusEqualTo(String value) {
            addCriterion("goods_status =", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotEqualTo(String value) {
            addCriterion("goods_status <>", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThan(String value) {
            addCriterion("goods_status >", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("goods_status >=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThan(String value) {
            addCriterion("goods_status <", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThanOrEqualTo(String value) {
            addCriterion("goods_status <=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLike(String value) {
            addCriterion("goods_status like", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotLike(String value) {
            addCriterion("goods_status not like", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIn(List<String> values) {
            addCriterion("goods_status in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotIn(List<String> values) {
            addCriterion("goods_status not in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusBetween(String value1, String value2) {
            addCriterion("goods_status between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotBetween(String value1, String value2) {
            addCriterion("goods_status not between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsClickTimesIsNull() {
            addCriterion("goods_click_times is null");
            return (Criteria) this;
        }

        public Criteria andGoodsClickTimesIsNotNull() {
            addCriterion("goods_click_times is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsClickTimesEqualTo(Integer value) {
            addCriterion("goods_click_times =", value, "goodsClickTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsClickTimesNotEqualTo(Integer value) {
            addCriterion("goods_click_times <>", value, "goodsClickTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsClickTimesGreaterThan(Integer value) {
            addCriterion("goods_click_times >", value, "goodsClickTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsClickTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_click_times >=", value, "goodsClickTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsClickTimesLessThan(Integer value) {
            addCriterion("goods_click_times <", value, "goodsClickTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsClickTimesLessThanOrEqualTo(Integer value) {
            addCriterion("goods_click_times <=", value, "goodsClickTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsClickTimesIn(List<Integer> values) {
            addCriterion("goods_click_times in", values, "goodsClickTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsClickTimesNotIn(List<Integer> values) {
            addCriterion("goods_click_times not in", values, "goodsClickTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsClickTimesBetween(Integer value1, Integer value2) {
            addCriterion("goods_click_times between", value1, value2, "goodsClickTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsClickTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_click_times not between", value1, value2, "goodsClickTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsIsNull() {
            addCriterion("goods_pics is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsIsNotNull() {
            addCriterion("goods_pics is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsEqualTo(String value) {
            addCriterion("goods_pics =", value, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsNotEqualTo(String value) {
            addCriterion("goods_pics <>", value, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsGreaterThan(String value) {
            addCriterion("goods_pics >", value, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_pics >=", value, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsLessThan(String value) {
            addCriterion("goods_pics <", value, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsLessThanOrEqualTo(String value) {
            addCriterion("goods_pics <=", value, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsLike(String value) {
            addCriterion("goods_pics like", value, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsNotLike(String value) {
            addCriterion("goods_pics not like", value, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsIn(List<String> values) {
            addCriterion("goods_pics in", values, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsNotIn(List<String> values) {
            addCriterion("goods_pics not in", values, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsBetween(String value1, String value2) {
            addCriterion("goods_pics between", value1, value2, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsNotBetween(String value1, String value2) {
            addCriterion("goods_pics not between", value1, value2, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeIsNull() {
            addCriterion("goods_up_time is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeIsNotNull() {
            addCriterion("goods_up_time is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeEqualTo(Date value) {
            addCriterion("goods_up_time =", value, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeNotEqualTo(Date value) {
            addCriterion("goods_up_time <>", value, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeGreaterThan(Date value) {
            addCriterion("goods_up_time >", value, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_up_time >=", value, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeLessThan(Date value) {
            addCriterion("goods_up_time <", value, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_up_time <=", value, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeIn(List<Date> values) {
            addCriterion("goods_up_time in", values, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeNotIn(List<Date> values) {
            addCriterion("goods_up_time not in", values, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeBetween(Date value1, Date value2) {
            addCriterion("goods_up_time between", value1, value2, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_up_time not between", value1, value2, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeIsNull() {
            addCriterion("goods_end_time is null");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeIsNotNull() {
            addCriterion("goods_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeEqualTo(Date value) {
            addCriterion("goods_end_time =", value, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeNotEqualTo(Date value) {
            addCriterion("goods_end_time <>", value, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeGreaterThan(Date value) {
            addCriterion("goods_end_time >", value, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_end_time >=", value, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeLessThan(Date value) {
            addCriterion("goods_end_time <", value, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_end_time <=", value, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeIn(List<Date> values) {
            addCriterion("goods_end_time in", values, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeNotIn(List<Date> values) {
            addCriterion("goods_end_time not in", values, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeBetween(Date value1, Date value2) {
            addCriterion("goods_end_time between", value1, value2, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_end_time not between", value1, value2, "goodsEndTime");
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