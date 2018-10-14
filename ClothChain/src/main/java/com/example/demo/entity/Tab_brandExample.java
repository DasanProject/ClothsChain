package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_brandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_brandExample() {
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

        public Criteria andBrandidIsNull() {
            addCriterion("brandid is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("brandid is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(Integer value) {
            addCriterion("brandid =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(Integer value) {
            addCriterion("brandid <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(Integer value) {
            addCriterion("brandid >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("brandid >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(Integer value) {
            addCriterion("brandid <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(Integer value) {
            addCriterion("brandid <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<Integer> values) {
            addCriterion("brandid in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<Integer> values) {
            addCriterion("brandid not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(Integer value1, Integer value2) {
            addCriterion("brandid between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("brandid not between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerid is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerid =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerid <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerid >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerid >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerid <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerid <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerid in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerid not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerid between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerid not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andBrandnumIsNull() {
            addCriterion("brandnum is null");
            return (Criteria) this;
        }

        public Criteria andBrandnumIsNotNull() {
            addCriterion("brandnum is not null");
            return (Criteria) this;
        }

        public Criteria andBrandnumEqualTo(String value) {
            addCriterion("brandnum =", value, "brandnum");
            return (Criteria) this;
        }

        public Criteria andBrandnumNotEqualTo(String value) {
            addCriterion("brandnum <>", value, "brandnum");
            return (Criteria) this;
        }

        public Criteria andBrandnumGreaterThan(String value) {
            addCriterion("brandnum >", value, "brandnum");
            return (Criteria) this;
        }

        public Criteria andBrandnumGreaterThanOrEqualTo(String value) {
            addCriterion("brandnum >=", value, "brandnum");
            return (Criteria) this;
        }

        public Criteria andBrandnumLessThan(String value) {
            addCriterion("brandnum <", value, "brandnum");
            return (Criteria) this;
        }

        public Criteria andBrandnumLessThanOrEqualTo(String value) {
            addCriterion("brandnum <=", value, "brandnum");
            return (Criteria) this;
        }

        public Criteria andBrandnumLike(String value) {
            addCriterion("brandnum like", value, "brandnum");
            return (Criteria) this;
        }

        public Criteria andBrandnumNotLike(String value) {
            addCriterion("brandnum not like", value, "brandnum");
            return (Criteria) this;
        }

        public Criteria andBrandnumIn(List<String> values) {
            addCriterion("brandnum in", values, "brandnum");
            return (Criteria) this;
        }

        public Criteria andBrandnumNotIn(List<String> values) {
            addCriterion("brandnum not in", values, "brandnum");
            return (Criteria) this;
        }

        public Criteria andBrandnumBetween(String value1, String value2) {
            addCriterion("brandnum between", value1, value2, "brandnum");
            return (Criteria) this;
        }

        public Criteria andBrandnumNotBetween(String value1, String value2) {
            addCriterion("brandnum not between", value1, value2, "brandnum");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNull() {
            addCriterion("brandname is null");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNotNull() {
            addCriterion("brandname is not null");
            return (Criteria) this;
        }

        public Criteria andBrandnameEqualTo(String value) {
            addCriterion("brandname =", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotEqualTo(String value) {
            addCriterion("brandname <>", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThan(String value) {
            addCriterion("brandname >", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThanOrEqualTo(String value) {
            addCriterion("brandname >=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThan(String value) {
            addCriterion("brandname <", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThanOrEqualTo(String value) {
            addCriterion("brandname <=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLike(String value) {
            addCriterion("brandname like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotLike(String value) {
            addCriterion("brandname not like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameIn(List<String> values) {
            addCriterion("brandname in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotIn(List<String> values) {
            addCriterion("brandname not in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameBetween(String value1, String value2) {
            addCriterion("brandname between", value1, value2, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotBetween(String value1, String value2) {
            addCriterion("brandname not between", value1, value2, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandfullnameIsNull() {
            addCriterion("brandfullname is null");
            return (Criteria) this;
        }

        public Criteria andBrandfullnameIsNotNull() {
            addCriterion("brandfullname is not null");
            return (Criteria) this;
        }

        public Criteria andBrandfullnameEqualTo(String value) {
            addCriterion("brandfullname =", value, "brandfullname");
            return (Criteria) this;
        }

        public Criteria andBrandfullnameNotEqualTo(String value) {
            addCriterion("brandfullname <>", value, "brandfullname");
            return (Criteria) this;
        }

        public Criteria andBrandfullnameGreaterThan(String value) {
            addCriterion("brandfullname >", value, "brandfullname");
            return (Criteria) this;
        }

        public Criteria andBrandfullnameGreaterThanOrEqualTo(String value) {
            addCriterion("brandfullname >=", value, "brandfullname");
            return (Criteria) this;
        }

        public Criteria andBrandfullnameLessThan(String value) {
            addCriterion("brandfullname <", value, "brandfullname");
            return (Criteria) this;
        }

        public Criteria andBrandfullnameLessThanOrEqualTo(String value) {
            addCriterion("brandfullname <=", value, "brandfullname");
            return (Criteria) this;
        }

        public Criteria andBrandfullnameLike(String value) {
            addCriterion("brandfullname like", value, "brandfullname");
            return (Criteria) this;
        }

        public Criteria andBrandfullnameNotLike(String value) {
            addCriterion("brandfullname not like", value, "brandfullname");
            return (Criteria) this;
        }

        public Criteria andBrandfullnameIn(List<String> values) {
            addCriterion("brandfullname in", values, "brandfullname");
            return (Criteria) this;
        }

        public Criteria andBrandfullnameNotIn(List<String> values) {
            addCriterion("brandfullname not in", values, "brandfullname");
            return (Criteria) this;
        }

        public Criteria andBrandfullnameBetween(String value1, String value2) {
            addCriterion("brandfullname between", value1, value2, "brandfullname");
            return (Criteria) this;
        }

        public Criteria andBrandfullnameNotBetween(String value1, String value2) {
            addCriterion("brandfullname not between", value1, value2, "brandfullname");
            return (Criteria) this;
        }

        public Criteria andSamplemultipleIsNull() {
            addCriterion("samplemultiple is null");
            return (Criteria) this;
        }

        public Criteria andSamplemultipleIsNotNull() {
            addCriterion("samplemultiple is not null");
            return (Criteria) this;
        }

        public Criteria andSamplemultipleEqualTo(Double value) {
            addCriterion("samplemultiple =", value, "samplemultiple");
            return (Criteria) this;
        }

        public Criteria andSamplemultipleNotEqualTo(Double value) {
            addCriterion("samplemultiple <>", value, "samplemultiple");
            return (Criteria) this;
        }

        public Criteria andSamplemultipleGreaterThan(Double value) {
            addCriterion("samplemultiple >", value, "samplemultiple");
            return (Criteria) this;
        }

        public Criteria andSamplemultipleGreaterThanOrEqualTo(Double value) {
            addCriterion("samplemultiple >=", value, "samplemultiple");
            return (Criteria) this;
        }

        public Criteria andSamplemultipleLessThan(Double value) {
            addCriterion("samplemultiple <", value, "samplemultiple");
            return (Criteria) this;
        }

        public Criteria andSamplemultipleLessThanOrEqualTo(Double value) {
            addCriterion("samplemultiple <=", value, "samplemultiple");
            return (Criteria) this;
        }

        public Criteria andSamplemultipleIn(List<Double> values) {
            addCriterion("samplemultiple in", values, "samplemultiple");
            return (Criteria) this;
        }

        public Criteria andSamplemultipleNotIn(List<Double> values) {
            addCriterion("samplemultiple not in", values, "samplemultiple");
            return (Criteria) this;
        }

        public Criteria andSamplemultipleBetween(Double value1, Double value2) {
            addCriterion("samplemultiple between", value1, value2, "samplemultiple");
            return (Criteria) this;
        }

        public Criteria andSamplemultipleNotBetween(Double value1, Double value2) {
            addCriterion("samplemultiple not between", value1, value2, "samplemultiple");
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