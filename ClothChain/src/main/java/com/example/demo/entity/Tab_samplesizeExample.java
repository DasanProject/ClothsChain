package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_samplesizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_samplesizeExample() {
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

        public Criteria andSamplesizeidIsNull() {
            addCriterion("samplesizeid is null");
            return (Criteria) this;
        }

        public Criteria andSamplesizeidIsNotNull() {
            addCriterion("samplesizeid is not null");
            return (Criteria) this;
        }

        public Criteria andSamplesizeidEqualTo(Integer value) {
            addCriterion("samplesizeid =", value, "samplesizeid");
            return (Criteria) this;
        }

        public Criteria andSamplesizeidNotEqualTo(Integer value) {
            addCriterion("samplesizeid <>", value, "samplesizeid");
            return (Criteria) this;
        }

        public Criteria andSamplesizeidGreaterThan(Integer value) {
            addCriterion("samplesizeid >", value, "samplesizeid");
            return (Criteria) this;
        }

        public Criteria andSamplesizeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("samplesizeid >=", value, "samplesizeid");
            return (Criteria) this;
        }

        public Criteria andSamplesizeidLessThan(Integer value) {
            addCriterion("samplesizeid <", value, "samplesizeid");
            return (Criteria) this;
        }

        public Criteria andSamplesizeidLessThanOrEqualTo(Integer value) {
            addCriterion("samplesizeid <=", value, "samplesizeid");
            return (Criteria) this;
        }

        public Criteria andSamplesizeidIn(List<Integer> values) {
            addCriterion("samplesizeid in", values, "samplesizeid");
            return (Criteria) this;
        }

        public Criteria andSamplesizeidNotIn(List<Integer> values) {
            addCriterion("samplesizeid not in", values, "samplesizeid");
            return (Criteria) this;
        }

        public Criteria andSamplesizeidBetween(Integer value1, Integer value2) {
            addCriterion("samplesizeid between", value1, value2, "samplesizeid");
            return (Criteria) this;
        }

        public Criteria andSamplesizeidNotBetween(Integer value1, Integer value2) {
            addCriterion("samplesizeid not between", value1, value2, "samplesizeid");
            return (Criteria) this;
        }

        public Criteria andSamplenoIsNull() {
            addCriterion("sampleno is null");
            return (Criteria) this;
        }

        public Criteria andSamplenoIsNotNull() {
            addCriterion("sampleno is not null");
            return (Criteria) this;
        }

        public Criteria andSamplenoEqualTo(String value) {
            addCriterion("sampleno =", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoNotEqualTo(String value) {
            addCriterion("sampleno <>", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoGreaterThan(String value) {
            addCriterion("sampleno >", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoGreaterThanOrEqualTo(String value) {
            addCriterion("sampleno >=", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoLessThan(String value) {
            addCriterion("sampleno <", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoLessThanOrEqualTo(String value) {
            addCriterion("sampleno <=", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoLike(String value) {
            addCriterion("sampleno like", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoNotLike(String value) {
            addCriterion("sampleno not like", value, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoIn(List<String> values) {
            addCriterion("sampleno in", values, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoNotIn(List<String> values) {
            addCriterion("sampleno not in", values, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoBetween(String value1, String value2) {
            addCriterion("sampleno between", value1, value2, "sampleno");
            return (Criteria) this;
        }

        public Criteria andSamplenoNotBetween(String value1, String value2) {
            addCriterion("sampleno not between", value1, value2, "sampleno");
            return (Criteria) this;
        }

        public Criteria andCustomerlocationIsNull() {
            addCriterion("customerlocation is null");
            return (Criteria) this;
        }

        public Criteria andCustomerlocationIsNotNull() {
            addCriterion("customerlocation is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerlocationEqualTo(String value) {
            addCriterion("customerlocation =", value, "customerlocation");
            return (Criteria) this;
        }

        public Criteria andCustomerlocationNotEqualTo(String value) {
            addCriterion("customerlocation <>", value, "customerlocation");
            return (Criteria) this;
        }

        public Criteria andCustomerlocationGreaterThan(String value) {
            addCriterion("customerlocation >", value, "customerlocation");
            return (Criteria) this;
        }

        public Criteria andCustomerlocationGreaterThanOrEqualTo(String value) {
            addCriterion("customerlocation >=", value, "customerlocation");
            return (Criteria) this;
        }

        public Criteria andCustomerlocationLessThan(String value) {
            addCriterion("customerlocation <", value, "customerlocation");
            return (Criteria) this;
        }

        public Criteria andCustomerlocationLessThanOrEqualTo(String value) {
            addCriterion("customerlocation <=", value, "customerlocation");
            return (Criteria) this;
        }

        public Criteria andCustomerlocationLike(String value) {
            addCriterion("customerlocation like", value, "customerlocation");
            return (Criteria) this;
        }

        public Criteria andCustomerlocationNotLike(String value) {
            addCriterion("customerlocation not like", value, "customerlocation");
            return (Criteria) this;
        }

        public Criteria andCustomerlocationIn(List<String> values) {
            addCriterion("customerlocation in", values, "customerlocation");
            return (Criteria) this;
        }

        public Criteria andCustomerlocationNotIn(List<String> values) {
            addCriterion("customerlocation not in", values, "customerlocation");
            return (Criteria) this;
        }

        public Criteria andCustomerlocationBetween(String value1, String value2) {
            addCriterion("customerlocation between", value1, value2, "customerlocation");
            return (Criteria) this;
        }

        public Criteria andCustomerlocationNotBetween(String value1, String value2) {
            addCriterion("customerlocation not between", value1, value2, "customerlocation");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andMetricmethodIsNull() {
            addCriterion("metricmethod is null");
            return (Criteria) this;
        }

        public Criteria andMetricmethodIsNotNull() {
            addCriterion("metricmethod is not null");
            return (Criteria) this;
        }

        public Criteria andMetricmethodEqualTo(String value) {
            addCriterion("metricmethod =", value, "metricmethod");
            return (Criteria) this;
        }

        public Criteria andMetricmethodNotEqualTo(String value) {
            addCriterion("metricmethod <>", value, "metricmethod");
            return (Criteria) this;
        }

        public Criteria andMetricmethodGreaterThan(String value) {
            addCriterion("metricmethod >", value, "metricmethod");
            return (Criteria) this;
        }

        public Criteria andMetricmethodGreaterThanOrEqualTo(String value) {
            addCriterion("metricmethod >=", value, "metricmethod");
            return (Criteria) this;
        }

        public Criteria andMetricmethodLessThan(String value) {
            addCriterion("metricmethod <", value, "metricmethod");
            return (Criteria) this;
        }

        public Criteria andMetricmethodLessThanOrEqualTo(String value) {
            addCriterion("metricmethod <=", value, "metricmethod");
            return (Criteria) this;
        }

        public Criteria andMetricmethodLike(String value) {
            addCriterion("metricmethod like", value, "metricmethod");
            return (Criteria) this;
        }

        public Criteria andMetricmethodNotLike(String value) {
            addCriterion("metricmethod not like", value, "metricmethod");
            return (Criteria) this;
        }

        public Criteria andMetricmethodIn(List<String> values) {
            addCriterion("metricmethod in", values, "metricmethod");
            return (Criteria) this;
        }

        public Criteria andMetricmethodNotIn(List<String> values) {
            addCriterion("metricmethod not in", values, "metricmethod");
            return (Criteria) this;
        }

        public Criteria andMetricmethodBetween(String value1, String value2) {
            addCriterion("metricmethod between", value1, value2, "metricmethod");
            return (Criteria) this;
        }

        public Criteria andMetricmethodNotBetween(String value1, String value2) {
            addCriterion("metricmethod not between", value1, value2, "metricmethod");
            return (Criteria) this;
        }

        public Criteria andSamplesizeIsNull() {
            addCriterion("samplesize is null");
            return (Criteria) this;
        }

        public Criteria andSamplesizeIsNotNull() {
            addCriterion("samplesize is not null");
            return (Criteria) this;
        }

        public Criteria andSamplesizeEqualTo(String value) {
            addCriterion("samplesize =", value, "samplesize");
            return (Criteria) this;
        }

        public Criteria andSamplesizeNotEqualTo(String value) {
            addCriterion("samplesize <>", value, "samplesize");
            return (Criteria) this;
        }

        public Criteria andSamplesizeGreaterThan(String value) {
            addCriterion("samplesize >", value, "samplesize");
            return (Criteria) this;
        }

        public Criteria andSamplesizeGreaterThanOrEqualTo(String value) {
            addCriterion("samplesize >=", value, "samplesize");
            return (Criteria) this;
        }

        public Criteria andSamplesizeLessThan(String value) {
            addCriterion("samplesize <", value, "samplesize");
            return (Criteria) this;
        }

        public Criteria andSamplesizeLessThanOrEqualTo(String value) {
            addCriterion("samplesize <=", value, "samplesize");
            return (Criteria) this;
        }

        public Criteria andSamplesizeLike(String value) {
            addCriterion("samplesize like", value, "samplesize");
            return (Criteria) this;
        }

        public Criteria andSamplesizeNotLike(String value) {
            addCriterion("samplesize not like", value, "samplesize");
            return (Criteria) this;
        }

        public Criteria andSamplesizeIn(List<String> values) {
            addCriterion("samplesize in", values, "samplesize");
            return (Criteria) this;
        }

        public Criteria andSamplesizeNotIn(List<String> values) {
            addCriterion("samplesize not in", values, "samplesize");
            return (Criteria) this;
        }

        public Criteria andSamplesizeBetween(String value1, String value2) {
            addCriterion("samplesize between", value1, value2, "samplesize");
            return (Criteria) this;
        }

        public Criteria andSamplesizeNotBetween(String value1, String value2) {
            addCriterion("samplesize not between", value1, value2, "samplesize");
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

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Integer value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Integer value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Integer value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Integer value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Integer value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Integer> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Integer> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Integer value1, Integer value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("size not between", value1, value2, "size");
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