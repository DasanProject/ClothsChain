package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_reachExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_reachExample() {
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

        public Criteria andReachidIsNull() {
            addCriterion("reachid is null");
            return (Criteria) this;
        }

        public Criteria andReachidIsNotNull() {
            addCriterion("reachid is not null");
            return (Criteria) this;
        }

        public Criteria andReachidEqualTo(Integer value) {
            addCriterion("reachid =", value, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidNotEqualTo(Integer value) {
            addCriterion("reachid <>", value, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidGreaterThan(Integer value) {
            addCriterion("reachid >", value, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reachid >=", value, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidLessThan(Integer value) {
            addCriterion("reachid <", value, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidLessThanOrEqualTo(Integer value) {
            addCriterion("reachid <=", value, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidIn(List<Integer> values) {
            addCriterion("reachid in", values, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidNotIn(List<Integer> values) {
            addCriterion("reachid not in", values, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidBetween(Integer value1, Integer value2) {
            addCriterion("reachid between", value1, value2, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidNotBetween(Integer value1, Integer value2) {
            addCriterion("reachid not between", value1, value2, "reachid");
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

        public Criteria andPlandateIsNull() {
            addCriterion("plandate is null");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNotNull() {
            addCriterion("plandate is not null");
            return (Criteria) this;
        }

        public Criteria andPlandateEqualTo(String value) {
            addCriterion("plandate =", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotEqualTo(String value) {
            addCriterion("plandate <>", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThan(String value) {
            addCriterion("plandate >", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThanOrEqualTo(String value) {
            addCriterion("plandate >=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThan(String value) {
            addCriterion("plandate <", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThanOrEqualTo(String value) {
            addCriterion("plandate <=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLike(String value) {
            addCriterion("plandate like", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotLike(String value) {
            addCriterion("plandate not like", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateIn(List<String> values) {
            addCriterion("plandate in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotIn(List<String> values) {
            addCriterion("plandate not in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateBetween(String value1, String value2) {
            addCriterion("plandate between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotBetween(String value1, String value2) {
            addCriterion("plandate not between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andComplatedateIsNull() {
            addCriterion("complatedate is null");
            return (Criteria) this;
        }

        public Criteria andComplatedateIsNotNull() {
            addCriterion("complatedate is not null");
            return (Criteria) this;
        }

        public Criteria andComplatedateEqualTo(String value) {
            addCriterion("complatedate =", value, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateNotEqualTo(String value) {
            addCriterion("complatedate <>", value, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateGreaterThan(String value) {
            addCriterion("complatedate >", value, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateGreaterThanOrEqualTo(String value) {
            addCriterion("complatedate >=", value, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateLessThan(String value) {
            addCriterion("complatedate <", value, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateLessThanOrEqualTo(String value) {
            addCriterion("complatedate <=", value, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateLike(String value) {
            addCriterion("complatedate like", value, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateNotLike(String value) {
            addCriterion("complatedate not like", value, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateIn(List<String> values) {
            addCriterion("complatedate in", values, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateNotIn(List<String> values) {
            addCriterion("complatedate not in", values, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateBetween(String value1, String value2) {
            addCriterion("complatedate between", value1, value2, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateNotBetween(String value1, String value2) {
            addCriterion("complatedate not between", value1, value2, "complatedate");
            return (Criteria) this;
        }

        public Criteria andSupperliarIsNull() {
            addCriterion("supperliar is null");
            return (Criteria) this;
        }

        public Criteria andSupperliarIsNotNull() {
            addCriterion("supperliar is not null");
            return (Criteria) this;
        }

        public Criteria andSupperliarEqualTo(String value) {
            addCriterion("supperliar =", value, "supperliar");
            return (Criteria) this;
        }

        public Criteria andSupperliarNotEqualTo(String value) {
            addCriterion("supperliar <>", value, "supperliar");
            return (Criteria) this;
        }

        public Criteria andSupperliarGreaterThan(String value) {
            addCriterion("supperliar >", value, "supperliar");
            return (Criteria) this;
        }

        public Criteria andSupperliarGreaterThanOrEqualTo(String value) {
            addCriterion("supperliar >=", value, "supperliar");
            return (Criteria) this;
        }

        public Criteria andSupperliarLessThan(String value) {
            addCriterion("supperliar <", value, "supperliar");
            return (Criteria) this;
        }

        public Criteria andSupperliarLessThanOrEqualTo(String value) {
            addCriterion("supperliar <=", value, "supperliar");
            return (Criteria) this;
        }

        public Criteria andSupperliarLike(String value) {
            addCriterion("supperliar like", value, "supperliar");
            return (Criteria) this;
        }

        public Criteria andSupperliarNotLike(String value) {
            addCriterion("supperliar not like", value, "supperliar");
            return (Criteria) this;
        }

        public Criteria andSupperliarIn(List<String> values) {
            addCriterion("supperliar in", values, "supperliar");
            return (Criteria) this;
        }

        public Criteria andSupperliarNotIn(List<String> values) {
            addCriterion("supperliar not in", values, "supperliar");
            return (Criteria) this;
        }

        public Criteria andSupperliarBetween(String value1, String value2) {
            addCriterion("supperliar between", value1, value2, "supperliar");
            return (Criteria) this;
        }

        public Criteria andSupperliarNotBetween(String value1, String value2) {
            addCriterion("supperliar not between", value1, value2, "supperliar");
            return (Criteria) this;
        }

        public Criteria andSalenoIsNull() {
            addCriterion("saleno is null");
            return (Criteria) this;
        }

        public Criteria andSalenoIsNotNull() {
            addCriterion("saleno is not null");
            return (Criteria) this;
        }

        public Criteria andSalenoEqualTo(String value) {
            addCriterion("saleno =", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotEqualTo(String value) {
            addCriterion("saleno <>", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoGreaterThan(String value) {
            addCriterion("saleno >", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoGreaterThanOrEqualTo(String value) {
            addCriterion("saleno >=", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoLessThan(String value) {
            addCriterion("saleno <", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoLessThanOrEqualTo(String value) {
            addCriterion("saleno <=", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoLike(String value) {
            addCriterion("saleno like", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotLike(String value) {
            addCriterion("saleno not like", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoIn(List<String> values) {
            addCriterion("saleno in", values, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotIn(List<String> values) {
            addCriterion("saleno not in", values, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoBetween(String value1, String value2) {
            addCriterion("saleno between", value1, value2, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotBetween(String value1, String value2) {
            addCriterion("saleno not between", value1, value2, "saleno");
            return (Criteria) this;
        }

        public Criteria andOpendateIsNull() {
            addCriterion("opendate is null");
            return (Criteria) this;
        }

        public Criteria andOpendateIsNotNull() {
            addCriterion("opendate is not null");
            return (Criteria) this;
        }

        public Criteria andOpendateEqualTo(String value) {
            addCriterion("opendate =", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotEqualTo(String value) {
            addCriterion("opendate <>", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateGreaterThan(String value) {
            addCriterion("opendate >", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateGreaterThanOrEqualTo(String value) {
            addCriterion("opendate >=", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLessThan(String value) {
            addCriterion("opendate <", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLessThanOrEqualTo(String value) {
            addCriterion("opendate <=", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLike(String value) {
            addCriterion("opendate like", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotLike(String value) {
            addCriterion("opendate not like", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateIn(List<String> values) {
            addCriterion("opendate in", values, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotIn(List<String> values) {
            addCriterion("opendate not in", values, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateBetween(String value1, String value2) {
            addCriterion("opendate between", value1, value2, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotBetween(String value1, String value2) {
            addCriterion("opendate not between", value1, value2, "opendate");
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