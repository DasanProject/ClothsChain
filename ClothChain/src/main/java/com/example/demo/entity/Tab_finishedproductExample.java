package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_finishedproductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_finishedproductExample() {
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

        public Criteria andInidIsNull() {
            addCriterion("inid is null");
            return (Criteria) this;
        }

        public Criteria andInidIsNotNull() {
            addCriterion("inid is not null");
            return (Criteria) this;
        }

        public Criteria andInidEqualTo(Integer value) {
            addCriterion("inid =", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidNotEqualTo(Integer value) {
            addCriterion("inid <>", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidGreaterThan(Integer value) {
            addCriterion("inid >", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidGreaterThanOrEqualTo(Integer value) {
            addCriterion("inid >=", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidLessThan(Integer value) {
            addCriterion("inid <", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidLessThanOrEqualTo(Integer value) {
            addCriterion("inid <=", value, "inid");
            return (Criteria) this;
        }

        public Criteria andInidIn(List<Integer> values) {
            addCriterion("inid in", values, "inid");
            return (Criteria) this;
        }

        public Criteria andInidNotIn(List<Integer> values) {
            addCriterion("inid not in", values, "inid");
            return (Criteria) this;
        }

        public Criteria andInidBetween(Integer value1, Integer value2) {
            addCriterion("inid between", value1, value2, "inid");
            return (Criteria) this;
        }

        public Criteria andInidNotBetween(Integer value1, Integer value2) {
            addCriterion("inid not between", value1, value2, "inid");
            return (Criteria) this;
        }

        public Criteria andFinishedproductsidIsNull() {
            addCriterion("finishedproductsid is null");
            return (Criteria) this;
        }

        public Criteria andFinishedproductsidIsNotNull() {
            addCriterion("finishedproductsid is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedproductsidEqualTo(String value) {
            addCriterion("finishedproductsid =", value, "finishedproductsid");
            return (Criteria) this;
        }

        public Criteria andFinishedproductsidNotEqualTo(String value) {
            addCriterion("finishedproductsid <>", value, "finishedproductsid");
            return (Criteria) this;
        }

        public Criteria andFinishedproductsidGreaterThan(String value) {
            addCriterion("finishedproductsid >", value, "finishedproductsid");
            return (Criteria) this;
        }

        public Criteria andFinishedproductsidGreaterThanOrEqualTo(String value) {
            addCriterion("finishedproductsid >=", value, "finishedproductsid");
            return (Criteria) this;
        }

        public Criteria andFinishedproductsidLessThan(String value) {
            addCriterion("finishedproductsid <", value, "finishedproductsid");
            return (Criteria) this;
        }

        public Criteria andFinishedproductsidLessThanOrEqualTo(String value) {
            addCriterion("finishedproductsid <=", value, "finishedproductsid");
            return (Criteria) this;
        }

        public Criteria andFinishedproductsidLike(String value) {
            addCriterion("finishedproductsid like", value, "finishedproductsid");
            return (Criteria) this;
        }

        public Criteria andFinishedproductsidNotLike(String value) {
            addCriterion("finishedproductsid not like", value, "finishedproductsid");
            return (Criteria) this;
        }

        public Criteria andFinishedproductsidIn(List<String> values) {
            addCriterion("finishedproductsid in", values, "finishedproductsid");
            return (Criteria) this;
        }

        public Criteria andFinishedproductsidNotIn(List<String> values) {
            addCriterion("finishedproductsid not in", values, "finishedproductsid");
            return (Criteria) this;
        }

        public Criteria andFinishedproductsidBetween(String value1, String value2) {
            addCriterion("finishedproductsid between", value1, value2, "finishedproductsid");
            return (Criteria) this;
        }

        public Criteria andFinishedproductsidNotBetween(String value1, String value2) {
            addCriterion("finishedproductsid not between", value1, value2, "finishedproductsid");
            return (Criteria) this;
        }

        public Criteria andIntputwarehouseIsNull() {
            addCriterion("intputwarehouse is null");
            return (Criteria) this;
        }

        public Criteria andIntputwarehouseIsNotNull() {
            addCriterion("intputwarehouse is not null");
            return (Criteria) this;
        }

        public Criteria andIntputwarehouseEqualTo(Integer value) {
            addCriterion("intputwarehouse =", value, "intputwarehouse");
            return (Criteria) this;
        }

        public Criteria andIntputwarehouseNotEqualTo(Integer value) {
            addCriterion("intputwarehouse <>", value, "intputwarehouse");
            return (Criteria) this;
        }

        public Criteria andIntputwarehouseGreaterThan(Integer value) {
            addCriterion("intputwarehouse >", value, "intputwarehouse");
            return (Criteria) this;
        }

        public Criteria andIntputwarehouseGreaterThanOrEqualTo(Integer value) {
            addCriterion("intputwarehouse >=", value, "intputwarehouse");
            return (Criteria) this;
        }

        public Criteria andIntputwarehouseLessThan(Integer value) {
            addCriterion("intputwarehouse <", value, "intputwarehouse");
            return (Criteria) this;
        }

        public Criteria andIntputwarehouseLessThanOrEqualTo(Integer value) {
            addCriterion("intputwarehouse <=", value, "intputwarehouse");
            return (Criteria) this;
        }

        public Criteria andIntputwarehouseIn(List<Integer> values) {
            addCriterion("intputwarehouse in", values, "intputwarehouse");
            return (Criteria) this;
        }

        public Criteria andIntputwarehouseNotIn(List<Integer> values) {
            addCriterion("intputwarehouse not in", values, "intputwarehouse");
            return (Criteria) this;
        }

        public Criteria andIntputwarehouseBetween(Integer value1, Integer value2) {
            addCriterion("intputwarehouse between", value1, value2, "intputwarehouse");
            return (Criteria) this;
        }

        public Criteria andIntputwarehouseNotBetween(Integer value1, Integer value2) {
            addCriterion("intputwarehouse not between", value1, value2, "intputwarehouse");
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

        public Criteria andOutdateIsNull() {
            addCriterion("outdate is null");
            return (Criteria) this;
        }

        public Criteria andOutdateIsNotNull() {
            addCriterion("outdate is not null");
            return (Criteria) this;
        }

        public Criteria andOutdateEqualTo(String value) {
            addCriterion("outdate =", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateNotEqualTo(String value) {
            addCriterion("outdate <>", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateGreaterThan(String value) {
            addCriterion("outdate >", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateGreaterThanOrEqualTo(String value) {
            addCriterion("outdate >=", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateLessThan(String value) {
            addCriterion("outdate <", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateLessThanOrEqualTo(String value) {
            addCriterion("outdate <=", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateLike(String value) {
            addCriterion("outdate like", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateNotLike(String value) {
            addCriterion("outdate not like", value, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateIn(List<String> values) {
            addCriterion("outdate in", values, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateNotIn(List<String> values) {
            addCriterion("outdate not in", values, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateBetween(String value1, String value2) {
            addCriterion("outdate between", value1, value2, "outdate");
            return (Criteria) this;
        }

        public Criteria andOutdateNotBetween(String value1, String value2) {
            addCriterion("outdate not between", value1, value2, "outdate");
            return (Criteria) this;
        }

        public Criteria andTotalnumberIsNull() {
            addCriterion("totalnumber is null");
            return (Criteria) this;
        }

        public Criteria andTotalnumberIsNotNull() {
            addCriterion("totalnumber is not null");
            return (Criteria) this;
        }

        public Criteria andTotalnumberEqualTo(Integer value) {
            addCriterion("totalnumber =", value, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberNotEqualTo(Integer value) {
            addCriterion("totalnumber <>", value, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberGreaterThan(Integer value) {
            addCriterion("totalnumber >", value, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalnumber >=", value, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberLessThan(Integer value) {
            addCriterion("totalnumber <", value, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberLessThanOrEqualTo(Integer value) {
            addCriterion("totalnumber <=", value, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberIn(List<Integer> values) {
            addCriterion("totalnumber in", values, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberNotIn(List<Integer> values) {
            addCriterion("totalnumber not in", values, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberBetween(Integer value1, Integer value2) {
            addCriterion("totalnumber between", value1, value2, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("totalnumber not between", value1, value2, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNull() {
            addCriterion("warehouse is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNotNull() {
            addCriterion("warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseEqualTo(String value) {
            addCriterion("warehouse =", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotEqualTo(String value) {
            addCriterion("warehouse <>", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThan(String value) {
            addCriterion("warehouse >", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse >=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThan(String value) {
            addCriterion("warehouse <", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThanOrEqualTo(String value) {
            addCriterion("warehouse <=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLike(String value) {
            addCriterion("warehouse like", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotLike(String value) {
            addCriterion("warehouse not like", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseIn(List<String> values) {
            addCriterion("warehouse in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotIn(List<String> values) {
            addCriterion("warehouse not in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseBetween(String value1, String value2) {
            addCriterion("warehouse between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotBetween(String value1, String value2) {
            addCriterion("warehouse not between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andDanjudateIsNull() {
            addCriterion("danjudate is null");
            return (Criteria) this;
        }

        public Criteria andDanjudateIsNotNull() {
            addCriterion("danjudate is not null");
            return (Criteria) this;
        }

        public Criteria andDanjudateEqualTo(String value) {
            addCriterion("danjudate =", value, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateNotEqualTo(String value) {
            addCriterion("danjudate <>", value, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateGreaterThan(String value) {
            addCriterion("danjudate >", value, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateGreaterThanOrEqualTo(String value) {
            addCriterion("danjudate >=", value, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateLessThan(String value) {
            addCriterion("danjudate <", value, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateLessThanOrEqualTo(String value) {
            addCriterion("danjudate <=", value, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateLike(String value) {
            addCriterion("danjudate like", value, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateNotLike(String value) {
            addCriterion("danjudate not like", value, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateIn(List<String> values) {
            addCriterion("danjudate in", values, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateNotIn(List<String> values) {
            addCriterion("danjudate not in", values, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateBetween(String value1, String value2) {
            addCriterion("danjudate between", value1, value2, "danjudate");
            return (Criteria) this;
        }

        public Criteria andDanjudateNotBetween(String value1, String value2) {
            addCriterion("danjudate not between", value1, value2, "danjudate");
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

        public Criteria andInputnumberIsNull() {
            addCriterion("inputnumber is null");
            return (Criteria) this;
        }

        public Criteria andInputnumberIsNotNull() {
            addCriterion("inputnumber is not null");
            return (Criteria) this;
        }

        public Criteria andInputnumberEqualTo(Integer value) {
            addCriterion("inputnumber =", value, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberNotEqualTo(Integer value) {
            addCriterion("inputnumber <>", value, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberGreaterThan(Integer value) {
            addCriterion("inputnumber >", value, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("inputnumber >=", value, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberLessThan(Integer value) {
            addCriterion("inputnumber <", value, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberLessThanOrEqualTo(Integer value) {
            addCriterion("inputnumber <=", value, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberIn(List<Integer> values) {
            addCriterion("inputnumber in", values, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberNotIn(List<Integer> values) {
            addCriterion("inputnumber not in", values, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberBetween(Integer value1, Integer value2) {
            addCriterion("inputnumber between", value1, value2, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andInputnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("inputnumber not between", value1, value2, "inputnumber");
            return (Criteria) this;
        }

        public Criteria andIntputdateIsNull() {
            addCriterion("intputdate is null");
            return (Criteria) this;
        }

        public Criteria andIntputdateIsNotNull() {
            addCriterion("intputdate is not null");
            return (Criteria) this;
        }

        public Criteria andIntputdateEqualTo(String value) {
            addCriterion("intputdate =", value, "intputdate");
            return (Criteria) this;
        }

        public Criteria andIntputdateNotEqualTo(String value) {
            addCriterion("intputdate <>", value, "intputdate");
            return (Criteria) this;
        }

        public Criteria andIntputdateGreaterThan(String value) {
            addCriterion("intputdate >", value, "intputdate");
            return (Criteria) this;
        }

        public Criteria andIntputdateGreaterThanOrEqualTo(String value) {
            addCriterion("intputdate >=", value, "intputdate");
            return (Criteria) this;
        }

        public Criteria andIntputdateLessThan(String value) {
            addCriterion("intputdate <", value, "intputdate");
            return (Criteria) this;
        }

        public Criteria andIntputdateLessThanOrEqualTo(String value) {
            addCriterion("intputdate <=", value, "intputdate");
            return (Criteria) this;
        }

        public Criteria andIntputdateLike(String value) {
            addCriterion("intputdate like", value, "intputdate");
            return (Criteria) this;
        }

        public Criteria andIntputdateNotLike(String value) {
            addCriterion("intputdate not like", value, "intputdate");
            return (Criteria) this;
        }

        public Criteria andIntputdateIn(List<String> values) {
            addCriterion("intputdate in", values, "intputdate");
            return (Criteria) this;
        }

        public Criteria andIntputdateNotIn(List<String> values) {
            addCriterion("intputdate not in", values, "intputdate");
            return (Criteria) this;
        }

        public Criteria andIntputdateBetween(String value1, String value2) {
            addCriterion("intputdate between", value1, value2, "intputdate");
            return (Criteria) this;
        }

        public Criteria andIntputdateNotBetween(String value1, String value2) {
            addCriterion("intputdate not between", value1, value2, "intputdate");
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