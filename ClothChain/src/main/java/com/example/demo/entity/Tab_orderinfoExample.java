package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_orderinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_orderinfoExample() {
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

        public Criteria andOrderinfoidIsNull() {
            addCriterion("orderinfoid is null");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidIsNotNull() {
            addCriterion("orderinfoid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidEqualTo(Integer value) {
            addCriterion("orderinfoid =", value, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidNotEqualTo(Integer value) {
            addCriterion("orderinfoid <>", value, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidGreaterThan(Integer value) {
            addCriterion("orderinfoid >", value, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderinfoid >=", value, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidLessThan(Integer value) {
            addCriterion("orderinfoid <", value, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("orderinfoid <=", value, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidIn(List<Integer> values) {
            addCriterion("orderinfoid in", values, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidNotIn(List<Integer> values) {
            addCriterion("orderinfoid not in", values, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidBetween(Integer value1, Integer value2) {
            addCriterion("orderinfoid between", value1, value2, "orderinfoid");
            return (Criteria) this;
        }

        public Criteria andOrderinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderinfoid not between", value1, value2, "orderinfoid");
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

        public Criteria andInfonameIsNull() {
            addCriterion("infoname is null");
            return (Criteria) this;
        }

        public Criteria andInfonameIsNotNull() {
            addCriterion("infoname is not null");
            return (Criteria) this;
        }

        public Criteria andInfonameEqualTo(String value) {
            addCriterion("infoname =", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameNotEqualTo(String value) {
            addCriterion("infoname <>", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameGreaterThan(String value) {
            addCriterion("infoname >", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameGreaterThanOrEqualTo(String value) {
            addCriterion("infoname >=", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameLessThan(String value) {
            addCriterion("infoname <", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameLessThanOrEqualTo(String value) {
            addCriterion("infoname <=", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameLike(String value) {
            addCriterion("infoname like", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameNotLike(String value) {
            addCriterion("infoname not like", value, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameIn(List<String> values) {
            addCriterion("infoname in", values, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameNotIn(List<String> values) {
            addCriterion("infoname not in", values, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameBetween(String value1, String value2) {
            addCriterion("infoname between", value1, value2, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfonameNotBetween(String value1, String value2) {
            addCriterion("infoname not between", value1, value2, "infoname");
            return (Criteria) this;
        }

        public Criteria andInfotypeIsNull() {
            addCriterion("infotype is null");
            return (Criteria) this;
        }

        public Criteria andInfotypeIsNotNull() {
            addCriterion("infotype is not null");
            return (Criteria) this;
        }

        public Criteria andInfotypeEqualTo(Integer value) {
            addCriterion("infotype =", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeNotEqualTo(Integer value) {
            addCriterion("infotype <>", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeGreaterThan(Integer value) {
            addCriterion("infotype >", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("infotype >=", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeLessThan(Integer value) {
            addCriterion("infotype <", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeLessThanOrEqualTo(Integer value) {
            addCriterion("infotype <=", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeIn(List<Integer> values) {
            addCriterion("infotype in", values, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeNotIn(List<Integer> values) {
            addCriterion("infotype not in", values, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeBetween(Integer value1, Integer value2) {
            addCriterion("infotype between", value1, value2, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeNotBetween(Integer value1, Integer value2) {
            addCriterion("infotype not between", value1, value2, "infotype");
            return (Criteria) this;
        }

        public Criteria andEntrydateIsNull() {
            addCriterion("entrydate is null");
            return (Criteria) this;
        }

        public Criteria andEntrydateIsNotNull() {
            addCriterion("entrydate is not null");
            return (Criteria) this;
        }

        public Criteria andEntrydateEqualTo(String value) {
            addCriterion("entrydate =", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateNotEqualTo(String value) {
            addCriterion("entrydate <>", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateGreaterThan(String value) {
            addCriterion("entrydate >", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateGreaterThanOrEqualTo(String value) {
            addCriterion("entrydate >=", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateLessThan(String value) {
            addCriterion("entrydate <", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateLessThanOrEqualTo(String value) {
            addCriterion("entrydate <=", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateLike(String value) {
            addCriterion("entrydate like", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateNotLike(String value) {
            addCriterion("entrydate not like", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateIn(List<String> values) {
            addCriterion("entrydate in", values, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateNotIn(List<String> values) {
            addCriterion("entrydate not in", values, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateBetween(String value1, String value2) {
            addCriterion("entrydate between", value1, value2, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateNotBetween(String value1, String value2) {
            addCriterion("entrydate not between", value1, value2, "entrydate");
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