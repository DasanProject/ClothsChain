package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_pickingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_pickingExample() {
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

        public Criteria andPickinidIsNull() {
            addCriterion("pickinid is null");
            return (Criteria) this;
        }

        public Criteria andPickinidIsNotNull() {
            addCriterion("pickinid is not null");
            return (Criteria) this;
        }

        public Criteria andPickinidEqualTo(Integer value) {
            addCriterion("pickinid =", value, "pickinid");
            return (Criteria) this;
        }

        public Criteria andPickinidNotEqualTo(Integer value) {
            addCriterion("pickinid <>", value, "pickinid");
            return (Criteria) this;
        }

        public Criteria andPickinidGreaterThan(Integer value) {
            addCriterion("pickinid >", value, "pickinid");
            return (Criteria) this;
        }

        public Criteria andPickinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pickinid >=", value, "pickinid");
            return (Criteria) this;
        }

        public Criteria andPickinidLessThan(Integer value) {
            addCriterion("pickinid <", value, "pickinid");
            return (Criteria) this;
        }

        public Criteria andPickinidLessThanOrEqualTo(Integer value) {
            addCriterion("pickinid <=", value, "pickinid");
            return (Criteria) this;
        }

        public Criteria andPickinidIn(List<Integer> values) {
            addCriterion("pickinid in", values, "pickinid");
            return (Criteria) this;
        }

        public Criteria andPickinidNotIn(List<Integer> values) {
            addCriterion("pickinid not in", values, "pickinid");
            return (Criteria) this;
        }

        public Criteria andPickinidBetween(Integer value1, Integer value2) {
            addCriterion("pickinid between", value1, value2, "pickinid");
            return (Criteria) this;
        }

        public Criteria andPickinidNotBetween(Integer value1, Integer value2) {
            addCriterion("pickinid not between", value1, value2, "pickinid");
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

        public Criteria andPickingnoIsNull() {
            addCriterion("pickingno is null");
            return (Criteria) this;
        }

        public Criteria andPickingnoIsNotNull() {
            addCriterion("pickingno is not null");
            return (Criteria) this;
        }

        public Criteria andPickingnoEqualTo(String value) {
            addCriterion("pickingno =", value, "pickingno");
            return (Criteria) this;
        }

        public Criteria andPickingnoNotEqualTo(String value) {
            addCriterion("pickingno <>", value, "pickingno");
            return (Criteria) this;
        }

        public Criteria andPickingnoGreaterThan(String value) {
            addCriterion("pickingno >", value, "pickingno");
            return (Criteria) this;
        }

        public Criteria andPickingnoGreaterThanOrEqualTo(String value) {
            addCriterion("pickingno >=", value, "pickingno");
            return (Criteria) this;
        }

        public Criteria andPickingnoLessThan(String value) {
            addCriterion("pickingno <", value, "pickingno");
            return (Criteria) this;
        }

        public Criteria andPickingnoLessThanOrEqualTo(String value) {
            addCriterion("pickingno <=", value, "pickingno");
            return (Criteria) this;
        }

        public Criteria andPickingnoLike(String value) {
            addCriterion("pickingno like", value, "pickingno");
            return (Criteria) this;
        }

        public Criteria andPickingnoNotLike(String value) {
            addCriterion("pickingno not like", value, "pickingno");
            return (Criteria) this;
        }

        public Criteria andPickingnoIn(List<String> values) {
            addCriterion("pickingno in", values, "pickingno");
            return (Criteria) this;
        }

        public Criteria andPickingnoNotIn(List<String> values) {
            addCriterion("pickingno not in", values, "pickingno");
            return (Criteria) this;
        }

        public Criteria andPickingnoBetween(String value1, String value2) {
            addCriterion("pickingno between", value1, value2, "pickingno");
            return (Criteria) this;
        }

        public Criteria andPickingnoNotBetween(String value1, String value2) {
            addCriterion("pickingno not between", value1, value2, "pickingno");
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

        public Criteria andTasktypeEqualTo(Integer value) {
            addCriterion("tasktype =", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotEqualTo(Integer value) {
            addCriterion("tasktype <>", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThan(Integer value) {
            addCriterion("tasktype >", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tasktype >=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThan(Integer value) {
            addCriterion("tasktype <", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThanOrEqualTo(Integer value) {
            addCriterion("tasktype <=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeIn(List<Integer> values) {
            addCriterion("tasktype in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotIn(List<Integer> values) {
            addCriterion("tasktype not in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeBetween(Integer value1, Integer value2) {
            addCriterion("tasktype between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tasktype not between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andBillstateIsNull() {
            addCriterion("billstate is null");
            return (Criteria) this;
        }

        public Criteria andBillstateIsNotNull() {
            addCriterion("billstate is not null");
            return (Criteria) this;
        }

        public Criteria andBillstateEqualTo(Integer value) {
            addCriterion("billstate =", value, "billstate");
            return (Criteria) this;
        }

        public Criteria andBillstateNotEqualTo(Integer value) {
            addCriterion("billstate <>", value, "billstate");
            return (Criteria) this;
        }

        public Criteria andBillstateGreaterThan(Integer value) {
            addCriterion("billstate >", value, "billstate");
            return (Criteria) this;
        }

        public Criteria andBillstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("billstate >=", value, "billstate");
            return (Criteria) this;
        }

        public Criteria andBillstateLessThan(Integer value) {
            addCriterion("billstate <", value, "billstate");
            return (Criteria) this;
        }

        public Criteria andBillstateLessThanOrEqualTo(Integer value) {
            addCriterion("billstate <=", value, "billstate");
            return (Criteria) this;
        }

        public Criteria andBillstateIn(List<Integer> values) {
            addCriterion("billstate in", values, "billstate");
            return (Criteria) this;
        }

        public Criteria andBillstateNotIn(List<Integer> values) {
            addCriterion("billstate not in", values, "billstate");
            return (Criteria) this;
        }

        public Criteria andBillstateBetween(Integer value1, Integer value2) {
            addCriterion("billstate between", value1, value2, "billstate");
            return (Criteria) this;
        }

        public Criteria andBillstateNotBetween(Integer value1, Integer value2) {
            addCriterion("billstate not between", value1, value2, "billstate");
            return (Criteria) this;
        }

        public Criteria andStorageIsNull() {
            addCriterion("storage is null");
            return (Criteria) this;
        }

        public Criteria andStorageIsNotNull() {
            addCriterion("storage is not null");
            return (Criteria) this;
        }

        public Criteria andStorageEqualTo(String value) {
            addCriterion("storage =", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotEqualTo(String value) {
            addCriterion("storage <>", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThan(String value) {
            addCriterion("storage >", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThanOrEqualTo(String value) {
            addCriterion("storage >=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThan(String value) {
            addCriterion("storage <", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThanOrEqualTo(String value) {
            addCriterion("storage <=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLike(String value) {
            addCriterion("storage like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotLike(String value) {
            addCriterion("storage not like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageIn(List<String> values) {
            addCriterion("storage in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotIn(List<String> values) {
            addCriterion("storage not in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageBetween(String value1, String value2) {
            addCriterion("storage between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotBetween(String value1, String value2) {
            addCriterion("storage not between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("purpose like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("purpose not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andDeliverydirectionIsNull() {
            addCriterion("deliverydirection is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydirectionIsNotNull() {
            addCriterion("deliverydirection is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydirectionEqualTo(String value) {
            addCriterion("deliverydirection =", value, "deliverydirection");
            return (Criteria) this;
        }

        public Criteria andDeliverydirectionNotEqualTo(String value) {
            addCriterion("deliverydirection <>", value, "deliverydirection");
            return (Criteria) this;
        }

        public Criteria andDeliverydirectionGreaterThan(String value) {
            addCriterion("deliverydirection >", value, "deliverydirection");
            return (Criteria) this;
        }

        public Criteria andDeliverydirectionGreaterThanOrEqualTo(String value) {
            addCriterion("deliverydirection >=", value, "deliverydirection");
            return (Criteria) this;
        }

        public Criteria andDeliverydirectionLessThan(String value) {
            addCriterion("deliverydirection <", value, "deliverydirection");
            return (Criteria) this;
        }

        public Criteria andDeliverydirectionLessThanOrEqualTo(String value) {
            addCriterion("deliverydirection <=", value, "deliverydirection");
            return (Criteria) this;
        }

        public Criteria andDeliverydirectionLike(String value) {
            addCriterion("deliverydirection like", value, "deliverydirection");
            return (Criteria) this;
        }

        public Criteria andDeliverydirectionNotLike(String value) {
            addCriterion("deliverydirection not like", value, "deliverydirection");
            return (Criteria) this;
        }

        public Criteria andDeliverydirectionIn(List<String> values) {
            addCriterion("deliverydirection in", values, "deliverydirection");
            return (Criteria) this;
        }

        public Criteria andDeliverydirectionNotIn(List<String> values) {
            addCriterion("deliverydirection not in", values, "deliverydirection");
            return (Criteria) this;
        }

        public Criteria andDeliverydirectionBetween(String value1, String value2) {
            addCriterion("deliverydirection between", value1, value2, "deliverydirection");
            return (Criteria) this;
        }

        public Criteria andDeliverydirectionNotBetween(String value1, String value2) {
            addCriterion("deliverydirection not between", value1, value2, "deliverydirection");
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

        public Criteria andColornoIsNull() {
            addCriterion("colorno is null");
            return (Criteria) this;
        }

        public Criteria andColornoIsNotNull() {
            addCriterion("colorno is not null");
            return (Criteria) this;
        }

        public Criteria andColornoEqualTo(String value) {
            addCriterion("colorno =", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoNotEqualTo(String value) {
            addCriterion("colorno <>", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoGreaterThan(String value) {
            addCriterion("colorno >", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoGreaterThanOrEqualTo(String value) {
            addCriterion("colorno >=", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoLessThan(String value) {
            addCriterion("colorno <", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoLessThanOrEqualTo(String value) {
            addCriterion("colorno <=", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoLike(String value) {
            addCriterion("colorno like", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoNotLike(String value) {
            addCriterion("colorno not like", value, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoIn(List<String> values) {
            addCriterion("colorno in", values, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoNotIn(List<String> values) {
            addCriterion("colorno not in", values, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoBetween(String value1, String value2) {
            addCriterion("colorno between", value1, value2, "colorno");
            return (Criteria) this;
        }

        public Criteria andColornoNotBetween(String value1, String value2) {
            addCriterion("colorno not between", value1, value2, "colorno");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andStocknumIsNull() {
            addCriterion("stocknum is null");
            return (Criteria) this;
        }

        public Criteria andStocknumIsNotNull() {
            addCriterion("stocknum is not null");
            return (Criteria) this;
        }

        public Criteria andStocknumEqualTo(Double value) {
            addCriterion("stocknum =", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumNotEqualTo(Double value) {
            addCriterion("stocknum <>", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumGreaterThan(Double value) {
            addCriterion("stocknum >", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumGreaterThanOrEqualTo(Double value) {
            addCriterion("stocknum >=", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumLessThan(Double value) {
            addCriterion("stocknum <", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumLessThanOrEqualTo(Double value) {
            addCriterion("stocknum <=", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumIn(List<Double> values) {
            addCriterion("stocknum in", values, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumNotIn(List<Double> values) {
            addCriterion("stocknum not in", values, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumBetween(Double value1, Double value2) {
            addCriterion("stocknum between", value1, value2, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumNotBetween(Double value1, Double value2) {
            addCriterion("stocknum not between", value1, value2, "stocknum");
            return (Criteria) this;
        }

        public Criteria andReceivenumIsNull() {
            addCriterion("receivenum is null");
            return (Criteria) this;
        }

        public Criteria andReceivenumIsNotNull() {
            addCriterion("receivenum is not null");
            return (Criteria) this;
        }

        public Criteria andReceivenumEqualTo(Double value) {
            addCriterion("receivenum =", value, "receivenum");
            return (Criteria) this;
        }

        public Criteria andReceivenumNotEqualTo(Double value) {
            addCriterion("receivenum <>", value, "receivenum");
            return (Criteria) this;
        }

        public Criteria andReceivenumGreaterThan(Double value) {
            addCriterion("receivenum >", value, "receivenum");
            return (Criteria) this;
        }

        public Criteria andReceivenumGreaterThanOrEqualTo(Double value) {
            addCriterion("receivenum >=", value, "receivenum");
            return (Criteria) this;
        }

        public Criteria andReceivenumLessThan(Double value) {
            addCriterion("receivenum <", value, "receivenum");
            return (Criteria) this;
        }

        public Criteria andReceivenumLessThanOrEqualTo(Double value) {
            addCriterion("receivenum <=", value, "receivenum");
            return (Criteria) this;
        }

        public Criteria andReceivenumIn(List<Double> values) {
            addCriterion("receivenum in", values, "receivenum");
            return (Criteria) this;
        }

        public Criteria andReceivenumNotIn(List<Double> values) {
            addCriterion("receivenum not in", values, "receivenum");
            return (Criteria) this;
        }

        public Criteria andReceivenumBetween(Double value1, Double value2) {
            addCriterion("receivenum between", value1, value2, "receivenum");
            return (Criteria) this;
        }

        public Criteria andReceivenumNotBetween(Double value1, Double value2) {
            addCriterion("receivenum not between", value1, value2, "receivenum");
            return (Criteria) this;
        }

        public Criteria andMaterialnoIsNull() {
            addCriterion("materialno is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnoIsNotNull() {
            addCriterion("materialno is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnoEqualTo(String value) {
            addCriterion("materialno =", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotEqualTo(String value) {
            addCriterion("materialno <>", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoGreaterThan(String value) {
            addCriterion("materialno >", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoGreaterThanOrEqualTo(String value) {
            addCriterion("materialno >=", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoLessThan(String value) {
            addCriterion("materialno <", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoLessThanOrEqualTo(String value) {
            addCriterion("materialno <=", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoLike(String value) {
            addCriterion("materialno like", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotLike(String value) {
            addCriterion("materialno not like", value, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoIn(List<String> values) {
            addCriterion("materialno in", values, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotIn(List<String> values) {
            addCriterion("materialno not in", values, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoBetween(String value1, String value2) {
            addCriterion("materialno between", value1, value2, "materialno");
            return (Criteria) this;
        }

        public Criteria andMaterialnoNotBetween(String value1, String value2) {
            addCriterion("materialno not between", value1, value2, "materialno");
            return (Criteria) this;
        }

        public Criteria andBilldateIsNull() {
            addCriterion("billdate is null");
            return (Criteria) this;
        }

        public Criteria andBilldateIsNotNull() {
            addCriterion("billdate is not null");
            return (Criteria) this;
        }

        public Criteria andBilldateEqualTo(String value) {
            addCriterion("billdate =", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotEqualTo(String value) {
            addCriterion("billdate <>", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateGreaterThan(String value) {
            addCriterion("billdate >", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateGreaterThanOrEqualTo(String value) {
            addCriterion("billdate >=", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateLessThan(String value) {
            addCriterion("billdate <", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateLessThanOrEqualTo(String value) {
            addCriterion("billdate <=", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateLike(String value) {
            addCriterion("billdate like", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotLike(String value) {
            addCriterion("billdate not like", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateIn(List<String> values) {
            addCriterion("billdate in", values, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotIn(List<String> values) {
            addCriterion("billdate not in", values, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateBetween(String value1, String value2) {
            addCriterion("billdate between", value1, value2, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotBetween(String value1, String value2) {
            addCriterion("billdate not between", value1, value2, "billdate");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNull() {
            addCriterion("applicant is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNotNull() {
            addCriterion("applicant is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantEqualTo(String value) {
            addCriterion("applicant =", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotEqualTo(String value) {
            addCriterion("applicant <>", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThan(String value) {
            addCriterion("applicant >", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThanOrEqualTo(String value) {
            addCriterion("applicant >=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThan(String value) {
            addCriterion("applicant <", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThanOrEqualTo(String value) {
            addCriterion("applicant <=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLike(String value) {
            addCriterion("applicant like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotLike(String value) {
            addCriterion("applicant not like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantIn(List<String> values) {
            addCriterion("applicant in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotIn(List<String> values) {
            addCriterion("applicant not in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantBetween(String value1, String value2) {
            addCriterion("applicant between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotBetween(String value1, String value2) {
            addCriterion("applicant not between", value1, value2, "applicant");
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

        public Criteria andSalenoIsNull() {
            addCriterion("saleno is null");
            return (Criteria) this;
        }

        public Criteria andSalenoIsNotNull() {
            addCriterion("saleno is not null");
            return (Criteria) this;
        }

        public Criteria andSalenoEqualTo(String value) {
            addCriterion("saleno =", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotEqualTo(String value) {
            addCriterion("saleno <>", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoGreaterThan(String value) {
            addCriterion("saleno >", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoGreaterThanOrEqualTo(String value) {
            addCriterion("saleno >=", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoLessThan(String value) {
            addCriterion("saleno <", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoLessThanOrEqualTo(String value) {
            addCriterion("saleno <=", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoLike(String value) {
            addCriterion("saleno like", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotLike(String value) {
            addCriterion("saleno not like", value, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoIn(List<String> values) {
            addCriterion("saleno in", values, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotIn(List<String> values) {
            addCriterion("saleno not in", values, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoBetween(String value1, String value2) {
            addCriterion("saleno between", value1, value2, "saleno");
            return (Criteria) this;
        }

        public Criteria andSalenoNotBetween(String value1, String value2) {
            addCriterion("saleno not between", value1, value2, "saleno");
            return (Criteria) this;
        }

        public Criteria andSarehousingnoIsNull() {
            addCriterion("sarehousingno is null");
            return (Criteria) this;
        }

        public Criteria andSarehousingnoIsNotNull() {
            addCriterion("sarehousingno is not null");
            return (Criteria) this;
        }

        public Criteria andSarehousingnoEqualTo(String value) {
            addCriterion("sarehousingno =", value, "sarehousingno");
            return (Criteria) this;
        }

        public Criteria andSarehousingnoNotEqualTo(String value) {
            addCriterion("sarehousingno <>", value, "sarehousingno");
            return (Criteria) this;
        }

        public Criteria andSarehousingnoGreaterThan(String value) {
            addCriterion("sarehousingno >", value, "sarehousingno");
            return (Criteria) this;
        }

        public Criteria andSarehousingnoGreaterThanOrEqualTo(String value) {
            addCriterion("sarehousingno >=", value, "sarehousingno");
            return (Criteria) this;
        }

        public Criteria andSarehousingnoLessThan(String value) {
            addCriterion("sarehousingno <", value, "sarehousingno");
            return (Criteria) this;
        }

        public Criteria andSarehousingnoLessThanOrEqualTo(String value) {
            addCriterion("sarehousingno <=", value, "sarehousingno");
            return (Criteria) this;
        }

        public Criteria andSarehousingnoLike(String value) {
            addCriterion("sarehousingno like", value, "sarehousingno");
            return (Criteria) this;
        }

        public Criteria andSarehousingnoNotLike(String value) {
            addCriterion("sarehousingno not like", value, "sarehousingno");
            return (Criteria) this;
        }

        public Criteria andSarehousingnoIn(List<String> values) {
            addCriterion("sarehousingno in", values, "sarehousingno");
            return (Criteria) this;
        }

        public Criteria andSarehousingnoNotIn(List<String> values) {
            addCriterion("sarehousingno not in", values, "sarehousingno");
            return (Criteria) this;
        }

        public Criteria andSarehousingnoBetween(String value1, String value2) {
            addCriterion("sarehousingno between", value1, value2, "sarehousingno");
            return (Criteria) this;
        }

        public Criteria andSarehousingnoNotBetween(String value1, String value2) {
            addCriterion("sarehousingno not between", value1, value2, "sarehousingno");
            return (Criteria) this;
        }

        public Criteria andMoneynoIsNull() {
            addCriterion("moneyno is null");
            return (Criteria) this;
        }

        public Criteria andMoneynoIsNotNull() {
            addCriterion("moneyno is not null");
            return (Criteria) this;
        }

        public Criteria andMoneynoEqualTo(String value) {
            addCriterion("moneyno =", value, "moneyno");
            return (Criteria) this;
        }

        public Criteria andMoneynoNotEqualTo(String value) {
            addCriterion("moneyno <>", value, "moneyno");
            return (Criteria) this;
        }

        public Criteria andMoneynoGreaterThan(String value) {
            addCriterion("moneyno >", value, "moneyno");
            return (Criteria) this;
        }

        public Criteria andMoneynoGreaterThanOrEqualTo(String value) {
            addCriterion("moneyno >=", value, "moneyno");
            return (Criteria) this;
        }

        public Criteria andMoneynoLessThan(String value) {
            addCriterion("moneyno <", value, "moneyno");
            return (Criteria) this;
        }

        public Criteria andMoneynoLessThanOrEqualTo(String value) {
            addCriterion("moneyno <=", value, "moneyno");
            return (Criteria) this;
        }

        public Criteria andMoneynoLike(String value) {
            addCriterion("moneyno like", value, "moneyno");
            return (Criteria) this;
        }

        public Criteria andMoneynoNotLike(String value) {
            addCriterion("moneyno not like", value, "moneyno");
            return (Criteria) this;
        }

        public Criteria andMoneynoIn(List<String> values) {
            addCriterion("moneyno in", values, "moneyno");
            return (Criteria) this;
        }

        public Criteria andMoneynoNotIn(List<String> values) {
            addCriterion("moneyno not in", values, "moneyno");
            return (Criteria) this;
        }

        public Criteria andMoneynoBetween(String value1, String value2) {
            addCriterion("moneyno between", value1, value2, "moneyno");
            return (Criteria) this;
        }

        public Criteria andMoneynoNotBetween(String value1, String value2) {
            addCriterion("moneyno not between", value1, value2, "moneyno");
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

        public Criteria andOuttreasurynoIsNull() {
            addCriterion("outtreasuryno is null");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynoIsNotNull() {
            addCriterion("outtreasuryno is not null");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynoEqualTo(String value) {
            addCriterion("outtreasuryno =", value, "outtreasuryno");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynoNotEqualTo(String value) {
            addCriterion("outtreasuryno <>", value, "outtreasuryno");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynoGreaterThan(String value) {
            addCriterion("outtreasuryno >", value, "outtreasuryno");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynoGreaterThanOrEqualTo(String value) {
            addCriterion("outtreasuryno >=", value, "outtreasuryno");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynoLessThan(String value) {
            addCriterion("outtreasuryno <", value, "outtreasuryno");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynoLessThanOrEqualTo(String value) {
            addCriterion("outtreasuryno <=", value, "outtreasuryno");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynoLike(String value) {
            addCriterion("outtreasuryno like", value, "outtreasuryno");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynoNotLike(String value) {
            addCriterion("outtreasuryno not like", value, "outtreasuryno");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynoIn(List<String> values) {
            addCriterion("outtreasuryno in", values, "outtreasuryno");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynoNotIn(List<String> values) {
            addCriterion("outtreasuryno not in", values, "outtreasuryno");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynoBetween(String value1, String value2) {
            addCriterion("outtreasuryno between", value1, value2, "outtreasuryno");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynoNotBetween(String value1, String value2) {
            addCriterion("outtreasuryno not between", value1, value2, "outtreasuryno");
            return (Criteria) this;
        }

        public Criteria andOuttreasurydateIsNull() {
            addCriterion("outtreasurydate is null");
            return (Criteria) this;
        }

        public Criteria andOuttreasurydateIsNotNull() {
            addCriterion("outtreasurydate is not null");
            return (Criteria) this;
        }

        public Criteria andOuttreasurydateEqualTo(String value) {
            addCriterion("outtreasurydate =", value, "outtreasurydate");
            return (Criteria) this;
        }

        public Criteria andOuttreasurydateNotEqualTo(String value) {
            addCriterion("outtreasurydate <>", value, "outtreasurydate");
            return (Criteria) this;
        }

        public Criteria andOuttreasurydateGreaterThan(String value) {
            addCriterion("outtreasurydate >", value, "outtreasurydate");
            return (Criteria) this;
        }

        public Criteria andOuttreasurydateGreaterThanOrEqualTo(String value) {
            addCriterion("outtreasurydate >=", value, "outtreasurydate");
            return (Criteria) this;
        }

        public Criteria andOuttreasurydateLessThan(String value) {
            addCriterion("outtreasurydate <", value, "outtreasurydate");
            return (Criteria) this;
        }

        public Criteria andOuttreasurydateLessThanOrEqualTo(String value) {
            addCriterion("outtreasurydate <=", value, "outtreasurydate");
            return (Criteria) this;
        }

        public Criteria andOuttreasurydateLike(String value) {
            addCriterion("outtreasurydate like", value, "outtreasurydate");
            return (Criteria) this;
        }

        public Criteria andOuttreasurydateNotLike(String value) {
            addCriterion("outtreasurydate not like", value, "outtreasurydate");
            return (Criteria) this;
        }

        public Criteria andOuttreasurydateIn(List<String> values) {
            addCriterion("outtreasurydate in", values, "outtreasurydate");
            return (Criteria) this;
        }

        public Criteria andOuttreasurydateNotIn(List<String> values) {
            addCriterion("outtreasurydate not in", values, "outtreasurydate");
            return (Criteria) this;
        }

        public Criteria andOuttreasurydateBetween(String value1, String value2) {
            addCriterion("outtreasurydate between", value1, value2, "outtreasurydate");
            return (Criteria) this;
        }

        public Criteria andOuttreasurydateNotBetween(String value1, String value2) {
            addCriterion("outtreasurydate not between", value1, value2, "outtreasurydate");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynumIsNull() {
            addCriterion("outtreasurynum is null");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynumIsNotNull() {
            addCriterion("outtreasurynum is not null");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynumEqualTo(Double value) {
            addCriterion("outtreasurynum =", value, "outtreasurynum");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynumNotEqualTo(Double value) {
            addCriterion("outtreasurynum <>", value, "outtreasurynum");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynumGreaterThan(Double value) {
            addCriterion("outtreasurynum >", value, "outtreasurynum");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynumGreaterThanOrEqualTo(Double value) {
            addCriterion("outtreasurynum >=", value, "outtreasurynum");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynumLessThan(Double value) {
            addCriterion("outtreasurynum <", value, "outtreasurynum");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynumLessThanOrEqualTo(Double value) {
            addCriterion("outtreasurynum <=", value, "outtreasurynum");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynumIn(List<Double> values) {
            addCriterion("outtreasurynum in", values, "outtreasurynum");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynumNotIn(List<Double> values) {
            addCriterion("outtreasurynum not in", values, "outtreasurynum");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynumBetween(Double value1, Double value2) {
            addCriterion("outtreasurynum between", value1, value2, "outtreasurynum");
            return (Criteria) this;
        }

        public Criteria andOuttreasurynumNotBetween(Double value1, Double value2) {
            addCriterion("outtreasurynum not between", value1, value2, "outtreasurynum");
            return (Criteria) this;
        }

        public Criteria andPickingtypeIsNull() {
            addCriterion("pickingtype is null");
            return (Criteria) this;
        }

        public Criteria andPickingtypeIsNotNull() {
            addCriterion("pickingtype is not null");
            return (Criteria) this;
        }

        public Criteria andPickingtypeEqualTo(Integer value) {
            addCriterion("pickingtype =", value, "pickingtype");
            return (Criteria) this;
        }

        public Criteria andPickingtypeNotEqualTo(Integer value) {
            addCriterion("pickingtype <>", value, "pickingtype");
            return (Criteria) this;
        }

        public Criteria andPickingtypeGreaterThan(Integer value) {
            addCriterion("pickingtype >", value, "pickingtype");
            return (Criteria) this;
        }

        public Criteria andPickingtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pickingtype >=", value, "pickingtype");
            return (Criteria) this;
        }

        public Criteria andPickingtypeLessThan(Integer value) {
            addCriterion("pickingtype <", value, "pickingtype");
            return (Criteria) this;
        }

        public Criteria andPickingtypeLessThanOrEqualTo(Integer value) {
            addCriterion("pickingtype <=", value, "pickingtype");
            return (Criteria) this;
        }

        public Criteria andPickingtypeIn(List<Integer> values) {
            addCriterion("pickingtype in", values, "pickingtype");
            return (Criteria) this;
        }

        public Criteria andPickingtypeNotIn(List<Integer> values) {
            addCriterion("pickingtype not in", values, "pickingtype");
            return (Criteria) this;
        }

        public Criteria andPickingtypeBetween(Integer value1, Integer value2) {
            addCriterion("pickingtype between", value1, value2, "pickingtype");
            return (Criteria) this;
        }

        public Criteria andPickingtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pickingtype not between", value1, value2, "pickingtype");
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