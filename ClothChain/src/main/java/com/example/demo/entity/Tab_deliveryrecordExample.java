package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_deliveryrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_deliveryrecordExample() {
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

        public Criteria andDeliveryidIsNull() {
            addCriterion("deliveryid is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryidIsNotNull() {
            addCriterion("deliveryid is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryidEqualTo(Integer value) {
            addCriterion("deliveryid =", value, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidNotEqualTo(Integer value) {
            addCriterion("deliveryid <>", value, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidGreaterThan(Integer value) {
            addCriterion("deliveryid >", value, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliveryid >=", value, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidLessThan(Integer value) {
            addCriterion("deliveryid <", value, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidLessThanOrEqualTo(Integer value) {
            addCriterion("deliveryid <=", value, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidIn(List<Integer> values) {
            addCriterion("deliveryid in", values, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidNotIn(List<Integer> values) {
            addCriterion("deliveryid not in", values, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidBetween(Integer value1, Integer value2) {
            addCriterion("deliveryid between", value1, value2, "deliveryid");
            return (Criteria) this;
        }

        public Criteria andDeliveryidNotBetween(Integer value1, Integer value2) {
            addCriterion("deliveryid not between", value1, value2, "deliveryid");
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

        public Criteria andProductiontotalIsNull() {
            addCriterion("productiontotal is null");
            return (Criteria) this;
        }

        public Criteria andProductiontotalIsNotNull() {
            addCriterion("productiontotal is not null");
            return (Criteria) this;
        }

        public Criteria andProductiontotalEqualTo(Integer value) {
            addCriterion("productiontotal =", value, "productiontotal");
            return (Criteria) this;
        }

        public Criteria andProductiontotalNotEqualTo(Integer value) {
            addCriterion("productiontotal <>", value, "productiontotal");
            return (Criteria) this;
        }

        public Criteria andProductiontotalGreaterThan(Integer value) {
            addCriterion("productiontotal >", value, "productiontotal");
            return (Criteria) this;
        }

        public Criteria andProductiontotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("productiontotal >=", value, "productiontotal");
            return (Criteria) this;
        }

        public Criteria andProductiontotalLessThan(Integer value) {
            addCriterion("productiontotal <", value, "productiontotal");
            return (Criteria) this;
        }

        public Criteria andProductiontotalLessThanOrEqualTo(Integer value) {
            addCriterion("productiontotal <=", value, "productiontotal");
            return (Criteria) this;
        }

        public Criteria andProductiontotalIn(List<Integer> values) {
            addCriterion("productiontotal in", values, "productiontotal");
            return (Criteria) this;
        }

        public Criteria andProductiontotalNotIn(List<Integer> values) {
            addCriterion("productiontotal not in", values, "productiontotal");
            return (Criteria) this;
        }

        public Criteria andProductiontotalBetween(Integer value1, Integer value2) {
            addCriterion("productiontotal between", value1, value2, "productiontotal");
            return (Criteria) this;
        }

        public Criteria andProductiontotalNotBetween(Integer value1, Integer value2) {
            addCriterion("productiontotal not between", value1, value2, "productiontotal");
            return (Criteria) this;
        }

        public Criteria andOuttotalIsNull() {
            addCriterion("outtotal is null");
            return (Criteria) this;
        }

        public Criteria andOuttotalIsNotNull() {
            addCriterion("outtotal is not null");
            return (Criteria) this;
        }

        public Criteria andOuttotalEqualTo(Double value) {
            addCriterion("outtotal =", value, "outtotal");
            return (Criteria) this;
        }

        public Criteria andOuttotalNotEqualTo(Double value) {
            addCriterion("outtotal <>", value, "outtotal");
            return (Criteria) this;
        }

        public Criteria andOuttotalGreaterThan(Double value) {
            addCriterion("outtotal >", value, "outtotal");
            return (Criteria) this;
        }

        public Criteria andOuttotalGreaterThanOrEqualTo(Double value) {
            addCriterion("outtotal >=", value, "outtotal");
            return (Criteria) this;
        }

        public Criteria andOuttotalLessThan(Double value) {
            addCriterion("outtotal <", value, "outtotal");
            return (Criteria) this;
        }

        public Criteria andOuttotalLessThanOrEqualTo(Double value) {
            addCriterion("outtotal <=", value, "outtotal");
            return (Criteria) this;
        }

        public Criteria andOuttotalIn(List<Double> values) {
            addCriterion("outtotal in", values, "outtotal");
            return (Criteria) this;
        }

        public Criteria andOuttotalNotIn(List<Double> values) {
            addCriterion("outtotal not in", values, "outtotal");
            return (Criteria) this;
        }

        public Criteria andOuttotalBetween(Double value1, Double value2) {
            addCriterion("outtotal between", value1, value2, "outtotal");
            return (Criteria) this;
        }

        public Criteria andOuttotalNotBetween(Double value1, Double value2) {
            addCriterion("outtotal not between", value1, value2, "outtotal");
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

        public Criteria andCustomerorderIsNull() {
            addCriterion("customerorder is null");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIsNotNull() {
            addCriterion("customerorder is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerorderEqualTo(String value) {
            addCriterion("customerorder =", value, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderNotEqualTo(String value) {
            addCriterion("customerorder <>", value, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderGreaterThan(String value) {
            addCriterion("customerorder >", value, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderGreaterThanOrEqualTo(String value) {
            addCriterion("customerorder >=", value, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderLessThan(String value) {
            addCriterion("customerorder <", value, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderLessThanOrEqualTo(String value) {
            addCriterion("customerorder <=", value, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderLike(String value) {
            addCriterion("customerorder like", value, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderNotLike(String value) {
            addCriterion("customerorder not like", value, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIn(List<String> values) {
            addCriterion("customerorder in", values, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderNotIn(List<String> values) {
            addCriterion("customerorder not in", values, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderBetween(String value1, String value2) {
            addCriterion("customerorder between", value1, value2, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderNotBetween(String value1, String value2) {
            addCriterion("customerorder not between", value1, value2, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerdeliveryIsNull() {
            addCriterion("customerdelivery is null");
            return (Criteria) this;
        }

        public Criteria andCustomerdeliveryIsNotNull() {
            addCriterion("customerdelivery is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerdeliveryEqualTo(String value) {
            addCriterion("customerdelivery =", value, "customerdelivery");
            return (Criteria) this;
        }

        public Criteria andCustomerdeliveryNotEqualTo(String value) {
            addCriterion("customerdelivery <>", value, "customerdelivery");
            return (Criteria) this;
        }

        public Criteria andCustomerdeliveryGreaterThan(String value) {
            addCriterion("customerdelivery >", value, "customerdelivery");
            return (Criteria) this;
        }

        public Criteria andCustomerdeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("customerdelivery >=", value, "customerdelivery");
            return (Criteria) this;
        }

        public Criteria andCustomerdeliveryLessThan(String value) {
            addCriterion("customerdelivery <", value, "customerdelivery");
            return (Criteria) this;
        }

        public Criteria andCustomerdeliveryLessThanOrEqualTo(String value) {
            addCriterion("customerdelivery <=", value, "customerdelivery");
            return (Criteria) this;
        }

        public Criteria andCustomerdeliveryLike(String value) {
            addCriterion("customerdelivery like", value, "customerdelivery");
            return (Criteria) this;
        }

        public Criteria andCustomerdeliveryNotLike(String value) {
            addCriterion("customerdelivery not like", value, "customerdelivery");
            return (Criteria) this;
        }

        public Criteria andCustomerdeliveryIn(List<String> values) {
            addCriterion("customerdelivery in", values, "customerdelivery");
            return (Criteria) this;
        }

        public Criteria andCustomerdeliveryNotIn(List<String> values) {
            addCriterion("customerdelivery not in", values, "customerdelivery");
            return (Criteria) this;
        }

        public Criteria andCustomerdeliveryBetween(String value1, String value2) {
            addCriterion("customerdelivery between", value1, value2, "customerdelivery");
            return (Criteria) this;
        }

        public Criteria andCustomerdeliveryNotBetween(String value1, String value2) {
            addCriterion("customerdelivery not between", value1, value2, "customerdelivery");
            return (Criteria) this;
        }

        public Criteria andQuarterIsNull() {
            addCriterion("quarter is null");
            return (Criteria) this;
        }

        public Criteria andQuarterIsNotNull() {
            addCriterion("quarter is not null");
            return (Criteria) this;
        }

        public Criteria andQuarterEqualTo(String value) {
            addCriterion("quarter =", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotEqualTo(String value) {
            addCriterion("quarter <>", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterGreaterThan(String value) {
            addCriterion("quarter >", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterGreaterThanOrEqualTo(String value) {
            addCriterion("quarter >=", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterLessThan(String value) {
            addCriterion("quarter <", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterLessThanOrEqualTo(String value) {
            addCriterion("quarter <=", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterLike(String value) {
            addCriterion("quarter like", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotLike(String value) {
            addCriterion("quarter not like", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterIn(List<String> values) {
            addCriterion("quarter in", values, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotIn(List<String> values) {
            addCriterion("quarter not in", values, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterBetween(String value1, String value2) {
            addCriterion("quarter between", value1, value2, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotBetween(String value1, String value2) {
            addCriterion("quarter not between", value1, value2, "quarter");
            return (Criteria) this;
        }

        public Criteria andIsstatusIsNull() {
            addCriterion("isstatus is null");
            return (Criteria) this;
        }

        public Criteria andIsstatusIsNotNull() {
            addCriterion("isstatus is not null");
            return (Criteria) this;
        }

        public Criteria andIsstatusEqualTo(Integer value) {
            addCriterion("isstatus =", value, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusNotEqualTo(Integer value) {
            addCriterion("isstatus <>", value, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusGreaterThan(Integer value) {
            addCriterion("isstatus >", value, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("isstatus >=", value, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusLessThan(Integer value) {
            addCriterion("isstatus <", value, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusLessThanOrEqualTo(Integer value) {
            addCriterion("isstatus <=", value, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusIn(List<Integer> values) {
            addCriterion("isstatus in", values, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusNotIn(List<Integer> values) {
            addCriterion("isstatus not in", values, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusBetween(Integer value1, Integer value2) {
            addCriterion("isstatus between", value1, value2, "isstatus");
            return (Criteria) this;
        }

        public Criteria andIsstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("isstatus not between", value1, value2, "isstatus");
            return (Criteria) this;
        }

        public Criteria andProductionorderIsNull() {
            addCriterion("productionorder is null");
            return (Criteria) this;
        }

        public Criteria andProductionorderIsNotNull() {
            addCriterion("productionorder is not null");
            return (Criteria) this;
        }

        public Criteria andProductionorderEqualTo(String value) {
            addCriterion("productionorder =", value, "productionorder");
            return (Criteria) this;
        }

        public Criteria andProductionorderNotEqualTo(String value) {
            addCriterion("productionorder <>", value, "productionorder");
            return (Criteria) this;
        }

        public Criteria andProductionorderGreaterThan(String value) {
            addCriterion("productionorder >", value, "productionorder");
            return (Criteria) this;
        }

        public Criteria andProductionorderGreaterThanOrEqualTo(String value) {
            addCriterion("productionorder >=", value, "productionorder");
            return (Criteria) this;
        }

        public Criteria andProductionorderLessThan(String value) {
            addCriterion("productionorder <", value, "productionorder");
            return (Criteria) this;
        }

        public Criteria andProductionorderLessThanOrEqualTo(String value) {
            addCriterion("productionorder <=", value, "productionorder");
            return (Criteria) this;
        }

        public Criteria andProductionorderLike(String value) {
            addCriterion("productionorder like", value, "productionorder");
            return (Criteria) this;
        }

        public Criteria andProductionorderNotLike(String value) {
            addCriterion("productionorder not like", value, "productionorder");
            return (Criteria) this;
        }

        public Criteria andProductionorderIn(List<String> values) {
            addCriterion("productionorder in", values, "productionorder");
            return (Criteria) this;
        }

        public Criteria andProductionorderNotIn(List<String> values) {
            addCriterion("productionorder not in", values, "productionorder");
            return (Criteria) this;
        }

        public Criteria andProductionorderBetween(String value1, String value2) {
            addCriterion("productionorder between", value1, value2, "productionorder");
            return (Criteria) this;
        }

        public Criteria andProductionorderNotBetween(String value1, String value2) {
            addCriterion("productionorder not between", value1, value2, "productionorder");
            return (Criteria) this;
        }

        public Criteria andAccpetnumberIsNull() {
            addCriterion("accpetnumber is null");
            return (Criteria) this;
        }

        public Criteria andAccpetnumberIsNotNull() {
            addCriterion("accpetnumber is not null");
            return (Criteria) this;
        }

        public Criteria andAccpetnumberEqualTo(Double value) {
            addCriterion("accpetnumber =", value, "accpetnumber");
            return (Criteria) this;
        }

        public Criteria andAccpetnumberNotEqualTo(Double value) {
            addCriterion("accpetnumber <>", value, "accpetnumber");
            return (Criteria) this;
        }

        public Criteria andAccpetnumberGreaterThan(Double value) {
            addCriterion("accpetnumber >", value, "accpetnumber");
            return (Criteria) this;
        }

        public Criteria andAccpetnumberGreaterThanOrEqualTo(Double value) {
            addCriterion("accpetnumber >=", value, "accpetnumber");
            return (Criteria) this;
        }

        public Criteria andAccpetnumberLessThan(Double value) {
            addCriterion("accpetnumber <", value, "accpetnumber");
            return (Criteria) this;
        }

        public Criteria andAccpetnumberLessThanOrEqualTo(Double value) {
            addCriterion("accpetnumber <=", value, "accpetnumber");
            return (Criteria) this;
        }

        public Criteria andAccpetnumberIn(List<Double> values) {
            addCriterion("accpetnumber in", values, "accpetnumber");
            return (Criteria) this;
        }

        public Criteria andAccpetnumberNotIn(List<Double> values) {
            addCriterion("accpetnumber not in", values, "accpetnumber");
            return (Criteria) this;
        }

        public Criteria andAccpetnumberBetween(Double value1, Double value2) {
            addCriterion("accpetnumber between", value1, value2, "accpetnumber");
            return (Criteria) this;
        }

        public Criteria andAccpetnumberNotBetween(Double value1, Double value2) {
            addCriterion("accpetnumber not between", value1, value2, "accpetnumber");
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