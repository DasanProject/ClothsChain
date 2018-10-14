package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_plantypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_plantypeExample() {
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

        public Criteria andPlantypeidIsNull() {
            addCriterion("plantypeid is null");
            return (Criteria) this;
        }

        public Criteria andPlantypeidIsNotNull() {
            addCriterion("plantypeid is not null");
            return (Criteria) this;
        }

        public Criteria andPlantypeidEqualTo(Integer value) {
            addCriterion("plantypeid =", value, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidNotEqualTo(Integer value) {
            addCriterion("plantypeid <>", value, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidGreaterThan(Integer value) {
            addCriterion("plantypeid >", value, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("plantypeid >=", value, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidLessThan(Integer value) {
            addCriterion("plantypeid <", value, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidLessThanOrEqualTo(Integer value) {
            addCriterion("plantypeid <=", value, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidIn(List<Integer> values) {
            addCriterion("plantypeid in", values, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidNotIn(List<Integer> values) {
            addCriterion("plantypeid not in", values, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidBetween(Integer value1, Integer value2) {
            addCriterion("plantypeid between", value1, value2, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("plantypeid not between", value1, value2, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andDescribleIsNull() {
            addCriterion("describle is null");
            return (Criteria) this;
        }

        public Criteria andDescribleIsNotNull() {
            addCriterion("describle is not null");
            return (Criteria) this;
        }

        public Criteria andDescribleEqualTo(String value) {
            addCriterion("describle =", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleNotEqualTo(String value) {
            addCriterion("describle <>", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleGreaterThan(String value) {
            addCriterion("describle >", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleGreaterThanOrEqualTo(String value) {
            addCriterion("describle >=", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleLessThan(String value) {
            addCriterion("describle <", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleLessThanOrEqualTo(String value) {
            addCriterion("describle <=", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleLike(String value) {
            addCriterion("describle like", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleNotLike(String value) {
            addCriterion("describle not like", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleIn(List<String> values) {
            addCriterion("describle in", values, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleNotIn(List<String> values) {
            addCriterion("describle not in", values, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleBetween(String value1, String value2) {
            addCriterion("describle between", value1, value2, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleNotBetween(String value1, String value2) {
            addCriterion("describle not between", value1, value2, "describle");
            return (Criteria) this;
        }

        public Criteria andSetdateIsNull() {
            addCriterion("setdate is null");
            return (Criteria) this;
        }

        public Criteria andSetdateIsNotNull() {
            addCriterion("setdate is not null");
            return (Criteria) this;
        }

        public Criteria andSetdateEqualTo(String value) {
            addCriterion("setdate =", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateNotEqualTo(String value) {
            addCriterion("setdate <>", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateGreaterThan(String value) {
            addCriterion("setdate >", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateGreaterThanOrEqualTo(String value) {
            addCriterion("setdate >=", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateLessThan(String value) {
            addCriterion("setdate <", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateLessThanOrEqualTo(String value) {
            addCriterion("setdate <=", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateLike(String value) {
            addCriterion("setdate like", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateNotLike(String value) {
            addCriterion("setdate not like", value, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateIn(List<String> values) {
            addCriterion("setdate in", values, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateNotIn(List<String> values) {
            addCriterion("setdate not in", values, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateBetween(String value1, String value2) {
            addCriterion("setdate between", value1, value2, "setdate");
            return (Criteria) this;
        }

        public Criteria andSetdateNotBetween(String value1, String value2) {
            addCriterion("setdate not between", value1, value2, "setdate");
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