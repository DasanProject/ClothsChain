package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_stylelibraryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_stylelibraryExample() {
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

        public Criteria andStyleidIsNull() {
            addCriterion("styleid is null");
            return (Criteria) this;
        }

        public Criteria andStyleidIsNotNull() {
            addCriterion("styleid is not null");
            return (Criteria) this;
        }

        public Criteria andStyleidEqualTo(Integer value) {
            addCriterion("styleid =", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotEqualTo(Integer value) {
            addCriterion("styleid <>", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidGreaterThan(Integer value) {
            addCriterion("styleid >", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("styleid >=", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLessThan(Integer value) {
            addCriterion("styleid <", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLessThanOrEqualTo(Integer value) {
            addCriterion("styleid <=", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidIn(List<Integer> values) {
            addCriterion("styleid in", values, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotIn(List<Integer> values) {
            addCriterion("styleid not in", values, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidBetween(Integer value1, Integer value2) {
            addCriterion("styleid between", value1, value2, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotBetween(Integer value1, Integer value2) {
            addCriterion("styleid not between", value1, value2, "styleid");
            return (Criteria) this;
        }

        public Criteria andStylenumIsNull() {
            addCriterion("stylenum is null");
            return (Criteria) this;
        }

        public Criteria andStylenumIsNotNull() {
            addCriterion("stylenum is not null");
            return (Criteria) this;
        }

        public Criteria andStylenumEqualTo(String value) {
            addCriterion("stylenum =", value, "stylenum");
            return (Criteria) this;
        }

        public Criteria andStylenumNotEqualTo(String value) {
            addCriterion("stylenum <>", value, "stylenum");
            return (Criteria) this;
        }

        public Criteria andStylenumGreaterThan(String value) {
            addCriterion("stylenum >", value, "stylenum");
            return (Criteria) this;
        }

        public Criteria andStylenumGreaterThanOrEqualTo(String value) {
            addCriterion("stylenum >=", value, "stylenum");
            return (Criteria) this;
        }

        public Criteria andStylenumLessThan(String value) {
            addCriterion("stylenum <", value, "stylenum");
            return (Criteria) this;
        }

        public Criteria andStylenumLessThanOrEqualTo(String value) {
            addCriterion("stylenum <=", value, "stylenum");
            return (Criteria) this;
        }

        public Criteria andStylenumLike(String value) {
            addCriterion("stylenum like", value, "stylenum");
            return (Criteria) this;
        }

        public Criteria andStylenumNotLike(String value) {
            addCriterion("stylenum not like", value, "stylenum");
            return (Criteria) this;
        }

        public Criteria andStylenumIn(List<String> values) {
            addCriterion("stylenum in", values, "stylenum");
            return (Criteria) this;
        }

        public Criteria andStylenumNotIn(List<String> values) {
            addCriterion("stylenum not in", values, "stylenum");
            return (Criteria) this;
        }

        public Criteria andStylenumBetween(String value1, String value2) {
            addCriterion("stylenum between", value1, value2, "stylenum");
            return (Criteria) this;
        }

        public Criteria andStylenumNotBetween(String value1, String value2) {
            addCriterion("stylenum not between", value1, value2, "stylenum");
            return (Criteria) this;
        }

        public Criteria andStylenameIsNull() {
            addCriterion("stylename is null");
            return (Criteria) this;
        }

        public Criteria andStylenameIsNotNull() {
            addCriterion("stylename is not null");
            return (Criteria) this;
        }

        public Criteria andStylenameEqualTo(String value) {
            addCriterion("stylename =", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameNotEqualTo(String value) {
            addCriterion("stylename <>", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameGreaterThan(String value) {
            addCriterion("stylename >", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameGreaterThanOrEqualTo(String value) {
            addCriterion("stylename >=", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameLessThan(String value) {
            addCriterion("stylename <", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameLessThanOrEqualTo(String value) {
            addCriterion("stylename <=", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameLike(String value) {
            addCriterion("stylename like", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameNotLike(String value) {
            addCriterion("stylename not like", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameIn(List<String> values) {
            addCriterion("stylename in", values, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameNotIn(List<String> values) {
            addCriterion("stylename not in", values, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameBetween(String value1, String value2) {
            addCriterion("stylename between", value1, value2, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameNotBetween(String value1, String value2) {
            addCriterion("stylename not between", value1, value2, "stylename");
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