package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_finecodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_finecodeExample() {
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

        public Criteria andFincodeidIsNull() {
            addCriterion("fincodeid is null");
            return (Criteria) this;
        }

        public Criteria andFincodeidIsNotNull() {
            addCriterion("fincodeid is not null");
            return (Criteria) this;
        }

        public Criteria andFincodeidEqualTo(Integer value) {
            addCriterion("fincodeid =", value, "fincodeid");
            return (Criteria) this;
        }

        public Criteria andFincodeidNotEqualTo(Integer value) {
            addCriterion("fincodeid <>", value, "fincodeid");
            return (Criteria) this;
        }

        public Criteria andFincodeidGreaterThan(Integer value) {
            addCriterion("fincodeid >", value, "fincodeid");
            return (Criteria) this;
        }

        public Criteria andFincodeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fincodeid >=", value, "fincodeid");
            return (Criteria) this;
        }

        public Criteria andFincodeidLessThan(Integer value) {
            addCriterion("fincodeid <", value, "fincodeid");
            return (Criteria) this;
        }

        public Criteria andFincodeidLessThanOrEqualTo(Integer value) {
            addCriterion("fincodeid <=", value, "fincodeid");
            return (Criteria) this;
        }

        public Criteria andFincodeidIn(List<Integer> values) {
            addCriterion("fincodeid in", values, "fincodeid");
            return (Criteria) this;
        }

        public Criteria andFincodeidNotIn(List<Integer> values) {
            addCriterion("fincodeid not in", values, "fincodeid");
            return (Criteria) this;
        }

        public Criteria andFincodeidBetween(Integer value1, Integer value2) {
            addCriterion("fincodeid between", value1, value2, "fincodeid");
            return (Criteria) this;
        }

        public Criteria andFincodeidNotBetween(Integer value1, Integer value2) {
            addCriterion("fincodeid not between", value1, value2, "fincodeid");
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

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
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

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNull() {
            addCriterion("deliverydate is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNotNull() {
            addCriterion("deliverydate is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateEqualTo(String value) {
            addCriterion("deliverydate =", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotEqualTo(String value) {
            addCriterion("deliverydate <>", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThan(String value) {
            addCriterion("deliverydate >", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThanOrEqualTo(String value) {
            addCriterion("deliverydate >=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThan(String value) {
            addCriterion("deliverydate <", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThanOrEqualTo(String value) {
            addCriterion("deliverydate <=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLike(String value) {
            addCriterion("deliverydate like", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotLike(String value) {
            addCriterion("deliverydate not like", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIn(List<String> values) {
            addCriterion("deliverydate in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotIn(List<String> values) {
            addCriterion("deliverydate not in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateBetween(String value1, String value2) {
            addCriterion("deliverydate between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotBetween(String value1, String value2) {
            addCriterion("deliverydate not between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andPoIsNull() {
            addCriterion("po is null");
            return (Criteria) this;
        }

        public Criteria andPoIsNotNull() {
            addCriterion("po is not null");
            return (Criteria) this;
        }

        public Criteria andPoEqualTo(String value) {
            addCriterion("po =", value, "po");
            return (Criteria) this;
        }

        public Criteria andPoNotEqualTo(String value) {
            addCriterion("po <>", value, "po");
            return (Criteria) this;
        }

        public Criteria andPoGreaterThan(String value) {
            addCriterion("po >", value, "po");
            return (Criteria) this;
        }

        public Criteria andPoGreaterThanOrEqualTo(String value) {
            addCriterion("po >=", value, "po");
            return (Criteria) this;
        }

        public Criteria andPoLessThan(String value) {
            addCriterion("po <", value, "po");
            return (Criteria) this;
        }

        public Criteria andPoLessThanOrEqualTo(String value) {
            addCriterion("po <=", value, "po");
            return (Criteria) this;
        }

        public Criteria andPoLike(String value) {
            addCriterion("po like", value, "po");
            return (Criteria) this;
        }

        public Criteria andPoNotLike(String value) {
            addCriterion("po not like", value, "po");
            return (Criteria) this;
        }

        public Criteria andPoIn(List<String> values) {
            addCriterion("po in", values, "po");
            return (Criteria) this;
        }

        public Criteria andPoNotIn(List<String> values) {
            addCriterion("po not in", values, "po");
            return (Criteria) this;
        }

        public Criteria andPoBetween(String value1, String value2) {
            addCriterion("po between", value1, value2, "po");
            return (Criteria) this;
        }

        public Criteria andPoNotBetween(String value1, String value2) {
            addCriterion("po not between", value1, value2, "po");
            return (Criteria) this;
        }

        public Criteria andCutnumIsNull() {
            addCriterion("cutnum is null");
            return (Criteria) this;
        }

        public Criteria andCutnumIsNotNull() {
            addCriterion("cutnum is not null");
            return (Criteria) this;
        }

        public Criteria andCutnumEqualTo(Integer value) {
            addCriterion("cutnum =", value, "cutnum");
            return (Criteria) this;
        }

        public Criteria andCutnumNotEqualTo(Integer value) {
            addCriterion("cutnum <>", value, "cutnum");
            return (Criteria) this;
        }

        public Criteria andCutnumGreaterThan(Integer value) {
            addCriterion("cutnum >", value, "cutnum");
            return (Criteria) this;
        }

        public Criteria andCutnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cutnum >=", value, "cutnum");
            return (Criteria) this;
        }

        public Criteria andCutnumLessThan(Integer value) {
            addCriterion("cutnum <", value, "cutnum");
            return (Criteria) this;
        }

        public Criteria andCutnumLessThanOrEqualTo(Integer value) {
            addCriterion("cutnum <=", value, "cutnum");
            return (Criteria) this;
        }

        public Criteria andCutnumIn(List<Integer> values) {
            addCriterion("cutnum in", values, "cutnum");
            return (Criteria) this;
        }

        public Criteria andCutnumNotIn(List<Integer> values) {
            addCriterion("cutnum not in", values, "cutnum");
            return (Criteria) this;
        }

        public Criteria andCutnumBetween(Integer value1, Integer value2) {
            addCriterion("cutnum between", value1, value2, "cutnum");
            return (Criteria) this;
        }

        public Criteria andCutnumNotBetween(Integer value1, Integer value2) {
            addCriterion("cutnum not between", value1, value2, "cutnum");
            return (Criteria) this;
        }

        public Criteria andMakenumIsNull() {
            addCriterion("makenum is null");
            return (Criteria) this;
        }

        public Criteria andMakenumIsNotNull() {
            addCriterion("makenum is not null");
            return (Criteria) this;
        }

        public Criteria andMakenumEqualTo(Integer value) {
            addCriterion("makenum =", value, "makenum");
            return (Criteria) this;
        }

        public Criteria andMakenumNotEqualTo(Integer value) {
            addCriterion("makenum <>", value, "makenum");
            return (Criteria) this;
        }

        public Criteria andMakenumGreaterThan(Integer value) {
            addCriterion("makenum >", value, "makenum");
            return (Criteria) this;
        }

        public Criteria andMakenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("makenum >=", value, "makenum");
            return (Criteria) this;
        }

        public Criteria andMakenumLessThan(Integer value) {
            addCriterion("makenum <", value, "makenum");
            return (Criteria) this;
        }

        public Criteria andMakenumLessThanOrEqualTo(Integer value) {
            addCriterion("makenum <=", value, "makenum");
            return (Criteria) this;
        }

        public Criteria andMakenumIn(List<Integer> values) {
            addCriterion("makenum in", values, "makenum");
            return (Criteria) this;
        }

        public Criteria andMakenumNotIn(List<Integer> values) {
            addCriterion("makenum not in", values, "makenum");
            return (Criteria) this;
        }

        public Criteria andMakenumBetween(Integer value1, Integer value2) {
            addCriterion("makenum between", value1, value2, "makenum");
            return (Criteria) this;
        }

        public Criteria andMakenumNotBetween(Integer value1, Integer value2) {
            addCriterion("makenum not between", value1, value2, "makenum");
            return (Criteria) this;
        }

        public Criteria andShippednumIsNull() {
            addCriterion("shippednum is null");
            return (Criteria) this;
        }

        public Criteria andShippednumIsNotNull() {
            addCriterion("shippednum is not null");
            return (Criteria) this;
        }

        public Criteria andShippednumEqualTo(Integer value) {
            addCriterion("shippednum =", value, "shippednum");
            return (Criteria) this;
        }

        public Criteria andShippednumNotEqualTo(Integer value) {
            addCriterion("shippednum <>", value, "shippednum");
            return (Criteria) this;
        }

        public Criteria andShippednumGreaterThan(Integer value) {
            addCriterion("shippednum >", value, "shippednum");
            return (Criteria) this;
        }

        public Criteria andShippednumGreaterThanOrEqualTo(Integer value) {
            addCriterion("shippednum >=", value, "shippednum");
            return (Criteria) this;
        }

        public Criteria andShippednumLessThan(Integer value) {
            addCriterion("shippednum <", value, "shippednum");
            return (Criteria) this;
        }

        public Criteria andShippednumLessThanOrEqualTo(Integer value) {
            addCriterion("shippednum <=", value, "shippednum");
            return (Criteria) this;
        }

        public Criteria andShippednumIn(List<Integer> values) {
            addCriterion("shippednum in", values, "shippednum");
            return (Criteria) this;
        }

        public Criteria andShippednumNotIn(List<Integer> values) {
            addCriterion("shippednum not in", values, "shippednum");
            return (Criteria) this;
        }

        public Criteria andShippednumBetween(Integer value1, Integer value2) {
            addCriterion("shippednum between", value1, value2, "shippednum");
            return (Criteria) this;
        }

        public Criteria andShippednumNotBetween(Integer value1, Integer value2) {
            addCriterion("shippednum not between", value1, value2, "shippednum");
            return (Criteria) this;
        }

        public Criteria andUnshippednumIsNull() {
            addCriterion("unshippednum is null");
            return (Criteria) this;
        }

        public Criteria andUnshippednumIsNotNull() {
            addCriterion("unshippednum is not null");
            return (Criteria) this;
        }

        public Criteria andUnshippednumEqualTo(Integer value) {
            addCriterion("unshippednum =", value, "unshippednum");
            return (Criteria) this;
        }

        public Criteria andUnshippednumNotEqualTo(Integer value) {
            addCriterion("unshippednum <>", value, "unshippednum");
            return (Criteria) this;
        }

        public Criteria andUnshippednumGreaterThan(Integer value) {
            addCriterion("unshippednum >", value, "unshippednum");
            return (Criteria) this;
        }

        public Criteria andUnshippednumGreaterThanOrEqualTo(Integer value) {
            addCriterion("unshippednum >=", value, "unshippednum");
            return (Criteria) this;
        }

        public Criteria andUnshippednumLessThan(Integer value) {
            addCriterion("unshippednum <", value, "unshippednum");
            return (Criteria) this;
        }

        public Criteria andUnshippednumLessThanOrEqualTo(Integer value) {
            addCriterion("unshippednum <=", value, "unshippednum");
            return (Criteria) this;
        }

        public Criteria andUnshippednumIn(List<Integer> values) {
            addCriterion("unshippednum in", values, "unshippednum");
            return (Criteria) this;
        }

        public Criteria andUnshippednumNotIn(List<Integer> values) {
            addCriterion("unshippednum not in", values, "unshippednum");
            return (Criteria) this;
        }

        public Criteria andUnshippednumBetween(Integer value1, Integer value2) {
            addCriterion("unshippednum between", value1, value2, "unshippednum");
            return (Criteria) this;
        }

        public Criteria andUnshippednumNotBetween(Integer value1, Integer value2) {
            addCriterion("unshippednum not between", value1, value2, "unshippednum");
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