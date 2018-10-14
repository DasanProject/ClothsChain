package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_quarterlyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_quarterlyExample() {
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

        public Criteria andQuarterlyidIsNull() {
            addCriterion("quarterlyid is null");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidIsNotNull() {
            addCriterion("quarterlyid is not null");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidEqualTo(Integer value) {
            addCriterion("quarterlyid =", value, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidNotEqualTo(Integer value) {
            addCriterion("quarterlyid <>", value, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidGreaterThan(Integer value) {
            addCriterion("quarterlyid >", value, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("quarterlyid >=", value, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidLessThan(Integer value) {
            addCriterion("quarterlyid <", value, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidLessThanOrEqualTo(Integer value) {
            addCriterion("quarterlyid <=", value, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidIn(List<Integer> values) {
            addCriterion("quarterlyid in", values, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidNotIn(List<Integer> values) {
            addCriterion("quarterlyid not in", values, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidBetween(Integer value1, Integer value2) {
            addCriterion("quarterlyid between", value1, value2, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidNotBetween(Integer value1, Integer value2) {
            addCriterion("quarterlyid not between", value1, value2, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlynoIsNull() {
            addCriterion("quarterlyno is null");
            return (Criteria) this;
        }

        public Criteria andQuarterlynoIsNotNull() {
            addCriterion("quarterlyno is not null");
            return (Criteria) this;
        }

        public Criteria andQuarterlynoEqualTo(String value) {
            addCriterion("quarterlyno =", value, "quarterlyno");
            return (Criteria) this;
        }

        public Criteria andQuarterlynoNotEqualTo(String value) {
            addCriterion("quarterlyno <>", value, "quarterlyno");
            return (Criteria) this;
        }

        public Criteria andQuarterlynoGreaterThan(String value) {
            addCriterion("quarterlyno >", value, "quarterlyno");
            return (Criteria) this;
        }

        public Criteria andQuarterlynoGreaterThanOrEqualTo(String value) {
            addCriterion("quarterlyno >=", value, "quarterlyno");
            return (Criteria) this;
        }

        public Criteria andQuarterlynoLessThan(String value) {
            addCriterion("quarterlyno <", value, "quarterlyno");
            return (Criteria) this;
        }

        public Criteria andQuarterlynoLessThanOrEqualTo(String value) {
            addCriterion("quarterlyno <=", value, "quarterlyno");
            return (Criteria) this;
        }

        public Criteria andQuarterlynoLike(String value) {
            addCriterion("quarterlyno like", value, "quarterlyno");
            return (Criteria) this;
        }

        public Criteria andQuarterlynoNotLike(String value) {
            addCriterion("quarterlyno not like", value, "quarterlyno");
            return (Criteria) this;
        }

        public Criteria andQuarterlynoIn(List<String> values) {
            addCriterion("quarterlyno in", values, "quarterlyno");
            return (Criteria) this;
        }

        public Criteria andQuarterlynoNotIn(List<String> values) {
            addCriterion("quarterlyno not in", values, "quarterlyno");
            return (Criteria) this;
        }

        public Criteria andQuarterlynoBetween(String value1, String value2) {
            addCriterion("quarterlyno between", value1, value2, "quarterlyno");
            return (Criteria) this;
        }

        public Criteria andQuarterlynoNotBetween(String value1, String value2) {
            addCriterion("quarterlyno not between", value1, value2, "quarterlyno");
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