package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_timeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_timeinfoExample() {
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

        public Criteria andTimeidIsNull() {
            addCriterion("timeid is null");
            return (Criteria) this;
        }

        public Criteria andTimeidIsNotNull() {
            addCriterion("timeid is not null");
            return (Criteria) this;
        }

        public Criteria andTimeidEqualTo(Integer value) {
            addCriterion("timeid =", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidNotEqualTo(Integer value) {
            addCriterion("timeid <>", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidGreaterThan(Integer value) {
            addCriterion("timeid >", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("timeid >=", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidLessThan(Integer value) {
            addCriterion("timeid <", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidLessThanOrEqualTo(Integer value) {
            addCriterion("timeid <=", value, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidIn(List<Integer> values) {
            addCriterion("timeid in", values, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidNotIn(List<Integer> values) {
            addCriterion("timeid not in", values, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidBetween(Integer value1, Integer value2) {
            addCriterion("timeid between", value1, value2, "timeid");
            return (Criteria) this;
        }

        public Criteria andTimeidNotBetween(Integer value1, Integer value2) {
            addCriterion("timeid not between", value1, value2, "timeid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIsNull() {
            addCriterion("orderdetailid is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIsNotNull() {
            addCriterion("orderdetailid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidEqualTo(Integer value) {
            addCriterion("orderdetailid =", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotEqualTo(Integer value) {
            addCriterion("orderdetailid <>", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidGreaterThan(Integer value) {
            addCriterion("orderdetailid >", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderdetailid >=", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLessThan(Integer value) {
            addCriterion("orderdetailid <", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLessThanOrEqualTo(Integer value) {
            addCriterion("orderdetailid <=", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIn(List<Integer> values) {
            addCriterion("orderdetailid in", values, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotIn(List<Integer> values) {
            addCriterion("orderdetailid not in", values, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidBetween(Integer value1, Integer value2) {
            addCriterion("orderdetailid between", value1, value2, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderdetailid not between", value1, value2, "orderdetailid");
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

        public Criteria andUppeopleIsNull() {
            addCriterion("uppeople is null");
            return (Criteria) this;
        }

        public Criteria andUppeopleIsNotNull() {
            addCriterion("uppeople is not null");
            return (Criteria) this;
        }

        public Criteria andUppeopleEqualTo(String value) {
            addCriterion("uppeople =", value, "uppeople");
            return (Criteria) this;
        }

        public Criteria andUppeopleNotEqualTo(String value) {
            addCriterion("uppeople <>", value, "uppeople");
            return (Criteria) this;
        }

        public Criteria andUppeopleGreaterThan(String value) {
            addCriterion("uppeople >", value, "uppeople");
            return (Criteria) this;
        }

        public Criteria andUppeopleGreaterThanOrEqualTo(String value) {
            addCriterion("uppeople >=", value, "uppeople");
            return (Criteria) this;
        }

        public Criteria andUppeopleLessThan(String value) {
            addCriterion("uppeople <", value, "uppeople");
            return (Criteria) this;
        }

        public Criteria andUppeopleLessThanOrEqualTo(String value) {
            addCriterion("uppeople <=", value, "uppeople");
            return (Criteria) this;
        }

        public Criteria andUppeopleLike(String value) {
            addCriterion("uppeople like", value, "uppeople");
            return (Criteria) this;
        }

        public Criteria andUppeopleNotLike(String value) {
            addCriterion("uppeople not like", value, "uppeople");
            return (Criteria) this;
        }

        public Criteria andUppeopleIn(List<String> values) {
            addCriterion("uppeople in", values, "uppeople");
            return (Criteria) this;
        }

        public Criteria andUppeopleNotIn(List<String> values) {
            addCriterion("uppeople not in", values, "uppeople");
            return (Criteria) this;
        }

        public Criteria andUppeopleBetween(String value1, String value2) {
            addCriterion("uppeople between", value1, value2, "uppeople");
            return (Criteria) this;
        }

        public Criteria andUppeopleNotBetween(String value1, String value2) {
            addCriterion("uppeople not between", value1, value2, "uppeople");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNull() {
            addCriterion("uptime is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("uptime is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(String value) {
            addCriterion("uptime =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(String value) {
            addCriterion("uptime <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(String value) {
            addCriterion("uptime >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(String value) {
            addCriterion("uptime >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(String value) {
            addCriterion("uptime <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(String value) {
            addCriterion("uptime <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLike(String value) {
            addCriterion("uptime like", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotLike(String value) {
            addCriterion("uptime not like", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<String> values) {
            addCriterion("uptime in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<String> values) {
            addCriterion("uptime not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(String value1, String value2) {
            addCriterion("uptime between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(String value1, String value2) {
            addCriterion("uptime not between", value1, value2, "uptime");
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