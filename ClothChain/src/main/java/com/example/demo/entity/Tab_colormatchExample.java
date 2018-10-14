package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_colormatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_colormatchExample() {
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

        public Criteria andColormatchidIsNull() {
            addCriterion("colormatchid is null");
            return (Criteria) this;
        }

        public Criteria andColormatchidIsNotNull() {
            addCriterion("colormatchid is not null");
            return (Criteria) this;
        }

        public Criteria andColormatchidEqualTo(Integer value) {
            addCriterion("colormatchid =", value, "colormatchid");
            return (Criteria) this;
        }

        public Criteria andColormatchidNotEqualTo(Integer value) {
            addCriterion("colormatchid <>", value, "colormatchid");
            return (Criteria) this;
        }

        public Criteria andColormatchidGreaterThan(Integer value) {
            addCriterion("colormatchid >", value, "colormatchid");
            return (Criteria) this;
        }

        public Criteria andColormatchidGreaterThanOrEqualTo(Integer value) {
            addCriterion("colormatchid >=", value, "colormatchid");
            return (Criteria) this;
        }

        public Criteria andColormatchidLessThan(Integer value) {
            addCriterion("colormatchid <", value, "colormatchid");
            return (Criteria) this;
        }

        public Criteria andColormatchidLessThanOrEqualTo(Integer value) {
            addCriterion("colormatchid <=", value, "colormatchid");
            return (Criteria) this;
        }

        public Criteria andColormatchidIn(List<Integer> values) {
            addCriterion("colormatchid in", values, "colormatchid");
            return (Criteria) this;
        }

        public Criteria andColormatchidNotIn(List<Integer> values) {
            addCriterion("colormatchid not in", values, "colormatchid");
            return (Criteria) this;
        }

        public Criteria andColormatchidBetween(Integer value1, Integer value2) {
            addCriterion("colormatchid between", value1, value2, "colormatchid");
            return (Criteria) this;
        }

        public Criteria andColormatchidNotBetween(Integer value1, Integer value2) {
            addCriterion("colormatchid not between", value1, value2, "colormatchid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridIsNull() {
            addCriterion("superlierid is null");
            return (Criteria) this;
        }

        public Criteria andSuperlieridIsNotNull() {
            addCriterion("superlierid is not null");
            return (Criteria) this;
        }

        public Criteria andSuperlieridEqualTo(Integer value) {
            addCriterion("superlierid =", value, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridNotEqualTo(Integer value) {
            addCriterion("superlierid <>", value, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridGreaterThan(Integer value) {
            addCriterion("superlierid >", value, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("superlierid >=", value, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridLessThan(Integer value) {
            addCriterion("superlierid <", value, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridLessThanOrEqualTo(Integer value) {
            addCriterion("superlierid <=", value, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridIn(List<Integer> values) {
            addCriterion("superlierid in", values, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridNotIn(List<Integer> values) {
            addCriterion("superlierid not in", values, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridBetween(Integer value1, Integer value2) {
            addCriterion("superlierid between", value1, value2, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridNotBetween(Integer value1, Integer value2) {
            addCriterion("superlierid not between", value1, value2, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSamplenoIsNull() {
            addCriterion("sampleno is null");
            return (Criteria) this;
        }

        public Criteria andSamplenoIsNotNull() {
            addCriterion("sampleno is not null");
            return (Criteria) this;
        }

        public Criteria andSamplenoEqualTo(String value) {
            addCriterion("sampleno =", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoNotEqualTo(String value) {
            addCriterion("sampleno <>", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoGreaterThan(String value) {
            addCriterion("sampleno >", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoGreaterThanOrEqualTo(String value) {
            addCriterion("sampleno >=", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoLessThan(String value) {
            addCriterion("sampleno <", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoLessThanOrEqualTo(String value) {
            addCriterion("sampleno <=", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoLike(String value) {
            addCriterion("sampleno like", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoNotLike(String value) {
            addCriterion("sampleno not like", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoIn(List<String> values) {
            addCriterion("sampleno in", values, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoNotIn(List<String> values) {
            addCriterion("sampleno not in", values, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoBetween(String value1, String value2) {
            addCriterion("sampleno between", value1, value2, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoNotBetween(String value1, String value2) {
            addCriterion("sampleno not between", value1, value2, "sampleno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoIsNull() {
            addCriterion("materialno is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnoIsNotNull() {
            addCriterion("materialno is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnoEqualTo(String value) {
            addCriterion("materialno =", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotEqualTo(String value) {
            addCriterion("materialno <>", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoGreaterThan(String value) {
            addCriterion("materialno >", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoGreaterThanOrEqualTo(String value) {
            addCriterion("materialno >=", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoLessThan(String value) {
            addCriterion("materialno <", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoLessThanOrEqualTo(String value) {
            addCriterion("materialno <=", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoLike(String value) {
            addCriterion("materialno like", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotLike(String value) {
            addCriterion("materialno not like", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoIn(List<String> values) {
            addCriterion("materialno in", values, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotIn(List<String> values) {
            addCriterion("materialno not in", values, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoBetween(String value1, String value2) {
            addCriterion("materialno between", value1, value2, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotBetween(String value1, String value2) {
            addCriterion("materialno not between", value1, value2, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNull() {
            addCriterion("materialname is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNotNull() {
            addCriterion("materialname is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameEqualTo(String value) {
            addCriterion("materialname =", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotEqualTo(String value) {
            addCriterion("materialname <>", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThan(String value) {
            addCriterion("materialname >", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThanOrEqualTo(String value) {
            addCriterion("materialname >=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThan(String value) {
            addCriterion("materialname <", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThanOrEqualTo(String value) {
            addCriterion("materialname <=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLike(String value) {
            addCriterion("materialname like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotLike(String value) {
            addCriterion("materialname not like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIn(List<String> values) {
            addCriterion("materialname in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotIn(List<String> values) {
            addCriterion("materialname not in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameBetween(String value1, String value2) {
            addCriterion("materialname between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotBetween(String value1, String value2) {
            addCriterion("materialname not between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andAaaIsNull() {
            addCriterion("aaa is null");
            return (Criteria) this;
        }

        public Criteria andAaaIsNotNull() {
            addCriterion("aaa is not null");
            return (Criteria) this;
        }

        public Criteria andAaaEqualTo(String value) {
            addCriterion("aaa =", value, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaNotEqualTo(String value) {
            addCriterion("aaa <>", value, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaGreaterThan(String value) {
            addCriterion("aaa >", value, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaGreaterThanOrEqualTo(String value) {
            addCriterion("aaa >=", value, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaLessThan(String value) {
            addCriterion("aaa <", value, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaLessThanOrEqualTo(String value) {
            addCriterion("aaa <=", value, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaLike(String value) {
            addCriterion("aaa like", value, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaNotLike(String value) {
            addCriterion("aaa not like", value, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaIn(List<String> values) {
            addCriterion("aaa in", values, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaNotIn(List<String> values) {
            addCriterion("aaa not in", values, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaBetween(String value1, String value2) {
            addCriterion("aaa between", value1, value2, "aaa");
            return (Criteria) this;
        }

        public Criteria andAaaNotBetween(String value1, String value2) {
            addCriterion("aaa not between", value1, value2, "aaa");
            return (Criteria) this;
        }

        public Criteria andModalIsNull() {
            addCriterion("modal is null");
            return (Criteria) this;
        }

        public Criteria andModalIsNotNull() {
            addCriterion("modal is not null");
            return (Criteria) this;
        }

        public Criteria andModalEqualTo(String value) {
            addCriterion("modal =", value, "modal");
            return (Criteria) this;
        }

        public Criteria andModalNotEqualTo(String value) {
            addCriterion("modal <>", value, "modal");
            return (Criteria) this;
        }

        public Criteria andModalGreaterThan(String value) {
            addCriterion("modal >", value, "modal");
            return (Criteria) this;
        }

        public Criteria andModalGreaterThanOrEqualTo(String value) {
            addCriterion("modal >=", value, "modal");
            return (Criteria) this;
        }

        public Criteria andModalLessThan(String value) {
            addCriterion("modal <", value, "modal");
            return (Criteria) this;
        }

        public Criteria andModalLessThanOrEqualTo(String value) {
            addCriterion("modal <=", value, "modal");
            return (Criteria) this;
        }

        public Criteria andModalLike(String value) {
            addCriterion("modal like", value, "modal");
            return (Criteria) this;
        }

        public Criteria andModalNotLike(String value) {
            addCriterion("modal not like", value, "modal");
            return (Criteria) this;
        }

        public Criteria andModalIn(List<String> values) {
            addCriterion("modal in", values, "modal");
            return (Criteria) this;
        }

        public Criteria andModalNotIn(List<String> values) {
            addCriterion("modal not in", values, "modal");
            return (Criteria) this;
        }

        public Criteria andModalBetween(String value1, String value2) {
            addCriterion("modal between", value1, value2, "modal");
            return (Criteria) this;
        }

        public Criteria andModalNotBetween(String value1, String value2) {
            addCriterion("modal not between", value1, value2, "modal");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColornoIsNull() {
            addCriterion("colorno is null");
            return (Criteria) this;
        }

        public Criteria andColornoIsNotNull() {
            addCriterion("colorno is not null");
            return (Criteria) this;
        }

        public Criteria andColornoEqualTo(String value) {
            addCriterion("colorno =", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoNotEqualTo(String value) {
            addCriterion("colorno <>", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoGreaterThan(String value) {
            addCriterion("colorno >", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoGreaterThanOrEqualTo(String value) {
            addCriterion("colorno >=", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoLessThan(String value) {
            addCriterion("colorno <", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoLessThanOrEqualTo(String value) {
            addCriterion("colorno <=", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoLike(String value) {
            addCriterion("colorno like", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoNotLike(String value) {
            addCriterion("colorno not like", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoIn(List<String> values) {
            addCriterion("colorno in", values, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoNotIn(List<String> values) {
            addCriterion("colorno not in", values, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoBetween(String value1, String value2) {
            addCriterion("colorno between", value1, value2, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoNotBetween(String value1, String value2) {
            addCriterion("colorno not between", value1, value2, "colorno");
            return (Criteria) this;
        }

        public Criteria andPartsIsNull() {
            addCriterion("parts is null");
            return (Criteria) this;
        }

        public Criteria andPartsIsNotNull() {
            addCriterion("parts is not null");
            return (Criteria) this;
        }

        public Criteria andPartsEqualTo(String value) {
            addCriterion("parts =", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotEqualTo(String value) {
            addCriterion("parts <>", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsGreaterThan(String value) {
            addCriterion("parts >", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsGreaterThanOrEqualTo(String value) {
            addCriterion("parts >=", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsLessThan(String value) {
            addCriterion("parts <", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsLessThanOrEqualTo(String value) {
            addCriterion("parts <=", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsLike(String value) {
            addCriterion("parts like", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotLike(String value) {
            addCriterion("parts not like", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsIn(List<String> values) {
            addCriterion("parts in", values, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotIn(List<String> values) {
            addCriterion("parts not in", values, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsBetween(String value1, String value2) {
            addCriterion("parts between", value1, value2, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotBetween(String value1, String value2) {
            addCriterion("parts not between", value1, value2, "parts");
            return (Criteria) this;
        }

        public Criteria andDosageIsNull() {
            addCriterion("dosage is null");
            return (Criteria) this;
        }

        public Criteria andDosageIsNotNull() {
            addCriterion("dosage is not null");
            return (Criteria) this;
        }

        public Criteria andDosageEqualTo(Double value) {
            addCriterion("dosage =", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotEqualTo(Double value) {
            addCriterion("dosage <>", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThan(Double value) {
            addCriterion("dosage >", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThanOrEqualTo(Double value) {
            addCriterion("dosage >=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThan(Double value) {
            addCriterion("dosage <", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThanOrEqualTo(Double value) {
            addCriterion("dosage <=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageIn(List<Double> values) {
            addCriterion("dosage in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotIn(List<Double> values) {
            addCriterion("dosage not in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageBetween(Double value1, Double value2) {
            addCriterion("dosage between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotBetween(Double value1, Double value2) {
            addCriterion("dosage not between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andLossIsNull() {
            addCriterion("loss is null");
            return (Criteria) this;
        }

        public Criteria andLossIsNotNull() {
            addCriterion("loss is not null");
            return (Criteria) this;
        }

        public Criteria andLossEqualTo(Double value) {
            addCriterion("loss =", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossNotEqualTo(Double value) {
            addCriterion("loss <>", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossGreaterThan(Double value) {
            addCriterion("loss >", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossGreaterThanOrEqualTo(Double value) {
            addCriterion("loss >=", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossLessThan(Double value) {
            addCriterion("loss <", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossLessThanOrEqualTo(Double value) {
            addCriterion("loss <=", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossIn(List<Double> values) {
            addCriterion("loss in", values, "loss");
            return (Criteria) this;
        }

        public Criteria andLossNotIn(List<Double> values) {
            addCriterion("loss not in", values, "loss");
            return (Criteria) this;
        }

        public Criteria andLossBetween(Double value1, Double value2) {
            addCriterion("loss between", value1, value2, "loss");
            return (Criteria) this;
        }

        public Criteria andLossNotBetween(Double value1, Double value2) {
            addCriterion("loss not between", value1, value2, "loss");
            return (Criteria) this;
        }

        public Criteria andMaterialcategoryIsNull() {
            addCriterion("materialcategory is null");
            return (Criteria) this;
        }

        public Criteria andMaterialcategoryIsNotNull() {
            addCriterion("materialcategory is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialcategoryEqualTo(String value) {
            addCriterion("materialcategory =", value, "materialcategory");
            return (Criteria) this;
        }

        public Criteria andMaterialcategoryNotEqualTo(String value) {
            addCriterion("materialcategory <>", value, "materialcategory");
            return (Criteria) this;
        }

        public Criteria andMaterialcategoryGreaterThan(String value) {
            addCriterion("materialcategory >", value, "materialcategory");
            return (Criteria) this;
        }

        public Criteria andMaterialcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("materialcategory >=", value, "materialcategory");
            return (Criteria) this;
        }

        public Criteria andMaterialcategoryLessThan(String value) {
            addCriterion("materialcategory <", value, "materialcategory");
            return (Criteria) this;
        }

        public Criteria andMaterialcategoryLessThanOrEqualTo(String value) {
            addCriterion("materialcategory <=", value, "materialcategory");
            return (Criteria) this;
        }

        public Criteria andMaterialcategoryLike(String value) {
            addCriterion("materialcategory like", value, "materialcategory");
            return (Criteria) this;
        }

        public Criteria andMaterialcategoryNotLike(String value) {
            addCriterion("materialcategory not like", value, "materialcategory");
            return (Criteria) this;
        }

        public Criteria andMaterialcategoryIn(List<String> values) {
            addCriterion("materialcategory in", values, "materialcategory");
            return (Criteria) this;
        }

        public Criteria andMaterialcategoryNotIn(List<String> values) {
            addCriterion("materialcategory not in", values, "materialcategory");
            return (Criteria) this;
        }

        public Criteria andMaterialcategoryBetween(String value1, String value2) {
            addCriterion("materialcategory between", value1, value2, "materialcategory");
            return (Criteria) this;
        }

        public Criteria andMaterialcategoryNotBetween(String value1, String value2) {
            addCriterion("materialcategory not between", value1, value2, "materialcategory");
            return (Criteria) this;
        }

        public Criteria andSpecIsNull() {
            addCriterion("spec is null");
            return (Criteria) this;
        }

        public Criteria andSpecIsNotNull() {
            addCriterion("spec is not null");
            return (Criteria) this;
        }

        public Criteria andSpecEqualTo(String value) {
            addCriterion("spec =", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotEqualTo(String value) {
            addCriterion("spec <>", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThan(String value) {
            addCriterion("spec >", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThanOrEqualTo(String value) {
            addCriterion("spec >=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThan(String value) {
            addCriterion("spec <", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThanOrEqualTo(String value) {
            addCriterion("spec <=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLike(String value) {
            addCriterion("spec like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotLike(String value) {
            addCriterion("spec not like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecIn(List<String> values) {
            addCriterion("spec in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotIn(List<String> values) {
            addCriterion("spec not in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecBetween(String value1, String value2) {
            addCriterion("spec between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotBetween(String value1, String value2) {
            addCriterion("spec not between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andClothtypeIsNull() {
            addCriterion("clothtype is null");
            return (Criteria) this;
        }

        public Criteria andClothtypeIsNotNull() {
            addCriterion("clothtype is not null");
            return (Criteria) this;
        }

        public Criteria andClothtypeEqualTo(String value) {
            addCriterion("clothtype =", value, "clothtype");
            return (Criteria) this;
        }

        public Criteria andClothtypeNotEqualTo(String value) {
            addCriterion("clothtype <>", value, "clothtype");
            return (Criteria) this;
        }

        public Criteria andClothtypeGreaterThan(String value) {
            addCriterion("clothtype >", value, "clothtype");
            return (Criteria) this;
        }

        public Criteria andClothtypeGreaterThanOrEqualTo(String value) {
            addCriterion("clothtype >=", value, "clothtype");
            return (Criteria) this;
        }

        public Criteria andClothtypeLessThan(String value) {
            addCriterion("clothtype <", value, "clothtype");
            return (Criteria) this;
        }

        public Criteria andClothtypeLessThanOrEqualTo(String value) {
            addCriterion("clothtype <=", value, "clothtype");
            return (Criteria) this;
        }

        public Criteria andClothtypeLike(String value) {
            addCriterion("clothtype like", value, "clothtype");
            return (Criteria) this;
        }

        public Criteria andClothtypeNotLike(String value) {
            addCriterion("clothtype not like", value, "clothtype");
            return (Criteria) this;
        }

        public Criteria andClothtypeIn(List<String> values) {
            addCriterion("clothtype in", values, "clothtype");
            return (Criteria) this;
        }

        public Criteria andClothtypeNotIn(List<String> values) {
            addCriterion("clothtype not in", values, "clothtype");
            return (Criteria) this;
        }

        public Criteria andClothtypeBetween(String value1, String value2) {
            addCriterion("clothtype between", value1, value2, "clothtype");
            return (Criteria) this;
        }

        public Criteria andClothtypeNotBetween(String value1, String value2) {
            addCriterion("clothtype not between", value1, value2, "clothtype");
            return (Criteria) this;
        }

        public Criteria andLargetypeIsNull() {
            addCriterion("largetype is null");
            return (Criteria) this;
        }

        public Criteria andLargetypeIsNotNull() {
            addCriterion("largetype is not null");
            return (Criteria) this;
        }

        public Criteria andLargetypeEqualTo(String value) {
            addCriterion("largetype =", value, "largetype");
            return (Criteria) this;
        }

        public Criteria andLargetypeNotEqualTo(String value) {
            addCriterion("largetype <>", value, "largetype");
            return (Criteria) this;
        }

        public Criteria andLargetypeGreaterThan(String value) {
            addCriterion("largetype >", value, "largetype");
            return (Criteria) this;
        }

        public Criteria andLargetypeGreaterThanOrEqualTo(String value) {
            addCriterion("largetype >=", value, "largetype");
            return (Criteria) this;
        }

        public Criteria andLargetypeLessThan(String value) {
            addCriterion("largetype <", value, "largetype");
            return (Criteria) this;
        }

        public Criteria andLargetypeLessThanOrEqualTo(String value) {
            addCriterion("largetype <=", value, "largetype");
            return (Criteria) this;
        }

        public Criteria andLargetypeLike(String value) {
            addCriterion("largetype like", value, "largetype");
            return (Criteria) this;
        }

        public Criteria andLargetypeNotLike(String value) {
            addCriterion("largetype not like", value, "largetype");
            return (Criteria) this;
        }

        public Criteria andLargetypeIn(List<String> values) {
            addCriterion("largetype in", values, "largetype");
            return (Criteria) this;
        }

        public Criteria andLargetypeNotIn(List<String> values) {
            addCriterion("largetype not in", values, "largetype");
            return (Criteria) this;
        }

        public Criteria andLargetypeBetween(String value1, String value2) {
            addCriterion("largetype between", value1, value2, "largetype");
            return (Criteria) this;
        }

        public Criteria andLargetypeNotBetween(String value1, String value2) {
            addCriterion("largetype not between", value1, value2, "largetype");
            return (Criteria) this;
        }

        public Criteria andSmalltypeIsNull() {
            addCriterion("smalltype is null");
            return (Criteria) this;
        }

        public Criteria andSmalltypeIsNotNull() {
            addCriterion("smalltype is not null");
            return (Criteria) this;
        }

        public Criteria andSmalltypeEqualTo(String value) {
            addCriterion("smalltype =", value, "smalltype");
            return (Criteria) this;
        }

        public Criteria andSmalltypeNotEqualTo(String value) {
            addCriterion("smalltype <>", value, "smalltype");
            return (Criteria) this;
        }

        public Criteria andSmalltypeGreaterThan(String value) {
            addCriterion("smalltype >", value, "smalltype");
            return (Criteria) this;
        }

        public Criteria andSmalltypeGreaterThanOrEqualTo(String value) {
            addCriterion("smalltype >=", value, "smalltype");
            return (Criteria) this;
        }

        public Criteria andSmalltypeLessThan(String value) {
            addCriterion("smalltype <", value, "smalltype");
            return (Criteria) this;
        }

        public Criteria andSmalltypeLessThanOrEqualTo(String value) {
            addCriterion("smalltype <=", value, "smalltype");
            return (Criteria) this;
        }

        public Criteria andSmalltypeLike(String value) {
            addCriterion("smalltype like", value, "smalltype");
            return (Criteria) this;
        }

        public Criteria andSmalltypeNotLike(String value) {
            addCriterion("smalltype not like", value, "smalltype");
            return (Criteria) this;
        }

        public Criteria andSmalltypeIn(List<String> values) {
            addCriterion("smalltype in", values, "smalltype");
            return (Criteria) this;
        }

        public Criteria andSmalltypeNotIn(List<String> values) {
            addCriterion("smalltype not in", values, "smalltype");
            return (Criteria) this;
        }

        public Criteria andSmalltypeBetween(String value1, String value2) {
            addCriterion("smalltype between", value1, value2, "smalltype");
            return (Criteria) this;
        }

        public Criteria andSmalltypeNotBetween(String value1, String value2) {
            addCriterion("smalltype not between", value1, value2, "smalltype");
            return (Criteria) this;
        }

        public Criteria andAuditingstateIsNull() {
            addCriterion("auditingstate is null");
            return (Criteria) this;
        }

        public Criteria andAuditingstateIsNotNull() {
            addCriterion("auditingstate is not null");
            return (Criteria) this;
        }

        public Criteria andAuditingstateEqualTo(Integer value) {
            addCriterion("auditingstate =", value, "auditingstate");
            return (Criteria) this;
        }

        public Criteria andAuditingstateNotEqualTo(Integer value) {
            addCriterion("auditingstate <>", value, "auditingstate");
            return (Criteria) this;
        }

        public Criteria andAuditingstateGreaterThan(Integer value) {
            addCriterion("auditingstate >", value, "auditingstate");
            return (Criteria) this;
        }

        public Criteria andAuditingstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("auditingstate >=", value, "auditingstate");
            return (Criteria) this;
        }

        public Criteria andAuditingstateLessThan(Integer value) {
            addCriterion("auditingstate <", value, "auditingstate");
            return (Criteria) this;
        }

        public Criteria andAuditingstateLessThanOrEqualTo(Integer value) {
            addCriterion("auditingstate <=", value, "auditingstate");
            return (Criteria) this;
        }

        public Criteria andAuditingstateIn(List<Integer> values) {
            addCriterion("auditingstate in", values, "auditingstate");
            return (Criteria) this;
        }

        public Criteria andAuditingstateNotIn(List<Integer> values) {
            addCriterion("auditingstate not in", values, "auditingstate");
            return (Criteria) this;
        }

        public Criteria andAuditingstateBetween(Integer value1, Integer value2) {
            addCriterion("auditingstate between", value1, value2, "auditingstate");
            return (Criteria) this;
        }

        public Criteria andAuditingstateNotBetween(Integer value1, Integer value2) {
            addCriterion("auditingstate not between", value1, value2, "auditingstate");
            return (Criteria) this;
        }

        public Criteria andPonoIsNull() {
            addCriterion("pono is null");
            return (Criteria) this;
        }

        public Criteria andPonoIsNotNull() {
            addCriterion("pono is not null");
            return (Criteria) this;
        }

        public Criteria andPonoEqualTo(String value) {
            addCriterion("pono =", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoNotEqualTo(String value) {
            addCriterion("pono <>", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoGreaterThan(String value) {
            addCriterion("pono >", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoGreaterThanOrEqualTo(String value) {
            addCriterion("pono >=", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoLessThan(String value) {
            addCriterion("pono <", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoLessThanOrEqualTo(String value) {
            addCriterion("pono <=", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoLike(String value) {
            addCriterion("pono like", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoNotLike(String value) {
            addCriterion("pono not like", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoIn(List<String> values) {
            addCriterion("pono in", values, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoNotIn(List<String> values) {
            addCriterion("pono not in", values, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoBetween(String value1, String value2) {
            addCriterion("pono between", value1, value2, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoNotBetween(String value1, String value2) {
            addCriterion("pono not between", value1, value2, "pono");
            return (Criteria) this;
        }
    }

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