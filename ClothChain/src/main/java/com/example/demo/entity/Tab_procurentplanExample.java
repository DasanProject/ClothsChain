package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_procurentplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_procurentplanExample() {
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

        public Criteria andProcurentidIsNull() {
            addCriterion("procurentid is null");
            return (Criteria) this;
        }

        public Criteria andProcurentidIsNotNull() {
            addCriterion("procurentid is not null");
            return (Criteria) this;
        }

        public Criteria andProcurentidEqualTo(Integer value) {
            addCriterion("procurentid =", value, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidNotEqualTo(Integer value) {
            addCriterion("procurentid <>", value, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidGreaterThan(Integer value) {
            addCriterion("procurentid >", value, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("procurentid >=", value, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidLessThan(Integer value) {
            addCriterion("procurentid <", value, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidLessThanOrEqualTo(Integer value) {
            addCriterion("procurentid <=", value, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidIn(List<Integer> values) {
            addCriterion("procurentid in", values, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidNotIn(List<Integer> values) {
            addCriterion("procurentid not in", values, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidBetween(Integer value1, Integer value2) {
            addCriterion("procurentid between", value1, value2, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidNotBetween(Integer value1, Integer value2) {
            addCriterion("procurentid not between", value1, value2, "procurentid");
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

        public Criteria andChargepeopleIsNull() {
            addCriterion("chargepeople is null");
            return (Criteria) this;
        }

        public Criteria andChargepeopleIsNotNull() {
            addCriterion("chargepeople is not null");
            return (Criteria) this;
        }

        public Criteria andChargepeopleEqualTo(String value) {
            addCriterion("chargepeople =", value, "chargepeople");
            return (Criteria) this;
        }

        public Criteria andChargepeopleNotEqualTo(String value) {
            addCriterion("chargepeople <>", value, "chargepeople");
            return (Criteria) this;
        }

        public Criteria andChargepeopleGreaterThan(String value) {
            addCriterion("chargepeople >", value, "chargepeople");
            return (Criteria) this;
        }

        public Criteria andChargepeopleGreaterThanOrEqualTo(String value) {
            addCriterion("chargepeople >=", value, "chargepeople");
            return (Criteria) this;
        }

        public Criteria andChargepeopleLessThan(String value) {
            addCriterion("chargepeople <", value, "chargepeople");
            return (Criteria) this;
        }

        public Criteria andChargepeopleLessThanOrEqualTo(String value) {
            addCriterion("chargepeople <=", value, "chargepeople");
            return (Criteria) this;
        }

        public Criteria andChargepeopleLike(String value) {
            addCriterion("chargepeople like", value, "chargepeople");
            return (Criteria) this;
        }

        public Criteria andChargepeopleNotLike(String value) {
            addCriterion("chargepeople not like", value, "chargepeople");
            return (Criteria) this;
        }

        public Criteria andChargepeopleIn(List<String> values) {
            addCriterion("chargepeople in", values, "chargepeople");
            return (Criteria) this;
        }

        public Criteria andChargepeopleNotIn(List<String> values) {
            addCriterion("chargepeople not in", values, "chargepeople");
            return (Criteria) this;
        }

        public Criteria andChargepeopleBetween(String value1, String value2) {
            addCriterion("chargepeople between", value1, value2, "chargepeople");
            return (Criteria) this;
        }

        public Criteria andChargepeopleNotBetween(String value1, String value2) {
            addCriterion("chargepeople not between", value1, value2, "chargepeople");
            return (Criteria) this;
        }

        public Criteria andExpecteddateIsNull() {
            addCriterion("expecteddate is null");
            return (Criteria) this;
        }

        public Criteria andExpecteddateIsNotNull() {
            addCriterion("expecteddate is not null");
            return (Criteria) this;
        }

        public Criteria andExpecteddateEqualTo(String value) {
            addCriterion("expecteddate =", value, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateNotEqualTo(String value) {
            addCriterion("expecteddate <>", value, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateGreaterThan(String value) {
            addCriterion("expecteddate >", value, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateGreaterThanOrEqualTo(String value) {
            addCriterion("expecteddate >=", value, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateLessThan(String value) {
            addCriterion("expecteddate <", value, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateLessThanOrEqualTo(String value) {
            addCriterion("expecteddate <=", value, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateLike(String value) {
            addCriterion("expecteddate like", value, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateNotLike(String value) {
            addCriterion("expecteddate not like", value, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateIn(List<String> values) {
            addCriterion("expecteddate in", values, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateNotIn(List<String> values) {
            addCriterion("expecteddate not in", values, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateBetween(String value1, String value2) {
            addCriterion("expecteddate between", value1, value2, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateNotBetween(String value1, String value2) {
            addCriterion("expecteddate not between", value1, value2, "expecteddate");
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