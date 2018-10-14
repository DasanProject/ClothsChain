package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_clothcompontentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_clothcompontentExample() {
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

        public Criteria andCompontentidIsNull() {
            addCriterion("compontentid is null");
            return (Criteria) this;
        }

        public Criteria andCompontentidIsNotNull() {
            addCriterion("compontentid is not null");
            return (Criteria) this;
        }

        public Criteria andCompontentidEqualTo(Integer value) {
            addCriterion("compontentid =", value, "compontentid");
            return (Criteria) this;
        }

        public Criteria andCompontentidNotEqualTo(Integer value) {
            addCriterion("compontentid <>", value, "compontentid");
            return (Criteria) this;
        }

        public Criteria andCompontentidGreaterThan(Integer value) {
            addCriterion("compontentid >", value, "compontentid");
            return (Criteria) this;
        }

        public Criteria andCompontentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("compontentid >=", value, "compontentid");
            return (Criteria) this;
        }

        public Criteria andCompontentidLessThan(Integer value) {
            addCriterion("compontentid <", value, "compontentid");
            return (Criteria) this;
        }

        public Criteria andCompontentidLessThanOrEqualTo(Integer value) {
            addCriterion("compontentid <=", value, "compontentid");
            return (Criteria) this;
        }

        public Criteria andCompontentidIn(List<Integer> values) {
            addCriterion("compontentid in", values, "compontentid");
            return (Criteria) this;
        }

        public Criteria andCompontentidNotIn(List<Integer> values) {
            addCriterion("compontentid not in", values, "compontentid");
            return (Criteria) this;
        }

        public Criteria andCompontentidBetween(Integer value1, Integer value2) {
            addCriterion("compontentid between", value1, value2, "compontentid");
            return (Criteria) this;
        }

        public Criteria andCompontentidNotBetween(Integer value1, Integer value2) {
            addCriterion("compontentid not between", value1, value2, "compontentid");
            return (Criteria) this;
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

        public Criteria andCompontentnameIsNull() {
            addCriterion("compontentname is null");
            return (Criteria) this;
        }

        public Criteria andCompontentnameIsNotNull() {
            addCriterion("compontentname is not null");
            return (Criteria) this;
        }

        public Criteria andCompontentnameEqualTo(String value) {
            addCriterion("compontentname =", value, "compontentname");
            return (Criteria) this;
        }

        public Criteria andCompontentnameNotEqualTo(String value) {
            addCriterion("compontentname <>", value, "compontentname");
            return (Criteria) this;
        }

        public Criteria andCompontentnameGreaterThan(String value) {
            addCriterion("compontentname >", value, "compontentname");
            return (Criteria) this;
        }

        public Criteria andCompontentnameGreaterThanOrEqualTo(String value) {
            addCriterion("compontentname >=", value, "compontentname");
            return (Criteria) this;
        }

        public Criteria andCompontentnameLessThan(String value) {
            addCriterion("compontentname <", value, "compontentname");
            return (Criteria) this;
        }

        public Criteria andCompontentnameLessThanOrEqualTo(String value) {
            addCriterion("compontentname <=", value, "compontentname");
            return (Criteria) this;
        }

        public Criteria andCompontentnameLike(String value) {
            addCriterion("compontentname like", value, "compontentname");
            return (Criteria) this;
        }

        public Criteria andCompontentnameNotLike(String value) {
            addCriterion("compontentname not like", value, "compontentname");
            return (Criteria) this;
        }

        public Criteria andCompontentnameIn(List<String> values) {
            addCriterion("compontentname in", values, "compontentname");
            return (Criteria) this;
        }

        public Criteria andCompontentnameNotIn(List<String> values) {
            addCriterion("compontentname not in", values, "compontentname");
            return (Criteria) this;
        }

        public Criteria andCompontentnameBetween(String value1, String value2) {
            addCriterion("compontentname between", value1, value2, "compontentname");
            return (Criteria) this;
        }

        public Criteria andCompontentnameNotBetween(String value1, String value2) {
            addCriterion("compontentname not between", value1, value2, "compontentname");
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