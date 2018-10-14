package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_sizetemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_sizetemplateExample() {
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

        public Criteria andSizeidIsNull() {
            addCriterion("sizeid is null");
            return (Criteria) this;
        }

        public Criteria andSizeidIsNotNull() {
            addCriterion("sizeid is not null");
            return (Criteria) this;
        }

        public Criteria andSizeidEqualTo(Integer value) {
            addCriterion("sizeid =", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidNotEqualTo(Integer value) {
            addCriterion("sizeid <>", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidGreaterThan(Integer value) {
            addCriterion("sizeid >", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sizeid >=", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidLessThan(Integer value) {
            addCriterion("sizeid <", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidLessThanOrEqualTo(Integer value) {
            addCriterion("sizeid <=", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidIn(List<Integer> values) {
            addCriterion("sizeid in", values, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidNotIn(List<Integer> values) {
            addCriterion("sizeid not in", values, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidBetween(Integer value1, Integer value2) {
            addCriterion("sizeid between", value1, value2, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidNotBetween(Integer value1, Integer value2) {
            addCriterion("sizeid not between", value1, value2, "sizeid");
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

        public Criteria andStyleidIsNull() {
            addCriterion("styleid is null");
            return (Criteria) this;
        }

        public Criteria andStyleidIsNotNull() {
            addCriterion("styleid is not null");
            return (Criteria) this;
        }

        public Criteria andStyleidEqualTo(Integer value) {
            addCriterion("styleid =", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotEqualTo(Integer value) {
            addCriterion("styleid <>", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidGreaterThan(Integer value) {
            addCriterion("styleid >", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("styleid >=", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLessThan(Integer value) {
            addCriterion("styleid <", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLessThanOrEqualTo(Integer value) {
            addCriterion("styleid <=", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidIn(List<Integer> values) {
            addCriterion("styleid in", values, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotIn(List<Integer> values) {
            addCriterion("styleid not in", values, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidBetween(Integer value1, Integer value2) {
            addCriterion("styleid between", value1, value2, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotBetween(Integer value1, Integer value2) {
            addCriterion("styleid not between", value1, value2, "styleid");
            return (Criteria) this;
        }

        public Criteria andBuweinoIsNull() {
            addCriterion("buweino is null");
            return (Criteria) this;
        }

        public Criteria andBuweinoIsNotNull() {
            addCriterion("buweino is not null");
            return (Criteria) this;
        }

        public Criteria andBuweinoEqualTo(String value) {
            addCriterion("buweino =", value, "buweino");
            return (Criteria) this;
        }

        public Criteria andBuweinoNotEqualTo(String value) {
            addCriterion("buweino <>", value, "buweino");
            return (Criteria) this;
        }

        public Criteria andBuweinoGreaterThan(String value) {
            addCriterion("buweino >", value, "buweino");
            return (Criteria) this;
        }

        public Criteria andBuweinoGreaterThanOrEqualTo(String value) {
            addCriterion("buweino >=", value, "buweino");
            return (Criteria) this;
        }

        public Criteria andBuweinoLessThan(String value) {
            addCriterion("buweino <", value, "buweino");
            return (Criteria) this;
        }

        public Criteria andBuweinoLessThanOrEqualTo(String value) {
            addCriterion("buweino <=", value, "buweino");
            return (Criteria) this;
        }

        public Criteria andBuweinoLike(String value) {
            addCriterion("buweino like", value, "buweino");
            return (Criteria) this;
        }

        public Criteria andBuweinoNotLike(String value) {
            addCriterion("buweino not like", value, "buweino");
            return (Criteria) this;
        }

        public Criteria andBuweinoIn(List<String> values) {
            addCriterion("buweino in", values, "buweino");
            return (Criteria) this;
        }

        public Criteria andBuweinoNotIn(List<String> values) {
            addCriterion("buweino not in", values, "buweino");
            return (Criteria) this;
        }

        public Criteria andBuweinoBetween(String value1, String value2) {
            addCriterion("buweino between", value1, value2, "buweino");
            return (Criteria) this;
        }

        public Criteria andBuweinoNotBetween(String value1, String value2) {
            addCriterion("buweino not between", value1, value2, "buweino");
            return (Criteria) this;
        }

        public Criteria andBuweinameIsNull() {
            addCriterion("buweiname is null");
            return (Criteria) this;
        }

        public Criteria andBuweinameIsNotNull() {
            addCriterion("buweiname is not null");
            return (Criteria) this;
        }

        public Criteria andBuweinameEqualTo(String value) {
            addCriterion("buweiname =", value, "buweiname");
            return (Criteria) this;
        }

        public Criteria andBuweinameNotEqualTo(String value) {
            addCriterion("buweiname <>", value, "buweiname");
            return (Criteria) this;
        }

        public Criteria andBuweinameGreaterThan(String value) {
            addCriterion("buweiname >", value, "buweiname");
            return (Criteria) this;
        }

        public Criteria andBuweinameGreaterThanOrEqualTo(String value) {
            addCriterion("buweiname >=", value, "buweiname");
            return (Criteria) this;
        }

        public Criteria andBuweinameLessThan(String value) {
            addCriterion("buweiname <", value, "buweiname");
            return (Criteria) this;
        }

        public Criteria andBuweinameLessThanOrEqualTo(String value) {
            addCriterion("buweiname <=", value, "buweiname");
            return (Criteria) this;
        }

        public Criteria andBuweinameLike(String value) {
            addCriterion("buweiname like", value, "buweiname");
            return (Criteria) this;
        }

        public Criteria andBuweinameNotLike(String value) {
            addCriterion("buweiname not like", value, "buweiname");
            return (Criteria) this;
        }

        public Criteria andBuweinameIn(List<String> values) {
            addCriterion("buweiname in", values, "buweiname");
            return (Criteria) this;
        }

        public Criteria andBuweinameNotIn(List<String> values) {
            addCriterion("buweiname not in", values, "buweiname");
            return (Criteria) this;
        }

        public Criteria andBuweinameBetween(String value1, String value2) {
            addCriterion("buweiname between", value1, value2, "buweiname");
            return (Criteria) this;
        }

        public Criteria andBuweinameNotBetween(String value1, String value2) {
            addCriterion("buweiname not between", value1, value2, "buweiname");
            return (Criteria) this;
        }

        public Criteria andPositiveIsNull() {
            addCriterion("positive is null");
            return (Criteria) this;
        }

        public Criteria andPositiveIsNotNull() {
            addCriterion("positive is not null");
            return (Criteria) this;
        }

        public Criteria andPositiveEqualTo(Double value) {
            addCriterion("positive =", value, "positive");
            return (Criteria) this;
        }

        public Criteria andPositiveNotEqualTo(Double value) {
            addCriterion("positive <>", value, "positive");
            return (Criteria) this;
        }

        public Criteria andPositiveGreaterThan(Double value) {
            addCriterion("positive >", value, "positive");
            return (Criteria) this;
        }

        public Criteria andPositiveGreaterThanOrEqualTo(Double value) {
            addCriterion("positive >=", value, "positive");
            return (Criteria) this;
        }

        public Criteria andPositiveLessThan(Double value) {
            addCriterion("positive <", value, "positive");
            return (Criteria) this;
        }

        public Criteria andPositiveLessThanOrEqualTo(Double value) {
            addCriterion("positive <=", value, "positive");
            return (Criteria) this;
        }

        public Criteria andPositiveIn(List<Double> values) {
            addCriterion("positive in", values, "positive");
            return (Criteria) this;
        }

        public Criteria andPositiveNotIn(List<Double> values) {
            addCriterion("positive not in", values, "positive");
            return (Criteria) this;
        }

        public Criteria andPositiveBetween(Double value1, Double value2) {
            addCriterion("positive between", value1, value2, "positive");
            return (Criteria) this;
        }

        public Criteria andPositiveNotBetween(Double value1, Double value2) {
            addCriterion("positive not between", value1, value2, "positive");
            return (Criteria) this;
        }

        public Criteria andNegativeIsNull() {
            addCriterion("negative is null");
            return (Criteria) this;
        }

        public Criteria andNegativeIsNotNull() {
            addCriterion("negative is not null");
            return (Criteria) this;
        }

        public Criteria andNegativeEqualTo(Double value) {
            addCriterion("negative =", value, "negative");
            return (Criteria) this;
        }

        public Criteria andNegativeNotEqualTo(Double value) {
            addCriterion("negative <>", value, "negative");
            return (Criteria) this;
        }

        public Criteria andNegativeGreaterThan(Double value) {
            addCriterion("negative >", value, "negative");
            return (Criteria) this;
        }

        public Criteria andNegativeGreaterThanOrEqualTo(Double value) {
            addCriterion("negative >=", value, "negative");
            return (Criteria) this;
        }

        public Criteria andNegativeLessThan(Double value) {
            addCriterion("negative <", value, "negative");
            return (Criteria) this;
        }

        public Criteria andNegativeLessThanOrEqualTo(Double value) {
            addCriterion("negative <=", value, "negative");
            return (Criteria) this;
        }

        public Criteria andNegativeIn(List<Double> values) {
            addCriterion("negative in", values, "negative");
            return (Criteria) this;
        }

        public Criteria andNegativeNotIn(List<Double> values) {
            addCriterion("negative not in", values, "negative");
            return (Criteria) this;
        }

        public Criteria andNegativeBetween(Double value1, Double value2) {
            addCriterion("negative between", value1, value2, "negative");
            return (Criteria) this;
        }

        public Criteria andNegativeNotBetween(Double value1, Double value2) {
            addCriterion("negative not between", value1, value2, "negative");
            return (Criteria) this;
        }

        public Criteria andDescribleIsNull() {
            addCriterion("describle is null");
            return (Criteria) this;
        }

        public Criteria andDescribleIsNotNull() {
            addCriterion("describle is not null");
            return (Criteria) this;
        }

        public Criteria andDescribleEqualTo(String value) {
            addCriterion("describle =", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleNotEqualTo(String value) {
            addCriterion("describle <>", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleGreaterThan(String value) {
            addCriterion("describle >", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleGreaterThanOrEqualTo(String value) {
            addCriterion("describle >=", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleLessThan(String value) {
            addCriterion("describle <", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleLessThanOrEqualTo(String value) {
            addCriterion("describle <=", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleLike(String value) {
            addCriterion("describle like", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleNotLike(String value) {
            addCriterion("describle not like", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleIn(List<String> values) {
            addCriterion("describle in", values, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleNotIn(List<String> values) {
            addCriterion("describle not in", values, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleBetween(String value1, String value2) {
            addCriterion("describle between", value1, value2, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleNotBetween(String value1, String value2) {
            addCriterion("describle not between", value1, value2, "describle");
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