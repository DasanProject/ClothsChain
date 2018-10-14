package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_badproblemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_badproblemExample() {
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

        public Criteria andTypeinidIsNull() {
            addCriterion("typeinid is null");
            return (Criteria) this;
        }

        public Criteria andTypeinidIsNotNull() {
            addCriterion("typeinid is not null");
            return (Criteria) this;
        }

        public Criteria andTypeinidEqualTo(Integer value) {
            addCriterion("typeinid =", value, "typeinid");
            return (Criteria) this;
        }

        public Criteria andTypeinidNotEqualTo(Integer value) {
            addCriterion("typeinid <>", value, "typeinid");
            return (Criteria) this;
        }

        public Criteria andTypeinidGreaterThan(Integer value) {
            addCriterion("typeinid >", value, "typeinid");
            return (Criteria) this;
        }

        public Criteria andTypeinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeinid >=", value, "typeinid");
            return (Criteria) this;
        }

        public Criteria andTypeinidLessThan(Integer value) {
            addCriterion("typeinid <", value, "typeinid");
            return (Criteria) this;
        }

        public Criteria andTypeinidLessThanOrEqualTo(Integer value) {
            addCriterion("typeinid <=", value, "typeinid");
            return (Criteria) this;
        }

        public Criteria andTypeinidIn(List<Integer> values) {
            addCriterion("typeinid in", values, "typeinid");
            return (Criteria) this;
        }

        public Criteria andTypeinidNotIn(List<Integer> values) {
            addCriterion("typeinid not in", values, "typeinid");
            return (Criteria) this;
        }

        public Criteria andTypeinidBetween(Integer value1, Integer value2) {
            addCriterion("typeinid between", value1, value2, "typeinid");
            return (Criteria) this;
        }

        public Criteria andTypeinidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeinid not between", value1, value2, "typeinid");
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

        public Criteria andBadnameIsNull() {
            addCriterion("badname is null");
            return (Criteria) this;
        }

        public Criteria andBadnameIsNotNull() {
            addCriterion("badname is not null");
            return (Criteria) this;
        }

        public Criteria andBadnameEqualTo(String value) {
            addCriterion("badname =", value, "badname");
            return (Criteria) this;
        }

        public Criteria andBadnameNotEqualTo(String value) {
            addCriterion("badname <>", value, "badname");
            return (Criteria) this;
        }

        public Criteria andBadnameGreaterThan(String value) {
            addCriterion("badname >", value, "badname");
            return (Criteria) this;
        }

        public Criteria andBadnameGreaterThanOrEqualTo(String value) {
            addCriterion("badname >=", value, "badname");
            return (Criteria) this;
        }

        public Criteria andBadnameLessThan(String value) {
            addCriterion("badname <", value, "badname");
            return (Criteria) this;
        }

        public Criteria andBadnameLessThanOrEqualTo(String value) {
            addCriterion("badname <=", value, "badname");
            return (Criteria) this;
        }

        public Criteria andBadnameLike(String value) {
            addCriterion("badname like", value, "badname");
            return (Criteria) this;
        }

        public Criteria andBadnameNotLike(String value) {
            addCriterion("badname not like", value, "badname");
            return (Criteria) this;
        }

        public Criteria andBadnameIn(List<String> values) {
            addCriterion("badname in", values, "badname");
            return (Criteria) this;
        }

        public Criteria andBadnameNotIn(List<String> values) {
            addCriterion("badname not in", values, "badname");
            return (Criteria) this;
        }

        public Criteria andBadnameBetween(String value1, String value2) {
            addCriterion("badname between", value1, value2, "badname");
            return (Criteria) this;
        }

        public Criteria andBadnameNotBetween(String value1, String value2) {
            addCriterion("badname not between", value1, value2, "badname");
            return (Criteria) this;
        }

        public Criteria andDefectlevelsIsNull() {
            addCriterion("defectlevels is null");
            return (Criteria) this;
        }

        public Criteria andDefectlevelsIsNotNull() {
            addCriterion("defectlevels is not null");
            return (Criteria) this;
        }

        public Criteria andDefectlevelsEqualTo(String value) {
            addCriterion("defectlevels =", value, "defectlevels");
            return (Criteria) this;
        }

        public Criteria andDefectlevelsNotEqualTo(String value) {
            addCriterion("defectlevels <>", value, "defectlevels");
            return (Criteria) this;
        }

        public Criteria andDefectlevelsGreaterThan(String value) {
            addCriterion("defectlevels >", value, "defectlevels");
            return (Criteria) this;
        }

        public Criteria andDefectlevelsGreaterThanOrEqualTo(String value) {
            addCriterion("defectlevels >=", value, "defectlevels");
            return (Criteria) this;
        }

        public Criteria andDefectlevelsLessThan(String value) {
            addCriterion("defectlevels <", value, "defectlevels");
            return (Criteria) this;
        }

        public Criteria andDefectlevelsLessThanOrEqualTo(String value) {
            addCriterion("defectlevels <=", value, "defectlevels");
            return (Criteria) this;
        }

        public Criteria andDefectlevelsLike(String value) {
            addCriterion("defectlevels like", value, "defectlevels");
            return (Criteria) this;
        }

        public Criteria andDefectlevelsNotLike(String value) {
            addCriterion("defectlevels not like", value, "defectlevels");
            return (Criteria) this;
        }

        public Criteria andDefectlevelsIn(List<String> values) {
            addCriterion("defectlevels in", values, "defectlevels");
            return (Criteria) this;
        }

        public Criteria andDefectlevelsNotIn(List<String> values) {
            addCriterion("defectlevels not in", values, "defectlevels");
            return (Criteria) this;
        }

        public Criteria andDefectlevelsBetween(String value1, String value2) {
            addCriterion("defectlevels between", value1, value2, "defectlevels");
            return (Criteria) this;
        }

        public Criteria andDefectlevelsNotBetween(String value1, String value2) {
            addCriterion("defectlevels not between", value1, value2, "defectlevels");
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