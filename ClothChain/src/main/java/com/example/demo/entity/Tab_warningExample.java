package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_warningExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_warningExample() {
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

        public Criteria andSetupidIsNull() {
            addCriterion("setupid is null");
            return (Criteria) this;
        }

        public Criteria andSetupidIsNotNull() {
            addCriterion("setupid is not null");
            return (Criteria) this;
        }

        public Criteria andSetupidEqualTo(Integer value) {
            addCriterion("setupid =", value, "setupid");
            return (Criteria) this;
        }

        public Criteria andSetupidNotEqualTo(Integer value) {
            addCriterion("setupid <>", value, "setupid");
            return (Criteria) this;
        }

        public Criteria andSetupidGreaterThan(Integer value) {
            addCriterion("setupid >", value, "setupid");
            return (Criteria) this;
        }

        public Criteria andSetupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("setupid >=", value, "setupid");
            return (Criteria) this;
        }

        public Criteria andSetupidLessThan(Integer value) {
            addCriterion("setupid <", value, "setupid");
            return (Criteria) this;
        }

        public Criteria andSetupidLessThanOrEqualTo(Integer value) {
            addCriterion("setupid <=", value, "setupid");
            return (Criteria) this;
        }

        public Criteria andSetupidIn(List<Integer> values) {
            addCriterion("setupid in", values, "setupid");
            return (Criteria) this;
        }

        public Criteria andSetupidNotIn(List<Integer> values) {
            addCriterion("setupid not in", values, "setupid");
            return (Criteria) this;
        }

        public Criteria andSetupidBetween(Integer value1, Integer value2) {
            addCriterion("setupid between", value1, value2, "setupid");
            return (Criteria) this;
        }

        public Criteria andSetupidNotBetween(Integer value1, Integer value2) {
            addCriterion("setupid not between", value1, value2, "setupid");
            return (Criteria) this;
        }

        public Criteria andMaterielnoIsNull() {
            addCriterion("materielno is null");
            return (Criteria) this;
        }

        public Criteria andMaterielnoIsNotNull() {
            addCriterion("materielno is not null");
            return (Criteria) this;
        }

        public Criteria andMaterielnoEqualTo(String value) {
            addCriterion("materielno =", value, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoNotEqualTo(String value) {
            addCriterion("materielno <>", value, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoGreaterThan(String value) {
            addCriterion("materielno >", value, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoGreaterThanOrEqualTo(String value) {
            addCriterion("materielno >=", value, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoLessThan(String value) {
            addCriterion("materielno <", value, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoLessThanOrEqualTo(String value) {
            addCriterion("materielno <=", value, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoLike(String value) {
            addCriterion("materielno like", value, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoNotLike(String value) {
            addCriterion("materielno not like", value, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoIn(List<String> values) {
            addCriterion("materielno in", values, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoNotIn(List<String> values) {
            addCriterion("materielno not in", values, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoBetween(String value1, String value2) {
            addCriterion("materielno between", value1, value2, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoNotBetween(String value1, String value2) {
            addCriterion("materielno not between", value1, value2, "materielno");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMaterielnameIsNull() {
            addCriterion("materielname is null");
            return (Criteria) this;
        }

        public Criteria andMaterielnameIsNotNull() {
            addCriterion("materielname is not null");
            return (Criteria) this;
        }

        public Criteria andMaterielnameEqualTo(String value) {
            addCriterion("materielname =", value, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameNotEqualTo(String value) {
            addCriterion("materielname <>", value, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameGreaterThan(String value) {
            addCriterion("materielname >", value, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameGreaterThanOrEqualTo(String value) {
            addCriterion("materielname >=", value, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameLessThan(String value) {
            addCriterion("materielname <", value, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameLessThanOrEqualTo(String value) {
            addCriterion("materielname <=", value, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameLike(String value) {
            addCriterion("materielname like", value, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameNotLike(String value) {
            addCriterion("materielname not like", value, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameIn(List<String> values) {
            addCriterion("materielname in", values, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameNotIn(List<String> values) {
            addCriterion("materielname not in", values, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameBetween(String value1, String value2) {
            addCriterion("materielname between", value1, value2, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameNotBetween(String value1, String value2) {
            addCriterion("materielname not between", value1, value2, "materielname");
            return (Criteria) this;
        }

        public Criteria andHigheststockIsNull() {
            addCriterion("higheststock is null");
            return (Criteria) this;
        }

        public Criteria andHigheststockIsNotNull() {
            addCriterion("higheststock is not null");
            return (Criteria) this;
        }

        public Criteria andHigheststockEqualTo(Double value) {
            addCriterion("higheststock =", value, "higheststock");
            return (Criteria) this;
        }

        public Criteria andHigheststockNotEqualTo(Double value) {
            addCriterion("higheststock <>", value, "higheststock");
            return (Criteria) this;
        }

        public Criteria andHigheststockGreaterThan(Double value) {
            addCriterion("higheststock >", value, "higheststock");
            return (Criteria) this;
        }

        public Criteria andHigheststockGreaterThanOrEqualTo(Double value) {
            addCriterion("higheststock >=", value, "higheststock");
            return (Criteria) this;
        }

        public Criteria andHigheststockLessThan(Double value) {
            addCriterion("higheststock <", value, "higheststock");
            return (Criteria) this;
        }

        public Criteria andHigheststockLessThanOrEqualTo(Double value) {
            addCriterion("higheststock <=", value, "higheststock");
            return (Criteria) this;
        }

        public Criteria andHigheststockIn(List<Double> values) {
            addCriterion("higheststock in", values, "higheststock");
            return (Criteria) this;
        }

        public Criteria andHigheststockNotIn(List<Double> values) {
            addCriterion("higheststock not in", values, "higheststock");
            return (Criteria) this;
        }

        public Criteria andHigheststockBetween(Double value1, Double value2) {
            addCriterion("higheststock between", value1, value2, "higheststock");
            return (Criteria) this;
        }

        public Criteria andHigheststockNotBetween(Double value1, Double value2) {
            addCriterion("higheststock not between", value1, value2, "higheststock");
            return (Criteria) this;
        }

        public Criteria andLowststockIsNull() {
            addCriterion("lowststock is null");
            return (Criteria) this;
        }

        public Criteria andLowststockIsNotNull() {
            addCriterion("lowststock is not null");
            return (Criteria) this;
        }

        public Criteria andLowststockEqualTo(Double value) {
            addCriterion("lowststock =", value, "lowststock");
            return (Criteria) this;
        }

        public Criteria andLowststockNotEqualTo(Double value) {
            addCriterion("lowststock <>", value, "lowststock");
            return (Criteria) this;
        }

        public Criteria andLowststockGreaterThan(Double value) {
            addCriterion("lowststock >", value, "lowststock");
            return (Criteria) this;
        }

        public Criteria andLowststockGreaterThanOrEqualTo(Double value) {
            addCriterion("lowststock >=", value, "lowststock");
            return (Criteria) this;
        }

        public Criteria andLowststockLessThan(Double value) {
            addCriterion("lowststock <", value, "lowststock");
            return (Criteria) this;
        }

        public Criteria andLowststockLessThanOrEqualTo(Double value) {
            addCriterion("lowststock <=", value, "lowststock");
            return (Criteria) this;
        }

        public Criteria andLowststockIn(List<Double> values) {
            addCriterion("lowststock in", values, "lowststock");
            return (Criteria) this;
        }

        public Criteria andLowststockNotIn(List<Double> values) {
            addCriterion("lowststock not in", values, "lowststock");
            return (Criteria) this;
        }

        public Criteria andLowststockBetween(Double value1, Double value2) {
            addCriterion("lowststock between", value1, value2, "lowststock");
            return (Criteria) this;
        }

        public Criteria andLowststockNotBetween(Double value1, Double value2) {
            addCriterion("lowststock not between", value1, value2, "lowststock");
            return (Criteria) this;
        }

        public Criteria andCloerIsNull() {
            addCriterion("cloer is null");
            return (Criteria) this;
        }

        public Criteria andCloerIsNotNull() {
            addCriterion("cloer is not null");
            return (Criteria) this;
        }

        public Criteria andCloerEqualTo(String value) {
            addCriterion("cloer =", value, "cloer");
            return (Criteria) this;
        }

        public Criteria andCloerNotEqualTo(String value) {
            addCriterion("cloer <>", value, "cloer");
            return (Criteria) this;
        }

        public Criteria andCloerGreaterThan(String value) {
            addCriterion("cloer >", value, "cloer");
            return (Criteria) this;
        }

        public Criteria andCloerGreaterThanOrEqualTo(String value) {
            addCriterion("cloer >=", value, "cloer");
            return (Criteria) this;
        }

        public Criteria andCloerLessThan(String value) {
            addCriterion("cloer <", value, "cloer");
            return (Criteria) this;
        }

        public Criteria andCloerLessThanOrEqualTo(String value) {
            addCriterion("cloer <=", value, "cloer");
            return (Criteria) this;
        }

        public Criteria andCloerLike(String value) {
            addCriterion("cloer like", value, "cloer");
            return (Criteria) this;
        }

        public Criteria andCloerNotLike(String value) {
            addCriterion("cloer not like", value, "cloer");
            return (Criteria) this;
        }

        public Criteria andCloerIn(List<String> values) {
            addCriterion("cloer in", values, "cloer");
            return (Criteria) this;
        }

        public Criteria andCloerNotIn(List<String> values) {
            addCriterion("cloer not in", values, "cloer");
            return (Criteria) this;
        }

        public Criteria andCloerBetween(String value1, String value2) {
            addCriterion("cloer between", value1, value2, "cloer");
            return (Criteria) this;
        }

        public Criteria andCloerNotBetween(String value1, String value2) {
            addCriterion("cloer not between", value1, value2, "cloer");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNull() {
            addCriterion("specifications is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNotNull() {
            addCriterion("specifications is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsEqualTo(String value) {
            addCriterion("specifications =", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotEqualTo(String value) {
            addCriterion("specifications <>", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThan(String value) {
            addCriterion("specifications >", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("specifications >=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThan(String value) {
            addCriterion("specifications <", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("specifications <=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLike(String value) {
            addCriterion("specifications like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotLike(String value) {
            addCriterion("specifications not like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIn(List<String> values) {
            addCriterion("specifications in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotIn(List<String> values) {
            addCriterion("specifications not in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsBetween(String value1, String value2) {
            addCriterion("specifications between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotBetween(String value1, String value2) {
            addCriterion("specifications not between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
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