package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_colorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_colorExample() {
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

        public Criteria andColoridIsNull() {
            addCriterion("colorid is null");
            return (Criteria) this;
        }

        public Criteria andColoridIsNotNull() {
            addCriterion("colorid is not null");
            return (Criteria) this;
        }

        public Criteria andColoridEqualTo(Integer value) {
            addCriterion("colorid =", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotEqualTo(Integer value) {
            addCriterion("colorid <>", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThan(Integer value) {
            addCriterion("colorid >", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("colorid >=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThan(Integer value) {
            addCriterion("colorid <", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThanOrEqualTo(Integer value) {
            addCriterion("colorid <=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridIn(List<Integer> values) {
            addCriterion("colorid in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotIn(List<Integer> values) {
            addCriterion("colorid not in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridBetween(Integer value1, Integer value2) {
            addCriterion("colorid between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotBetween(Integer value1, Integer value2) {
            addCriterion("colorid not between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andColornoIsNull() {
            addCriterion("colorno is null");
            return (Criteria) this;
        }

        public Criteria andColornoIsNotNull() {
            addCriterion("colorno is not null");
            return (Criteria) this;
        }

        public Criteria andColornoEqualTo(String value) {
            addCriterion("colorno =", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoNotEqualTo(String value) {
            addCriterion("colorno <>", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoGreaterThan(String value) {
            addCriterion("colorno >", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoGreaterThanOrEqualTo(String value) {
            addCriterion("colorno >=", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoLessThan(String value) {
            addCriterion("colorno <", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoLessThanOrEqualTo(String value) {
            addCriterion("colorno <=", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoLike(String value) {
            addCriterion("colorno like", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoNotLike(String value) {
            addCriterion("colorno not like", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoIn(List<String> values) {
            addCriterion("colorno in", values, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoNotIn(List<String> values) {
            addCriterion("colorno not in", values, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoBetween(String value1, String value2) {
            addCriterion("colorno between", value1, value2, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoNotBetween(String value1, String value2) {
            addCriterion("colorno not between", value1, value2, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornameIsNull() {
            addCriterion("colorname is null");
            return (Criteria) this;
        }

        public Criteria andColornameIsNotNull() {
            addCriterion("colorname is not null");
            return (Criteria) this;
        }

        public Criteria andColornameEqualTo(String value) {
            addCriterion("colorname =", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotEqualTo(String value) {
            addCriterion("colorname <>", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameGreaterThan(String value) {
            addCriterion("colorname >", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameGreaterThanOrEqualTo(String value) {
            addCriterion("colorname >=", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLessThan(String value) {
            addCriterion("colorname <", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLessThanOrEqualTo(String value) {
            addCriterion("colorname <=", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameLike(String value) {
            addCriterion("colorname like", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotLike(String value) {
            addCriterion("colorname not like", value, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameIn(List<String> values) {
            addCriterion("colorname in", values, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotIn(List<String> values) {
            addCriterion("colorname not in", values, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameBetween(String value1, String value2) {
            addCriterion("colorname between", value1, value2, "colorname");
            return (Criteria) this;
        }

        public Criteria andColornameNotBetween(String value1, String value2) {
            addCriterion("colorname not between", value1, value2, "colorname");
            return (Criteria) this;
        }

        public Criteria andColorstrIsNull() {
            addCriterion("colorstr is null");
            return (Criteria) this;
        }

        public Criteria andColorstrIsNotNull() {
            addCriterion("colorstr is not null");
            return (Criteria) this;
        }

        public Criteria andColorstrEqualTo(String value) {
            addCriterion("colorstr =", value, "colorstr");
            return (Criteria) this;
        }

        public Criteria andColorstrNotEqualTo(String value) {
            addCriterion("colorstr <>", value, "colorstr");
            return (Criteria) this;
        }

        public Criteria andColorstrGreaterThan(String value) {
            addCriterion("colorstr >", value, "colorstr");
            return (Criteria) this;
        }

        public Criteria andColorstrGreaterThanOrEqualTo(String value) {
            addCriterion("colorstr >=", value, "colorstr");
            return (Criteria) this;
        }

        public Criteria andColorstrLessThan(String value) {
            addCriterion("colorstr <", value, "colorstr");
            return (Criteria) this;
        }

        public Criteria andColorstrLessThanOrEqualTo(String value) {
            addCriterion("colorstr <=", value, "colorstr");
            return (Criteria) this;
        }

        public Criteria andColorstrLike(String value) {
            addCriterion("colorstr like", value, "colorstr");
            return (Criteria) this;
        }

        public Criteria andColorstrNotLike(String value) {
            addCriterion("colorstr not like", value, "colorstr");
            return (Criteria) this;
        }

        public Criteria andColorstrIn(List<String> values) {
            addCriterion("colorstr in", values, "colorstr");
            return (Criteria) this;
        }

        public Criteria andColorstrNotIn(List<String> values) {
            addCriterion("colorstr not in", values, "colorstr");
            return (Criteria) this;
        }

        public Criteria andColorstrBetween(String value1, String value2) {
            addCriterion("colorstr between", value1, value2, "colorstr");
            return (Criteria) this;
        }

        public Criteria andColorstrNotBetween(String value1, String value2) {
            addCriterion("colorstr not between", value1, value2, "colorstr");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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