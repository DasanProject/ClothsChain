package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_singlerowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_singlerowExample() {
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

        public Criteria andSingleidIsNull() {
            addCriterion("singleid is null");
            return (Criteria) this;
        }

        public Criteria andSingleidIsNotNull() {
            addCriterion("singleid is not null");
            return (Criteria) this;
        }

        public Criteria andSingleidEqualTo(Integer value) {
            addCriterion("singleid =", value, "singleid");
            return (Criteria) this;
        }

        public Criteria andSingleidNotEqualTo(Integer value) {
            addCriterion("singleid <>", value, "singleid");
            return (Criteria) this;
        }

        public Criteria andSingleidGreaterThan(Integer value) {
            addCriterion("singleid >", value, "singleid");
            return (Criteria) this;
        }

        public Criteria andSingleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("singleid >=", value, "singleid");
            return (Criteria) this;
        }

        public Criteria andSingleidLessThan(Integer value) {
            addCriterion("singleid <", value, "singleid");
            return (Criteria) this;
        }

        public Criteria andSingleidLessThanOrEqualTo(Integer value) {
            addCriterion("singleid <=", value, "singleid");
            return (Criteria) this;
        }

        public Criteria andSingleidIn(List<Integer> values) {
            addCriterion("singleid in", values, "singleid");
            return (Criteria) this;
        }

        public Criteria andSingleidNotIn(List<Integer> values) {
            addCriterion("singleid not in", values, "singleid");
            return (Criteria) this;
        }

        public Criteria andSingleidBetween(Integer value1, Integer value2) {
            addCriterion("singleid between", value1, value2, "singleid");
            return (Criteria) this;
        }

        public Criteria andSingleidNotBetween(Integer value1, Integer value2) {
            addCriterion("singleid not between", value1, value2, "singleid");
            return (Criteria) this;
        }

        public Criteria andGroupsIsNull() {
            addCriterion("groups is null");
            return (Criteria) this;
        }

        public Criteria andGroupsIsNotNull() {
            addCriterion("groups is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsEqualTo(String value) {
            addCriterion("groups =", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotEqualTo(String value) {
            addCriterion("groups <>", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsGreaterThan(String value) {
            addCriterion("groups >", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsGreaterThanOrEqualTo(String value) {
            addCriterion("groups >=", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsLessThan(String value) {
            addCriterion("groups <", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsLessThanOrEqualTo(String value) {
            addCriterion("groups <=", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsLike(String value) {
            addCriterion("groups like", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotLike(String value) {
            addCriterion("groups not like", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsIn(List<String> values) {
            addCriterion("groups in", values, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotIn(List<String> values) {
            addCriterion("groups not in", values, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsBetween(String value1, String value2) {
            addCriterion("groups between", value1, value2, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotBetween(String value1, String value2) {
            addCriterion("groups not between", value1, value2, "groups");
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

        public Criteria andSinglenumberIsNull() {
            addCriterion("singlenumber is null");
            return (Criteria) this;
        }

        public Criteria andSinglenumberIsNotNull() {
            addCriterion("singlenumber is not null");
            return (Criteria) this;
        }

        public Criteria andSinglenumberEqualTo(Integer value) {
            addCriterion("singlenumber =", value, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberNotEqualTo(Integer value) {
            addCriterion("singlenumber <>", value, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberGreaterThan(Integer value) {
            addCriterion("singlenumber >", value, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("singlenumber >=", value, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberLessThan(Integer value) {
            addCriterion("singlenumber <", value, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberLessThanOrEqualTo(Integer value) {
            addCriterion("singlenumber <=", value, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberIn(List<Integer> values) {
            addCriterion("singlenumber in", values, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberNotIn(List<Integer> values) {
            addCriterion("singlenumber not in", values, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberBetween(Integer value1, Integer value2) {
            addCriterion("singlenumber between", value1, value2, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("singlenumber not between", value1, value2, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNull() {
            addCriterion("begindate is null");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNotNull() {
            addCriterion("begindate is not null");
            return (Criteria) this;
        }

        public Criteria andBegindateEqualTo(String value) {
            addCriterion("begindate =", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotEqualTo(String value) {
            addCriterion("begindate <>", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThan(String value) {
            addCriterion("begindate >", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThanOrEqualTo(String value) {
            addCriterion("begindate >=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThan(String value) {
            addCriterion("begindate <", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThanOrEqualTo(String value) {
            addCriterion("begindate <=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLike(String value) {
            addCriterion("begindate like", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotLike(String value) {
            addCriterion("begindate not like", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateIn(List<String> values) {
            addCriterion("begindate in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotIn(List<String> values) {
            addCriterion("begindate not in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateBetween(String value1, String value2) {
            addCriterion("begindate between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotBetween(String value1, String value2) {
            addCriterion("begindate not between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(String value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(String value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(String value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(String value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(String value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLike(String value) {
            addCriterion("enddate like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotLike(String value) {
            addCriterion("enddate not like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<String> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<String> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(String value1, String value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(String value1, String value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andOverdateIsNull() {
            addCriterion("overdate is null");
            return (Criteria) this;
        }

        public Criteria andOverdateIsNotNull() {
            addCriterion("overdate is not null");
            return (Criteria) this;
        }

        public Criteria andOverdateEqualTo(String value) {
            addCriterion("overdate =", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateNotEqualTo(String value) {
            addCriterion("overdate <>", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateGreaterThan(String value) {
            addCriterion("overdate >", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateGreaterThanOrEqualTo(String value) {
            addCriterion("overdate >=", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateLessThan(String value) {
            addCriterion("overdate <", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateLessThanOrEqualTo(String value) {
            addCriterion("overdate <=", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateLike(String value) {
            addCriterion("overdate like", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateNotLike(String value) {
            addCriterion("overdate not like", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateIn(List<String> values) {
            addCriterion("overdate in", values, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateNotIn(List<String> values) {
            addCriterion("overdate not in", values, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateBetween(String value1, String value2) {
            addCriterion("overdate between", value1, value2, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateNotBetween(String value1, String value2) {
            addCriterion("overdate not between", value1, value2, "overdate");
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