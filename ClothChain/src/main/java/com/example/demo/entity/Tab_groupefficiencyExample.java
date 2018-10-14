package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_groupefficiencyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_groupefficiencyExample() {
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

        public Criteria andSetidIsNull() {
            addCriterion("setid is null");
            return (Criteria) this;
        }

        public Criteria andSetidIsNotNull() {
            addCriterion("setid is not null");
            return (Criteria) this;
        }

        public Criteria andSetidEqualTo(Integer value) {
            addCriterion("setid =", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidNotEqualTo(Integer value) {
            addCriterion("setid <>", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidGreaterThan(Integer value) {
            addCriterion("setid >", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("setid >=", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidLessThan(Integer value) {
            addCriterion("setid <", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidLessThanOrEqualTo(Integer value) {
            addCriterion("setid <=", value, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidIn(List<Integer> values) {
            addCriterion("setid in", values, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidNotIn(List<Integer> values) {
            addCriterion("setid not in", values, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidBetween(Integer value1, Integer value2) {
            addCriterion("setid between", value1, value2, "setid");
            return (Criteria) this;
        }

        public Criteria andSetidNotBetween(Integer value1, Integer value2) {
            addCriterion("setid not between", value1, value2, "setid");
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

        public Criteria andGroupcodingIsNull() {
            addCriterion("groupcoding is null");
            return (Criteria) this;
        }

        public Criteria andGroupcodingIsNotNull() {
            addCriterion("groupcoding is not null");
            return (Criteria) this;
        }

        public Criteria andGroupcodingEqualTo(String value) {
            addCriterion("groupcoding =", value, "groupcoding");
            return (Criteria) this;
        }

        public Criteria andGroupcodingNotEqualTo(String value) {
            addCriterion("groupcoding <>", value, "groupcoding");
            return (Criteria) this;
        }

        public Criteria andGroupcodingGreaterThan(String value) {
            addCriterion("groupcoding >", value, "groupcoding");
            return (Criteria) this;
        }

        public Criteria andGroupcodingGreaterThanOrEqualTo(String value) {
            addCriterion("groupcoding >=", value, "groupcoding");
            return (Criteria) this;
        }

        public Criteria andGroupcodingLessThan(String value) {
            addCriterion("groupcoding <", value, "groupcoding");
            return (Criteria) this;
        }

        public Criteria andGroupcodingLessThanOrEqualTo(String value) {
            addCriterion("groupcoding <=", value, "groupcoding");
            return (Criteria) this;
        }

        public Criteria andGroupcodingLike(String value) {
            addCriterion("groupcoding like", value, "groupcoding");
            return (Criteria) this;
        }

        public Criteria andGroupcodingNotLike(String value) {
            addCriterion("groupcoding not like", value, "groupcoding");
            return (Criteria) this;
        }

        public Criteria andGroupcodingIn(List<String> values) {
            addCriterion("groupcoding in", values, "groupcoding");
            return (Criteria) this;
        }

        public Criteria andGroupcodingNotIn(List<String> values) {
            addCriterion("groupcoding not in", values, "groupcoding");
            return (Criteria) this;
        }

        public Criteria andGroupcodingBetween(String value1, String value2) {
            addCriterion("groupcoding between", value1, value2, "groupcoding");
            return (Criteria) this;
        }

        public Criteria andGroupcodingNotBetween(String value1, String value2) {
            addCriterion("groupcoding not between", value1, value2, "groupcoding");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNull() {
            addCriterion("groupname is null");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("groupname is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("groupname =", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("groupname <>", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("groupname >", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("groupname >=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("groupname <", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("groupname <=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("groupname like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("groupname not like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("groupname in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("groupname not in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("groupname between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("groupname not between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andStylenumberIsNull() {
            addCriterion("stylenumber is null");
            return (Criteria) this;
        }

        public Criteria andStylenumberIsNotNull() {
            addCriterion("stylenumber is not null");
            return (Criteria) this;
        }

        public Criteria andStylenumberEqualTo(String value) {
            addCriterion("stylenumber =", value, "stylenumber");
            return (Criteria) this;
        }

        public Criteria andStylenumberNotEqualTo(String value) {
            addCriterion("stylenumber <>", value, "stylenumber");
            return (Criteria) this;
        }

        public Criteria andStylenumberGreaterThan(String value) {
            addCriterion("stylenumber >", value, "stylenumber");
            return (Criteria) this;
        }

        public Criteria andStylenumberGreaterThanOrEqualTo(String value) {
            addCriterion("stylenumber >=", value, "stylenumber");
            return (Criteria) this;
        }

        public Criteria andStylenumberLessThan(String value) {
            addCriterion("stylenumber <", value, "stylenumber");
            return (Criteria) this;
        }

        public Criteria andStylenumberLessThanOrEqualTo(String value) {
            addCriterion("stylenumber <=", value, "stylenumber");
            return (Criteria) this;
        }

        public Criteria andStylenumberLike(String value) {
            addCriterion("stylenumber like", value, "stylenumber");
            return (Criteria) this;
        }

        public Criteria andStylenumberNotLike(String value) {
            addCriterion("stylenumber not like", value, "stylenumber");
            return (Criteria) this;
        }

        public Criteria andStylenumberIn(List<String> values) {
            addCriterion("stylenumber in", values, "stylenumber");
            return (Criteria) this;
        }

        public Criteria andStylenumberNotIn(List<String> values) {
            addCriterion("stylenumber not in", values, "stylenumber");
            return (Criteria) this;
        }

        public Criteria andStylenumberBetween(String value1, String value2) {
            addCriterion("stylenumber between", value1, value2, "stylenumber");
            return (Criteria) this;
        }

        public Criteria andStylenumberNotBetween(String value1, String value2) {
            addCriterion("stylenumber not between", value1, value2, "stylenumber");
            return (Criteria) this;
        }

        public Criteria andTeamefficiencyIsNull() {
            addCriterion("teamefficiency is null");
            return (Criteria) this;
        }

        public Criteria andTeamefficiencyIsNotNull() {
            addCriterion("teamefficiency is not null");
            return (Criteria) this;
        }

        public Criteria andTeamefficiencyEqualTo(Double value) {
            addCriterion("teamefficiency =", value, "teamefficiency");
            return (Criteria) this;
        }

        public Criteria andTeamefficiencyNotEqualTo(Double value) {
            addCriterion("teamefficiency <>", value, "teamefficiency");
            return (Criteria) this;
        }

        public Criteria andTeamefficiencyGreaterThan(Double value) {
            addCriterion("teamefficiency >", value, "teamefficiency");
            return (Criteria) this;
        }

        public Criteria andTeamefficiencyGreaterThanOrEqualTo(Double value) {
            addCriterion("teamefficiency >=", value, "teamefficiency");
            return (Criteria) this;
        }

        public Criteria andTeamefficiencyLessThan(Double value) {
            addCriterion("teamefficiency <", value, "teamefficiency");
            return (Criteria) this;
        }

        public Criteria andTeamefficiencyLessThanOrEqualTo(Double value) {
            addCriterion("teamefficiency <=", value, "teamefficiency");
            return (Criteria) this;
        }

        public Criteria andTeamefficiencyIn(List<Double> values) {
            addCriterion("teamefficiency in", values, "teamefficiency");
            return (Criteria) this;
        }

        public Criteria andTeamefficiencyNotIn(List<Double> values) {
            addCriterion("teamefficiency not in", values, "teamefficiency");
            return (Criteria) this;
        }

        public Criteria andTeamefficiencyBetween(Double value1, Double value2) {
            addCriterion("teamefficiency between", value1, value2, "teamefficiency");
            return (Criteria) this;
        }

        public Criteria andTeamefficiencyNotBetween(Double value1, Double value2) {
            addCriterion("teamefficiency not between", value1, value2, "teamefficiency");
            return (Criteria) this;
        }

        public Criteria andStandardnumIsNull() {
            addCriterion("standardnum is null");
            return (Criteria) this;
        }

        public Criteria andStandardnumIsNotNull() {
            addCriterion("standardnum is not null");
            return (Criteria) this;
        }

        public Criteria andStandardnumEqualTo(Integer value) {
            addCriterion("standardnum =", value, "standardnum");
            return (Criteria) this;
        }

        public Criteria andStandardnumNotEqualTo(Integer value) {
            addCriterion("standardnum <>", value, "standardnum");
            return (Criteria) this;
        }

        public Criteria andStandardnumGreaterThan(Integer value) {
            addCriterion("standardnum >", value, "standardnum");
            return (Criteria) this;
        }

        public Criteria andStandardnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("standardnum >=", value, "standardnum");
            return (Criteria) this;
        }

        public Criteria andStandardnumLessThan(Integer value) {
            addCriterion("standardnum <", value, "standardnum");
            return (Criteria) this;
        }

        public Criteria andStandardnumLessThanOrEqualTo(Integer value) {
            addCriterion("standardnum <=", value, "standardnum");
            return (Criteria) this;
        }

        public Criteria andStandardnumIn(List<Integer> values) {
            addCriterion("standardnum in", values, "standardnum");
            return (Criteria) this;
        }

        public Criteria andStandardnumNotIn(List<Integer> values) {
            addCriterion("standardnum not in", values, "standardnum");
            return (Criteria) this;
        }

        public Criteria andStandardnumBetween(Integer value1, Integer value2) {
            addCriterion("standardnum between", value1, value2, "standardnum");
            return (Criteria) this;
        }

        public Criteria andStandardnumNotBetween(Integer value1, Integer value2) {
            addCriterion("standardnum not between", value1, value2, "standardnum");
            return (Criteria) this;
        }

        public Criteria andLearningcoefficientIsNull() {
            addCriterion("learningcoefficient is null");
            return (Criteria) this;
        }

        public Criteria andLearningcoefficientIsNotNull() {
            addCriterion("learningcoefficient is not null");
            return (Criteria) this;
        }

        public Criteria andLearningcoefficientEqualTo(Double value) {
            addCriterion("learningcoefficient =", value, "learningcoefficient");
            return (Criteria) this;
        }

        public Criteria andLearningcoefficientNotEqualTo(Double value) {
            addCriterion("learningcoefficient <>", value, "learningcoefficient");
            return (Criteria) this;
        }

        public Criteria andLearningcoefficientGreaterThan(Double value) {
            addCriterion("learningcoefficient >", value, "learningcoefficient");
            return (Criteria) this;
        }

        public Criteria andLearningcoefficientGreaterThanOrEqualTo(Double value) {
            addCriterion("learningcoefficient >=", value, "learningcoefficient");
            return (Criteria) this;
        }

        public Criteria andLearningcoefficientLessThan(Double value) {
            addCriterion("learningcoefficient <", value, "learningcoefficient");
            return (Criteria) this;
        }

        public Criteria andLearningcoefficientLessThanOrEqualTo(Double value) {
            addCriterion("learningcoefficient <=", value, "learningcoefficient");
            return (Criteria) this;
        }

        public Criteria andLearningcoefficientIn(List<Double> values) {
            addCriterion("learningcoefficient in", values, "learningcoefficient");
            return (Criteria) this;
        }

        public Criteria andLearningcoefficientNotIn(List<Double> values) {
            addCriterion("learningcoefficient not in", values, "learningcoefficient");
            return (Criteria) this;
        }

        public Criteria andLearningcoefficientBetween(Double value1, Double value2) {
            addCriterion("learningcoefficient between", value1, value2, "learningcoefficient");
            return (Criteria) this;
        }

        public Criteria andLearningcoefficientNotBetween(Double value1, Double value2) {
            addCriterion("learningcoefficient not between", value1, value2, "learningcoefficient");
            return (Criteria) this;
        }

        public Criteria andCiencyIsNull() {
            addCriterion("ciency is null");
            return (Criteria) this;
        }

        public Criteria andCiencyIsNotNull() {
            addCriterion("ciency is not null");
            return (Criteria) this;
        }

        public Criteria andCiencyEqualTo(Double value) {
            addCriterion("ciency =", value, "ciency");
            return (Criteria) this;
        }

        public Criteria andCiencyNotEqualTo(Double value) {
            addCriterion("ciency <>", value, "ciency");
            return (Criteria) this;
        }

        public Criteria andCiencyGreaterThan(Double value) {
            addCriterion("ciency >", value, "ciency");
            return (Criteria) this;
        }

        public Criteria andCiencyGreaterThanOrEqualTo(Double value) {
            addCriterion("ciency >=", value, "ciency");
            return (Criteria) this;
        }

        public Criteria andCiencyLessThan(Double value) {
            addCriterion("ciency <", value, "ciency");
            return (Criteria) this;
        }

        public Criteria andCiencyLessThanOrEqualTo(Double value) {
            addCriterion("ciency <=", value, "ciency");
            return (Criteria) this;
        }

        public Criteria andCiencyIn(List<Double> values) {
            addCriterion("ciency in", values, "ciency");
            return (Criteria) this;
        }

        public Criteria andCiencyNotIn(List<Double> values) {
            addCriterion("ciency not in", values, "ciency");
            return (Criteria) this;
        }

        public Criteria andCiencyBetween(Double value1, Double value2) {
            addCriterion("ciency between", value1, value2, "ciency");
            return (Criteria) this;
        }

        public Criteria andCiencyNotBetween(Double value1, Double value2) {
            addCriterion("ciency not between", value1, value2, "ciency");
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