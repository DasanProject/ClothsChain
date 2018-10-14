package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_accessoriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_accessoriesExample() {
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

        public Criteria andAccessoriesidIsNull() {
            addCriterion("accessoriesid is null");
            return (Criteria) this;
        }

        public Criteria andAccessoriesidIsNotNull() {
            addCriterion("accessoriesid is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoriesidEqualTo(Integer value) {
            addCriterion("accessoriesid =", value, "accessoriesid");
            return (Criteria) this;
        }

        public Criteria andAccessoriesidNotEqualTo(Integer value) {
            addCriterion("accessoriesid <>", value, "accessoriesid");
            return (Criteria) this;
        }

        public Criteria andAccessoriesidGreaterThan(Integer value) {
            addCriterion("accessoriesid >", value, "accessoriesid");
            return (Criteria) this;
        }

        public Criteria andAccessoriesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("accessoriesid >=", value, "accessoriesid");
            return (Criteria) this;
        }

        public Criteria andAccessoriesidLessThan(Integer value) {
            addCriterion("accessoriesid <", value, "accessoriesid");
            return (Criteria) this;
        }

        public Criteria andAccessoriesidLessThanOrEqualTo(Integer value) {
            addCriterion("accessoriesid <=", value, "accessoriesid");
            return (Criteria) this;
        }

        public Criteria andAccessoriesidIn(List<Integer> values) {
            addCriterion("accessoriesid in", values, "accessoriesid");
            return (Criteria) this;
        }

        public Criteria andAccessoriesidNotIn(List<Integer> values) {
            addCriterion("accessoriesid not in", values, "accessoriesid");
            return (Criteria) this;
        }

        public Criteria andAccessoriesidBetween(Integer value1, Integer value2) {
            addCriterion("accessoriesid between", value1, value2, "accessoriesid");
            return (Criteria) this;
        }

        public Criteria andAccessoriesidNotBetween(Integer value1, Integer value2) {
            addCriterion("accessoriesid not between", value1, value2, "accessoriesid");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnumIsNull() {
            addCriterion("accessoriesnum is null");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnumIsNotNull() {
            addCriterion("accessoriesnum is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnumEqualTo(String value) {
            addCriterion("accessoriesnum =", value, "accessoriesnum");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnumNotEqualTo(String value) {
            addCriterion("accessoriesnum <>", value, "accessoriesnum");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnumGreaterThan(String value) {
            addCriterion("accessoriesnum >", value, "accessoriesnum");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnumGreaterThanOrEqualTo(String value) {
            addCriterion("accessoriesnum >=", value, "accessoriesnum");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnumLessThan(String value) {
            addCriterion("accessoriesnum <", value, "accessoriesnum");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnumLessThanOrEqualTo(String value) {
            addCriterion("accessoriesnum <=", value, "accessoriesnum");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnumLike(String value) {
            addCriterion("accessoriesnum like", value, "accessoriesnum");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnumNotLike(String value) {
            addCriterion("accessoriesnum not like", value, "accessoriesnum");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnumIn(List<String> values) {
            addCriterion("accessoriesnum in", values, "accessoriesnum");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnumNotIn(List<String> values) {
            addCriterion("accessoriesnum not in", values, "accessoriesnum");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnumBetween(String value1, String value2) {
            addCriterion("accessoriesnum between", value1, value2, "accessoriesnum");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnumNotBetween(String value1, String value2) {
            addCriterion("accessoriesnum not between", value1, value2, "accessoriesnum");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnameIsNull() {
            addCriterion("accessoriesname is null");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnameIsNotNull() {
            addCriterion("accessoriesname is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnameEqualTo(String value) {
            addCriterion("accessoriesname =", value, "accessoriesname");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnameNotEqualTo(String value) {
            addCriterion("accessoriesname <>", value, "accessoriesname");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnameGreaterThan(String value) {
            addCriterion("accessoriesname >", value, "accessoriesname");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnameGreaterThanOrEqualTo(String value) {
            addCriterion("accessoriesname >=", value, "accessoriesname");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnameLessThan(String value) {
            addCriterion("accessoriesname <", value, "accessoriesname");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnameLessThanOrEqualTo(String value) {
            addCriterion("accessoriesname <=", value, "accessoriesname");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnameLike(String value) {
            addCriterion("accessoriesname like", value, "accessoriesname");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnameNotLike(String value) {
            addCriterion("accessoriesname not like", value, "accessoriesname");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnameIn(List<String> values) {
            addCriterion("accessoriesname in", values, "accessoriesname");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnameNotIn(List<String> values) {
            addCriterion("accessoriesname not in", values, "accessoriesname");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnameBetween(String value1, String value2) {
            addCriterion("accessoriesname between", value1, value2, "accessoriesname");
            return (Criteria) this;
        }

        public Criteria andAccessoriesnameNotBetween(String value1, String value2) {
            addCriterion("accessoriesname not between", value1, value2, "accessoriesname");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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