package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_storageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_storageExample() {
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

        public Criteria andStorageidIsNull() {
            addCriterion("storageid is null");
            return (Criteria) this;
        }

        public Criteria andStorageidIsNotNull() {
            addCriterion("storageid is not null");
            return (Criteria) this;
        }

        public Criteria andStorageidEqualTo(Integer value) {
            addCriterion("storageid =", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotEqualTo(Integer value) {
            addCriterion("storageid <>", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidGreaterThan(Integer value) {
            addCriterion("storageid >", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("storageid >=", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidLessThan(Integer value) {
            addCriterion("storageid <", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidLessThanOrEqualTo(Integer value) {
            addCriterion("storageid <=", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidIn(List<Integer> values) {
            addCriterion("storageid in", values, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotIn(List<Integer> values) {
            addCriterion("storageid not in", values, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidBetween(Integer value1, Integer value2) {
            addCriterion("storageid between", value1, value2, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotBetween(Integer value1, Integer value2) {
            addCriterion("storageid not between", value1, value2, "storageid");
            return (Criteria) this;
        }

        public Criteria andStoragenoIsNull() {
            addCriterion("storageno is null");
            return (Criteria) this;
        }

        public Criteria andStoragenoIsNotNull() {
            addCriterion("storageno is not null");
            return (Criteria) this;
        }

        public Criteria andStoragenoEqualTo(String value) {
            addCriterion("storageno =", value, "storageno");
            return (Criteria) this;
        }

        public Criteria andStoragenoNotEqualTo(String value) {
            addCriterion("storageno <>", value, "storageno");
            return (Criteria) this;
        }

        public Criteria andStoragenoGreaterThan(String value) {
            addCriterion("storageno >", value, "storageno");
            return (Criteria) this;
        }

        public Criteria andStoragenoGreaterThanOrEqualTo(String value) {
            addCriterion("storageno >=", value, "storageno");
            return (Criteria) this;
        }

        public Criteria andStoragenoLessThan(String value) {
            addCriterion("storageno <", value, "storageno");
            return (Criteria) this;
        }

        public Criteria andStoragenoLessThanOrEqualTo(String value) {
            addCriterion("storageno <=", value, "storageno");
            return (Criteria) this;
        }

        public Criteria andStoragenoLike(String value) {
            addCriterion("storageno like", value, "storageno");
            return (Criteria) this;
        }

        public Criteria andStoragenoNotLike(String value) {
            addCriterion("storageno not like", value, "storageno");
            return (Criteria) this;
        }

        public Criteria andStoragenoIn(List<String> values) {
            addCriterion("storageno in", values, "storageno");
            return (Criteria) this;
        }

        public Criteria andStoragenoNotIn(List<String> values) {
            addCriterion("storageno not in", values, "storageno");
            return (Criteria) this;
        }

        public Criteria andStoragenoBetween(String value1, String value2) {
            addCriterion("storageno between", value1, value2, "storageno");
            return (Criteria) this;
        }

        public Criteria andStoragenoNotBetween(String value1, String value2) {
            addCriterion("storageno not between", value1, value2, "storageno");
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

        public Criteria andStoragedateIsNull() {
            addCriterion("storagedate is null");
            return (Criteria) this;
        }

        public Criteria andStoragedateIsNotNull() {
            addCriterion("storagedate is not null");
            return (Criteria) this;
        }

        public Criteria andStoragedateEqualTo(String value) {
            addCriterion("storagedate =", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateNotEqualTo(String value) {
            addCriterion("storagedate <>", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateGreaterThan(String value) {
            addCriterion("storagedate >", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateGreaterThanOrEqualTo(String value) {
            addCriterion("storagedate >=", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateLessThan(String value) {
            addCriterion("storagedate <", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateLessThanOrEqualTo(String value) {
            addCriterion("storagedate <=", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateLike(String value) {
            addCriterion("storagedate like", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateNotLike(String value) {
            addCriterion("storagedate not like", value, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateIn(List<String> values) {
            addCriterion("storagedate in", values, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateNotIn(List<String> values) {
            addCriterion("storagedate not in", values, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateBetween(String value1, String value2) {
            addCriterion("storagedate between", value1, value2, "storagedate");
            return (Criteria) this;
        }

        public Criteria andStoragedateNotBetween(String value1, String value2) {
            addCriterion("storagedate not between", value1, value2, "storagedate");
            return (Criteria) this;
        }

        public Criteria andPurchaserIsNull() {
            addCriterion("purchaser is null");
            return (Criteria) this;
        }

        public Criteria andPurchaserIsNotNull() {
            addCriterion("purchaser is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaserEqualTo(String value) {
            addCriterion("purchaser =", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotEqualTo(String value) {
            addCriterion("purchaser <>", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserGreaterThan(String value) {
            addCriterion("purchaser >", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserGreaterThanOrEqualTo(String value) {
            addCriterion("purchaser >=", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserLessThan(String value) {
            addCriterion("purchaser <", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserLessThanOrEqualTo(String value) {
            addCriterion("purchaser <=", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserLike(String value) {
            addCriterion("purchaser like", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotLike(String value) {
            addCriterion("purchaser not like", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserIn(List<String> values) {
            addCriterion("purchaser in", values, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotIn(List<String> values) {
            addCriterion("purchaser not in", values, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserBetween(String value1, String value2) {
            addCriterion("purchaser between", value1, value2, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotBetween(String value1, String value2) {
            addCriterion("purchaser not between", value1, value2, "purchaser");
            return (Criteria) this;
        }

        public Criteria andDeliverynoIsNull() {
            addCriterion("deliveryno is null");
            return (Criteria) this;
        }

        public Criteria andDeliverynoIsNotNull() {
            addCriterion("deliveryno is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverynoEqualTo(String value) {
            addCriterion("deliveryno =", value, "deliveryno");
            return (Criteria) this;
        }

        public Criteria andDeliverynoNotEqualTo(String value) {
            addCriterion("deliveryno <>", value, "deliveryno");
            return (Criteria) this;
        }

        public Criteria andDeliverynoGreaterThan(String value) {
            addCriterion("deliveryno >", value, "deliveryno");
            return (Criteria) this;
        }

        public Criteria andDeliverynoGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryno >=", value, "deliveryno");
            return (Criteria) this;
        }

        public Criteria andDeliverynoLessThan(String value) {
            addCriterion("deliveryno <", value, "deliveryno");
            return (Criteria) this;
        }

        public Criteria andDeliverynoLessThanOrEqualTo(String value) {
            addCriterion("deliveryno <=", value, "deliveryno");
            return (Criteria) this;
        }

        public Criteria andDeliverynoLike(String value) {
            addCriterion("deliveryno like", value, "deliveryno");
            return (Criteria) this;
        }

        public Criteria andDeliverynoNotLike(String value) {
            addCriterion("deliveryno not like", value, "deliveryno");
            return (Criteria) this;
        }

        public Criteria andDeliverynoIn(List<String> values) {
            addCriterion("deliveryno in", values, "deliveryno");
            return (Criteria) this;
        }

        public Criteria andDeliverynoNotIn(List<String> values) {
            addCriterion("deliveryno not in", values, "deliveryno");
            return (Criteria) this;
        }

        public Criteria andDeliverynoBetween(String value1, String value2) {
            addCriterion("deliveryno between", value1, value2, "deliveryno");
            return (Criteria) this;
        }

        public Criteria andDeliverynoNotBetween(String value1, String value2) {
            addCriterion("deliveryno not between", value1, value2, "deliveryno");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNull() {
            addCriterion("batchno is null");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNotNull() {
            addCriterion("batchno is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnoEqualTo(String value) {
            addCriterion("batchno =", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotEqualTo(String value) {
            addCriterion("batchno <>", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThan(String value) {
            addCriterion("batchno >", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("batchno >=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThan(String value) {
            addCriterion("batchno <", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThanOrEqualTo(String value) {
            addCriterion("batchno <=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLike(String value) {
            addCriterion("batchno like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotLike(String value) {
            addCriterion("batchno not like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoIn(List<String> values) {
            addCriterion("batchno in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotIn(List<String> values) {
            addCriterion("batchno not in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoBetween(String value1, String value2) {
            addCriterion("batchno between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotBetween(String value1, String value2) {
            addCriterion("batchno not between", value1, value2, "batchno");
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

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andSuperlieridIsNull() {
            addCriterion("superlierid is null");
            return (Criteria) this;
        }

        public Criteria andSuperlieridIsNotNull() {
            addCriterion("superlierid is not null");
            return (Criteria) this;
        }

        public Criteria andSuperlieridEqualTo(Integer value) {
            addCriterion("superlierid =", value, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridNotEqualTo(Integer value) {
            addCriterion("superlierid <>", value, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridGreaterThan(Integer value) {
            addCriterion("superlierid >", value, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("superlierid >=", value, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridLessThan(Integer value) {
            addCriterion("superlierid <", value, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridLessThanOrEqualTo(Integer value) {
            addCriterion("superlierid <=", value, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridIn(List<Integer> values) {
            addCriterion("superlierid in", values, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridNotIn(List<Integer> values) {
            addCriterion("superlierid not in", values, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridBetween(Integer value1, Integer value2) {
            addCriterion("superlierid between", value1, value2, "superlierid");
            return (Criteria) this;
        }

        public Criteria andSuperlieridNotBetween(Integer value1, Integer value2) {
            addCriterion("superlierid not between", value1, value2, "superlierid");
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