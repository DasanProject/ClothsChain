package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_cliprecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_cliprecordExample() {
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

        public Criteria andCliprecordidIsNull() {
            addCriterion("cliprecordid is null");
            return (Criteria) this;
        }

        public Criteria andCliprecordidIsNotNull() {
            addCriterion("cliprecordid is not null");
            return (Criteria) this;
        }

        public Criteria andCliprecordidEqualTo(Integer value) {
            addCriterion("cliprecordid =", value, "cliprecordid");
            return (Criteria) this;
        }

        public Criteria andCliprecordidNotEqualTo(Integer value) {
            addCriterion("cliprecordid <>", value, "cliprecordid");
            return (Criteria) this;
        }

        public Criteria andCliprecordidGreaterThan(Integer value) {
            addCriterion("cliprecordid >", value, "cliprecordid");
            return (Criteria) this;
        }

        public Criteria andCliprecordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cliprecordid >=", value, "cliprecordid");
            return (Criteria) this;
        }

        public Criteria andCliprecordidLessThan(Integer value) {
            addCriterion("cliprecordid <", value, "cliprecordid");
            return (Criteria) this;
        }

        public Criteria andCliprecordidLessThanOrEqualTo(Integer value) {
            addCriterion("cliprecordid <=", value, "cliprecordid");
            return (Criteria) this;
        }

        public Criteria andCliprecordidIn(List<Integer> values) {
            addCriterion("cliprecordid in", values, "cliprecordid");
            return (Criteria) this;
        }

        public Criteria andCliprecordidNotIn(List<Integer> values) {
            addCriterion("cliprecordid not in", values, "cliprecordid");
            return (Criteria) this;
        }

        public Criteria andCliprecordidBetween(Integer value1, Integer value2) {
            addCriterion("cliprecordid between", value1, value2, "cliprecordid");
            return (Criteria) this;
        }

        public Criteria andCliprecordidNotBetween(Integer value1, Integer value2) {
            addCriterion("cliprecordid not between", value1, value2, "cliprecordid");
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

        public Criteria andSizeEqualTo(Double value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Double value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Double value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Double value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Double value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Double value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Double> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Double> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Double value1, Double value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Double value1, Double value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNull() {
            addCriterion("numbers is null");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNotNull() {
            addCriterion("numbers is not null");
            return (Criteria) this;
        }

        public Criteria andNumbersEqualTo(Double value) {
            addCriterion("numbers =", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotEqualTo(Double value) {
            addCriterion("numbers <>", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThan(Double value) {
            addCriterion("numbers >", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThanOrEqualTo(Double value) {
            addCriterion("numbers >=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThan(Double value) {
            addCriterion("numbers <", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThanOrEqualTo(Double value) {
            addCriterion("numbers <=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersIn(List<Double> values) {
            addCriterion("numbers in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotIn(List<Double> values) {
            addCriterion("numbers not in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersBetween(Double value1, Double value2) {
            addCriterion("numbers between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotBetween(Double value1, Double value2) {
            addCriterion("numbers not between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andStocknumberIsNull() {
            addCriterion("stocknumber is null");
            return (Criteria) this;
        }

        public Criteria andStocknumberIsNotNull() {
            addCriterion("stocknumber is not null");
            return (Criteria) this;
        }

        public Criteria andStocknumberEqualTo(String value) {
            addCriterion("stocknumber =", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberNotEqualTo(String value) {
            addCriterion("stocknumber <>", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberGreaterThan(String value) {
            addCriterion("stocknumber >", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberGreaterThanOrEqualTo(String value) {
            addCriterion("stocknumber >=", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberLessThan(String value) {
            addCriterion("stocknumber <", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberLessThanOrEqualTo(String value) {
            addCriterion("stocknumber <=", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberLike(String value) {
            addCriterion("stocknumber like", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberNotLike(String value) {
            addCriterion("stocknumber not like", value, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberIn(List<String> values) {
            addCriterion("stocknumber in", values, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberNotIn(List<String> values) {
            addCriterion("stocknumber not in", values, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberBetween(String value1, String value2) {
            addCriterion("stocknumber between", value1, value2, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknumberNotBetween(String value1, String value2) {
            addCriterion("stocknumber not between", value1, value2, "stocknumber");
            return (Criteria) this;
        }

        public Criteria andStocknameIsNull() {
            addCriterion("stockname is null");
            return (Criteria) this;
        }

        public Criteria andStocknameIsNotNull() {
            addCriterion("stockname is not null");
            return (Criteria) this;
        }

        public Criteria andStocknameEqualTo(String value) {
            addCriterion("stockname =", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameNotEqualTo(String value) {
            addCriterion("stockname <>", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameGreaterThan(String value) {
            addCriterion("stockname >", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameGreaterThanOrEqualTo(String value) {
            addCriterion("stockname >=", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameLessThan(String value) {
            addCriterion("stockname <", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameLessThanOrEqualTo(String value) {
            addCriterion("stockname <=", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameLike(String value) {
            addCriterion("stockname like", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameNotLike(String value) {
            addCriterion("stockname not like", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameIn(List<String> values) {
            addCriterion("stockname in", values, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameNotIn(List<String> values) {
            addCriterion("stockname not in", values, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameBetween(String value1, String value2) {
            addCriterion("stockname between", value1, value2, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameNotBetween(String value1, String value2) {
            addCriterion("stockname not between", value1, value2, "stockname");
            return (Criteria) this;
        }

        public Criteria andStockshuliangIsNull() {
            addCriterion("stockshuliang is null");
            return (Criteria) this;
        }

        public Criteria andStockshuliangIsNotNull() {
            addCriterion("stockshuliang is not null");
            return (Criteria) this;
        }

        public Criteria andStockshuliangEqualTo(Double value) {
            addCriterion("stockshuliang =", value, "stockshuliang");
            return (Criteria) this;
        }

        public Criteria andStockshuliangNotEqualTo(Double value) {
            addCriterion("stockshuliang <>", value, "stockshuliang");
            return (Criteria) this;
        }

        public Criteria andStockshuliangGreaterThan(Double value) {
            addCriterion("stockshuliang >", value, "stockshuliang");
            return (Criteria) this;
        }

        public Criteria andStockshuliangGreaterThanOrEqualTo(Double value) {
            addCriterion("stockshuliang >=", value, "stockshuliang");
            return (Criteria) this;
        }

        public Criteria andStockshuliangLessThan(Double value) {
            addCriterion("stockshuliang <", value, "stockshuliang");
            return (Criteria) this;
        }

        public Criteria andStockshuliangLessThanOrEqualTo(Double value) {
            addCriterion("stockshuliang <=", value, "stockshuliang");
            return (Criteria) this;
        }

        public Criteria andStockshuliangIn(List<Double> values) {
            addCriterion("stockshuliang in", values, "stockshuliang");
            return (Criteria) this;
        }

        public Criteria andStockshuliangNotIn(List<Double> values) {
            addCriterion("stockshuliang not in", values, "stockshuliang");
            return (Criteria) this;
        }

        public Criteria andStockshuliangBetween(Double value1, Double value2) {
            addCriterion("stockshuliang between", value1, value2, "stockshuliang");
            return (Criteria) this;
        }

        public Criteria andStockshuliangNotBetween(Double value1, Double value2) {
            addCriterion("stockshuliang not between", value1, value2, "stockshuliang");
            return (Criteria) this;
        }

        public Criteria andClipdateIsNull() {
            addCriterion("clipdate is null");
            return (Criteria) this;
        }

        public Criteria andClipdateIsNotNull() {
            addCriterion("clipdate is not null");
            return (Criteria) this;
        }

        public Criteria andClipdateEqualTo(String value) {
            addCriterion("clipdate =", value, "clipdate");
            return (Criteria) this;
        }

        public Criteria andClipdateNotEqualTo(String value) {
            addCriterion("clipdate <>", value, "clipdate");
            return (Criteria) this;
        }

        public Criteria andClipdateGreaterThan(String value) {
            addCriterion("clipdate >", value, "clipdate");
            return (Criteria) this;
        }

        public Criteria andClipdateGreaterThanOrEqualTo(String value) {
            addCriterion("clipdate >=", value, "clipdate");
            return (Criteria) this;
        }

        public Criteria andClipdateLessThan(String value) {
            addCriterion("clipdate <", value, "clipdate");
            return (Criteria) this;
        }

        public Criteria andClipdateLessThanOrEqualTo(String value) {
            addCriterion("clipdate <=", value, "clipdate");
            return (Criteria) this;
        }

        public Criteria andClipdateLike(String value) {
            addCriterion("clipdate like", value, "clipdate");
            return (Criteria) this;
        }

        public Criteria andClipdateNotLike(String value) {
            addCriterion("clipdate not like", value, "clipdate");
            return (Criteria) this;
        }

        public Criteria andClipdateIn(List<String> values) {
            addCriterion("clipdate in", values, "clipdate");
            return (Criteria) this;
        }

        public Criteria andClipdateNotIn(List<String> values) {
            addCriterion("clipdate not in", values, "clipdate");
            return (Criteria) this;
        }

        public Criteria andClipdateBetween(String value1, String value2) {
            addCriterion("clipdate between", value1, value2, "clipdate");
            return (Criteria) this;
        }

        public Criteria andClipdateNotBetween(String value1, String value2) {
            addCriterion("clipdate not between", value1, value2, "clipdate");
            return (Criteria) this;
        }

        public Criteria andBedtimeIsNull() {
            addCriterion("bedtime is null");
            return (Criteria) this;
        }

        public Criteria andBedtimeIsNotNull() {
            addCriterion("bedtime is not null");
            return (Criteria) this;
        }

        public Criteria andBedtimeEqualTo(String value) {
            addCriterion("bedtime =", value, "bedtime");
            return (Criteria) this;
        }

        public Criteria andBedtimeNotEqualTo(String value) {
            addCriterion("bedtime <>", value, "bedtime");
            return (Criteria) this;
        }

        public Criteria andBedtimeGreaterThan(String value) {
            addCriterion("bedtime >", value, "bedtime");
            return (Criteria) this;
        }

        public Criteria andBedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("bedtime >=", value, "bedtime");
            return (Criteria) this;
        }

        public Criteria andBedtimeLessThan(String value) {
            addCriterion("bedtime <", value, "bedtime");
            return (Criteria) this;
        }

        public Criteria andBedtimeLessThanOrEqualTo(String value) {
            addCriterion("bedtime <=", value, "bedtime");
            return (Criteria) this;
        }

        public Criteria andBedtimeLike(String value) {
            addCriterion("bedtime like", value, "bedtime");
            return (Criteria) this;
        }

        public Criteria andBedtimeNotLike(String value) {
            addCriterion("bedtime not like", value, "bedtime");
            return (Criteria) this;
        }

        public Criteria andBedtimeIn(List<String> values) {
            addCriterion("bedtime in", values, "bedtime");
            return (Criteria) this;
        }

        public Criteria andBedtimeNotIn(List<String> values) {
            addCriterion("bedtime not in", values, "bedtime");
            return (Criteria) this;
        }

        public Criteria andBedtimeBetween(String value1, String value2) {
            addCriterion("bedtime between", value1, value2, "bedtime");
            return (Criteria) this;
        }

        public Criteria andBedtimeNotBetween(String value1, String value2) {
            addCriterion("bedtime not between", value1, value2, "bedtime");
            return (Criteria) this;
        }

        public Criteria andCengshuIsNull() {
            addCriterion("cengshu is null");
            return (Criteria) this;
        }

        public Criteria andCengshuIsNotNull() {
            addCriterion("cengshu is not null");
            return (Criteria) this;
        }

        public Criteria andCengshuEqualTo(Integer value) {
            addCriterion("cengshu =", value, "cengshu");
            return (Criteria) this;
        }

        public Criteria andCengshuNotEqualTo(Integer value) {
            addCriterion("cengshu <>", value, "cengshu");
            return (Criteria) this;
        }

        public Criteria andCengshuGreaterThan(Integer value) {
            addCriterion("cengshu >", value, "cengshu");
            return (Criteria) this;
        }

        public Criteria andCengshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("cengshu >=", value, "cengshu");
            return (Criteria) this;
        }

        public Criteria andCengshuLessThan(Integer value) {
            addCriterion("cengshu <", value, "cengshu");
            return (Criteria) this;
        }

        public Criteria andCengshuLessThanOrEqualTo(Integer value) {
            addCriterion("cengshu <=", value, "cengshu");
            return (Criteria) this;
        }

        public Criteria andCengshuIn(List<Integer> values) {
            addCriterion("cengshu in", values, "cengshu");
            return (Criteria) this;
        }

        public Criteria andCengshuNotIn(List<Integer> values) {
            addCriterion("cengshu not in", values, "cengshu");
            return (Criteria) this;
        }

        public Criteria andCengshuBetween(Integer value1, Integer value2) {
            addCriterion("cengshu between", value1, value2, "cengshu");
            return (Criteria) this;
        }

        public Criteria andCengshuNotBetween(Integer value1, Integer value2) {
            addCriterion("cengshu not between", value1, value2, "cengshu");
            return (Criteria) this;
        }

        public Criteria andPulldateIsNull() {
            addCriterion("pulldate is null");
            return (Criteria) this;
        }

        public Criteria andPulldateIsNotNull() {
            addCriterion("pulldate is not null");
            return (Criteria) this;
        }

        public Criteria andPulldateEqualTo(String value) {
            addCriterion("pulldate =", value, "pulldate");
            return (Criteria) this;
        }

        public Criteria andPulldateNotEqualTo(String value) {
            addCriterion("pulldate <>", value, "pulldate");
            return (Criteria) this;
        }

        public Criteria andPulldateGreaterThan(String value) {
            addCriterion("pulldate >", value, "pulldate");
            return (Criteria) this;
        }

        public Criteria andPulldateGreaterThanOrEqualTo(String value) {
            addCriterion("pulldate >=", value, "pulldate");
            return (Criteria) this;
        }

        public Criteria andPulldateLessThan(String value) {
            addCriterion("pulldate <", value, "pulldate");
            return (Criteria) this;
        }

        public Criteria andPulldateLessThanOrEqualTo(String value) {
            addCriterion("pulldate <=", value, "pulldate");
            return (Criteria) this;
        }

        public Criteria andPulldateLike(String value) {
            addCriterion("pulldate like", value, "pulldate");
            return (Criteria) this;
        }

        public Criteria andPulldateNotLike(String value) {
            addCriterion("pulldate not like", value, "pulldate");
            return (Criteria) this;
        }

        public Criteria andPulldateIn(List<String> values) {
            addCriterion("pulldate in", values, "pulldate");
            return (Criteria) this;
        }

        public Criteria andPulldateNotIn(List<String> values) {
            addCriterion("pulldate not in", values, "pulldate");
            return (Criteria) this;
        }

        public Criteria andPulldateBetween(String value1, String value2) {
            addCriterion("pulldate between", value1, value2, "pulldate");
            return (Criteria) this;
        }

        public Criteria andPulldateNotBetween(String value1, String value2) {
            addCriterion("pulldate not between", value1, value2, "pulldate");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNull() {
            addCriterion("releasedate is null");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNotNull() {
            addCriterion("releasedate is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedateEqualTo(String value) {
            addCriterion("releasedate =", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotEqualTo(String value) {
            addCriterion("releasedate <>", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThan(String value) {
            addCriterion("releasedate >", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThanOrEqualTo(String value) {
            addCriterion("releasedate >=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThan(String value) {
            addCriterion("releasedate <", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThanOrEqualTo(String value) {
            addCriterion("releasedate <=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLike(String value) {
            addCriterion("releasedate like", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotLike(String value) {
            addCriterion("releasedate not like", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateIn(List<String> values) {
            addCriterion("releasedate in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotIn(List<String> values) {
            addCriterion("releasedate not in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateBetween(String value1, String value2) {
            addCriterion("releasedate between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotBetween(String value1, String value2) {
            addCriterion("releasedate not between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andOverdateIsNull() {
            addCriterion("overdate is null");
            return (Criteria) this;
        }

        public Criteria andOverdateIsNotNull() {
            addCriterion("overdate is not null");
            return (Criteria) this;
        }

        public Criteria andOverdateEqualTo(String value) {
            addCriterion("overdate =", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateNotEqualTo(String value) {
            addCriterion("overdate <>", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateGreaterThan(String value) {
            addCriterion("overdate >", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateGreaterThanOrEqualTo(String value) {
            addCriterion("overdate >=", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateLessThan(String value) {
            addCriterion("overdate <", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateLessThanOrEqualTo(String value) {
            addCriterion("overdate <=", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateLike(String value) {
            addCriterion("overdate like", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateNotLike(String value) {
            addCriterion("overdate not like", value, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateIn(List<String> values) {
            addCriterion("overdate in", values, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateNotIn(List<String> values) {
            addCriterion("overdate not in", values, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateBetween(String value1, String value2) {
            addCriterion("overdate between", value1, value2, "overdate");
            return (Criteria) this;
        }

        public Criteria andOverdateNotBetween(String value1, String value2) {
            addCriterion("overdate not between", value1, value2, "overdate");
            return (Criteria) this;
        }

        public Criteria andClipstatusIsNull() {
            addCriterion("clipstatus is null");
            return (Criteria) this;
        }

        public Criteria andClipstatusIsNotNull() {
            addCriterion("clipstatus is not null");
            return (Criteria) this;
        }

        public Criteria andClipstatusEqualTo(Integer value) {
            addCriterion("clipstatus =", value, "clipstatus");
            return (Criteria) this;
        }

        public Criteria andClipstatusNotEqualTo(Integer value) {
            addCriterion("clipstatus <>", value, "clipstatus");
            return (Criteria) this;
        }

        public Criteria andClipstatusGreaterThan(Integer value) {
            addCriterion("clipstatus >", value, "clipstatus");
            return (Criteria) this;
        }

        public Criteria andClipstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("clipstatus >=", value, "clipstatus");
            return (Criteria) this;
        }

        public Criteria andClipstatusLessThan(Integer value) {
            addCriterion("clipstatus <", value, "clipstatus");
            return (Criteria) this;
        }

        public Criteria andClipstatusLessThanOrEqualTo(Integer value) {
            addCriterion("clipstatus <=", value, "clipstatus");
            return (Criteria) this;
        }

        public Criteria andClipstatusIn(List<Integer> values) {
            addCriterion("clipstatus in", values, "clipstatus");
            return (Criteria) this;
        }

        public Criteria andClipstatusNotIn(List<Integer> values) {
            addCriterion("clipstatus not in", values, "clipstatus");
            return (Criteria) this;
        }

        public Criteria andClipstatusBetween(Integer value1, Integer value2) {
            addCriterion("clipstatus between", value1, value2, "clipstatus");
            return (Criteria) this;
        }

        public Criteria andClipstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("clipstatus not between", value1, value2, "clipstatus");
            return (Criteria) this;
        }

        public Criteria andClipoutdateIsNull() {
            addCriterion("clipoutdate is null");
            return (Criteria) this;
        }

        public Criteria andClipoutdateIsNotNull() {
            addCriterion("clipoutdate is not null");
            return (Criteria) this;
        }

        public Criteria andClipoutdateEqualTo(String value) {
            addCriterion("clipoutdate =", value, "clipoutdate");
            return (Criteria) this;
        }

        public Criteria andClipoutdateNotEqualTo(String value) {
            addCriterion("clipoutdate <>", value, "clipoutdate");
            return (Criteria) this;
        }

        public Criteria andClipoutdateGreaterThan(String value) {
            addCriterion("clipoutdate >", value, "clipoutdate");
            return (Criteria) this;
        }

        public Criteria andClipoutdateGreaterThanOrEqualTo(String value) {
            addCriterion("clipoutdate >=", value, "clipoutdate");
            return (Criteria) this;
        }

        public Criteria andClipoutdateLessThan(String value) {
            addCriterion("clipoutdate <", value, "clipoutdate");
            return (Criteria) this;
        }

        public Criteria andClipoutdateLessThanOrEqualTo(String value) {
            addCriterion("clipoutdate <=", value, "clipoutdate");
            return (Criteria) this;
        }

        public Criteria andClipoutdateLike(String value) {
            addCriterion("clipoutdate like", value, "clipoutdate");
            return (Criteria) this;
        }

        public Criteria andClipoutdateNotLike(String value) {
            addCriterion("clipoutdate not like", value, "clipoutdate");
            return (Criteria) this;
        }

        public Criteria andClipoutdateIn(List<String> values) {
            addCriterion("clipoutdate in", values, "clipoutdate");
            return (Criteria) this;
        }

        public Criteria andClipoutdateNotIn(List<String> values) {
            addCriterion("clipoutdate not in", values, "clipoutdate");
            return (Criteria) this;
        }

        public Criteria andClipoutdateBetween(String value1, String value2) {
            addCriterion("clipoutdate between", value1, value2, "clipoutdate");
            return (Criteria) this;
        }

        public Criteria andClipoutdateNotBetween(String value1, String value2) {
            addCriterion("clipoutdate not between", value1, value2, "clipoutdate");
            return (Criteria) this;
        }

        public Criteria andPonumberIsNull() {
            addCriterion("ponumber is null");
            return (Criteria) this;
        }

        public Criteria andPonumberIsNotNull() {
            addCriterion("ponumber is not null");
            return (Criteria) this;
        }

        public Criteria andPonumberEqualTo(String value) {
            addCriterion("ponumber =", value, "ponumber");
            return (Criteria) this;
        }

        public Criteria andPonumberNotEqualTo(String value) {
            addCriterion("ponumber <>", value, "ponumber");
            return (Criteria) this;
        }

        public Criteria andPonumberGreaterThan(String value) {
            addCriterion("ponumber >", value, "ponumber");
            return (Criteria) this;
        }

        public Criteria andPonumberGreaterThanOrEqualTo(String value) {
            addCriterion("ponumber >=", value, "ponumber");
            return (Criteria) this;
        }

        public Criteria andPonumberLessThan(String value) {
            addCriterion("ponumber <", value, "ponumber");
            return (Criteria) this;
        }

        public Criteria andPonumberLessThanOrEqualTo(String value) {
            addCriterion("ponumber <=", value, "ponumber");
            return (Criteria) this;
        }

        public Criteria andPonumberLike(String value) {
            addCriterion("ponumber like", value, "ponumber");
            return (Criteria) this;
        }

        public Criteria andPonumberNotLike(String value) {
            addCriterion("ponumber not like", value, "ponumber");
            return (Criteria) this;
        }

        public Criteria andPonumberIn(List<String> values) {
            addCriterion("ponumber in", values, "ponumber");
            return (Criteria) this;
        }

        public Criteria andPonumberNotIn(List<String> values) {
            addCriterion("ponumber not in", values, "ponumber");
            return (Criteria) this;
        }

        public Criteria andPonumberBetween(String value1, String value2) {
            addCriterion("ponumber between", value1, value2, "ponumber");
            return (Criteria) this;
        }

        public Criteria andPonumberNotBetween(String value1, String value2) {
            addCriterion("ponumber not between", value1, value2, "ponumber");
            return (Criteria) this;
        }

        public Criteria andAssemblylineIsNull() {
            addCriterion("assemblyline is null");
            return (Criteria) this;
        }

        public Criteria andAssemblylineIsNotNull() {
            addCriterion("assemblyline is not null");
            return (Criteria) this;
        }

        public Criteria andAssemblylineEqualTo(String value) {
            addCriterion("assemblyline =", value, "assemblyline");
            return (Criteria) this;
        }

        public Criteria andAssemblylineNotEqualTo(String value) {
            addCriterion("assemblyline <>", value, "assemblyline");
            return (Criteria) this;
        }

        public Criteria andAssemblylineGreaterThan(String value) {
            addCriterion("assemblyline >", value, "assemblyline");
            return (Criteria) this;
        }

        public Criteria andAssemblylineGreaterThanOrEqualTo(String value) {
            addCriterion("assemblyline >=", value, "assemblyline");
            return (Criteria) this;
        }

        public Criteria andAssemblylineLessThan(String value) {
            addCriterion("assemblyline <", value, "assemblyline");
            return (Criteria) this;
        }

        public Criteria andAssemblylineLessThanOrEqualTo(String value) {
            addCriterion("assemblyline <=", value, "assemblyline");
            return (Criteria) this;
        }

        public Criteria andAssemblylineLike(String value) {
            addCriterion("assemblyline like", value, "assemblyline");
            return (Criteria) this;
        }

        public Criteria andAssemblylineNotLike(String value) {
            addCriterion("assemblyline not like", value, "assemblyline");
            return (Criteria) this;
        }

        public Criteria andAssemblylineIn(List<String> values) {
            addCriterion("assemblyline in", values, "assemblyline");
            return (Criteria) this;
        }

        public Criteria andAssemblylineNotIn(List<String> values) {
            addCriterion("assemblyline not in", values, "assemblyline");
            return (Criteria) this;
        }

        public Criteria andAssemblylineBetween(String value1, String value2) {
            addCriterion("assemblyline between", value1, value2, "assemblyline");
            return (Criteria) this;
        }

        public Criteria andAssemblylineNotBetween(String value1, String value2) {
            addCriterion("assemblyline not between", value1, value2, "assemblyline");
            return (Criteria) this;
        }

        public Criteria andOutlinetimeIsNull() {
            addCriterion("outlinetime is null");
            return (Criteria) this;
        }

        public Criteria andOutlinetimeIsNotNull() {
            addCriterion("outlinetime is not null");
            return (Criteria) this;
        }

        public Criteria andOutlinetimeEqualTo(String value) {
            addCriterion("outlinetime =", value, "outlinetime");
            return (Criteria) this;
        }

        public Criteria andOutlinetimeNotEqualTo(String value) {
            addCriterion("outlinetime <>", value, "outlinetime");
            return (Criteria) this;
        }

        public Criteria andOutlinetimeGreaterThan(String value) {
            addCriterion("outlinetime >", value, "outlinetime");
            return (Criteria) this;
        }

        public Criteria andOutlinetimeGreaterThanOrEqualTo(String value) {
            addCriterion("outlinetime >=", value, "outlinetime");
            return (Criteria) this;
        }

        public Criteria andOutlinetimeLessThan(String value) {
            addCriterion("outlinetime <", value, "outlinetime");
            return (Criteria) this;
        }

        public Criteria andOutlinetimeLessThanOrEqualTo(String value) {
            addCriterion("outlinetime <=", value, "outlinetime");
            return (Criteria) this;
        }

        public Criteria andOutlinetimeLike(String value) {
            addCriterion("outlinetime like", value, "outlinetime");
            return (Criteria) this;
        }

        public Criteria andOutlinetimeNotLike(String value) {
            addCriterion("outlinetime not like", value, "outlinetime");
            return (Criteria) this;
        }

        public Criteria andOutlinetimeIn(List<String> values) {
            addCriterion("outlinetime in", values, "outlinetime");
            return (Criteria) this;
        }

        public Criteria andOutlinetimeNotIn(List<String> values) {
            addCriterion("outlinetime not in", values, "outlinetime");
            return (Criteria) this;
        }

        public Criteria andOutlinetimeBetween(String value1, String value2) {
            addCriterion("outlinetime between", value1, value2, "outlinetime");
            return (Criteria) this;
        }

        public Criteria andOutlinetimeNotBetween(String value1, String value2) {
            addCriterion("outlinetime not between", value1, value2, "outlinetime");
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