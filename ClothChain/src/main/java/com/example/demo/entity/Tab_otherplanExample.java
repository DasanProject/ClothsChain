package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_otherplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_otherplanExample() {
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

        public Criteria andOtherplanidIsNull() {
            addCriterion("otherplanid is null");
            return (Criteria) this;
        }

        public Criteria andOtherplanidIsNotNull() {
            addCriterion("otherplanid is not null");
            return (Criteria) this;
        }

        public Criteria andOtherplanidEqualTo(Integer value) {
            addCriterion("otherplanid =", value, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidNotEqualTo(Integer value) {
            addCriterion("otherplanid <>", value, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidGreaterThan(Integer value) {
            addCriterion("otherplanid >", value, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("otherplanid >=", value, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidLessThan(Integer value) {
            addCriterion("otherplanid <", value, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidLessThanOrEqualTo(Integer value) {
            addCriterion("otherplanid <=", value, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidIn(List<Integer> values) {
            addCriterion("otherplanid in", values, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidNotIn(List<Integer> values) {
            addCriterion("otherplanid not in", values, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidBetween(Integer value1, Integer value2) {
            addCriterion("otherplanid between", value1, value2, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidNotBetween(Integer value1, Integer value2) {
            addCriterion("otherplanid not between", value1, value2, "otherplanid");
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

        public Criteria andThingIsNull() {
            addCriterion("thing is null");
            return (Criteria) this;
        }

        public Criteria andThingIsNotNull() {
            addCriterion("thing is not null");
            return (Criteria) this;
        }

        public Criteria andThingEqualTo(String value) {
            addCriterion("thing =", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingNotEqualTo(String value) {
            addCriterion("thing <>", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingGreaterThan(String value) {
            addCriterion("thing >", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingGreaterThanOrEqualTo(String value) {
            addCriterion("thing >=", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingLessThan(String value) {
            addCriterion("thing <", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingLessThanOrEqualTo(String value) {
            addCriterion("thing <=", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingLike(String value) {
            addCriterion("thing like", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingNotLike(String value) {
            addCriterion("thing not like", value, "thing");
            return (Criteria) this;
        }

        public Criteria andThingIn(List<String> values) {
            addCriterion("thing in", values, "thing");
            return (Criteria) this;
        }

        public Criteria andThingNotIn(List<String> values) {
            addCriterion("thing not in", values, "thing");
            return (Criteria) this;
        }

        public Criteria andThingBetween(String value1, String value2) {
            addCriterion("thing between", value1, value2, "thing");
            return (Criteria) this;
        }

        public Criteria andThingNotBetween(String value1, String value2) {
            addCriterion("thing not between", value1, value2, "thing");
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

        public Criteria andOrdernoIsNull() {
            addCriterion("orderno is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderno is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("orderno =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("orderno <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("orderno >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("orderno >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("orderno <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("orderno <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("orderno like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("orderno not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("orderno in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("orderno not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("orderno between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("orderno not between", value1, value2, "orderno");
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