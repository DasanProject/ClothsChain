package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_timesetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_timesetExample() {
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

        public Criteria andSetidIsNull() {
            addCriterion("setid is null");
            return (Criteria) this;
        }

        public Criteria andSetidIsNotNull() {
            addCriterion("setid is not null");
            return (Criteria) this;
        }

        public Criteria andSetidEqualTo(Integer value) {
            addCriterion("setid =", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidNotEqualTo(Integer value) {
            addCriterion("setid <>", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidGreaterThan(Integer value) {
            addCriterion("setid >", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("setid >=", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidLessThan(Integer value) {
            addCriterion("setid <", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidLessThanOrEqualTo(Integer value) {
            addCriterion("setid <=", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidIn(List<Integer> values) {
            addCriterion("setid in", values, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidNotIn(List<Integer> values) {
            addCriterion("setid not in", values, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidBetween(Integer value1, Integer value2) {
            addCriterion("setid between", value1, value2, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidNotBetween(Integer value1, Integer value2) {
            addCriterion("setid not between", value1, value2, "setid");
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

        public Criteria andWorkdateIsNull() {
            addCriterion("workdate is null");
            return (Criteria) this;
        }

        public Criteria andWorkdateIsNotNull() {
            addCriterion("workdate is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdateEqualTo(String value) {
            addCriterion("workdate =", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotEqualTo(String value) {
            addCriterion("workdate <>", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateGreaterThan(String value) {
            addCriterion("workdate >", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateGreaterThanOrEqualTo(String value) {
            addCriterion("workdate >=", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateLessThan(String value) {
            addCriterion("workdate <", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateLessThanOrEqualTo(String value) {
            addCriterion("workdate <=", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateLike(String value) {
            addCriterion("workdate like", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotLike(String value) {
            addCriterion("workdate not like", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateIn(List<String> values) {
            addCriterion("workdate in", values, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotIn(List<String> values) {
            addCriterion("workdate not in", values, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateBetween(String value1, String value2) {
            addCriterion("workdate between", value1, value2, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotBetween(String value1, String value2) {
            addCriterion("workdate not between", value1, value2, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkhoursIsNull() {
            addCriterion("workhours is null");
            return (Criteria) this;
        }

        public Criteria andWorkhoursIsNotNull() {
            addCriterion("workhours is not null");
            return (Criteria) this;
        }

        public Criteria andWorkhoursEqualTo(Integer value) {
            addCriterion("workhours =", value, "workhours");
            return (Criteria) this;
        }

        public Criteria andWorkhoursNotEqualTo(Integer value) {
            addCriterion("workhours <>", value, "workhours");
            return (Criteria) this;
        }

        public Criteria andWorkhoursGreaterThan(Integer value) {
            addCriterion("workhours >", value, "workhours");
            return (Criteria) this;
        }

        public Criteria andWorkhoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("workhours >=", value, "workhours");
            return (Criteria) this;
        }

        public Criteria andWorkhoursLessThan(Integer value) {
            addCriterion("workhours <", value, "workhours");
            return (Criteria) this;
        }

        public Criteria andWorkhoursLessThanOrEqualTo(Integer value) {
            addCriterion("workhours <=", value, "workhours");
            return (Criteria) this;
        }

        public Criteria andWorkhoursIn(List<Integer> values) {
            addCriterion("workhours in", values, "workhours");
            return (Criteria) this;
        }

        public Criteria andWorkhoursNotIn(List<Integer> values) {
            addCriterion("workhours not in", values, "workhours");
            return (Criteria) this;
        }

        public Criteria andWorkhoursBetween(Integer value1, Integer value2) {
            addCriterion("workhours between", value1, value2, "workhours");
            return (Criteria) this;
        }

        public Criteria andWorkhoursNotBetween(Integer value1, Integer value2) {
            addCriterion("workhours not between", value1, value2, "workhours");
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