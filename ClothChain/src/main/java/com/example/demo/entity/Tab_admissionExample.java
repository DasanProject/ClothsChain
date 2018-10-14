package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_admissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_admissionExample() {
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

        public Criteria andAdmissionidIsNull() {
            addCriterion("admissionid is null");
            return (Criteria) this;
        }

        public Criteria andAdmissionidIsNotNull() {
            addCriterion("admissionid is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissionidEqualTo(Integer value) {
            addCriterion("admissionid =", value, "admissionid");
            return (Criteria) this;
        }

        public Criteria andAdmissionidNotEqualTo(Integer value) {
            addCriterion("admissionid <>", value, "admissionid");
            return (Criteria) this;
        }

        public Criteria andAdmissionidGreaterThan(Integer value) {
            addCriterion("admissionid >", value, "admissionid");
            return (Criteria) this;
        }

        public Criteria andAdmissionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("admissionid >=", value, "admissionid");
            return (Criteria) this;
        }

        public Criteria andAdmissionidLessThan(Integer value) {
            addCriterion("admissionid <", value, "admissionid");
            return (Criteria) this;
        }

        public Criteria andAdmissionidLessThanOrEqualTo(Integer value) {
            addCriterion("admissionid <=", value, "admissionid");
            return (Criteria) this;
        }

        public Criteria andAdmissionidIn(List<Integer> values) {
            addCriterion("admissionid in", values, "admissionid");
            return (Criteria) this;
        }

        public Criteria andAdmissionidNotIn(List<Integer> values) {
            addCriterion("admissionid not in", values, "admissionid");
            return (Criteria) this;
        }

        public Criteria andAdmissionidBetween(Integer value1, Integer value2) {
            addCriterion("admissionid between", value1, value2, "admissionid");
            return (Criteria) this;
        }

        public Criteria andAdmissionidNotBetween(Integer value1, Integer value2) {
            addCriterion("admissionid not between", value1, value2, "admissionid");
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

        public Criteria andAdmissionmoneyIsNull() {
            addCriterion("admissionmoney is null");
            return (Criteria) this;
        }

        public Criteria andAdmissionmoneyIsNotNull() {
            addCriterion("admissionmoney is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissionmoneyEqualTo(Double value) {
            addCriterion("admissionmoney =", value, "admissionmoney");
            return (Criteria) this;
        }

        public Criteria andAdmissionmoneyNotEqualTo(Double value) {
            addCriterion("admissionmoney <>", value, "admissionmoney");
            return (Criteria) this;
        }

        public Criteria andAdmissionmoneyGreaterThan(Double value) {
            addCriterion("admissionmoney >", value, "admissionmoney");
            return (Criteria) this;
        }

        public Criteria andAdmissionmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("admissionmoney >=", value, "admissionmoney");
            return (Criteria) this;
        }

        public Criteria andAdmissionmoneyLessThan(Double value) {
            addCriterion("admissionmoney <", value, "admissionmoney");
            return (Criteria) this;
        }

        public Criteria andAdmissionmoneyLessThanOrEqualTo(Double value) {
            addCriterion("admissionmoney <=", value, "admissionmoney");
            return (Criteria) this;
        }

        public Criteria andAdmissionmoneyIn(List<Double> values) {
            addCriterion("admissionmoney in", values, "admissionmoney");
            return (Criteria) this;
        }

        public Criteria andAdmissionmoneyNotIn(List<Double> values) {
            addCriterion("admissionmoney not in", values, "admissionmoney");
            return (Criteria) this;
        }

        public Criteria andAdmissionmoneyBetween(Double value1, Double value2) {
            addCriterion("admissionmoney between", value1, value2, "admissionmoney");
            return (Criteria) this;
        }

        public Criteria andAdmissionmoneyNotBetween(Double value1, Double value2) {
            addCriterion("admissionmoney not between", value1, value2, "admissionmoney");
            return (Criteria) this;
        }

        public Criteria andDuenumIsNull() {
            addCriterion("duenum is null");
            return (Criteria) this;
        }

        public Criteria andDuenumIsNotNull() {
            addCriterion("duenum is not null");
            return (Criteria) this;
        }

        public Criteria andDuenumEqualTo(Integer value) {
            addCriterion("duenum =", value, "duenum");
            return (Criteria) this;
        }

        public Criteria andDuenumNotEqualTo(Integer value) {
            addCriterion("duenum <>", value, "duenum");
            return (Criteria) this;
        }

        public Criteria andDuenumGreaterThan(Integer value) {
            addCriterion("duenum >", value, "duenum");
            return (Criteria) this;
        }

        public Criteria andDuenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("duenum >=", value, "duenum");
            return (Criteria) this;
        }

        public Criteria andDuenumLessThan(Integer value) {
            addCriterion("duenum <", value, "duenum");
            return (Criteria) this;
        }

        public Criteria andDuenumLessThanOrEqualTo(Integer value) {
            addCriterion("duenum <=", value, "duenum");
            return (Criteria) this;
        }

        public Criteria andDuenumIn(List<Integer> values) {
            addCriterion("duenum in", values, "duenum");
            return (Criteria) this;
        }

        public Criteria andDuenumNotIn(List<Integer> values) {
            addCriterion("duenum not in", values, "duenum");
            return (Criteria) this;
        }

        public Criteria andDuenumBetween(Integer value1, Integer value2) {
            addCriterion("duenum between", value1, value2, "duenum");
            return (Criteria) this;
        }

        public Criteria andDuenumNotBetween(Integer value1, Integer value2) {
            addCriterion("duenum not between", value1, value2, "duenum");
            return (Criteria) this;
        }

        public Criteria andDuedateIsNull() {
            addCriterion("duedate is null");
            return (Criteria) this;
        }

        public Criteria andDuedateIsNotNull() {
            addCriterion("duedate is not null");
            return (Criteria) this;
        }

        public Criteria andDuedateEqualTo(String value) {
            addCriterion("duedate =", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotEqualTo(String value) {
            addCriterion("duedate <>", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThan(String value) {
            addCriterion("duedate >", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThanOrEqualTo(String value) {
            addCriterion("duedate >=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThan(String value) {
            addCriterion("duedate <", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThanOrEqualTo(String value) {
            addCriterion("duedate <=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLike(String value) {
            addCriterion("duedate like", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotLike(String value) {
            addCriterion("duedate not like", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateIn(List<String> values) {
            addCriterion("duedate in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotIn(List<String> values) {
            addCriterion("duedate not in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateBetween(String value1, String value2) {
            addCriterion("duedate between", value1, value2, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotBetween(String value1, String value2) {
            addCriterion("duedate not between", value1, value2, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuepeopleIsNull() {
            addCriterion("duepeople is null");
            return (Criteria) this;
        }

        public Criteria andDuepeopleIsNotNull() {
            addCriterion("duepeople is not null");
            return (Criteria) this;
        }

        public Criteria andDuepeopleEqualTo(String value) {
            addCriterion("duepeople =", value, "duepeople");
            return (Criteria) this;
        }

        public Criteria andDuepeopleNotEqualTo(String value) {
            addCriterion("duepeople <>", value, "duepeople");
            return (Criteria) this;
        }

        public Criteria andDuepeopleGreaterThan(String value) {
            addCriterion("duepeople >", value, "duepeople");
            return (Criteria) this;
        }

        public Criteria andDuepeopleGreaterThanOrEqualTo(String value) {
            addCriterion("duepeople >=", value, "duepeople");
            return (Criteria) this;
        }

        public Criteria andDuepeopleLessThan(String value) {
            addCriterion("duepeople <", value, "duepeople");
            return (Criteria) this;
        }

        public Criteria andDuepeopleLessThanOrEqualTo(String value) {
            addCriterion("duepeople <=", value, "duepeople");
            return (Criteria) this;
        }

        public Criteria andDuepeopleLike(String value) {
            addCriterion("duepeople like", value, "duepeople");
            return (Criteria) this;
        }

        public Criteria andDuepeopleNotLike(String value) {
            addCriterion("duepeople not like", value, "duepeople");
            return (Criteria) this;
        }

        public Criteria andDuepeopleIn(List<String> values) {
            addCriterion("duepeople in", values, "duepeople");
            return (Criteria) this;
        }

        public Criteria andDuepeopleNotIn(List<String> values) {
            addCriterion("duepeople not in", values, "duepeople");
            return (Criteria) this;
        }

        public Criteria andDuepeopleBetween(String value1, String value2) {
            addCriterion("duepeople between", value1, value2, "duepeople");
            return (Criteria) this;
        }

        public Criteria andDuepeopleNotBetween(String value1, String value2) {
            addCriterion("duepeople not between", value1, value2, "duepeople");
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