package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_shipnoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_shipnoExample() {
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

        public Criteria andSpidIsNull() {
            addCriterion("spid is null");
            return (Criteria) this;
        }

        public Criteria andSpidIsNotNull() {
            addCriterion("spid is not null");
            return (Criteria) this;
        }

        public Criteria andSpidEqualTo(Integer value) {
            addCriterion("spid =", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotEqualTo(Integer value) {
            addCriterion("spid <>", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidGreaterThan(Integer value) {
            addCriterion("spid >", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("spid >=", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidLessThan(Integer value) {
            addCriterion("spid <", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidLessThanOrEqualTo(Integer value) {
            addCriterion("spid <=", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidIn(List<Integer> values) {
            addCriterion("spid in", values, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotIn(List<Integer> values) {
            addCriterion("spid not in", values, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidBetween(Integer value1, Integer value2) {
            addCriterion("spid between", value1, value2, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotBetween(Integer value1, Integer value2) {
            addCriterion("spid not between", value1, value2, "spid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerid is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerid =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerid <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerid >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerid >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerid <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerid <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerid in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerid not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerid between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerid not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andNoticnoIsNull() {
            addCriterion("noticno is null");
            return (Criteria) this;
        }

        public Criteria andNoticnoIsNotNull() {
            addCriterion("noticno is not null");
            return (Criteria) this;
        }

        public Criteria andNoticnoEqualTo(String value) {
            addCriterion("noticno =", value, "noticno");
            return (Criteria) this;
        }

        public Criteria andNoticnoNotEqualTo(String value) {
            addCriterion("noticno <>", value, "noticno");
            return (Criteria) this;
        }

        public Criteria andNoticnoGreaterThan(String value) {
            addCriterion("noticno >", value, "noticno");
            return (Criteria) this;
        }

        public Criteria andNoticnoGreaterThanOrEqualTo(String value) {
            addCriterion("noticno >=", value, "noticno");
            return (Criteria) this;
        }

        public Criteria andNoticnoLessThan(String value) {
            addCriterion("noticno <", value, "noticno");
            return (Criteria) this;
        }

        public Criteria andNoticnoLessThanOrEqualTo(String value) {
            addCriterion("noticno <=", value, "noticno");
            return (Criteria) this;
        }

        public Criteria andNoticnoLike(String value) {
            addCriterion("noticno like", value, "noticno");
            return (Criteria) this;
        }

        public Criteria andNoticnoNotLike(String value) {
            addCriterion("noticno not like", value, "noticno");
            return (Criteria) this;
        }

        public Criteria andNoticnoIn(List<String> values) {
            addCriterion("noticno in", values, "noticno");
            return (Criteria) this;
        }

        public Criteria andNoticnoNotIn(List<String> values) {
            addCriterion("noticno not in", values, "noticno");
            return (Criteria) this;
        }

        public Criteria andNoticnoBetween(String value1, String value2) {
            addCriterion("noticno between", value1, value2, "noticno");
            return (Criteria) this;
        }

        public Criteria andNoticnoNotBetween(String value1, String value2) {
            addCriterion("noticno not between", value1, value2, "noticno");
            return (Criteria) this;
        }

        public Criteria andExpecteddateIsNull() {
            addCriterion("expecteddate is null");
            return (Criteria) this;
        }

        public Criteria andExpecteddateIsNotNull() {
            addCriterion("expecteddate is not null");
            return (Criteria) this;
        }

        public Criteria andExpecteddateEqualTo(String value) {
            addCriterion("expecteddate =", value, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateNotEqualTo(String value) {
            addCriterion("expecteddate <>", value, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateGreaterThan(String value) {
            addCriterion("expecteddate >", value, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateGreaterThanOrEqualTo(String value) {
            addCriterion("expecteddate >=", value, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateLessThan(String value) {
            addCriterion("expecteddate <", value, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateLessThanOrEqualTo(String value) {
            addCriterion("expecteddate <=", value, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateLike(String value) {
            addCriterion("expecteddate like", value, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateNotLike(String value) {
            addCriterion("expecteddate not like", value, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateIn(List<String> values) {
            addCriterion("expecteddate in", values, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateNotIn(List<String> values) {
            addCriterion("expecteddate not in", values, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateBetween(String value1, String value2) {
            addCriterion("expecteddate between", value1, value2, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andExpecteddateNotBetween(String value1, String value2) {
            addCriterion("expecteddate not between", value1, value2, "expecteddate");
            return (Criteria) this;
        }

        public Criteria andOutgodateIsNull() {
            addCriterion("outgodate is null");
            return (Criteria) this;
        }

        public Criteria andOutgodateIsNotNull() {
            addCriterion("outgodate is not null");
            return (Criteria) this;
        }

        public Criteria andOutgodateEqualTo(String value) {
            addCriterion("outgodate =", value, "outgodate");
            return (Criteria) this;
        }

        public Criteria andOutgodateNotEqualTo(String value) {
            addCriterion("outgodate <>", value, "outgodate");
            return (Criteria) this;
        }

        public Criteria andOutgodateGreaterThan(String value) {
            addCriterion("outgodate >", value, "outgodate");
            return (Criteria) this;
        }

        public Criteria andOutgodateGreaterThanOrEqualTo(String value) {
            addCriterion("outgodate >=", value, "outgodate");
            return (Criteria) this;
        }

        public Criteria andOutgodateLessThan(String value) {
            addCriterion("outgodate <", value, "outgodate");
            return (Criteria) this;
        }

        public Criteria andOutgodateLessThanOrEqualTo(String value) {
            addCriterion("outgodate <=", value, "outgodate");
            return (Criteria) this;
        }

        public Criteria andOutgodateLike(String value) {
            addCriterion("outgodate like", value, "outgodate");
            return (Criteria) this;
        }

        public Criteria andOutgodateNotLike(String value) {
            addCriterion("outgodate not like", value, "outgodate");
            return (Criteria) this;
        }

        public Criteria andOutgodateIn(List<String> values) {
            addCriterion("outgodate in", values, "outgodate");
            return (Criteria) this;
        }

        public Criteria andOutgodateNotIn(List<String> values) {
            addCriterion("outgodate not in", values, "outgodate");
            return (Criteria) this;
        }

        public Criteria andOutgodateBetween(String value1, String value2) {
            addCriterion("outgodate between", value1, value2, "outgodate");
            return (Criteria) this;
        }

        public Criteria andOutgodateNotBetween(String value1, String value2) {
            addCriterion("outgodate not between", value1, value2, "outgodate");
            return (Criteria) this;
        }

        public Criteria andManagersIsNull() {
            addCriterion("managers is null");
            return (Criteria) this;
        }

        public Criteria andManagersIsNotNull() {
            addCriterion("managers is not null");
            return (Criteria) this;
        }

        public Criteria andManagersEqualTo(String value) {
            addCriterion("managers =", value, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersNotEqualTo(String value) {
            addCriterion("managers <>", value, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersGreaterThan(String value) {
            addCriterion("managers >", value, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersGreaterThanOrEqualTo(String value) {
            addCriterion("managers >=", value, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersLessThan(String value) {
            addCriterion("managers <", value, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersLessThanOrEqualTo(String value) {
            addCriterion("managers <=", value, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersLike(String value) {
            addCriterion("managers like", value, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersNotLike(String value) {
            addCriterion("managers not like", value, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersIn(List<String> values) {
            addCriterion("managers in", values, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersNotIn(List<String> values) {
            addCriterion("managers not in", values, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersBetween(String value1, String value2) {
            addCriterion("managers between", value1, value2, "managers");
            return (Criteria) this;
        }

        public Criteria andManagersNotBetween(String value1, String value2) {
            addCriterion("managers not between", value1, value2, "managers");
            return (Criteria) this;
        }

        public Criteria andRelationIsNull() {
            addCriterion("relation is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("relation is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(String value) {
            addCriterion("relation =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(String value) {
            addCriterion("relation <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(String value) {
            addCriterion("relation >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(String value) {
            addCriterion("relation >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(String value) {
            addCriterion("relation <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(String value) {
            addCriterion("relation <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLike(String value) {
            addCriterion("relation like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotLike(String value) {
            addCriterion("relation not like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<String> values) {
            addCriterion("relation in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<String> values) {
            addCriterion("relation not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(String value1, String value2) {
            addCriterion("relation between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(String value1, String value2) {
            addCriterion("relation not between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andDeliIsNull() {
            addCriterion("deli is null");
            return (Criteria) this;
        }

        public Criteria andDeliIsNotNull() {
            addCriterion("deli is not null");
            return (Criteria) this;
        }

        public Criteria andDeliEqualTo(String value) {
            addCriterion("deli =", value, "deli");
            return (Criteria) this;
        }

        public Criteria andDeliNotEqualTo(String value) {
            addCriterion("deli <>", value, "deli");
            return (Criteria) this;
        }

        public Criteria andDeliGreaterThan(String value) {
            addCriterion("deli >", value, "deli");
            return (Criteria) this;
        }

        public Criteria andDeliGreaterThanOrEqualTo(String value) {
            addCriterion("deli >=", value, "deli");
            return (Criteria) this;
        }

        public Criteria andDeliLessThan(String value) {
            addCriterion("deli <", value, "deli");
            return (Criteria) this;
        }

        public Criteria andDeliLessThanOrEqualTo(String value) {
            addCriterion("deli <=", value, "deli");
            return (Criteria) this;
        }

        public Criteria andDeliLike(String value) {
            addCriterion("deli like", value, "deli");
            return (Criteria) this;
        }

        public Criteria andDeliNotLike(String value) {
            addCriterion("deli not like", value, "deli");
            return (Criteria) this;
        }

        public Criteria andDeliIn(List<String> values) {
            addCriterion("deli in", values, "deli");
            return (Criteria) this;
        }

        public Criteria andDeliNotIn(List<String> values) {
            addCriterion("deli not in", values, "deli");
            return (Criteria) this;
        }

        public Criteria andDeliBetween(String value1, String value2) {
            addCriterion("deli between", value1, value2, "deli");
            return (Criteria) this;
        }

        public Criteria andDeliNotBetween(String value1, String value2) {
            addCriterion("deli not between", value1, value2, "deli");
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