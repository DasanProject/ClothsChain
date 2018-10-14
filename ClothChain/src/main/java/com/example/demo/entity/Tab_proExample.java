package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_proExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_proExample() {
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

        public Criteria andProgressidIsNull() {
            addCriterion("progressid is null");
            return (Criteria) this;
        }

        public Criteria andProgressidIsNotNull() {
            addCriterion("progressid is not null");
            return (Criteria) this;
        }

        public Criteria andProgressidEqualTo(Integer value) {
            addCriterion("progressid =", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidNotEqualTo(Integer value) {
            addCriterion("progressid <>", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidGreaterThan(Integer value) {
            addCriterion("progressid >", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("progressid >=", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidLessThan(Integer value) {
            addCriterion("progressid <", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidLessThanOrEqualTo(Integer value) {
            addCriterion("progressid <=", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidIn(List<Integer> values) {
            addCriterion("progressid in", values, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidNotIn(List<Integer> values) {
            addCriterion("progressid not in", values, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidBetween(Integer value1, Integer value2) {
            addCriterion("progressid between", value1, value2, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidNotBetween(Integer value1, Integer value2) {
            addCriterion("progressid not between", value1, value2, "progressid");
            return (Criteria) this;
        }

        public Criteria andSalesorderIsNull() {
            addCriterion("salesorder is null");
            return (Criteria) this;
        }

        public Criteria andSalesorderIsNotNull() {
            addCriterion("salesorder is not null");
            return (Criteria) this;
        }

        public Criteria andSalesorderEqualTo(String value) {
            addCriterion("salesorder =", value, "salesorder");
            return (Criteria) this;
        }

        public Criteria andSalesorderNotEqualTo(String value) {
            addCriterion("salesorder <>", value, "salesorder");
            return (Criteria) this;
        }

        public Criteria andSalesorderGreaterThan(String value) {
            addCriterion("salesorder >", value, "salesorder");
            return (Criteria) this;
        }

        public Criteria andSalesorderGreaterThanOrEqualTo(String value) {
            addCriterion("salesorder >=", value, "salesorder");
            return (Criteria) this;
        }

        public Criteria andSalesorderLessThan(String value) {
            addCriterion("salesorder <", value, "salesorder");
            return (Criteria) this;
        }

        public Criteria andSalesorderLessThanOrEqualTo(String value) {
            addCriterion("salesorder <=", value, "salesorder");
            return (Criteria) this;
        }

        public Criteria andSalesorderLike(String value) {
            addCriterion("salesorder like", value, "salesorder");
            return (Criteria) this;
        }

        public Criteria andSalesorderNotLike(String value) {
            addCriterion("salesorder not like", value, "salesorder");
            return (Criteria) this;
        }

        public Criteria andSalesorderIn(List<String> values) {
            addCriterion("salesorder in", values, "salesorder");
            return (Criteria) this;
        }

        public Criteria andSalesorderNotIn(List<String> values) {
            addCriterion("salesorder not in", values, "salesorder");
            return (Criteria) this;
        }

        public Criteria andSalesorderBetween(String value1, String value2) {
            addCriterion("salesorder between", value1, value2, "salesorder");
            return (Criteria) this;
        }

        public Criteria andSalesorderNotBetween(String value1, String value2) {
            addCriterion("salesorder not between", value1, value2, "salesorder");
            return (Criteria) this;
        }

        public Criteria andCutnumberIsNull() {
            addCriterion("cutnumber is null");
            return (Criteria) this;
        }

        public Criteria andCutnumberIsNotNull() {
            addCriterion("cutnumber is not null");
            return (Criteria) this;
        }

        public Criteria andCutnumberEqualTo(Integer value) {
            addCriterion("cutnumber =", value, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberNotEqualTo(Integer value) {
            addCriterion("cutnumber <>", value, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberGreaterThan(Integer value) {
            addCriterion("cutnumber >", value, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("cutnumber >=", value, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberLessThan(Integer value) {
            addCriterion("cutnumber <", value, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberLessThanOrEqualTo(Integer value) {
            addCriterion("cutnumber <=", value, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberIn(List<Integer> values) {
            addCriterion("cutnumber in", values, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberNotIn(List<Integer> values) {
            addCriterion("cutnumber not in", values, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberBetween(Integer value1, Integer value2) {
            addCriterion("cutnumber between", value1, value2, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andCutnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("cutnumber not between", value1, value2, "cutnumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberIsNull() {
            addCriterion("worknumber is null");
            return (Criteria) this;
        }

        public Criteria andWorknumberIsNotNull() {
            addCriterion("worknumber is not null");
            return (Criteria) this;
        }

        public Criteria andWorknumberEqualTo(Integer value) {
            addCriterion("worknumber =", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNotEqualTo(Integer value) {
            addCriterion("worknumber <>", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberGreaterThan(Integer value) {
            addCriterion("worknumber >", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("worknumber >=", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberLessThan(Integer value) {
            addCriterion("worknumber <", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberLessThanOrEqualTo(Integer value) {
            addCriterion("worknumber <=", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberIn(List<Integer> values) {
            addCriterion("worknumber in", values, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNotIn(List<Integer> values) {
            addCriterion("worknumber not in", values, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberBetween(Integer value1, Integer value2) {
            addCriterion("worknumber between", value1, value2, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNotBetween(Integer value1, Integer value2) {
            addCriterion("worknumber not between", value1, value2, "worknumber");
            return (Criteria) this;
        }

        public Criteria andIntputnumberIsNull() {
            addCriterion("intputnumber is null");
            return (Criteria) this;
        }

        public Criteria andIntputnumberIsNotNull() {
            addCriterion("intputnumber is not null");
            return (Criteria) this;
        }

        public Criteria andIntputnumberEqualTo(Integer value) {
            addCriterion("intputnumber =", value, "intputnumber");
            return (Criteria) this;
        }

        public Criteria andIntputnumberNotEqualTo(Integer value) {
            addCriterion("intputnumber <>", value, "intputnumber");
            return (Criteria) this;
        }

        public Criteria andIntputnumberGreaterThan(Integer value) {
            addCriterion("intputnumber >", value, "intputnumber");
            return (Criteria) this;
        }

        public Criteria andIntputnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("intputnumber >=", value, "intputnumber");
            return (Criteria) this;
        }

        public Criteria andIntputnumberLessThan(Integer value) {
            addCriterion("intputnumber <", value, "intputnumber");
            return (Criteria) this;
        }

        public Criteria andIntputnumberLessThanOrEqualTo(Integer value) {
            addCriterion("intputnumber <=", value, "intputnumber");
            return (Criteria) this;
        }

        public Criteria andIntputnumberIn(List<Integer> values) {
            addCriterion("intputnumber in", values, "intputnumber");
            return (Criteria) this;
        }

        public Criteria andIntputnumberNotIn(List<Integer> values) {
            addCriterion("intputnumber not in", values, "intputnumber");
            return (Criteria) this;
        }

        public Criteria andIntputnumberBetween(Integer value1, Integer value2) {
            addCriterion("intputnumber between", value1, value2, "intputnumber");
            return (Criteria) this;
        }

        public Criteria andIntputnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("intputnumber not between", value1, value2, "intputnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberIsNull() {
            addCriterion("outnumber is null");
            return (Criteria) this;
        }

        public Criteria andOutnumberIsNotNull() {
            addCriterion("outnumber is not null");
            return (Criteria) this;
        }

        public Criteria andOutnumberEqualTo(Integer value) {
            addCriterion("outnumber =", value, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberNotEqualTo(Integer value) {
            addCriterion("outnumber <>", value, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberGreaterThan(Integer value) {
            addCriterion("outnumber >", value, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("outnumber >=", value, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberLessThan(Integer value) {
            addCriterion("outnumber <", value, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberLessThanOrEqualTo(Integer value) {
            addCriterion("outnumber <=", value, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberIn(List<Integer> values) {
            addCriterion("outnumber in", values, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberNotIn(List<Integer> values) {
            addCriterion("outnumber not in", values, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberBetween(Integer value1, Integer value2) {
            addCriterion("outnumber between", value1, value2, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("outnumber not between", value1, value2, "outnumber");
            return (Criteria) this;
        }

        public Criteria andAccepetnumberIsNull() {
            addCriterion("accepetnumber is null");
            return (Criteria) this;
        }

        public Criteria andAccepetnumberIsNotNull() {
            addCriterion("accepetnumber is not null");
            return (Criteria) this;
        }

        public Criteria andAccepetnumberEqualTo(Integer value) {
            addCriterion("accepetnumber =", value, "accepetnumber");
            return (Criteria) this;
        }

        public Criteria andAccepetnumberNotEqualTo(Integer value) {
            addCriterion("accepetnumber <>", value, "accepetnumber");
            return (Criteria) this;
        }

        public Criteria andAccepetnumberGreaterThan(Integer value) {
            addCriterion("accepetnumber >", value, "accepetnumber");
            return (Criteria) this;
        }

        public Criteria andAccepetnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("accepetnumber >=", value, "accepetnumber");
            return (Criteria) this;
        }

        public Criteria andAccepetnumberLessThan(Integer value) {
            addCriterion("accepetnumber <", value, "accepetnumber");
            return (Criteria) this;
        }

        public Criteria andAccepetnumberLessThanOrEqualTo(Integer value) {
            addCriterion("accepetnumber <=", value, "accepetnumber");
            return (Criteria) this;
        }

        public Criteria andAccepetnumberIn(List<Integer> values) {
            addCriterion("accepetnumber in", values, "accepetnumber");
            return (Criteria) this;
        }

        public Criteria andAccepetnumberNotIn(List<Integer> values) {
            addCriterion("accepetnumber not in", values, "accepetnumber");
            return (Criteria) this;
        }

        public Criteria andAccepetnumberBetween(Integer value1, Integer value2) {
            addCriterion("accepetnumber between", value1, value2, "accepetnumber");
            return (Criteria) this;
        }

        public Criteria andAccepetnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("accepetnumber not between", value1, value2, "accepetnumber");
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