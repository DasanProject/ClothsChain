package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_checkorderinputExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_checkorderinputExample() {
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

        public Criteria andCheckmessageidIsNull() {
            addCriterion("checkmessageid is null");
            return (Criteria) this;
        }

        public Criteria andCheckmessageidIsNotNull() {
            addCriterion("checkmessageid is not null");
            return (Criteria) this;
        }

        public Criteria andCheckmessageidEqualTo(Integer value) {
            addCriterion("checkmessageid =", value, "checkmessageid");
            return (Criteria) this;
        }

        public Criteria andCheckmessageidNotEqualTo(Integer value) {
            addCriterion("checkmessageid <>", value, "checkmessageid");
            return (Criteria) this;
        }

        public Criteria andCheckmessageidGreaterThan(Integer value) {
            addCriterion("checkmessageid >", value, "checkmessageid");
            return (Criteria) this;
        }

        public Criteria andCheckmessageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkmessageid >=", value, "checkmessageid");
            return (Criteria) this;
        }

        public Criteria andCheckmessageidLessThan(Integer value) {
            addCriterion("checkmessageid <", value, "checkmessageid");
            return (Criteria) this;
        }

        public Criteria andCheckmessageidLessThanOrEqualTo(Integer value) {
            addCriterion("checkmessageid <=", value, "checkmessageid");
            return (Criteria) this;
        }

        public Criteria andCheckmessageidIn(List<Integer> values) {
            addCriterion("checkmessageid in", values, "checkmessageid");
            return (Criteria) this;
        }

        public Criteria andCheckmessageidNotIn(List<Integer> values) {
            addCriterion("checkmessageid not in", values, "checkmessageid");
            return (Criteria) this;
        }

        public Criteria andCheckmessageidBetween(Integer value1, Integer value2) {
            addCriterion("checkmessageid between", value1, value2, "checkmessageid");
            return (Criteria) this;
        }

        public Criteria andCheckmessageidNotBetween(Integer value1, Integer value2) {
            addCriterion("checkmessageid not between", value1, value2, "checkmessageid");
            return (Criteria) this;
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleIsNull() {
            addCriterion("checkpeople is null");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleIsNotNull() {
            addCriterion("checkpeople is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleEqualTo(String value) {
            addCriterion("checkpeople =", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleNotEqualTo(String value) {
            addCriterion("checkpeople <>", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleGreaterThan(String value) {
            addCriterion("checkpeople >", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("checkpeople >=", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleLessThan(String value) {
            addCriterion("checkpeople <", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleLessThanOrEqualTo(String value) {
            addCriterion("checkpeople <=", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleLike(String value) {
            addCriterion("checkpeople like", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleNotLike(String value) {
            addCriterion("checkpeople not like", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleIn(List<String> values) {
            addCriterion("checkpeople in", values, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleNotIn(List<String> values) {
            addCriterion("checkpeople not in", values, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleBetween(String value1, String value2) {
            addCriterion("checkpeople between", value1, value2, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleNotBetween(String value1, String value2) {
            addCriterion("checkpeople not between", value1, value2, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNull() {
            addCriterion("checkdate is null");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNotNull() {
            addCriterion("checkdate is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdateEqualTo(String value) {
            addCriterion("checkdate =", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotEqualTo(String value) {
            addCriterion("checkdate <>", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThan(String value) {
            addCriterion("checkdate >", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThanOrEqualTo(String value) {
            addCriterion("checkdate >=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThan(String value) {
            addCriterion("checkdate <", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThanOrEqualTo(String value) {
            addCriterion("checkdate <=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLike(String value) {
            addCriterion("checkdate like", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotLike(String value) {
            addCriterion("checkdate not like", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateIn(List<String> values) {
            addCriterion("checkdate in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotIn(List<String> values) {
            addCriterion("checkdate not in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateBetween(String value1, String value2) {
            addCriterion("checkdate between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotBetween(String value1, String value2) {
            addCriterion("checkdate not between", value1, value2, "checkdate");
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

        public Criteria andClipidIsNull() {
            addCriterion("clipid is null");
            return (Criteria) this;
        }

        public Criteria andClipidIsNotNull() {
            addCriterion("clipid is not null");
            return (Criteria) this;
        }

        public Criteria andClipidEqualTo(Integer value) {
            addCriterion("clipid =", value, "clipid");
            return (Criteria) this;
        }

        public Criteria andClipidNotEqualTo(Integer value) {
            addCriterion("clipid <>", value, "clipid");
            return (Criteria) this;
        }

        public Criteria andClipidGreaterThan(Integer value) {
            addCriterion("clipid >", value, "clipid");
            return (Criteria) this;
        }

        public Criteria andClipidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clipid >=", value, "clipid");
            return (Criteria) this;
        }

        public Criteria andClipidLessThan(Integer value) {
            addCriterion("clipid <", value, "clipid");
            return (Criteria) this;
        }

        public Criteria andClipidLessThanOrEqualTo(Integer value) {
            addCriterion("clipid <=", value, "clipid");
            return (Criteria) this;
        }

        public Criteria andClipidIn(List<Integer> values) {
            addCriterion("clipid in", values, "clipid");
            return (Criteria) this;
        }

        public Criteria andClipidNotIn(List<Integer> values) {
            addCriterion("clipid not in", values, "clipid");
            return (Criteria) this;
        }

        public Criteria andClipidBetween(Integer value1, Integer value2) {
            addCriterion("clipid between", value1, value2, "clipid");
            return (Criteria) this;
        }

        public Criteria andClipidNotBetween(Integer value1, Integer value2) {
            addCriterion("clipid not between", value1, value2, "clipid");
            return (Criteria) this;
        }

        public Criteria andDepetnameIsNull() {
            addCriterion("depetname is null");
            return (Criteria) this;
        }

        public Criteria andDepetnameIsNotNull() {
            addCriterion("depetname is not null");
            return (Criteria) this;
        }

        public Criteria andDepetnameEqualTo(String value) {
            addCriterion("depetname =", value, "depetname");
            return (Criteria) this;
        }

        public Criteria andDepetnameNotEqualTo(String value) {
            addCriterion("depetname <>", value, "depetname");
            return (Criteria) this;
        }

        public Criteria andDepetnameGreaterThan(String value) {
            addCriterion("depetname >", value, "depetname");
            return (Criteria) this;
        }

        public Criteria andDepetnameGreaterThanOrEqualTo(String value) {
            addCriterion("depetname >=", value, "depetname");
            return (Criteria) this;
        }

        public Criteria andDepetnameLessThan(String value) {
            addCriterion("depetname <", value, "depetname");
            return (Criteria) this;
        }

        public Criteria andDepetnameLessThanOrEqualTo(String value) {
            addCriterion("depetname <=", value, "depetname");
            return (Criteria) this;
        }

        public Criteria andDepetnameLike(String value) {
            addCriterion("depetname like", value, "depetname");
            return (Criteria) this;
        }

        public Criteria andDepetnameNotLike(String value) {
            addCriterion("depetname not like", value, "depetname");
            return (Criteria) this;
        }

        public Criteria andDepetnameIn(List<String> values) {
            addCriterion("depetname in", values, "depetname");
            return (Criteria) this;
        }

        public Criteria andDepetnameNotIn(List<String> values) {
            addCriterion("depetname not in", values, "depetname");
            return (Criteria) this;
        }

        public Criteria andDepetnameBetween(String value1, String value2) {
            addCriterion("depetname between", value1, value2, "depetname");
            return (Criteria) this;
        }

        public Criteria andDepetnameNotBetween(String value1, String value2) {
            addCriterion("depetname not between", value1, value2, "depetname");
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

        public Criteria andClothidIsNull() {
            addCriterion("clothid is null");
            return (Criteria) this;
        }

        public Criteria andClothidIsNotNull() {
            addCriterion("clothid is not null");
            return (Criteria) this;
        }

        public Criteria andClothidEqualTo(String value) {
            addCriterion("clothid =", value, "clothid");
            return (Criteria) this;
        }

        public Criteria andClothidNotEqualTo(String value) {
            addCriterion("clothid <>", value, "clothid");
            return (Criteria) this;
        }

        public Criteria andClothidGreaterThan(String value) {
            addCriterion("clothid >", value, "clothid");
            return (Criteria) this;
        }

        public Criteria andClothidGreaterThanOrEqualTo(String value) {
            addCriterion("clothid >=", value, "clothid");
            return (Criteria) this;
        }

        public Criteria andClothidLessThan(String value) {
            addCriterion("clothid <", value, "clothid");
            return (Criteria) this;
        }

        public Criteria andClothidLessThanOrEqualTo(String value) {
            addCriterion("clothid <=", value, "clothid");
            return (Criteria) this;
        }

        public Criteria andClothidLike(String value) {
            addCriterion("clothid like", value, "clothid");
            return (Criteria) this;
        }

        public Criteria andClothidNotLike(String value) {
            addCriterion("clothid not like", value, "clothid");
            return (Criteria) this;
        }

        public Criteria andClothidIn(List<String> values) {
            addCriterion("clothid in", values, "clothid");
            return (Criteria) this;
        }

        public Criteria andClothidNotIn(List<String> values) {
            addCriterion("clothid not in", values, "clothid");
            return (Criteria) this;
        }

        public Criteria andClothidBetween(String value1, String value2) {
            addCriterion("clothid between", value1, value2, "clothid");
            return (Criteria) this;
        }

        public Criteria andClothidNotBetween(String value1, String value2) {
            addCriterion("clothid not between", value1, value2, "clothid");
            return (Criteria) this;
        }

        public Criteria andGoodstatusIsNull() {
            addCriterion("goodstatus is null");
            return (Criteria) this;
        }

        public Criteria andGoodstatusIsNotNull() {
            addCriterion("goodstatus is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstatusEqualTo(Integer value) {
            addCriterion("goodstatus =", value, "goodstatus");
            return (Criteria) this;
        }

        public Criteria andGoodstatusNotEqualTo(Integer value) {
            addCriterion("goodstatus <>", value, "goodstatus");
            return (Criteria) this;
        }

        public Criteria andGoodstatusGreaterThan(Integer value) {
            addCriterion("goodstatus >", value, "goodstatus");
            return (Criteria) this;
        }

        public Criteria andGoodstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodstatus >=", value, "goodstatus");
            return (Criteria) this;
        }

        public Criteria andGoodstatusLessThan(Integer value) {
            addCriterion("goodstatus <", value, "goodstatus");
            return (Criteria) this;
        }

        public Criteria andGoodstatusLessThanOrEqualTo(Integer value) {
            addCriterion("goodstatus <=", value, "goodstatus");
            return (Criteria) this;
        }

        public Criteria andGoodstatusIn(List<Integer> values) {
            addCriterion("goodstatus in", values, "goodstatus");
            return (Criteria) this;
        }

        public Criteria andGoodstatusNotIn(List<Integer> values) {
            addCriterion("goodstatus not in", values, "goodstatus");
            return (Criteria) this;
        }

        public Criteria andGoodstatusBetween(Integer value1, Integer value2) {
            addCriterion("goodstatus between", value1, value2, "goodstatus");
            return (Criteria) this;
        }

        public Criteria andGoodstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("goodstatus not between", value1, value2, "goodstatus");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIsNull() {
            addCriterion("grouptype is null");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIsNotNull() {
            addCriterion("grouptype is not null");
            return (Criteria) this;
        }

        public Criteria andGrouptypeEqualTo(String value) {
            addCriterion("grouptype =", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotEqualTo(String value) {
            addCriterion("grouptype <>", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeGreaterThan(String value) {
            addCriterion("grouptype >", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeGreaterThanOrEqualTo(String value) {
            addCriterion("grouptype >=", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLessThan(String value) {
            addCriterion("grouptype <", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLessThanOrEqualTo(String value) {
            addCriterion("grouptype <=", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLike(String value) {
            addCriterion("grouptype like", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotLike(String value) {
            addCriterion("grouptype not like", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIn(List<String> values) {
            addCriterion("grouptype in", values, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotIn(List<String> values) {
            addCriterion("grouptype not in", values, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeBetween(String value1, String value2) {
            addCriterion("grouptype between", value1, value2, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotBetween(String value1, String value2) {
            addCriterion("grouptype not between", value1, value2, "grouptype");
            return (Criteria) this;
        }

        public Criteria andOddnumbersIsNull() {
            addCriterion("oddnumbers is null");
            return (Criteria) this;
        }

        public Criteria andOddnumbersIsNotNull() {
            addCriterion("oddnumbers is not null");
            return (Criteria) this;
        }

        public Criteria andOddnumbersEqualTo(String value) {
            addCriterion("oddnumbers =", value, "oddnumbers");
            return (Criteria) this;
        }

        public Criteria andOddnumbersNotEqualTo(String value) {
            addCriterion("oddnumbers <>", value, "oddnumbers");
            return (Criteria) this;
        }

        public Criteria andOddnumbersGreaterThan(String value) {
            addCriterion("oddnumbers >", value, "oddnumbers");
            return (Criteria) this;
        }

        public Criteria andOddnumbersGreaterThanOrEqualTo(String value) {
            addCriterion("oddnumbers >=", value, "oddnumbers");
            return (Criteria) this;
        }

        public Criteria andOddnumbersLessThan(String value) {
            addCriterion("oddnumbers <", value, "oddnumbers");
            return (Criteria) this;
        }

        public Criteria andOddnumbersLessThanOrEqualTo(String value) {
            addCriterion("oddnumbers <=", value, "oddnumbers");
            return (Criteria) this;
        }

        public Criteria andOddnumbersLike(String value) {
            addCriterion("oddnumbers like", value, "oddnumbers");
            return (Criteria) this;
        }

        public Criteria andOddnumbersNotLike(String value) {
            addCriterion("oddnumbers not like", value, "oddnumbers");
            return (Criteria) this;
        }

        public Criteria andOddnumbersIn(List<String> values) {
            addCriterion("oddnumbers in", values, "oddnumbers");
            return (Criteria) this;
        }

        public Criteria andOddnumbersNotIn(List<String> values) {
            addCriterion("oddnumbers not in", values, "oddnumbers");
            return (Criteria) this;
        }

        public Criteria andOddnumbersBetween(String value1, String value2) {
            addCriterion("oddnumbers between", value1, value2, "oddnumbers");
            return (Criteria) this;
        }

        public Criteria andOddnumbersNotBetween(String value1, String value2) {
            addCriterion("oddnumbers not between", value1, value2, "oddnumbers");
            return (Criteria) this;
        }

        public Criteria andPackingnoIsNull() {
            addCriterion("packingno is null");
            return (Criteria) this;
        }

        public Criteria andPackingnoIsNotNull() {
            addCriterion("packingno is not null");
            return (Criteria) this;
        }

        public Criteria andPackingnoEqualTo(String value) {
            addCriterion("packingno =", value, "packingno");
            return (Criteria) this;
        }

        public Criteria andPackingnoNotEqualTo(String value) {
            addCriterion("packingno <>", value, "packingno");
            return (Criteria) this;
        }

        public Criteria andPackingnoGreaterThan(String value) {
            addCriterion("packingno >", value, "packingno");
            return (Criteria) this;
        }

        public Criteria andPackingnoGreaterThanOrEqualTo(String value) {
            addCriterion("packingno >=", value, "packingno");
            return (Criteria) this;
        }

        public Criteria andPackingnoLessThan(String value) {
            addCriterion("packingno <", value, "packingno");
            return (Criteria) this;
        }

        public Criteria andPackingnoLessThanOrEqualTo(String value) {
            addCriterion("packingno <=", value, "packingno");
            return (Criteria) this;
        }

        public Criteria andPackingnoLike(String value) {
            addCriterion("packingno like", value, "packingno");
            return (Criteria) this;
        }

        public Criteria andPackingnoNotLike(String value) {
            addCriterion("packingno not like", value, "packingno");
            return (Criteria) this;
        }

        public Criteria andPackingnoIn(List<String> values) {
            addCriterion("packingno in", values, "packingno");
            return (Criteria) this;
        }

        public Criteria andPackingnoNotIn(List<String> values) {
            addCriterion("packingno not in", values, "packingno");
            return (Criteria) this;
        }

        public Criteria andPackingnoBetween(String value1, String value2) {
            addCriterion("packingno between", value1, value2, "packingno");
            return (Criteria) this;
        }

        public Criteria andPackingnoNotBetween(String value1, String value2) {
            addCriterion("packingno not between", value1, value2, "packingno");
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