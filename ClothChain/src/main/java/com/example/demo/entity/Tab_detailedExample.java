package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_detailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_detailedExample() {
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

        public Criteria andDetailidIsNull() {
            addCriterion("detailid is null");
            return (Criteria) this;
        }

        public Criteria andDetailidIsNotNull() {
            addCriterion("detailid is not null");
            return (Criteria) this;
        }

        public Criteria andDetailidEqualTo(Integer value) {
            addCriterion("detailid =", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotEqualTo(Integer value) {
            addCriterion("detailid <>", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidGreaterThan(Integer value) {
            addCriterion("detailid >", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("detailid >=", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLessThan(Integer value) {
            addCriterion("detailid <", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLessThanOrEqualTo(Integer value) {
            addCriterion("detailid <=", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidIn(List<Integer> values) {
            addCriterion("detailid in", values, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotIn(List<Integer> values) {
            addCriterion("detailid not in", values, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidBetween(Integer value1, Integer value2) {
            addCriterion("detailid between", value1, value2, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("detailid not between", value1, value2, "detailid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIsNull() {
            addCriterion("purchaseid is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIsNotNull() {
            addCriterion("purchaseid is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseidEqualTo(Integer value) {
            addCriterion("purchaseid =", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotEqualTo(Integer value) {
            addCriterion("purchaseid <>", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidGreaterThan(Integer value) {
            addCriterion("purchaseid >", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseid >=", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidLessThan(Integer value) {
            addCriterion("purchaseid <", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseid <=", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIn(List<Integer> values) {
            addCriterion("purchaseid in", values, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotIn(List<Integer> values) {
            addCriterion("purchaseid not in", values, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidBetween(Integer value1, Integer value2) {
            addCriterion("purchaseid between", value1, value2, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseid not between", value1, value2, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andDevelopmentnoIsNull() {
            addCriterion("developmentno is null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentnoIsNotNull() {
            addCriterion("developmentno is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentnoEqualTo(String value) {
            addCriterion("developmentno =", value, "developmentno");
            return (Criteria) this;
        }

        public Criteria andDevelopmentnoNotEqualTo(String value) {
            addCriterion("developmentno <>", value, "developmentno");
            return (Criteria) this;
        }

        public Criteria andDevelopmentnoGreaterThan(String value) {
            addCriterion("developmentno >", value, "developmentno");
            return (Criteria) this;
        }

        public Criteria andDevelopmentnoGreaterThanOrEqualTo(String value) {
            addCriterion("developmentno >=", value, "developmentno");
            return (Criteria) this;
        }

        public Criteria andDevelopmentnoLessThan(String value) {
            addCriterion("developmentno <", value, "developmentno");
            return (Criteria) this;
        }

        public Criteria andDevelopmentnoLessThanOrEqualTo(String value) {
            addCriterion("developmentno <=", value, "developmentno");
            return (Criteria) this;
        }

        public Criteria andDevelopmentnoLike(String value) {
            addCriterion("developmentno like", value, "developmentno");
            return (Criteria) this;
        }

        public Criteria andDevelopmentnoNotLike(String value) {
            addCriterion("developmentno not like", value, "developmentno");
            return (Criteria) this;
        }

        public Criteria andDevelopmentnoIn(List<String> values) {
            addCriterion("developmentno in", values, "developmentno");
            return (Criteria) this;
        }

        public Criteria andDevelopmentnoNotIn(List<String> values) {
            addCriterion("developmentno not in", values, "developmentno");
            return (Criteria) this;
        }

        public Criteria andDevelopmentnoBetween(String value1, String value2) {
            addCriterion("developmentno between", value1, value2, "developmentno");
            return (Criteria) this;
        }

        public Criteria andDevelopmentnoNotBetween(String value1, String value2) {
            addCriterion("developmentno not between", value1, value2, "developmentno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoIsNull() {
            addCriterion("purchaseno is null");
            return (Criteria) this;
        }

        public Criteria andPurchasenoIsNotNull() {
            addCriterion("purchaseno is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasenoEqualTo(String value) {
            addCriterion("purchaseno =", value, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoNotEqualTo(String value) {
            addCriterion("purchaseno <>", value, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoGreaterThan(String value) {
            addCriterion("purchaseno >", value, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseno >=", value, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoLessThan(String value) {
            addCriterion("purchaseno <", value, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoLessThanOrEqualTo(String value) {
            addCriterion("purchaseno <=", value, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoLike(String value) {
            addCriterion("purchaseno like", value, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoNotLike(String value) {
            addCriterion("purchaseno not like", value, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoIn(List<String> values) {
            addCriterion("purchaseno in", values, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoNotIn(List<String> values) {
            addCriterion("purchaseno not in", values, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoBetween(String value1, String value2) {
            addCriterion("purchaseno between", value1, value2, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andPurchasenoNotBetween(String value1, String value2) {
            addCriterion("purchaseno not between", value1, value2, "purchaseno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoIsNull() {
            addCriterion("materielno is null");
            return (Criteria) this;
        }

        public Criteria andMaterielnoIsNotNull() {
            addCriterion("materielno is not null");
            return (Criteria) this;
        }

        public Criteria andMaterielnoEqualTo(String value) {
            addCriterion("materielno =", value, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoNotEqualTo(String value) {
            addCriterion("materielno <>", value, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoGreaterThan(String value) {
            addCriterion("materielno >", value, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoGreaterThanOrEqualTo(String value) {
            addCriterion("materielno >=", value, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoLessThan(String value) {
            addCriterion("materielno <", value, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoLessThanOrEqualTo(String value) {
            addCriterion("materielno <=", value, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoLike(String value) {
            addCriterion("materielno like", value, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoNotLike(String value) {
            addCriterion("materielno not like", value, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoIn(List<String> values) {
            addCriterion("materielno in", values, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoNotIn(List<String> values) {
            addCriterion("materielno not in", values, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoBetween(String value1, String value2) {
            addCriterion("materielno between", value1, value2, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnoNotBetween(String value1, String value2) {
            addCriterion("materielno not between", value1, value2, "materielno");
            return (Criteria) this;
        }

        public Criteria andMaterielnameIsNull() {
            addCriterion("materielname is null");
            return (Criteria) this;
        }

        public Criteria andMaterielnameIsNotNull() {
            addCriterion("materielname is not null");
            return (Criteria) this;
        }

        public Criteria andMaterielnameEqualTo(String value) {
            addCriterion("materielname =", value, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameNotEqualTo(String value) {
            addCriterion("materielname <>", value, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameGreaterThan(String value) {
            addCriterion("materielname >", value, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameGreaterThanOrEqualTo(String value) {
            addCriterion("materielname >=", value, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameLessThan(String value) {
            addCriterion("materielname <", value, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameLessThanOrEqualTo(String value) {
            addCriterion("materielname <=", value, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameLike(String value) {
            addCriterion("materielname like", value, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameNotLike(String value) {
            addCriterion("materielname not like", value, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameIn(List<String> values) {
            addCriterion("materielname in", values, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameNotIn(List<String> values) {
            addCriterion("materielname not in", values, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameBetween(String value1, String value2) {
            addCriterion("materielname between", value1, value2, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterielnameNotBetween(String value1, String value2) {
            addCriterion("materielname not between", value1, value2, "materielname");
            return (Criteria) this;
        }

        public Criteria andMaterialsnoIsNull() {
            addCriterion("materialsno is null");
            return (Criteria) this;
        }

        public Criteria andMaterialsnoIsNotNull() {
            addCriterion("materialsno is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialsnoEqualTo(String value) {
            addCriterion("materialsno =", value, "materialsno");
            return (Criteria) this;
        }

        public Criteria andMaterialsnoNotEqualTo(String value) {
            addCriterion("materialsno <>", value, "materialsno");
            return (Criteria) this;
        }

        public Criteria andMaterialsnoGreaterThan(String value) {
            addCriterion("materialsno >", value, "materialsno");
            return (Criteria) this;
        }

        public Criteria andMaterialsnoGreaterThanOrEqualTo(String value) {
            addCriterion("materialsno >=", value, "materialsno");
            return (Criteria) this;
        }

        public Criteria andMaterialsnoLessThan(String value) {
            addCriterion("materialsno <", value, "materialsno");
            return (Criteria) this;
        }

        public Criteria andMaterialsnoLessThanOrEqualTo(String value) {
            addCriterion("materialsno <=", value, "materialsno");
            return (Criteria) this;
        }

        public Criteria andMaterialsnoLike(String value) {
            addCriterion("materialsno like", value, "materialsno");
            return (Criteria) this;
        }

        public Criteria andMaterialsnoNotLike(String value) {
            addCriterion("materialsno not like", value, "materialsno");
            return (Criteria) this;
        }

        public Criteria andMaterialsnoIn(List<String> values) {
            addCriterion("materialsno in", values, "materialsno");
            return (Criteria) this;
        }

        public Criteria andMaterialsnoNotIn(List<String> values) {
            addCriterion("materialsno not in", values, "materialsno");
            return (Criteria) this;
        }

        public Criteria andMaterialsnoBetween(String value1, String value2) {
            addCriterion("materialsno between", value1, value2, "materialsno");
            return (Criteria) this;
        }

        public Criteria andMaterialsnoNotBetween(String value1, String value2) {
            addCriterion("materialsno not between", value1, value2, "materialsno");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNull() {
            addCriterion("specifications is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIsNotNull() {
            addCriterion("specifications is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationsEqualTo(String value) {
            addCriterion("specifications =", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotEqualTo(String value) {
            addCriterion("specifications <>", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThan(String value) {
            addCriterion("specifications >", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("specifications >=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThan(String value) {
            addCriterion("specifications <", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("specifications <=", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsLike(String value) {
            addCriterion("specifications like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotLike(String value) {
            addCriterion("specifications not like", value, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsIn(List<String> values) {
            addCriterion("specifications in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotIn(List<String> values) {
            addCriterion("specifications not in", values, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsBetween(String value1, String value2) {
            addCriterion("specifications between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andSpecificationsNotBetween(String value1, String value2) {
            addCriterion("specifications not between", value1, value2, "specifications");
            return (Criteria) this;
        }

        public Criteria andStoragebatchnoIsNull() {
            addCriterion("storagebatchno is null");
            return (Criteria) this;
        }

        public Criteria andStoragebatchnoIsNotNull() {
            addCriterion("storagebatchno is not null");
            return (Criteria) this;
        }

        public Criteria andStoragebatchnoEqualTo(String value) {
            addCriterion("storagebatchno =", value, "storagebatchno");
            return (Criteria) this;
        }

        public Criteria andStoragebatchnoNotEqualTo(String value) {
            addCriterion("storagebatchno <>", value, "storagebatchno");
            return (Criteria) this;
        }

        public Criteria andStoragebatchnoGreaterThan(String value) {
            addCriterion("storagebatchno >", value, "storagebatchno");
            return (Criteria) this;
        }

        public Criteria andStoragebatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("storagebatchno >=", value, "storagebatchno");
            return (Criteria) this;
        }

        public Criteria andStoragebatchnoLessThan(String value) {
            addCriterion("storagebatchno <", value, "storagebatchno");
            return (Criteria) this;
        }

        public Criteria andStoragebatchnoLessThanOrEqualTo(String value) {
            addCriterion("storagebatchno <=", value, "storagebatchno");
            return (Criteria) this;
        }

        public Criteria andStoragebatchnoLike(String value) {
            addCriterion("storagebatchno like", value, "storagebatchno");
            return (Criteria) this;
        }

        public Criteria andStoragebatchnoNotLike(String value) {
            addCriterion("storagebatchno not like", value, "storagebatchno");
            return (Criteria) this;
        }

        public Criteria andStoragebatchnoIn(List<String> values) {
            addCriterion("storagebatchno in", values, "storagebatchno");
            return (Criteria) this;
        }

        public Criteria andStoragebatchnoNotIn(List<String> values) {
            addCriterion("storagebatchno not in", values, "storagebatchno");
            return (Criteria) this;
        }

        public Criteria andStoragebatchnoBetween(String value1, String value2) {
            addCriterion("storagebatchno between", value1, value2, "storagebatchno");
            return (Criteria) this;
        }

        public Criteria andStoragebatchnoNotBetween(String value1, String value2) {
            addCriterion("storagebatchno not between", value1, value2, "storagebatchno");
            return (Criteria) this;
        }

        public Criteria andColourIsNull() {
            addCriterion("colour is null");
            return (Criteria) this;
        }

        public Criteria andColourIsNotNull() {
            addCriterion("colour is not null");
            return (Criteria) this;
        }

        public Criteria andColourEqualTo(String value) {
            addCriterion("colour =", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourNotEqualTo(String value) {
            addCriterion("colour <>", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourGreaterThan(String value) {
            addCriterion("colour >", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourGreaterThanOrEqualTo(String value) {
            addCriterion("colour >=", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourLessThan(String value) {
            addCriterion("colour <", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourLessThanOrEqualTo(String value) {
            addCriterion("colour <=", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourLike(String value) {
            addCriterion("colour like", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourNotLike(String value) {
            addCriterion("colour not like", value, "colour");
            return (Criteria) this;
        }

        public Criteria andColourIn(List<String> values) {
            addCriterion("colour in", values, "colour");
            return (Criteria) this;
        }

        public Criteria andColourNotIn(List<String> values) {
            addCriterion("colour not in", values, "colour");
            return (Criteria) this;
        }

        public Criteria andColourBetween(String value1, String value2) {
            addCriterion("colour between", value1, value2, "colour");
            return (Criteria) this;
        }

        public Criteria andColourNotBetween(String value1, String value2) {
            addCriterion("colour not between", value1, value2, "colour");
            return (Criteria) this;
        }

        public Criteria andDemandnumIsNull() {
            addCriterion("demandnum is null");
            return (Criteria) this;
        }

        public Criteria andDemandnumIsNotNull() {
            addCriterion("demandnum is not null");
            return (Criteria) this;
        }

        public Criteria andDemandnumEqualTo(Double value) {
            addCriterion("demandnum =", value, "demandnum");
            return (Criteria) this;
        }

        public Criteria andDemandnumNotEqualTo(Double value) {
            addCriterion("demandnum <>", value, "demandnum");
            return (Criteria) this;
        }

        public Criteria andDemandnumGreaterThan(Double value) {
            addCriterion("demandnum >", value, "demandnum");
            return (Criteria) this;
        }

        public Criteria andDemandnumGreaterThanOrEqualTo(Double value) {
            addCriterion("demandnum >=", value, "demandnum");
            return (Criteria) this;
        }

        public Criteria andDemandnumLessThan(Double value) {
            addCriterion("demandnum <", value, "demandnum");
            return (Criteria) this;
        }

        public Criteria andDemandnumLessThanOrEqualTo(Double value) {
            addCriterion("demandnum <=", value, "demandnum");
            return (Criteria) this;
        }

        public Criteria andDemandnumIn(List<Double> values) {
            addCriterion("demandnum in", values, "demandnum");
            return (Criteria) this;
        }

        public Criteria andDemandnumNotIn(List<Double> values) {
            addCriterion("demandnum not in", values, "demandnum");
            return (Criteria) this;
        }

        public Criteria andDemandnumBetween(Double value1, Double value2) {
            addCriterion("demandnum between", value1, value2, "demandnum");
            return (Criteria) this;
        }

        public Criteria andDemandnumNotBetween(Double value1, Double value2) {
            addCriterion("demandnum not between", value1, value2, "demandnum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumIsNull() {
            addCriterion("purchasenum is null");
            return (Criteria) this;
        }

        public Criteria andPurchasenumIsNotNull() {
            addCriterion("purchasenum is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasenumEqualTo(Double value) {
            addCriterion("purchasenum =", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumNotEqualTo(Double value) {
            addCriterion("purchasenum <>", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumGreaterThan(Double value) {
            addCriterion("purchasenum >", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumGreaterThanOrEqualTo(Double value) {
            addCriterion("purchasenum >=", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumLessThan(Double value) {
            addCriterion("purchasenum <", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumLessThanOrEqualTo(Double value) {
            addCriterion("purchasenum <=", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumIn(List<Double> values) {
            addCriterion("purchasenum in", values, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumNotIn(List<Double> values) {
            addCriterion("purchasenum not in", values, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumBetween(Double value1, Double value2) {
            addCriterion("purchasenum between", value1, value2, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumNotBetween(Double value1, Double value2) {
            addCriterion("purchasenum not between", value1, value2, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andDemanddateIsNull() {
            addCriterion("demanddate is null");
            return (Criteria) this;
        }

        public Criteria andDemanddateIsNotNull() {
            addCriterion("demanddate is not null");
            return (Criteria) this;
        }

        public Criteria andDemanddateEqualTo(String value) {
            addCriterion("demanddate =", value, "demanddate");
            return (Criteria) this;
        }

        public Criteria andDemanddateNotEqualTo(String value) {
            addCriterion("demanddate <>", value, "demanddate");
            return (Criteria) this;
        }

        public Criteria andDemanddateGreaterThan(String value) {
            addCriterion("demanddate >", value, "demanddate");
            return (Criteria) this;
        }

        public Criteria andDemanddateGreaterThanOrEqualTo(String value) {
            addCriterion("demanddate >=", value, "demanddate");
            return (Criteria) this;
        }

        public Criteria andDemanddateLessThan(String value) {
            addCriterion("demanddate <", value, "demanddate");
            return (Criteria) this;
        }

        public Criteria andDemanddateLessThanOrEqualTo(String value) {
            addCriterion("demanddate <=", value, "demanddate");
            return (Criteria) this;
        }

        public Criteria andDemanddateLike(String value) {
            addCriterion("demanddate like", value, "demanddate");
            return (Criteria) this;
        }

        public Criteria andDemanddateNotLike(String value) {
            addCriterion("demanddate not like", value, "demanddate");
            return (Criteria) this;
        }

        public Criteria andDemanddateIn(List<String> values) {
            addCriterion("demanddate in", values, "demanddate");
            return (Criteria) this;
        }

        public Criteria andDemanddateNotIn(List<String> values) {
            addCriterion("demanddate not in", values, "demanddate");
            return (Criteria) this;
        }

        public Criteria andDemanddateBetween(String value1, String value2) {
            addCriterion("demanddate between", value1, value2, "demanddate");
            return (Criteria) this;
        }

        public Criteria andDemanddateNotBetween(String value1, String value2) {
            addCriterion("demanddate not between", value1, value2, "demanddate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateIsNull() {
            addCriterion("approvalstate is null");
            return (Criteria) this;
        }

        public Criteria andApprovalstateIsNotNull() {
            addCriterion("approvalstate is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalstateEqualTo(Integer value) {
            addCriterion("approvalstate =", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateNotEqualTo(Integer value) {
            addCriterion("approvalstate <>", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateGreaterThan(Integer value) {
            addCriterion("approvalstate >", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("approvalstate >=", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateLessThan(Integer value) {
            addCriterion("approvalstate <", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateLessThanOrEqualTo(Integer value) {
            addCriterion("approvalstate <=", value, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateIn(List<Integer> values) {
            addCriterion("approvalstate in", values, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateNotIn(List<Integer> values) {
            addCriterion("approvalstate not in", values, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateBetween(Integer value1, Integer value2) {
            addCriterion("approvalstate between", value1, value2, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApprovalstateNotBetween(Integer value1, Integer value2) {
            addCriterion("approvalstate not between", value1, value2, "approvalstate");
            return (Criteria) this;
        }

        public Criteria andApproverIsNull() {
            addCriterion("approver is null");
            return (Criteria) this;
        }

        public Criteria andApproverIsNotNull() {
            addCriterion("approver is not null");
            return (Criteria) this;
        }

        public Criteria andApproverEqualTo(String value) {
            addCriterion("approver =", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotEqualTo(String value) {
            addCriterion("approver <>", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThan(String value) {
            addCriterion("approver >", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThanOrEqualTo(String value) {
            addCriterion("approver >=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThan(String value) {
            addCriterion("approver <", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThanOrEqualTo(String value) {
            addCriterion("approver <=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLike(String value) {
            addCriterion("approver like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotLike(String value) {
            addCriterion("approver not like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverIn(List<String> values) {
            addCriterion("approver in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotIn(List<String> values) {
            addCriterion("approver not in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverBetween(String value1, String value2) {
            addCriterion("approver between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotBetween(String value1, String value2) {
            addCriterion("approver not between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andTasktypeIsNull() {
            addCriterion("tasktype is null");
            return (Criteria) this;
        }

        public Criteria andTasktypeIsNotNull() {
            addCriterion("tasktype is not null");
            return (Criteria) this;
        }

        public Criteria andTasktypeEqualTo(String value) {
            addCriterion("tasktype =", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotEqualTo(String value) {
            addCriterion("tasktype <>", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThan(String value) {
            addCriterion("tasktype >", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThanOrEqualTo(String value) {
            addCriterion("tasktype >=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThan(String value) {
            addCriterion("tasktype <", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThanOrEqualTo(String value) {
            addCriterion("tasktype <=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLike(String value) {
            addCriterion("tasktype like", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotLike(String value) {
            addCriterion("tasktype not like", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeIn(List<String> values) {
            addCriterion("tasktype in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotIn(List<String> values) {
            addCriterion("tasktype not in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeBetween(String value1, String value2) {
            addCriterion("tasktype between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotBetween(String value1, String value2) {
            addCriterion("tasktype not between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andPurchasernameIsNull() {
            addCriterion("purchasername is null");
            return (Criteria) this;
        }

        public Criteria andPurchasernameIsNotNull() {
            addCriterion("purchasername is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasernameEqualTo(String value) {
            addCriterion("purchasername =", value, "purchasername");
            return (Criteria) this;
        }

        public Criteria andPurchasernameNotEqualTo(String value) {
            addCriterion("purchasername <>", value, "purchasername");
            return (Criteria) this;
        }

        public Criteria andPurchasernameGreaterThan(String value) {
            addCriterion("purchasername >", value, "purchasername");
            return (Criteria) this;
        }

        public Criteria andPurchasernameGreaterThanOrEqualTo(String value) {
            addCriterion("purchasername >=", value, "purchasername");
            return (Criteria) this;
        }

        public Criteria andPurchasernameLessThan(String value) {
            addCriterion("purchasername <", value, "purchasername");
            return (Criteria) this;
        }

        public Criteria andPurchasernameLessThanOrEqualTo(String value) {
            addCriterion("purchasername <=", value, "purchasername");
            return (Criteria) this;
        }

        public Criteria andPurchasernameLike(String value) {
            addCriterion("purchasername like", value, "purchasername");
            return (Criteria) this;
        }

        public Criteria andPurchasernameNotLike(String value) {
            addCriterion("purchasername not like", value, "purchasername");
            return (Criteria) this;
        }

        public Criteria andPurchasernameIn(List<String> values) {
            addCriterion("purchasername in", values, "purchasername");
            return (Criteria) this;
        }

        public Criteria andPurchasernameNotIn(List<String> values) {
            addCriterion("purchasername not in", values, "purchasername");
            return (Criteria) this;
        }

        public Criteria andPurchasernameBetween(String value1, String value2) {
            addCriterion("purchasername between", value1, value2, "purchasername");
            return (Criteria) this;
        }

        public Criteria andPurchasernameNotBetween(String value1, String value2) {
            addCriterion("purchasername not between", value1, value2, "purchasername");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andMaterialidIsNull() {
            addCriterion("materialid is null");
            return (Criteria) this;
        }

        public Criteria andMaterialidIsNotNull() {
            addCriterion("materialid is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialidEqualTo(Integer value) {
            addCriterion("materialid =", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotEqualTo(Integer value) {
            addCriterion("materialid <>", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidGreaterThan(Integer value) {
            addCriterion("materialid >", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidGreaterThanOrEqualTo(Integer value) {
            addCriterion("materialid >=", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidLessThan(Integer value) {
            addCriterion("materialid <", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidLessThanOrEqualTo(Integer value) {
            addCriterion("materialid <=", value, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidIn(List<Integer> values) {
            addCriterion("materialid in", values, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotIn(List<Integer> values) {
            addCriterion("materialid not in", values, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidBetween(Integer value1, Integer value2) {
            addCriterion("materialid between", value1, value2, "materialid");
            return (Criteria) this;
        }

        public Criteria andMaterialidNotBetween(Integer value1, Integer value2) {
            addCriterion("materialid not between", value1, value2, "materialid");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPartsIsNull() {
            addCriterion("parts is null");
            return (Criteria) this;
        }

        public Criteria andPartsIsNotNull() {
            addCriterion("parts is not null");
            return (Criteria) this;
        }

        public Criteria andPartsEqualTo(String value) {
            addCriterion("parts =", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotEqualTo(String value) {
            addCriterion("parts <>", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsGreaterThan(String value) {
            addCriterion("parts >", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsGreaterThanOrEqualTo(String value) {
            addCriterion("parts >=", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsLessThan(String value) {
            addCriterion("parts <", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsLessThanOrEqualTo(String value) {
            addCriterion("parts <=", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsLike(String value) {
            addCriterion("parts like", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotLike(String value) {
            addCriterion("parts not like", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsIn(List<String> values) {
            addCriterion("parts in", values, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotIn(List<String> values) {
            addCriterion("parts not in", values, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsBetween(String value1, String value2) {
            addCriterion("parts between", value1, value2, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotBetween(String value1, String value2) {
            addCriterion("parts not between", value1, value2, "parts");
            return (Criteria) this;
        }

        public Criteria andAvailablenumIsNull() {
            addCriterion("availablenum is null");
            return (Criteria) this;
        }

        public Criteria andAvailablenumIsNotNull() {
            addCriterion("availablenum is not null");
            return (Criteria) this;
        }

        public Criteria andAvailablenumEqualTo(Double value) {
            addCriterion("availablenum =", value, "availablenum");
            return (Criteria) this;
        }

        public Criteria andAvailablenumNotEqualTo(Double value) {
            addCriterion("availablenum <>", value, "availablenum");
            return (Criteria) this;
        }

        public Criteria andAvailablenumGreaterThan(Double value) {
            addCriterion("availablenum >", value, "availablenum");
            return (Criteria) this;
        }

        public Criteria andAvailablenumGreaterThanOrEqualTo(Double value) {
            addCriterion("availablenum >=", value, "availablenum");
            return (Criteria) this;
        }

        public Criteria andAvailablenumLessThan(Double value) {
            addCriterion("availablenum <", value, "availablenum");
            return (Criteria) this;
        }

        public Criteria andAvailablenumLessThanOrEqualTo(Double value) {
            addCriterion("availablenum <=", value, "availablenum");
            return (Criteria) this;
        }

        public Criteria andAvailablenumIn(List<Double> values) {
            addCriterion("availablenum in", values, "availablenum");
            return (Criteria) this;
        }

        public Criteria andAvailablenumNotIn(List<Double> values) {
            addCriterion("availablenum not in", values, "availablenum");
            return (Criteria) this;
        }

        public Criteria andAvailablenumBetween(Double value1, Double value2) {
            addCriterion("availablenum between", value1, value2, "availablenum");
            return (Criteria) this;
        }

        public Criteria andAvailablenumNotBetween(Double value1, Double value2) {
            addCriterion("availablenum not between", value1, value2, "availablenum");
            return (Criteria) this;
        }

        public Criteria andUsenumIsNull() {
            addCriterion("usenum is null");
            return (Criteria) this;
        }

        public Criteria andUsenumIsNotNull() {
            addCriterion("usenum is not null");
            return (Criteria) this;
        }

        public Criteria andUsenumEqualTo(Double value) {
            addCriterion("usenum =", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumNotEqualTo(Double value) {
            addCriterion("usenum <>", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumGreaterThan(Double value) {
            addCriterion("usenum >", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumGreaterThanOrEqualTo(Double value) {
            addCriterion("usenum >=", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumLessThan(Double value) {
            addCriterion("usenum <", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumLessThanOrEqualTo(Double value) {
            addCriterion("usenum <=", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumIn(List<Double> values) {
            addCriterion("usenum in", values, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumNotIn(List<Double> values) {
            addCriterion("usenum not in", values, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumBetween(Double value1, Double value2) {
            addCriterion("usenum between", value1, value2, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumNotBetween(Double value1, Double value2) {
            addCriterion("usenum not between", value1, value2, "usenum");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(Integer value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(Integer value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(Integer value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(Integer value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<Integer> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<Integer> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(Integer value1, Integer value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPurchaselistnoIsNull() {
            addCriterion("purchaselistno is null");
            return (Criteria) this;
        }

        public Criteria andPurchaselistnoIsNotNull() {
            addCriterion("purchaselistno is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaselistnoEqualTo(String value) {
            addCriterion("purchaselistno =", value, "purchaselistno");
            return (Criteria) this;
        }

        public Criteria andPurchaselistnoNotEqualTo(String value) {
            addCriterion("purchaselistno <>", value, "purchaselistno");
            return (Criteria) this;
        }

        public Criteria andPurchaselistnoGreaterThan(String value) {
            addCriterion("purchaselistno >", value, "purchaselistno");
            return (Criteria) this;
        }

        public Criteria andPurchaselistnoGreaterThanOrEqualTo(String value) {
            addCriterion("purchaselistno >=", value, "purchaselistno");
            return (Criteria) this;
        }

        public Criteria andPurchaselistnoLessThan(String value) {
            addCriterion("purchaselistno <", value, "purchaselistno");
            return (Criteria) this;
        }

        public Criteria andPurchaselistnoLessThanOrEqualTo(String value) {
            addCriterion("purchaselistno <=", value, "purchaselistno");
            return (Criteria) this;
        }

        public Criteria andPurchaselistnoLike(String value) {
            addCriterion("purchaselistno like", value, "purchaselistno");
            return (Criteria) this;
        }

        public Criteria andPurchaselistnoNotLike(String value) {
            addCriterion("purchaselistno not like", value, "purchaselistno");
            return (Criteria) this;
        }

        public Criteria andPurchaselistnoIn(List<String> values) {
            addCriterion("purchaselistno in", values, "purchaselistno");
            return (Criteria) this;
        }

        public Criteria andPurchaselistnoNotIn(List<String> values) {
            addCriterion("purchaselistno not in", values, "purchaselistno");
            return (Criteria) this;
        }

        public Criteria andPurchaselistnoBetween(String value1, String value2) {
            addCriterion("purchaselistno between", value1, value2, "purchaselistno");
            return (Criteria) this;
        }

        public Criteria andPurchaselistnoNotBetween(String value1, String value2) {
            addCriterion("purchaselistno not between", value1, value2, "purchaselistno");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andIssuedateIsNull() {
            addCriterion("Issuedate is null");
            return (Criteria) this;
        }

        public Criteria andIssuedateIsNotNull() {
            addCriterion("Issuedate is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedateEqualTo(String value) {
            addCriterion("Issuedate =", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotEqualTo(String value) {
            addCriterion("Issuedate <>", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateGreaterThan(String value) {
            addCriterion("Issuedate >", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateGreaterThanOrEqualTo(String value) {
            addCriterion("Issuedate >=", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateLessThan(String value) {
            addCriterion("Issuedate <", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateLessThanOrEqualTo(String value) {
            addCriterion("Issuedate <=", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateLike(String value) {
            addCriterion("Issuedate like", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotLike(String value) {
            addCriterion("Issuedate not like", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateIn(List<String> values) {
            addCriterion("Issuedate in", values, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotIn(List<String> values) {
            addCriterion("Issuedate not in", values, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateBetween(String value1, String value2) {
            addCriterion("Issuedate between", value1, value2, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotBetween(String value1, String value2) {
            addCriterion("Issuedate not between", value1, value2, "issuedate");
            return (Criteria) this;
        }

        public Criteria andPendingdateIsNull() {
            addCriterion("pendingdate is null");
            return (Criteria) this;
        }

        public Criteria andPendingdateIsNotNull() {
            addCriterion("pendingdate is not null");
            return (Criteria) this;
        }

        public Criteria andPendingdateEqualTo(String value) {
            addCriterion("pendingdate =", value, "pendingdate");
            return (Criteria) this;
        }

        public Criteria andPendingdateNotEqualTo(String value) {
            addCriterion("pendingdate <>", value, "pendingdate");
            return (Criteria) this;
        }

        public Criteria andPendingdateGreaterThan(String value) {
            addCriterion("pendingdate >", value, "pendingdate");
            return (Criteria) this;
        }

        public Criteria andPendingdateGreaterThanOrEqualTo(String value) {
            addCriterion("pendingdate >=", value, "pendingdate");
            return (Criteria) this;
        }

        public Criteria andPendingdateLessThan(String value) {
            addCriterion("pendingdate <", value, "pendingdate");
            return (Criteria) this;
        }

        public Criteria andPendingdateLessThanOrEqualTo(String value) {
            addCriterion("pendingdate <=", value, "pendingdate");
            return (Criteria) this;
        }

        public Criteria andPendingdateLike(String value) {
            addCriterion("pendingdate like", value, "pendingdate");
            return (Criteria) this;
        }

        public Criteria andPendingdateNotLike(String value) {
            addCriterion("pendingdate not like", value, "pendingdate");
            return (Criteria) this;
        }

        public Criteria andPendingdateIn(List<String> values) {
            addCriterion("pendingdate in", values, "pendingdate");
            return (Criteria) this;
        }

        public Criteria andPendingdateNotIn(List<String> values) {
            addCriterion("pendingdate not in", values, "pendingdate");
            return (Criteria) this;
        }

        public Criteria andPendingdateBetween(String value1, String value2) {
            addCriterion("pendingdate between", value1, value2, "pendingdate");
            return (Criteria) this;
        }

        public Criteria andPendingdateNotBetween(String value1, String value2) {
            addCriterion("pendingdate not between", value1, value2, "pendingdate");
            return (Criteria) this;
        }

        public Criteria andPistageIsNull() {
            addCriterion("pistage is null");
            return (Criteria) this;
        }

        public Criteria andPistageIsNotNull() {
            addCriterion("pistage is not null");
            return (Criteria) this;
        }

        public Criteria andPistageEqualTo(String value) {
            addCriterion("pistage =", value, "pistage");
            return (Criteria) this;
        }

        public Criteria andPistageNotEqualTo(String value) {
            addCriterion("pistage <>", value, "pistage");
            return (Criteria) this;
        }

        public Criteria andPistageGreaterThan(String value) {
            addCriterion("pistage >", value, "pistage");
            return (Criteria) this;
        }

        public Criteria andPistageGreaterThanOrEqualTo(String value) {
            addCriterion("pistage >=", value, "pistage");
            return (Criteria) this;
        }

        public Criteria andPistageLessThan(String value) {
            addCriterion("pistage <", value, "pistage");
            return (Criteria) this;
        }

        public Criteria andPistageLessThanOrEqualTo(String value) {
            addCriterion("pistage <=", value, "pistage");
            return (Criteria) this;
        }

        public Criteria andPistageLike(String value) {
            addCriterion("pistage like", value, "pistage");
            return (Criteria) this;
        }

        public Criteria andPistageNotLike(String value) {
            addCriterion("pistage not like", value, "pistage");
            return (Criteria) this;
        }

        public Criteria andPistageIn(List<String> values) {
            addCriterion("pistage in", values, "pistage");
            return (Criteria) this;
        }

        public Criteria andPistageNotIn(List<String> values) {
            addCriterion("pistage not in", values, "pistage");
            return (Criteria) this;
        }

        public Criteria andPistageBetween(String value1, String value2) {
            addCriterion("pistage between", value1, value2, "pistage");
            return (Criteria) this;
        }

        public Criteria andPistageNotBetween(String value1, String value2) {
            addCriterion("pistage not between", value1, value2, "pistage");
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

        public Criteria andPurchasepeopleIsNull() {
            addCriterion("purchasepeople is null");
            return (Criteria) this;
        }

        public Criteria andPurchasepeopleIsNotNull() {
            addCriterion("purchasepeople is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasepeopleEqualTo(String value) {
            addCriterion("purchasepeople =", value, "purchasepeople");
            return (Criteria) this;
        }

        public Criteria andPurchasepeopleNotEqualTo(String value) {
            addCriterion("purchasepeople <>", value, "purchasepeople");
            return (Criteria) this;
        }

        public Criteria andPurchasepeopleGreaterThan(String value) {
            addCriterion("purchasepeople >", value, "purchasepeople");
            return (Criteria) this;
        }

        public Criteria andPurchasepeopleGreaterThanOrEqualTo(String value) {
            addCriterion("purchasepeople >=", value, "purchasepeople");
            return (Criteria) this;
        }

        public Criteria andPurchasepeopleLessThan(String value) {
            addCriterion("purchasepeople <", value, "purchasepeople");
            return (Criteria) this;
        }

        public Criteria andPurchasepeopleLessThanOrEqualTo(String value) {
            addCriterion("purchasepeople <=", value, "purchasepeople");
            return (Criteria) this;
        }

        public Criteria andPurchasepeopleLike(String value) {
            addCriterion("purchasepeople like", value, "purchasepeople");
            return (Criteria) this;
        }

        public Criteria andPurchasepeopleNotLike(String value) {
            addCriterion("purchasepeople not like", value, "purchasepeople");
            return (Criteria) this;
        }

        public Criteria andPurchasepeopleIn(List<String> values) {
            addCriterion("purchasepeople in", values, "purchasepeople");
            return (Criteria) this;
        }

        public Criteria andPurchasepeopleNotIn(List<String> values) {
            addCriterion("purchasepeople not in", values, "purchasepeople");
            return (Criteria) this;
        }

        public Criteria andPurchasepeopleBetween(String value1, String value2) {
            addCriterion("purchasepeople between", value1, value2, "purchasepeople");
            return (Criteria) this;
        }

        public Criteria andPurchasepeopleNotBetween(String value1, String value2) {
            addCriterion("purchasepeople not between", value1, value2, "purchasepeople");
            return (Criteria) this;
        }

        public Criteria andPinoIsNull() {
            addCriterion("pino is null");
            return (Criteria) this;
        }

        public Criteria andPinoIsNotNull() {
            addCriterion("pino is not null");
            return (Criteria) this;
        }

        public Criteria andPinoEqualTo(String value) {
            addCriterion("pino =", value, "pino");
            return (Criteria) this;
        }

        public Criteria andPinoNotEqualTo(String value) {
            addCriterion("pino <>", value, "pino");
            return (Criteria) this;
        }

        public Criteria andPinoGreaterThan(String value) {
            addCriterion("pino >", value, "pino");
            return (Criteria) this;
        }

        public Criteria andPinoGreaterThanOrEqualTo(String value) {
            addCriterion("pino >=", value, "pino");
            return (Criteria) this;
        }

        public Criteria andPinoLessThan(String value) {
            addCriterion("pino <", value, "pino");
            return (Criteria) this;
        }

        public Criteria andPinoLessThanOrEqualTo(String value) {
            addCriterion("pino <=", value, "pino");
            return (Criteria) this;
        }

        public Criteria andPinoLike(String value) {
            addCriterion("pino like", value, "pino");
            return (Criteria) this;
        }

        public Criteria andPinoNotLike(String value) {
            addCriterion("pino not like", value, "pino");
            return (Criteria) this;
        }

        public Criteria andPinoIn(List<String> values) {
            addCriterion("pino in", values, "pino");
            return (Criteria) this;
        }

        public Criteria andPinoNotIn(List<String> values) {
            addCriterion("pino not in", values, "pino");
            return (Criteria) this;
        }

        public Criteria andPinoBetween(String value1, String value2) {
            addCriterion("pino between", value1, value2, "pino");
            return (Criteria) this;
        }

        public Criteria andPinoNotBetween(String value1, String value2) {
            addCriterion("pino not between", value1, value2, "pino");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditordateIsNull() {
            addCriterion("auditordate is null");
            return (Criteria) this;
        }

        public Criteria andAuditordateIsNotNull() {
            addCriterion("auditordate is not null");
            return (Criteria) this;
        }

        public Criteria andAuditordateEqualTo(String value) {
            addCriterion("auditordate =", value, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateNotEqualTo(String value) {
            addCriterion("auditordate <>", value, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateGreaterThan(String value) {
            addCriterion("auditordate >", value, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateGreaterThanOrEqualTo(String value) {
            addCriterion("auditordate >=", value, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateLessThan(String value) {
            addCriterion("auditordate <", value, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateLessThanOrEqualTo(String value) {
            addCriterion("auditordate <=", value, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateLike(String value) {
            addCriterion("auditordate like", value, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateNotLike(String value) {
            addCriterion("auditordate not like", value, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateIn(List<String> values) {
            addCriterion("auditordate in", values, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateNotIn(List<String> values) {
            addCriterion("auditordate not in", values, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateBetween(String value1, String value2) {
            addCriterion("auditordate between", value1, value2, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateNotBetween(String value1, String value2) {
            addCriterion("auditordate not between", value1, value2, "auditordate");
            return (Criteria) this;
        }

        public Criteria andPinumIsNull() {
            addCriterion("pinum is null");
            return (Criteria) this;
        }

        public Criteria andPinumIsNotNull() {
            addCriterion("pinum is not null");
            return (Criteria) this;
        }

        public Criteria andPinumEqualTo(Double value) {
            addCriterion("pinum =", value, "pinum");
            return (Criteria) this;
        }

        public Criteria andPinumNotEqualTo(Double value) {
            addCriterion("pinum <>", value, "pinum");
            return (Criteria) this;
        }

        public Criteria andPinumGreaterThan(Double value) {
            addCriterion("pinum >", value, "pinum");
            return (Criteria) this;
        }

        public Criteria andPinumGreaterThanOrEqualTo(Double value) {
            addCriterion("pinum >=", value, "pinum");
            return (Criteria) this;
        }

        public Criteria andPinumLessThan(Double value) {
            addCriterion("pinum <", value, "pinum");
            return (Criteria) this;
        }

        public Criteria andPinumLessThanOrEqualTo(Double value) {
            addCriterion("pinum <=", value, "pinum");
            return (Criteria) this;
        }

        public Criteria andPinumIn(List<Double> values) {
            addCriterion("pinum in", values, "pinum");
            return (Criteria) this;
        }

        public Criteria andPinumNotIn(List<Double> values) {
            addCriterion("pinum not in", values, "pinum");
            return (Criteria) this;
        }

        public Criteria andPinumBetween(Double value1, Double value2) {
            addCriterion("pinum between", value1, value2, "pinum");
            return (Criteria) this;
        }

        public Criteria andPinumNotBetween(Double value1, Double value2) {
            addCriterion("pinum not between", value1, value2, "pinum");
            return (Criteria) this;
        }

        public Criteria andApplynumIsNull() {
            addCriterion("applynum is null");
            return (Criteria) this;
        }

        public Criteria andApplynumIsNotNull() {
            addCriterion("applynum is not null");
            return (Criteria) this;
        }

        public Criteria andApplynumEqualTo(Double value) {
            addCriterion("applynum =", value, "applynum");
            return (Criteria) this;
        }

        public Criteria andApplynumNotEqualTo(Double value) {
            addCriterion("applynum <>", value, "applynum");
            return (Criteria) this;
        }

        public Criteria andApplynumGreaterThan(Double value) {
            addCriterion("applynum >", value, "applynum");
            return (Criteria) this;
        }

        public Criteria andApplynumGreaterThanOrEqualTo(Double value) {
            addCriterion("applynum >=", value, "applynum");
            return (Criteria) this;
        }

        public Criteria andApplynumLessThan(Double value) {
            addCriterion("applynum <", value, "applynum");
            return (Criteria) this;
        }

        public Criteria andApplynumLessThanOrEqualTo(Double value) {
            addCriterion("applynum <=", value, "applynum");
            return (Criteria) this;
        }

        public Criteria andApplynumIn(List<Double> values) {
            addCriterion("applynum in", values, "applynum");
            return (Criteria) this;
        }

        public Criteria andApplynumNotIn(List<Double> values) {
            addCriterion("applynum not in", values, "applynum");
            return (Criteria) this;
        }

        public Criteria andApplynumBetween(Double value1, Double value2) {
            addCriterion("applynum between", value1, value2, "applynum");
            return (Criteria) this;
        }

        public Criteria andApplynumNotBetween(Double value1, Double value2) {
            addCriterion("applynum not between", value1, value2, "applynum");
            return (Criteria) this;
        }

        public Criteria andWarehousingIsNull() {
            addCriterion("warehousing is null");
            return (Criteria) this;
        }

        public Criteria andWarehousingIsNotNull() {
            addCriterion("warehousing is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousingEqualTo(String value) {
            addCriterion("warehousing =", value, "warehousing");
            return (Criteria) this;
        }

        public Criteria andWarehousingNotEqualTo(String value) {
            addCriterion("warehousing <>", value, "warehousing");
            return (Criteria) this;
        }

        public Criteria andWarehousingGreaterThan(String value) {
            addCriterion("warehousing >", value, "warehousing");
            return (Criteria) this;
        }

        public Criteria andWarehousingGreaterThanOrEqualTo(String value) {
            addCriterion("warehousing >=", value, "warehousing");
            return (Criteria) this;
        }

        public Criteria andWarehousingLessThan(String value) {
            addCriterion("warehousing <", value, "warehousing");
            return (Criteria) this;
        }

        public Criteria andWarehousingLessThanOrEqualTo(String value) {
            addCriterion("warehousing <=", value, "warehousing");
            return (Criteria) this;
        }

        public Criteria andWarehousingLike(String value) {
            addCriterion("warehousing like", value, "warehousing");
            return (Criteria) this;
        }

        public Criteria andWarehousingNotLike(String value) {
            addCriterion("warehousing not like", value, "warehousing");
            return (Criteria) this;
        }

        public Criteria andWarehousingIn(List<String> values) {
            addCriterion("warehousing in", values, "warehousing");
            return (Criteria) this;
        }

        public Criteria andWarehousingNotIn(List<String> values) {
            addCriterion("warehousing not in", values, "warehousing");
            return (Criteria) this;
        }

        public Criteria andWarehousingBetween(String value1, String value2) {
            addCriterion("warehousing between", value1, value2, "warehousing");
            return (Criteria) this;
        }

        public Criteria andWarehousingNotBetween(String value1, String value2) {
            addCriterion("warehousing not between", value1, value2, "warehousing");
            return (Criteria) this;
        }

        public Criteria andStoragenumIsNull() {
            addCriterion("storagenum is null");
            return (Criteria) this;
        }

        public Criteria andStoragenumIsNotNull() {
            addCriterion("storagenum is not null");
            return (Criteria) this;
        }

        public Criteria andStoragenumEqualTo(Double value) {
            addCriterion("storagenum =", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumNotEqualTo(Double value) {
            addCriterion("storagenum <>", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumGreaterThan(Double value) {
            addCriterion("storagenum >", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumGreaterThanOrEqualTo(Double value) {
            addCriterion("storagenum >=", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumLessThan(Double value) {
            addCriterion("storagenum <", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumLessThanOrEqualTo(Double value) {
            addCriterion("storagenum <=", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumIn(List<Double> values) {
            addCriterion("storagenum in", values, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumNotIn(List<Double> values) {
            addCriterion("storagenum not in", values, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumBetween(Double value1, Double value2) {
            addCriterion("storagenum between", value1, value2, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumNotBetween(Double value1, Double value2) {
            addCriterion("storagenum not between", value1, value2, "storagenum");
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

        public Criteria andSettlementnoIsNull() {
            addCriterion("settlementno is null");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIsNotNull() {
            addCriterion("settlementno is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementnoEqualTo(String value) {
            addCriterion("settlementno =", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotEqualTo(String value) {
            addCriterion("settlementno <>", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoGreaterThan(String value) {
            addCriterion("settlementno >", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoGreaterThanOrEqualTo(String value) {
            addCriterion("settlementno >=", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLessThan(String value) {
            addCriterion("settlementno <", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLessThanOrEqualTo(String value) {
            addCriterion("settlementno <=", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoLike(String value) {
            addCriterion("settlementno like", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotLike(String value) {
            addCriterion("settlementno not like", value, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoIn(List<String> values) {
            addCriterion("settlementno in", values, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotIn(List<String> values) {
            addCriterion("settlementno not in", values, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoBetween(String value1, String value2) {
            addCriterion("settlementno between", value1, value2, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnoNotBetween(String value1, String value2) {
            addCriterion("settlementno not between", value1, value2, "settlementno");
            return (Criteria) this;
        }

        public Criteria andSettlementnumIsNull() {
            addCriterion("settlementnum is null");
            return (Criteria) this;
        }

        public Criteria andSettlementnumIsNotNull() {
            addCriterion("settlementnum is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementnumEqualTo(Double value) {
            addCriterion("settlementnum =", value, "settlementnum");
            return (Criteria) this;
        }

        public Criteria andSettlementnumNotEqualTo(Double value) {
            addCriterion("settlementnum <>", value, "settlementnum");
            return (Criteria) this;
        }

        public Criteria andSettlementnumGreaterThan(Double value) {
            addCriterion("settlementnum >", value, "settlementnum");
            return (Criteria) this;
        }

        public Criteria andSettlementnumGreaterThanOrEqualTo(Double value) {
            addCriterion("settlementnum >=", value, "settlementnum");
            return (Criteria) this;
        }

        public Criteria andSettlementnumLessThan(Double value) {
            addCriterion("settlementnum <", value, "settlementnum");
            return (Criteria) this;
        }

        public Criteria andSettlementnumLessThanOrEqualTo(Double value) {
            addCriterion("settlementnum <=", value, "settlementnum");
            return (Criteria) this;
        }

        public Criteria andSettlementnumIn(List<Double> values) {
            addCriterion("settlementnum in", values, "settlementnum");
            return (Criteria) this;
        }

        public Criteria andSettlementnumNotIn(List<Double> values) {
            addCriterion("settlementnum not in", values, "settlementnum");
            return (Criteria) this;
        }

        public Criteria andSettlementnumBetween(Double value1, Double value2) {
            addCriterion("settlementnum between", value1, value2, "settlementnum");
            return (Criteria) this;
        }

        public Criteria andSettlementnumNotBetween(Double value1, Double value2) {
            addCriterion("settlementnum not between", value1, value2, "settlementnum");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceIsNull() {
            addCriterion("settlementprice is null");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceIsNotNull() {
            addCriterion("settlementprice is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceEqualTo(Double value) {
            addCriterion("settlementprice =", value, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceNotEqualTo(Double value) {
            addCriterion("settlementprice <>", value, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceGreaterThan(Double value) {
            addCriterion("settlementprice >", value, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("settlementprice >=", value, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceLessThan(Double value) {
            addCriterion("settlementprice <", value, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceLessThanOrEqualTo(Double value) {
            addCriterion("settlementprice <=", value, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceIn(List<Double> values) {
            addCriterion("settlementprice in", values, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceNotIn(List<Double> values) {
            addCriterion("settlementprice not in", values, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceBetween(Double value1, Double value2) {
            addCriterion("settlementprice between", value1, value2, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceNotBetween(Double value1, Double value2) {
            addCriterion("settlementprice not between", value1, value2, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyIsNull() {
            addCriterion("settlementmoney is null");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyIsNotNull() {
            addCriterion("settlementmoney is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyEqualTo(Double value) {
            addCriterion("settlementmoney =", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyNotEqualTo(Double value) {
            addCriterion("settlementmoney <>", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyGreaterThan(Double value) {
            addCriterion("settlementmoney >", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("settlementmoney >=", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyLessThan(Double value) {
            addCriterion("settlementmoney <", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyLessThanOrEqualTo(Double value) {
            addCriterion("settlementmoney <=", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyIn(List<Double> values) {
            addCriterion("settlementmoney in", values, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyNotIn(List<Double> values) {
            addCriterion("settlementmoney not in", values, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyBetween(Double value1, Double value2) {
            addCriterion("settlementmoney between", value1, value2, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyNotBetween(Double value1, Double value2) {
            addCriterion("settlementmoney not between", value1, value2, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andReconciliationsnoIsNull() {
            addCriterion("reconciliationsno is null");
            return (Criteria) this;
        }

        public Criteria andReconciliationsnoIsNotNull() {
            addCriterion("reconciliationsno is not null");
            return (Criteria) this;
        }

        public Criteria andReconciliationsnoEqualTo(String value) {
            addCriterion("reconciliationsno =", value, "reconciliationsno");
            return (Criteria) this;
        }

        public Criteria andReconciliationsnoNotEqualTo(String value) {
            addCriterion("reconciliationsno <>", value, "reconciliationsno");
            return (Criteria) this;
        }

        public Criteria andReconciliationsnoGreaterThan(String value) {
            addCriterion("reconciliationsno >", value, "reconciliationsno");
            return (Criteria) this;
        }

        public Criteria andReconciliationsnoGreaterThanOrEqualTo(String value) {
            addCriterion("reconciliationsno >=", value, "reconciliationsno");
            return (Criteria) this;
        }

        public Criteria andReconciliationsnoLessThan(String value) {
            addCriterion("reconciliationsno <", value, "reconciliationsno");
            return (Criteria) this;
        }

        public Criteria andReconciliationsnoLessThanOrEqualTo(String value) {
            addCriterion("reconciliationsno <=", value, "reconciliationsno");
            return (Criteria) this;
        }

        public Criteria andReconciliationsnoLike(String value) {
            addCriterion("reconciliationsno like", value, "reconciliationsno");
            return (Criteria) this;
        }

        public Criteria andReconciliationsnoNotLike(String value) {
            addCriterion("reconciliationsno not like", value, "reconciliationsno");
            return (Criteria) this;
        }

        public Criteria andReconciliationsnoIn(List<String> values) {
            addCriterion("reconciliationsno in", values, "reconciliationsno");
            return (Criteria) this;
        }

        public Criteria andReconciliationsnoNotIn(List<String> values) {
            addCriterion("reconciliationsno not in", values, "reconciliationsno");
            return (Criteria) this;
        }

        public Criteria andReconciliationsnoBetween(String value1, String value2) {
            addCriterion("reconciliationsno between", value1, value2, "reconciliationsno");
            return (Criteria) this;
        }

        public Criteria andReconciliationsnoNotBetween(String value1, String value2) {
            addCriterion("reconciliationsno not between", value1, value2, "reconciliationsno");
            return (Criteria) this;
        }

        public Criteria andReconciliationstateIsNull() {
            addCriterion("reconciliationstate is null");
            return (Criteria) this;
        }

        public Criteria andReconciliationstateIsNotNull() {
            addCriterion("reconciliationstate is not null");
            return (Criteria) this;
        }

        public Criteria andReconciliationstateEqualTo(Integer value) {
            addCriterion("reconciliationstate =", value, "reconciliationstate");
            return (Criteria) this;
        }

        public Criteria andReconciliationstateNotEqualTo(Integer value) {
            addCriterion("reconciliationstate <>", value, "reconciliationstate");
            return (Criteria) this;
        }

        public Criteria andReconciliationstateGreaterThan(Integer value) {
            addCriterion("reconciliationstate >", value, "reconciliationstate");
            return (Criteria) this;
        }

        public Criteria andReconciliationstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("reconciliationstate >=", value, "reconciliationstate");
            return (Criteria) this;
        }

        public Criteria andReconciliationstateLessThan(Integer value) {
            addCriterion("reconciliationstate <", value, "reconciliationstate");
            return (Criteria) this;
        }

        public Criteria andReconciliationstateLessThanOrEqualTo(Integer value) {
            addCriterion("reconciliationstate <=", value, "reconciliationstate");
            return (Criteria) this;
        }

        public Criteria andReconciliationstateIn(List<Integer> values) {
            addCriterion("reconciliationstate in", values, "reconciliationstate");
            return (Criteria) this;
        }

        public Criteria andReconciliationstateNotIn(List<Integer> values) {
            addCriterion("reconciliationstate not in", values, "reconciliationstate");
            return (Criteria) this;
        }

        public Criteria andReconciliationstateBetween(Integer value1, Integer value2) {
            addCriterion("reconciliationstate between", value1, value2, "reconciliationstate");
            return (Criteria) this;
        }

        public Criteria andReconciliationstateNotBetween(Integer value1, Integer value2) {
            addCriterion("reconciliationstate not between", value1, value2, "reconciliationstate");
            return (Criteria) this;
        }

        public Criteria andReconciliationsdateIsNull() {
            addCriterion("reconciliationsdate is null");
            return (Criteria) this;
        }

        public Criteria andReconciliationsdateIsNotNull() {
            addCriterion("reconciliationsdate is not null");
            return (Criteria) this;
        }

        public Criteria andReconciliationsdateEqualTo(String value) {
            addCriterion("reconciliationsdate =", value, "reconciliationsdate");
            return (Criteria) this;
        }

        public Criteria andReconciliationsdateNotEqualTo(String value) {
            addCriterion("reconciliationsdate <>", value, "reconciliationsdate");
            return (Criteria) this;
        }

        public Criteria andReconciliationsdateGreaterThan(String value) {
            addCriterion("reconciliationsdate >", value, "reconciliationsdate");
            return (Criteria) this;
        }

        public Criteria andReconciliationsdateGreaterThanOrEqualTo(String value) {
            addCriterion("reconciliationsdate >=", value, "reconciliationsdate");
            return (Criteria) this;
        }

        public Criteria andReconciliationsdateLessThan(String value) {
            addCriterion("reconciliationsdate <", value, "reconciliationsdate");
            return (Criteria) this;
        }

        public Criteria andReconciliationsdateLessThanOrEqualTo(String value) {
            addCriterion("reconciliationsdate <=", value, "reconciliationsdate");
            return (Criteria) this;
        }

        public Criteria andReconciliationsdateLike(String value) {
            addCriterion("reconciliationsdate like", value, "reconciliationsdate");
            return (Criteria) this;
        }

        public Criteria andReconciliationsdateNotLike(String value) {
            addCriterion("reconciliationsdate not like", value, "reconciliationsdate");
            return (Criteria) this;
        }

        public Criteria andReconciliationsdateIn(List<String> values) {
            addCriterion("reconciliationsdate in", values, "reconciliationsdate");
            return (Criteria) this;
        }

        public Criteria andReconciliationsdateNotIn(List<String> values) {
            addCriterion("reconciliationsdate not in", values, "reconciliationsdate");
            return (Criteria) this;
        }

        public Criteria andReconciliationsdateBetween(String value1, String value2) {
            addCriterion("reconciliationsdate between", value1, value2, "reconciliationsdate");
            return (Criteria) this;
        }

        public Criteria andReconciliationsdateNotBetween(String value1, String value2) {
            addCriterion("reconciliationsdate not between", value1, value2, "reconciliationsdate");
            return (Criteria) this;
        }

        public Criteria andOutnumIsNull() {
            addCriterion("outnum is null");
            return (Criteria) this;
        }

        public Criteria andOutnumIsNotNull() {
            addCriterion("outnum is not null");
            return (Criteria) this;
        }

        public Criteria andOutnumEqualTo(Double value) {
            addCriterion("outnum =", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumNotEqualTo(Double value) {
            addCriterion("outnum <>", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumGreaterThan(Double value) {
            addCriterion("outnum >", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumGreaterThanOrEqualTo(Double value) {
            addCriterion("outnum >=", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumLessThan(Double value) {
            addCriterion("outnum <", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumLessThanOrEqualTo(Double value) {
            addCriterion("outnum <=", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumIn(List<Double> values) {
            addCriterion("outnum in", values, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumNotIn(List<Double> values) {
            addCriterion("outnum not in", values, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumBetween(Double value1, Double value2) {
            addCriterion("outnum between", value1, value2, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumNotBetween(Double value1, Double value2) {
            addCriterion("outnum not between", value1, value2, "outnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumIsNull() {
            addCriterion("surplusnum is null");
            return (Criteria) this;
        }

        public Criteria andSurplusnumIsNotNull() {
            addCriterion("surplusnum is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusnumEqualTo(Double value) {
            addCriterion("surplusnum =", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumNotEqualTo(Double value) {
            addCriterion("surplusnum <>", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumGreaterThan(Double value) {
            addCriterion("surplusnum >", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumGreaterThanOrEqualTo(Double value) {
            addCriterion("surplusnum >=", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumLessThan(Double value) {
            addCriterion("surplusnum <", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumLessThanOrEqualTo(Double value) {
            addCriterion("surplusnum <=", value, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumIn(List<Double> values) {
            addCriterion("surplusnum in", values, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumNotIn(List<Double> values) {
            addCriterion("surplusnum not in", values, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumBetween(Double value1, Double value2) {
            addCriterion("surplusnum between", value1, value2, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andSurplusnumNotBetween(Double value1, Double value2) {
            addCriterion("surplusnum not between", value1, value2, "surplusnum");
            return (Criteria) this;
        }

        public Criteria andUnlockednumIsNull() {
            addCriterion("unlockednum is null");
            return (Criteria) this;
        }

        public Criteria andUnlockednumIsNotNull() {
            addCriterion("unlockednum is not null");
            return (Criteria) this;
        }

        public Criteria andUnlockednumEqualTo(Double value) {
            addCriterion("unlockednum =", value, "unlockednum");
            return (Criteria) this;
        }

        public Criteria andUnlockednumNotEqualTo(Double value) {
            addCriterion("unlockednum <>", value, "unlockednum");
            return (Criteria) this;
        }

        public Criteria andUnlockednumGreaterThan(Double value) {
            addCriterion("unlockednum >", value, "unlockednum");
            return (Criteria) this;
        }

        public Criteria andUnlockednumGreaterThanOrEqualTo(Double value) {
            addCriterion("unlockednum >=", value, "unlockednum");
            return (Criteria) this;
        }

        public Criteria andUnlockednumLessThan(Double value) {
            addCriterion("unlockednum <", value, "unlockednum");
            return (Criteria) this;
        }

        public Criteria andUnlockednumLessThanOrEqualTo(Double value) {
            addCriterion("unlockednum <=", value, "unlockednum");
            return (Criteria) this;
        }

        public Criteria andUnlockednumIn(List<Double> values) {
            addCriterion("unlockednum in", values, "unlockednum");
            return (Criteria) this;
        }

        public Criteria andUnlockednumNotIn(List<Double> values) {
            addCriterion("unlockednum not in", values, "unlockednum");
            return (Criteria) this;
        }

        public Criteria andUnlockednumBetween(Double value1, Double value2) {
            addCriterion("unlockednum between", value1, value2, "unlockednum");
            return (Criteria) this;
        }

        public Criteria andUnlockednumNotBetween(Double value1, Double value2) {
            addCriterion("unlockednum not between", value1, value2, "unlockednum");
            return (Criteria) this;
        }

        public Criteria andInnumIsNull() {
            addCriterion("innum is null");
            return (Criteria) this;
        }

        public Criteria andInnumIsNotNull() {
            addCriterion("innum is not null");
            return (Criteria) this;
        }

        public Criteria andInnumEqualTo(Double value) {
            addCriterion("innum =", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumNotEqualTo(Double value) {
            addCriterion("innum <>", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumGreaterThan(Double value) {
            addCriterion("innum >", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumGreaterThanOrEqualTo(Double value) {
            addCriterion("innum >=", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumLessThan(Double value) {
            addCriterion("innum <", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumLessThanOrEqualTo(Double value) {
            addCriterion("innum <=", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumIn(List<Double> values) {
            addCriterion("innum in", values, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumNotIn(List<Double> values) {
            addCriterion("innum not in", values, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumBetween(Double value1, Double value2) {
            addCriterion("innum between", value1, value2, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumNotBetween(Double value1, Double value2) {
            addCriterion("innum not between", value1, value2, "innum");
            return (Criteria) this;
        }

        public Criteria andLockingnumIsNull() {
            addCriterion("lockingnum is null");
            return (Criteria) this;
        }

        public Criteria andLockingnumIsNotNull() {
            addCriterion("lockingnum is not null");
            return (Criteria) this;
        }

        public Criteria andLockingnumEqualTo(Double value) {
            addCriterion("lockingnum =", value, "lockingnum");
            return (Criteria) this;
        }

        public Criteria andLockingnumNotEqualTo(Double value) {
            addCriterion("lockingnum <>", value, "lockingnum");
            return (Criteria) this;
        }

        public Criteria andLockingnumGreaterThan(Double value) {
            addCriterion("lockingnum >", value, "lockingnum");
            return (Criteria) this;
        }

        public Criteria andLockingnumGreaterThanOrEqualTo(Double value) {
            addCriterion("lockingnum >=", value, "lockingnum");
            return (Criteria) this;
        }

        public Criteria andLockingnumLessThan(Double value) {
            addCriterion("lockingnum <", value, "lockingnum");
            return (Criteria) this;
        }

        public Criteria andLockingnumLessThanOrEqualTo(Double value) {
            addCriterion("lockingnum <=", value, "lockingnum");
            return (Criteria) this;
        }

        public Criteria andLockingnumIn(List<Double> values) {
            addCriterion("lockingnum in", values, "lockingnum");
            return (Criteria) this;
        }

        public Criteria andLockingnumNotIn(List<Double> values) {
            addCriterion("lockingnum not in", values, "lockingnum");
            return (Criteria) this;
        }

        public Criteria andLockingnumBetween(Double value1, Double value2) {
            addCriterion("lockingnum between", value1, value2, "lockingnum");
            return (Criteria) this;
        }

        public Criteria andLockingnumNotBetween(Double value1, Double value2) {
            addCriterion("lockingnum not between", value1, value2, "lockingnum");
            return (Criteria) this;
        }

        public Criteria andSettlementstateIsNull() {
            addCriterion("settlementstate is null");
            return (Criteria) this;
        }

        public Criteria andSettlementstateIsNotNull() {
            addCriterion("settlementstate is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementstateEqualTo(Integer value) {
            addCriterion("settlementstate =", value, "settlementstate");
            return (Criteria) this;
        }

        public Criteria andSettlementstateNotEqualTo(Integer value) {
            addCriterion("settlementstate <>", value, "settlementstate");
            return (Criteria) this;
        }

        public Criteria andSettlementstateGreaterThan(Integer value) {
            addCriterion("settlementstate >", value, "settlementstate");
            return (Criteria) this;
        }

        public Criteria andSettlementstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("settlementstate >=", value, "settlementstate");
            return (Criteria) this;
        }

        public Criteria andSettlementstateLessThan(Integer value) {
            addCriterion("settlementstate <", value, "settlementstate");
            return (Criteria) this;
        }

        public Criteria andSettlementstateLessThanOrEqualTo(Integer value) {
            addCriterion("settlementstate <=", value, "settlementstate");
            return (Criteria) this;
        }

        public Criteria andSettlementstateIn(List<Integer> values) {
            addCriterion("settlementstate in", values, "settlementstate");
            return (Criteria) this;
        }

        public Criteria andSettlementstateNotIn(List<Integer> values) {
            addCriterion("settlementstate not in", values, "settlementstate");
            return (Criteria) this;
        }

        public Criteria andSettlementstateBetween(Integer value1, Integer value2) {
            addCriterion("settlementstate between", value1, value2, "settlementstate");
            return (Criteria) this;
        }

        public Criteria andSettlementstateNotBetween(Integer value1, Integer value2) {
            addCriterion("settlementstate not between", value1, value2, "settlementstate");
            return (Criteria) this;
        }

        public Criteria andFinancepeopleIsNull() {
            addCriterion("financepeople is null");
            return (Criteria) this;
        }

        public Criteria andFinancepeopleIsNotNull() {
            addCriterion("financepeople is not null");
            return (Criteria) this;
        }

        public Criteria andFinancepeopleEqualTo(String value) {
            addCriterion("financepeople =", value, "financepeople");
            return (Criteria) this;
        }

        public Criteria andFinancepeopleNotEqualTo(String value) {
            addCriterion("financepeople <>", value, "financepeople");
            return (Criteria) this;
        }

        public Criteria andFinancepeopleGreaterThan(String value) {
            addCriterion("financepeople >", value, "financepeople");
            return (Criteria) this;
        }

        public Criteria andFinancepeopleGreaterThanOrEqualTo(String value) {
            addCriterion("financepeople >=", value, "financepeople");
            return (Criteria) this;
        }

        public Criteria andFinancepeopleLessThan(String value) {
            addCriterion("financepeople <", value, "financepeople");
            return (Criteria) this;
        }

        public Criteria andFinancepeopleLessThanOrEqualTo(String value) {
            addCriterion("financepeople <=", value, "financepeople");
            return (Criteria) this;
        }

        public Criteria andFinancepeopleLike(String value) {
            addCriterion("financepeople like", value, "financepeople");
            return (Criteria) this;
        }

        public Criteria andFinancepeopleNotLike(String value) {
            addCriterion("financepeople not like", value, "financepeople");
            return (Criteria) this;
        }

        public Criteria andFinancepeopleIn(List<String> values) {
            addCriterion("financepeople in", values, "financepeople");
            return (Criteria) this;
        }

        public Criteria andFinancepeopleNotIn(List<String> values) {
            addCriterion("financepeople not in", values, "financepeople");
            return (Criteria) this;
        }

        public Criteria andFinancepeopleBetween(String value1, String value2) {
            addCriterion("financepeople between", value1, value2, "financepeople");
            return (Criteria) this;
        }

        public Criteria andFinancepeopleNotBetween(String value1, String value2) {
            addCriterion("financepeople not between", value1, value2, "financepeople");
            return (Criteria) this;
        }

        public Criteria andFinancestateIsNull() {
            addCriterion("financestate is null");
            return (Criteria) this;
        }

        public Criteria andFinancestateIsNotNull() {
            addCriterion("financestate is not null");
            return (Criteria) this;
        }

        public Criteria andFinancestateEqualTo(Integer value) {
            addCriterion("financestate =", value, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateNotEqualTo(Integer value) {
            addCriterion("financestate <>", value, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateGreaterThan(Integer value) {
            addCriterion("financestate >", value, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("financestate >=", value, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateLessThan(Integer value) {
            addCriterion("financestate <", value, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateLessThanOrEqualTo(Integer value) {
            addCriterion("financestate <=", value, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateIn(List<Integer> values) {
            addCriterion("financestate in", values, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateNotIn(List<Integer> values) {
            addCriterion("financestate not in", values, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateBetween(Integer value1, Integer value2) {
            addCriterion("financestate between", value1, value2, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateNotBetween(Integer value1, Integer value2) {
            addCriterion("financestate not between", value1, value2, "financestate");
            return (Criteria) this;
        }

        public Criteria andFnancedateIsNull() {
            addCriterion("fnancedate is null");
            return (Criteria) this;
        }

        public Criteria andFnancedateIsNotNull() {
            addCriterion("fnancedate is not null");
            return (Criteria) this;
        }

        public Criteria andFnancedateEqualTo(String value) {
            addCriterion("fnancedate =", value, "fnancedate");
            return (Criteria) this;
        }

        public Criteria andFnancedateNotEqualTo(String value) {
            addCriterion("fnancedate <>", value, "fnancedate");
            return (Criteria) this;
        }

        public Criteria andFnancedateGreaterThan(String value) {
            addCriterion("fnancedate >", value, "fnancedate");
            return (Criteria) this;
        }

        public Criteria andFnancedateGreaterThanOrEqualTo(String value) {
            addCriterion("fnancedate >=", value, "fnancedate");
            return (Criteria) this;
        }

        public Criteria andFnancedateLessThan(String value) {
            addCriterion("fnancedate <", value, "fnancedate");
            return (Criteria) this;
        }

        public Criteria andFnancedateLessThanOrEqualTo(String value) {
            addCriterion("fnancedate <=", value, "fnancedate");
            return (Criteria) this;
        }

        public Criteria andFnancedateLike(String value) {
            addCriterion("fnancedate like", value, "fnancedate");
            return (Criteria) this;
        }

        public Criteria andFnancedateNotLike(String value) {
            addCriterion("fnancedate not like", value, "fnancedate");
            return (Criteria) this;
        }

        public Criteria andFnancedateIn(List<String> values) {
            addCriterion("fnancedate in", values, "fnancedate");
            return (Criteria) this;
        }

        public Criteria andFnancedateNotIn(List<String> values) {
            addCriterion("fnancedate not in", values, "fnancedate");
            return (Criteria) this;
        }

        public Criteria andFnancedateBetween(String value1, String value2) {
            addCriterion("fnancedate between", value1, value2, "fnancedate");
            return (Criteria) this;
        }

        public Criteria andFnancedateNotBetween(String value1, String value2) {
            addCriterion("fnancedate not between", value1, value2, "fnancedate");
            return (Criteria) this;
        }

        public Criteria andOccupynumIsNull() {
            addCriterion("occupynum is null");
            return (Criteria) this;
        }

        public Criteria andOccupynumIsNotNull() {
            addCriterion("occupynum is not null");
            return (Criteria) this;
        }

        public Criteria andOccupynumEqualTo(Double value) {
            addCriterion("occupynum =", value, "occupynum");
            return (Criteria) this;
        }

        public Criteria andOccupynumNotEqualTo(Double value) {
            addCriterion("occupynum <>", value, "occupynum");
            return (Criteria) this;
        }

        public Criteria andOccupynumGreaterThan(Double value) {
            addCriterion("occupynum >", value, "occupynum");
            return (Criteria) this;
        }

        public Criteria andOccupynumGreaterThanOrEqualTo(Double value) {
            addCriterion("occupynum >=", value, "occupynum");
            return (Criteria) this;
        }

        public Criteria andOccupynumLessThan(Double value) {
            addCriterion("occupynum <", value, "occupynum");
            return (Criteria) this;
        }

        public Criteria andOccupynumLessThanOrEqualTo(Double value) {
            addCriterion("occupynum <=", value, "occupynum");
            return (Criteria) this;
        }

        public Criteria andOccupynumIn(List<Double> values) {
            addCriterion("occupynum in", values, "occupynum");
            return (Criteria) this;
        }

        public Criteria andOccupynumNotIn(List<Double> values) {
            addCriterion("occupynum not in", values, "occupynum");
            return (Criteria) this;
        }

        public Criteria andOccupynumBetween(Double value1, Double value2) {
            addCriterion("occupynum between", value1, value2, "occupynum");
            return (Criteria) this;
        }

        public Criteria andOccupynumNotBetween(Double value1, Double value2) {
            addCriterion("occupynum not between", value1, value2, "occupynum");
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