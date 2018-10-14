package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_productplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_productplanExample() {
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

        public Criteria andProductplanidIsNull() {
            addCriterion("productplanid is null");
            return (Criteria) this;
        }

        public Criteria andProductplanidIsNotNull() {
            addCriterion("productplanid is not null");
            return (Criteria) this;
        }

        public Criteria andProductplanidEqualTo(Integer value) {
            addCriterion("productplanid =", value, "productplanid");
            return (Criteria) this;
        }

        public Criteria andProductplanidNotEqualTo(Integer value) {
            addCriterion("productplanid <>", value, "productplanid");
            return (Criteria) this;
        }

        public Criteria andProductplanidGreaterThan(Integer value) {
            addCriterion("productplanid >", value, "productplanid");
            return (Criteria) this;
        }

        public Criteria andProductplanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productplanid >=", value, "productplanid");
            return (Criteria) this;
        }

        public Criteria andProductplanidLessThan(Integer value) {
            addCriterion("productplanid <", value, "productplanid");
            return (Criteria) this;
        }

        public Criteria andProductplanidLessThanOrEqualTo(Integer value) {
            addCriterion("productplanid <=", value, "productplanid");
            return (Criteria) this;
        }

        public Criteria andProductplanidIn(List<Integer> values) {
            addCriterion("productplanid in", values, "productplanid");
            return (Criteria) this;
        }

        public Criteria andProductplanidNotIn(List<Integer> values) {
            addCriterion("productplanid not in", values, "productplanid");
            return (Criteria) this;
        }

        public Criteria andProductplanidBetween(Integer value1, Integer value2) {
            addCriterion("productplanid between", value1, value2, "productplanid");
            return (Criteria) this;
        }

        public Criteria andProductplanidNotBetween(Integer value1, Integer value2) {
            addCriterion("productplanid not between", value1, value2, "productplanid");
            return (Criteria) this;
        }

        public Criteria andPlanthingIsNull() {
            addCriterion("planthing is null");
            return (Criteria) this;
        }

        public Criteria andPlanthingIsNotNull() {
            addCriterion("planthing is not null");
            return (Criteria) this;
        }

        public Criteria andPlanthingEqualTo(String value) {
            addCriterion("planthing =", value, "planthing");
            return (Criteria) this;
        }

        public Criteria andPlanthingNotEqualTo(String value) {
            addCriterion("planthing <>", value, "planthing");
            return (Criteria) this;
        }

        public Criteria andPlanthingGreaterThan(String value) {
            addCriterion("planthing >", value, "planthing");
            return (Criteria) this;
        }

        public Criteria andPlanthingGreaterThanOrEqualTo(String value) {
            addCriterion("planthing >=", value, "planthing");
            return (Criteria) this;
        }

        public Criteria andPlanthingLessThan(String value) {
            addCriterion("planthing <", value, "planthing");
            return (Criteria) this;
        }

        public Criteria andPlanthingLessThanOrEqualTo(String value) {
            addCriterion("planthing <=", value, "planthing");
            return (Criteria) this;
        }

        public Criteria andPlanthingLike(String value) {
            addCriterion("planthing like", value, "planthing");
            return (Criteria) this;
        }

        public Criteria andPlanthingNotLike(String value) {
            addCriterion("planthing not like", value, "planthing");
            return (Criteria) this;
        }

        public Criteria andPlanthingIn(List<String> values) {
            addCriterion("planthing in", values, "planthing");
            return (Criteria) this;
        }

        public Criteria andPlanthingNotIn(List<String> values) {
            addCriterion("planthing not in", values, "planthing");
            return (Criteria) this;
        }

        public Criteria andPlanthingBetween(String value1, String value2) {
            addCriterion("planthing between", value1, value2, "planthing");
            return (Criteria) this;
        }

        public Criteria andPlanthingNotBetween(String value1, String value2) {
            addCriterion("planthing not between", value1, value2, "planthing");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNull() {
            addCriterion("plandate is null");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNotNull() {
            addCriterion("plandate is not null");
            return (Criteria) this;
        }

        public Criteria andPlandateEqualTo(String value) {
            addCriterion("plandate =", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotEqualTo(String value) {
            addCriterion("plandate <>", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThan(String value) {
            addCriterion("plandate >", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThanOrEqualTo(String value) {
            addCriterion("plandate >=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThan(String value) {
            addCriterion("plandate <", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThanOrEqualTo(String value) {
            addCriterion("plandate <=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLike(String value) {
            addCriterion("plandate like", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotLike(String value) {
            addCriterion("plandate not like", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateIn(List<String> values) {
            addCriterion("plandate in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotIn(List<String> values) {
            addCriterion("plandate not in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateBetween(String value1, String value2) {
            addCriterion("plandate between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotBetween(String value1, String value2) {
            addCriterion("plandate not between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andComplatedateIsNull() {
            addCriterion("complatedate is null");
            return (Criteria) this;
        }

        public Criteria andComplatedateIsNotNull() {
            addCriterion("complatedate is not null");
            return (Criteria) this;
        }

        public Criteria andComplatedateEqualTo(String value) {
            addCriterion("complatedate =", value, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateNotEqualTo(String value) {
            addCriterion("complatedate <>", value, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateGreaterThan(String value) {
            addCriterion("complatedate >", value, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateGreaterThanOrEqualTo(String value) {
            addCriterion("complatedate >=", value, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateLessThan(String value) {
            addCriterion("complatedate <", value, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateLessThanOrEqualTo(String value) {
            addCriterion("complatedate <=", value, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateLike(String value) {
            addCriterion("complatedate like", value, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateNotLike(String value) {
            addCriterion("complatedate not like", value, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateIn(List<String> values) {
            addCriterion("complatedate in", values, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateNotIn(List<String> values) {
            addCriterion("complatedate not in", values, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateBetween(String value1, String value2) {
            addCriterion("complatedate between", value1, value2, "complatedate");
            return (Criteria) this;
        }

        public Criteria andComplatedateNotBetween(String value1, String value2) {
            addCriterion("complatedate not between", value1, value2, "complatedate");
            return (Criteria) this;
        }

        public Criteria andProgroupIsNull() {
            addCriterion("progroup is null");
            return (Criteria) this;
        }

        public Criteria andProgroupIsNotNull() {
            addCriterion("progroup is not null");
            return (Criteria) this;
        }

        public Criteria andProgroupEqualTo(String value) {
            addCriterion("progroup =", value, "progroup");
            return (Criteria) this;
        }

        public Criteria andProgroupNotEqualTo(String value) {
            addCriterion("progroup <>", value, "progroup");
            return (Criteria) this;
        }

        public Criteria andProgroupGreaterThan(String value) {
            addCriterion("progroup >", value, "progroup");
            return (Criteria) this;
        }

        public Criteria andProgroupGreaterThanOrEqualTo(String value) {
            addCriterion("progroup >=", value, "progroup");
            return (Criteria) this;
        }

        public Criteria andProgroupLessThan(String value) {
            addCriterion("progroup <", value, "progroup");
            return (Criteria) this;
        }

        public Criteria andProgroupLessThanOrEqualTo(String value) {
            addCriterion("progroup <=", value, "progroup");
            return (Criteria) this;
        }

        public Criteria andProgroupLike(String value) {
            addCriterion("progroup like", value, "progroup");
            return (Criteria) this;
        }

        public Criteria andProgroupNotLike(String value) {
            addCriterion("progroup not like", value, "progroup");
            return (Criteria) this;
        }

        public Criteria andProgroupIn(List<String> values) {
            addCriterion("progroup in", values, "progroup");
            return (Criteria) this;
        }

        public Criteria andProgroupNotIn(List<String> values) {
            addCriterion("progroup not in", values, "progroup");
            return (Criteria) this;
        }

        public Criteria andProgroupBetween(String value1, String value2) {
            addCriterion("progroup between", value1, value2, "progroup");
            return (Criteria) this;
        }

        public Criteria andProgroupNotBetween(String value1, String value2) {
            addCriterion("progroup not between", value1, value2, "progroup");
            return (Criteria) this;
        }

        public Criteria andChargepaopleIsNull() {
            addCriterion("chargepaople is null");
            return (Criteria) this;
        }

        public Criteria andChargepaopleIsNotNull() {
            addCriterion("chargepaople is not null");
            return (Criteria) this;
        }

        public Criteria andChargepaopleEqualTo(String value) {
            addCriterion("chargepaople =", value, "chargepaople");
            return (Criteria) this;
        }

        public Criteria andChargepaopleNotEqualTo(String value) {
            addCriterion("chargepaople <>", value, "chargepaople");
            return (Criteria) this;
        }

        public Criteria andChargepaopleGreaterThan(String value) {
            addCriterion("chargepaople >", value, "chargepaople");
            return (Criteria) this;
        }

        public Criteria andChargepaopleGreaterThanOrEqualTo(String value) {
            addCriterion("chargepaople >=", value, "chargepaople");
            return (Criteria) this;
        }

        public Criteria andChargepaopleLessThan(String value) {
            addCriterion("chargepaople <", value, "chargepaople");
            return (Criteria) this;
        }

        public Criteria andChargepaopleLessThanOrEqualTo(String value) {
            addCriterion("chargepaople <=", value, "chargepaople");
            return (Criteria) this;
        }

        public Criteria andChargepaopleLike(String value) {
            addCriterion("chargepaople like", value, "chargepaople");
            return (Criteria) this;
        }

        public Criteria andChargepaopleNotLike(String value) {
            addCriterion("chargepaople not like", value, "chargepaople");
            return (Criteria) this;
        }

        public Criteria andChargepaopleIn(List<String> values) {
            addCriterion("chargepaople in", values, "chargepaople");
            return (Criteria) this;
        }

        public Criteria andChargepaopleNotIn(List<String> values) {
            addCriterion("chargepaople not in", values, "chargepaople");
            return (Criteria) this;
        }

        public Criteria andChargepaopleBetween(String value1, String value2) {
            addCriterion("chargepaople between", value1, value2, "chargepaople");
            return (Criteria) this;
        }

        public Criteria andChargepaopleNotBetween(String value1, String value2) {
            addCriterion("chargepaople not between", value1, value2, "chargepaople");
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