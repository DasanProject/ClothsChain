package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_planremarkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_planremarkExample() {
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

        public Criteria andPlanremarkidIsNull() {
            addCriterion("planremarkid is null");
            return (Criteria) this;
        }

        public Criteria andPlanremarkidIsNotNull() {
            addCriterion("planremarkid is not null");
            return (Criteria) this;
        }

        public Criteria andPlanremarkidEqualTo(Integer value) {
            addCriterion("planremarkid =", value, "planremarkid");
            return (Criteria) this;
        }

        public Criteria andPlanremarkidNotEqualTo(Integer value) {
            addCriterion("planremarkid <>", value, "planremarkid");
            return (Criteria) this;
        }

        public Criteria andPlanremarkidGreaterThan(Integer value) {
            addCriterion("planremarkid >", value, "planremarkid");
            return (Criteria) this;
        }

        public Criteria andPlanremarkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("planremarkid >=", value, "planremarkid");
            return (Criteria) this;
        }

        public Criteria andPlanremarkidLessThan(Integer value) {
            addCriterion("planremarkid <", value, "planremarkid");
            return (Criteria) this;
        }

        public Criteria andPlanremarkidLessThanOrEqualTo(Integer value) {
            addCriterion("planremarkid <=", value, "planremarkid");
            return (Criteria) this;
        }

        public Criteria andPlanremarkidIn(List<Integer> values) {
            addCriterion("planremarkid in", values, "planremarkid");
            return (Criteria) this;
        }

        public Criteria andPlanremarkidNotIn(List<Integer> values) {
            addCriterion("planremarkid not in", values, "planremarkid");
            return (Criteria) this;
        }

        public Criteria andPlanremarkidBetween(Integer value1, Integer value2) {
            addCriterion("planremarkid between", value1, value2, "planremarkid");
            return (Criteria) this;
        }

        public Criteria andPlanremarkidNotBetween(Integer value1, Integer value2) {
            addCriterion("planremarkid not between", value1, value2, "planremarkid");
            return (Criteria) this;
        }

        public Criteria andProcurentidIsNull() {
            addCriterion("procurentid is null");
            return (Criteria) this;
        }

        public Criteria andProcurentidIsNotNull() {
            addCriterion("procurentid is not null");
            return (Criteria) this;
        }

        public Criteria andProcurentidEqualTo(Integer value) {
            addCriterion("procurentid =", value, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidNotEqualTo(Integer value) {
            addCriterion("procurentid <>", value, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidGreaterThan(Integer value) {
            addCriterion("procurentid >", value, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("procurentid >=", value, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidLessThan(Integer value) {
            addCriterion("procurentid <", value, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidLessThanOrEqualTo(Integer value) {
            addCriterion("procurentid <=", value, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidIn(List<Integer> values) {
            addCriterion("procurentid in", values, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidNotIn(List<Integer> values) {
            addCriterion("procurentid not in", values, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidBetween(Integer value1, Integer value2) {
            addCriterion("procurentid between", value1, value2, "procurentid");
            return (Criteria) this;
        }

        public Criteria andProcurentidNotBetween(Integer value1, Integer value2) {
            addCriterion("procurentid not between", value1, value2, "procurentid");
            return (Criteria) this;
        }

        public Criteria andReachidIsNull() {
            addCriterion("reachid is null");
            return (Criteria) this;
        }

        public Criteria andReachidIsNotNull() {
            addCriterion("reachid is not null");
            return (Criteria) this;
        }

        public Criteria andReachidEqualTo(Integer value) {
            addCriterion("reachid =", value, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidNotEqualTo(Integer value) {
            addCriterion("reachid <>", value, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidGreaterThan(Integer value) {
            addCriterion("reachid >", value, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reachid >=", value, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidLessThan(Integer value) {
            addCriterion("reachid <", value, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidLessThanOrEqualTo(Integer value) {
            addCriterion("reachid <=", value, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidIn(List<Integer> values) {
            addCriterion("reachid in", values, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidNotIn(List<Integer> values) {
            addCriterion("reachid not in", values, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidBetween(Integer value1, Integer value2) {
            addCriterion("reachid between", value1, value2, "reachid");
            return (Criteria) this;
        }

        public Criteria andReachidNotBetween(Integer value1, Integer value2) {
            addCriterion("reachid not between", value1, value2, "reachid");
            return (Criteria) this;
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

        public Criteria andOtherplanidIsNull() {
            addCriterion("otherplanid is null");
            return (Criteria) this;
        }

        public Criteria andOtherplanidIsNotNull() {
            addCriterion("otherplanid is not null");
            return (Criteria) this;
        }

        public Criteria andOtherplanidEqualTo(Integer value) {
            addCriterion("otherplanid =", value, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidNotEqualTo(Integer value) {
            addCriterion("otherplanid <>", value, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidGreaterThan(Integer value) {
            addCriterion("otherplanid >", value, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("otherplanid >=", value, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidLessThan(Integer value) {
            addCriterion("otherplanid <", value, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidLessThanOrEqualTo(Integer value) {
            addCriterion("otherplanid <=", value, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidIn(List<Integer> values) {
            addCriterion("otherplanid in", values, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidNotIn(List<Integer> values) {
            addCriterion("otherplanid not in", values, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidBetween(Integer value1, Integer value2) {
            addCriterion("otherplanid between", value1, value2, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andOtherplanidNotBetween(Integer value1, Integer value2) {
            addCriterion("otherplanid not between", value1, value2, "otherplanid");
            return (Criteria) this;
        }

        public Criteria andSalenoIsNull() {
            addCriterion("saleno is null");
            return (Criteria) this;
        }

        public Criteria andSalenoIsNotNull() {
            addCriterion("saleno is not null");
            return (Criteria) this;
        }

        public Criteria andSalenoEqualTo(String value) {
            addCriterion("saleno =", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotEqualTo(String value) {
            addCriterion("saleno <>", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoGreaterThan(String value) {
            addCriterion("saleno >", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoGreaterThanOrEqualTo(String value) {
            addCriterion("saleno >=", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoLessThan(String value) {
            addCriterion("saleno <", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoLessThanOrEqualTo(String value) {
            addCriterion("saleno <=", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoLike(String value) {
            addCriterion("saleno like", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotLike(String value) {
            addCriterion("saleno not like", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoIn(List<String> values) {
            addCriterion("saleno in", values, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotIn(List<String> values) {
            addCriterion("saleno not in", values, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoBetween(String value1, String value2) {
            addCriterion("saleno between", value1, value2, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotBetween(String value1, String value2) {
            addCriterion("saleno not between", value1, value2, "saleno");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andOperaterIsNull() {
            addCriterion("operater is null");
            return (Criteria) this;
        }

        public Criteria andOperaterIsNotNull() {
            addCriterion("operater is not null");
            return (Criteria) this;
        }

        public Criteria andOperaterEqualTo(String value) {
            addCriterion("operater =", value, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterNotEqualTo(String value) {
            addCriterion("operater <>", value, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterGreaterThan(String value) {
            addCriterion("operater >", value, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterGreaterThanOrEqualTo(String value) {
            addCriterion("operater >=", value, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterLessThan(String value) {
            addCriterion("operater <", value, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterLessThanOrEqualTo(String value) {
            addCriterion("operater <=", value, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterLike(String value) {
            addCriterion("operater like", value, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterNotLike(String value) {
            addCriterion("operater not like", value, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterIn(List<String> values) {
            addCriterion("operater in", values, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterNotIn(List<String> values) {
            addCriterion("operater not in", values, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterBetween(String value1, String value2) {
            addCriterion("operater between", value1, value2, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterNotBetween(String value1, String value2) {
            addCriterion("operater not between", value1, value2, "operater");
            return (Criteria) this;
        }

        public Criteria andOperdateIsNull() {
            addCriterion("operdate is null");
            return (Criteria) this;
        }

        public Criteria andOperdateIsNotNull() {
            addCriterion("operdate is not null");
            return (Criteria) this;
        }

        public Criteria andOperdateEqualTo(String value) {
            addCriterion("operdate =", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateNotEqualTo(String value) {
            addCriterion("operdate <>", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateGreaterThan(String value) {
            addCriterion("operdate >", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateGreaterThanOrEqualTo(String value) {
            addCriterion("operdate >=", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateLessThan(String value) {
            addCriterion("operdate <", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateLessThanOrEqualTo(String value) {
            addCriterion("operdate <=", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateLike(String value) {
            addCriterion("operdate like", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateNotLike(String value) {
            addCriterion("operdate not like", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateIn(List<String> values) {
            addCriterion("operdate in", values, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateNotIn(List<String> values) {
            addCriterion("operdate not in", values, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateBetween(String value1, String value2) {
            addCriterion("operdate between", value1, value2, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateNotBetween(String value1, String value2) {
            addCriterion("operdate not between", value1, value2, "operdate");
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