package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_settlementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_settlementExample() {
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

        public Criteria andSettlementidIsNull() {
            addCriterion("settlementid is null");
            return (Criteria) this;
        }

        public Criteria andSettlementidIsNotNull() {
            addCriterion("settlementid is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementidEqualTo(Integer value) {
            addCriterion("settlementid =", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidNotEqualTo(Integer value) {
            addCriterion("settlementid <>", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidGreaterThan(Integer value) {
            addCriterion("settlementid >", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidGreaterThanOrEqualTo(Integer value) {
            addCriterion("settlementid >=", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidLessThan(Integer value) {
            addCriterion("settlementid <", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidLessThanOrEqualTo(Integer value) {
            addCriterion("settlementid <=", value, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidIn(List<Integer> values) {
            addCriterion("settlementid in", values, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidNotIn(List<Integer> values) {
            addCriterion("settlementid not in", values, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidBetween(Integer value1, Integer value2) {
            addCriterion("settlementid between", value1, value2, "settlementid");
            return (Criteria) this;
        }

        public Criteria andSettlementidNotBetween(Integer value1, Integer value2) {
            addCriterion("settlementid not between", value1, value2, "settlementid");
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

        public Criteria andRequisitiondateIsNull() {
            addCriterion("requisitiondate is null");
            return (Criteria) this;
        }

        public Criteria andRequisitiondateIsNotNull() {
            addCriterion("requisitiondate is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitiondateEqualTo(String value) {
            addCriterion("requisitiondate =", value, "requisitiondate");
            return (Criteria) this;
        }

        public Criteria andRequisitiondateNotEqualTo(String value) {
            addCriterion("requisitiondate <>", value, "requisitiondate");
            return (Criteria) this;
        }

        public Criteria andRequisitiondateGreaterThan(String value) {
            addCriterion("requisitiondate >", value, "requisitiondate");
            return (Criteria) this;
        }

        public Criteria andRequisitiondateGreaterThanOrEqualTo(String value) {
            addCriterion("requisitiondate >=", value, "requisitiondate");
            return (Criteria) this;
        }

        public Criteria andRequisitiondateLessThan(String value) {
            addCriterion("requisitiondate <", value, "requisitiondate");
            return (Criteria) this;
        }

        public Criteria andRequisitiondateLessThanOrEqualTo(String value) {
            addCriterion("requisitiondate <=", value, "requisitiondate");
            return (Criteria) this;
        }

        public Criteria andRequisitiondateLike(String value) {
            addCriterion("requisitiondate like", value, "requisitiondate");
            return (Criteria) this;
        }

        public Criteria andRequisitiondateNotLike(String value) {
            addCriterion("requisitiondate not like", value, "requisitiondate");
            return (Criteria) this;
        }

        public Criteria andRequisitiondateIn(List<String> values) {
            addCriterion("requisitiondate in", values, "requisitiondate");
            return (Criteria) this;
        }

        public Criteria andRequisitiondateNotIn(List<String> values) {
            addCriterion("requisitiondate not in", values, "requisitiondate");
            return (Criteria) this;
        }

        public Criteria andRequisitiondateBetween(String value1, String value2) {
            addCriterion("requisitiondate between", value1, value2, "requisitiondate");
            return (Criteria) this;
        }

        public Criteria andRequisitiondateNotBetween(String value1, String value2) {
            addCriterion("requisitiondate not between", value1, value2, "requisitiondate");
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

        public Criteria andFinancestateEqualTo(String value) {
            addCriterion("financestate =", value, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateNotEqualTo(String value) {
            addCriterion("financestate <>", value, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateGreaterThan(String value) {
            addCriterion("financestate >", value, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateGreaterThanOrEqualTo(String value) {
            addCriterion("financestate >=", value, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateLessThan(String value) {
            addCriterion("financestate <", value, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateLessThanOrEqualTo(String value) {
            addCriterion("financestate <=", value, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateLike(String value) {
            addCriterion("financestate like", value, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateNotLike(String value) {
            addCriterion("financestate not like", value, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateIn(List<String> values) {
            addCriterion("financestate in", values, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateNotIn(List<String> values) {
            addCriterion("financestate not in", values, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateBetween(String value1, String value2) {
            addCriterion("financestate between", value1, value2, "financestate");
            return (Criteria) this;
        }

        public Criteria andFinancestateNotBetween(String value1, String value2) {
            addCriterion("financestate not between", value1, value2, "financestate");
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

        public Criteria andApplymoneyIsNull() {
            addCriterion("applymoney is null");
            return (Criteria) this;
        }

        public Criteria andApplymoneyIsNotNull() {
            addCriterion("applymoney is not null");
            return (Criteria) this;
        }

        public Criteria andApplymoneyEqualTo(Double value) {
            addCriterion("applymoney =", value, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyNotEqualTo(Double value) {
            addCriterion("applymoney <>", value, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyGreaterThan(Double value) {
            addCriterion("applymoney >", value, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("applymoney >=", value, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyLessThan(Double value) {
            addCriterion("applymoney <", value, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyLessThanOrEqualTo(Double value) {
            addCriterion("applymoney <=", value, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyIn(List<Double> values) {
            addCriterion("applymoney in", values, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyNotIn(List<Double> values) {
            addCriterion("applymoney not in", values, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyBetween(Double value1, Double value2) {
            addCriterion("applymoney between", value1, value2, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyNotBetween(Double value1, Double value2) {
            addCriterion("applymoney not between", value1, value2, "applymoney");
            return (Criteria) this;
        }

        public Criteria andPaymentmoneyIsNull() {
            addCriterion("paymentmoney is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmoneyIsNotNull() {
            addCriterion("paymentmoney is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmoneyEqualTo(Double value) {
            addCriterion("paymentmoney =", value, "paymentmoney");
            return (Criteria) this;
        }

        public Criteria andPaymentmoneyNotEqualTo(Double value) {
            addCriterion("paymentmoney <>", value, "paymentmoney");
            return (Criteria) this;
        }

        public Criteria andPaymentmoneyGreaterThan(Double value) {
            addCriterion("paymentmoney >", value, "paymentmoney");
            return (Criteria) this;
        }

        public Criteria andPaymentmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("paymentmoney >=", value, "paymentmoney");
            return (Criteria) this;
        }

        public Criteria andPaymentmoneyLessThan(Double value) {
            addCriterion("paymentmoney <", value, "paymentmoney");
            return (Criteria) this;
        }

        public Criteria andPaymentmoneyLessThanOrEqualTo(Double value) {
            addCriterion("paymentmoney <=", value, "paymentmoney");
            return (Criteria) this;
        }

        public Criteria andPaymentmoneyIn(List<Double> values) {
            addCriterion("paymentmoney in", values, "paymentmoney");
            return (Criteria) this;
        }

        public Criteria andPaymentmoneyNotIn(List<Double> values) {
            addCriterion("paymentmoney not in", values, "paymentmoney");
            return (Criteria) this;
        }

        public Criteria andPaymentmoneyBetween(Double value1, Double value2) {
            addCriterion("paymentmoney between", value1, value2, "paymentmoney");
            return (Criteria) this;
        }

        public Criteria andPaymentmoneyNotBetween(Double value1, Double value2) {
            addCriterion("paymentmoney not between", value1, value2, "paymentmoney");
            return (Criteria) this;
        }

        public Criteria andApplytypeIsNull() {
            addCriterion("applytype is null");
            return (Criteria) this;
        }

        public Criteria andApplytypeIsNotNull() {
            addCriterion("applytype is not null");
            return (Criteria) this;
        }

        public Criteria andApplytypeEqualTo(String value) {
            addCriterion("applytype =", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotEqualTo(String value) {
            addCriterion("applytype <>", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeGreaterThan(String value) {
            addCriterion("applytype >", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeGreaterThanOrEqualTo(String value) {
            addCriterion("applytype >=", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLessThan(String value) {
            addCriterion("applytype <", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLessThanOrEqualTo(String value) {
            addCriterion("applytype <=", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLike(String value) {
            addCriterion("applytype like", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotLike(String value) {
            addCriterion("applytype not like", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeIn(List<String> values) {
            addCriterion("applytype in", values, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotIn(List<String> values) {
            addCriterion("applytype not in", values, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeBetween(String value1, String value2) {
            addCriterion("applytype between", value1, value2, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotBetween(String value1, String value2) {
            addCriterion("applytype not between", value1, value2, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplystateIsNull() {
            addCriterion("applystate is null");
            return (Criteria) this;
        }

        public Criteria andApplystateIsNotNull() {
            addCriterion("applystate is not null");
            return (Criteria) this;
        }

        public Criteria andApplystateEqualTo(Integer value) {
            addCriterion("applystate =", value, "applystate");
            return (Criteria) this;
        }

        public Criteria andApplystateNotEqualTo(Integer value) {
            addCriterion("applystate <>", value, "applystate");
            return (Criteria) this;
        }

        public Criteria andApplystateGreaterThan(Integer value) {
            addCriterion("applystate >", value, "applystate");
            return (Criteria) this;
        }

        public Criteria andApplystateGreaterThanOrEqualTo(Integer value) {
            addCriterion("applystate >=", value, "applystate");
            return (Criteria) this;
        }

        public Criteria andApplystateLessThan(Integer value) {
            addCriterion("applystate <", value, "applystate");
            return (Criteria) this;
        }

        public Criteria andApplystateLessThanOrEqualTo(Integer value) {
            addCriterion("applystate <=", value, "applystate");
            return (Criteria) this;
        }

        public Criteria andApplystateIn(List<Integer> values) {
            addCriterion("applystate in", values, "applystate");
            return (Criteria) this;
        }

        public Criteria andApplystateNotIn(List<Integer> values) {
            addCriterion("applystate not in", values, "applystate");
            return (Criteria) this;
        }

        public Criteria andApplystateBetween(Integer value1, Integer value2) {
            addCriterion("applystate between", value1, value2, "applystate");
            return (Criteria) this;
        }

        public Criteria andApplystateNotBetween(Integer value1, Integer value2) {
            addCriterion("applystate not between", value1, value2, "applystate");
            return (Criteria) this;
        }

        public Criteria andDyeingfeeIsNull() {
            addCriterion("dyeingfee is null");
            return (Criteria) this;
        }

        public Criteria andDyeingfeeIsNotNull() {
            addCriterion("dyeingfee is not null");
            return (Criteria) this;
        }

        public Criteria andDyeingfeeEqualTo(Double value) {
            addCriterion("dyeingfee =", value, "dyeingfee");
            return (Criteria) this;
        }

        public Criteria andDyeingfeeNotEqualTo(Double value) {
            addCriterion("dyeingfee <>", value, "dyeingfee");
            return (Criteria) this;
        }

        public Criteria andDyeingfeeGreaterThan(Double value) {
            addCriterion("dyeingfee >", value, "dyeingfee");
            return (Criteria) this;
        }

        public Criteria andDyeingfeeGreaterThanOrEqualTo(Double value) {
            addCriterion("dyeingfee >=", value, "dyeingfee");
            return (Criteria) this;
        }

        public Criteria andDyeingfeeLessThan(Double value) {
            addCriterion("dyeingfee <", value, "dyeingfee");
            return (Criteria) this;
        }

        public Criteria andDyeingfeeLessThanOrEqualTo(Double value) {
            addCriterion("dyeingfee <=", value, "dyeingfee");
            return (Criteria) this;
        }

        public Criteria andDyeingfeeIn(List<Double> values) {
            addCriterion("dyeingfee in", values, "dyeingfee");
            return (Criteria) this;
        }

        public Criteria andDyeingfeeNotIn(List<Double> values) {
            addCriterion("dyeingfee not in", values, "dyeingfee");
            return (Criteria) this;
        }

        public Criteria andDyeingfeeBetween(Double value1, Double value2) {
            addCriterion("dyeingfee between", value1, value2, "dyeingfee");
            return (Criteria) this;
        }

        public Criteria andDyeingfeeNotBetween(Double value1, Double value2) {
            addCriterion("dyeingfee not between", value1, value2, "dyeingfee");
            return (Criteria) this;
        }

        public Criteria andSmallfeeIsNull() {
            addCriterion("smallfee is null");
            return (Criteria) this;
        }

        public Criteria andSmallfeeIsNotNull() {
            addCriterion("smallfee is not null");
            return (Criteria) this;
        }

        public Criteria andSmallfeeEqualTo(Double value) {
            addCriterion("smallfee =", value, "smallfee");
            return (Criteria) this;
        }

        public Criteria andSmallfeeNotEqualTo(Double value) {
            addCriterion("smallfee <>", value, "smallfee");
            return (Criteria) this;
        }

        public Criteria andSmallfeeGreaterThan(Double value) {
            addCriterion("smallfee >", value, "smallfee");
            return (Criteria) this;
        }

        public Criteria andSmallfeeGreaterThanOrEqualTo(Double value) {
            addCriterion("smallfee >=", value, "smallfee");
            return (Criteria) this;
        }

        public Criteria andSmallfeeLessThan(Double value) {
            addCriterion("smallfee <", value, "smallfee");
            return (Criteria) this;
        }

        public Criteria andSmallfeeLessThanOrEqualTo(Double value) {
            addCriterion("smallfee <=", value, "smallfee");
            return (Criteria) this;
        }

        public Criteria andSmallfeeIn(List<Double> values) {
            addCriterion("smallfee in", values, "smallfee");
            return (Criteria) this;
        }

        public Criteria andSmallfeeNotIn(List<Double> values) {
            addCriterion("smallfee not in", values, "smallfee");
            return (Criteria) this;
        }

        public Criteria andSmallfeeBetween(Double value1, Double value2) {
            addCriterion("smallfee between", value1, value2, "smallfee");
            return (Criteria) this;
        }

        public Criteria andSmallfeeNotBetween(Double value1, Double value2) {
            addCriterion("smallfee not between", value1, value2, "smallfee");
            return (Criteria) this;
        }

        public Criteria andOthermoneyIsNull() {
            addCriterion("othermoney is null");
            return (Criteria) this;
        }

        public Criteria andOthermoneyIsNotNull() {
            addCriterion("othermoney is not null");
            return (Criteria) this;
        }

        public Criteria andOthermoneyEqualTo(Double value) {
            addCriterion("othermoney =", value, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyNotEqualTo(Double value) {
            addCriterion("othermoney <>", value, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyGreaterThan(Double value) {
            addCriterion("othermoney >", value, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("othermoney >=", value, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyLessThan(Double value) {
            addCriterion("othermoney <", value, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyLessThanOrEqualTo(Double value) {
            addCriterion("othermoney <=", value, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyIn(List<Double> values) {
            addCriterion("othermoney in", values, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyNotIn(List<Double> values) {
            addCriterion("othermoney not in", values, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyBetween(Double value1, Double value2) {
            addCriterion("othermoney between", value1, value2, "othermoney");
            return (Criteria) this;
        }

        public Criteria andOthermoneyNotBetween(Double value1, Double value2) {
            addCriterion("othermoney not between", value1, value2, "othermoney");
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

        public Criteria andRuditorIsNull() {
            addCriterion("ruditor is null");
            return (Criteria) this;
        }

        public Criteria andRuditorIsNotNull() {
            addCriterion("ruditor is not null");
            return (Criteria) this;
        }

        public Criteria andRuditorEqualTo(String value) {
            addCriterion("ruditor =", value, "ruditor");
            return (Criteria) this;
        }

        public Criteria andRuditorNotEqualTo(String value) {
            addCriterion("ruditor <>", value, "ruditor");
            return (Criteria) this;
        }

        public Criteria andRuditorGreaterThan(String value) {
            addCriterion("ruditor >", value, "ruditor");
            return (Criteria) this;
        }

        public Criteria andRuditorGreaterThanOrEqualTo(String value) {
            addCriterion("ruditor >=", value, "ruditor");
            return (Criteria) this;
        }

        public Criteria andRuditorLessThan(String value) {
            addCriterion("ruditor <", value, "ruditor");
            return (Criteria) this;
        }

        public Criteria andRuditorLessThanOrEqualTo(String value) {
            addCriterion("ruditor <=", value, "ruditor");
            return (Criteria) this;
        }

        public Criteria andRuditorLike(String value) {
            addCriterion("ruditor like", value, "ruditor");
            return (Criteria) this;
        }

        public Criteria andRuditorNotLike(String value) {
            addCriterion("ruditor not like", value, "ruditor");
            return (Criteria) this;
        }

        public Criteria andRuditorIn(List<String> values) {
            addCriterion("ruditor in", values, "ruditor");
            return (Criteria) this;
        }

        public Criteria andRuditorNotIn(List<String> values) {
            addCriterion("ruditor not in", values, "ruditor");
            return (Criteria) this;
        }

        public Criteria andRuditorBetween(String value1, String value2) {
            addCriterion("ruditor between", value1, value2, "ruditor");
            return (Criteria) this;
        }

        public Criteria andRuditorNotBetween(String value1, String value2) {
            addCriterion("ruditor not between", value1, value2, "ruditor");
            return (Criteria) this;
        }

        public Criteria andLeaderapproverIsNull() {
            addCriterion("leaderapprover is null");
            return (Criteria) this;
        }

        public Criteria andLeaderapproverIsNotNull() {
            addCriterion("leaderapprover is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderapproverEqualTo(String value) {
            addCriterion("leaderapprover =", value, "leaderapprover");
            return (Criteria) this;
        }

        public Criteria andLeaderapproverNotEqualTo(String value) {
            addCriterion("leaderapprover <>", value, "leaderapprover");
            return (Criteria) this;
        }

        public Criteria andLeaderapproverGreaterThan(String value) {
            addCriterion("leaderapprover >", value, "leaderapprover");
            return (Criteria) this;
        }

        public Criteria andLeaderapproverGreaterThanOrEqualTo(String value) {
            addCriterion("leaderapprover >=", value, "leaderapprover");
            return (Criteria) this;
        }

        public Criteria andLeaderapproverLessThan(String value) {
            addCriterion("leaderapprover <", value, "leaderapprover");
            return (Criteria) this;
        }

        public Criteria andLeaderapproverLessThanOrEqualTo(String value) {
            addCriterion("leaderapprover <=", value, "leaderapprover");
            return (Criteria) this;
        }

        public Criteria andLeaderapproverLike(String value) {
            addCriterion("leaderapprover like", value, "leaderapprover");
            return (Criteria) this;
        }

        public Criteria andLeaderapproverNotLike(String value) {
            addCriterion("leaderapprover not like", value, "leaderapprover");
            return (Criteria) this;
        }

        public Criteria andLeaderapproverIn(List<String> values) {
            addCriterion("leaderapprover in", values, "leaderapprover");
            return (Criteria) this;
        }

        public Criteria andLeaderapproverNotIn(List<String> values) {
            addCriterion("leaderapprover not in", values, "leaderapprover");
            return (Criteria) this;
        }

        public Criteria andLeaderapproverBetween(String value1, String value2) {
            addCriterion("leaderapprover between", value1, value2, "leaderapprover");
            return (Criteria) this;
        }

        public Criteria andLeaderapproverNotBetween(String value1, String value2) {
            addCriterion("leaderapprover not between", value1, value2, "leaderapprover");
            return (Criteria) this;
        }

        public Criteria andBatchdateIsNull() {
            addCriterion("batchdate is null");
            return (Criteria) this;
        }

        public Criteria andBatchdateIsNotNull() {
            addCriterion("batchdate is not null");
            return (Criteria) this;
        }

        public Criteria andBatchdateEqualTo(String value) {
            addCriterion("batchdate =", value, "batchdate");
            return (Criteria) this;
        }

        public Criteria andBatchdateNotEqualTo(String value) {
            addCriterion("batchdate <>", value, "batchdate");
            return (Criteria) this;
        }

        public Criteria andBatchdateGreaterThan(String value) {
            addCriterion("batchdate >", value, "batchdate");
            return (Criteria) this;
        }

        public Criteria andBatchdateGreaterThanOrEqualTo(String value) {
            addCriterion("batchdate >=", value, "batchdate");
            return (Criteria) this;
        }

        public Criteria andBatchdateLessThan(String value) {
            addCriterion("batchdate <", value, "batchdate");
            return (Criteria) this;
        }

        public Criteria andBatchdateLessThanOrEqualTo(String value) {
            addCriterion("batchdate <=", value, "batchdate");
            return (Criteria) this;
        }

        public Criteria andBatchdateLike(String value) {
            addCriterion("batchdate like", value, "batchdate");
            return (Criteria) this;
        }

        public Criteria andBatchdateNotLike(String value) {
            addCriterion("batchdate not like", value, "batchdate");
            return (Criteria) this;
        }

        public Criteria andBatchdateIn(List<String> values) {
            addCriterion("batchdate in", values, "batchdate");
            return (Criteria) this;
        }

        public Criteria andBatchdateNotIn(List<String> values) {
            addCriterion("batchdate not in", values, "batchdate");
            return (Criteria) this;
        }

        public Criteria andBatchdateBetween(String value1, String value2) {
            addCriterion("batchdate between", value1, value2, "batchdate");
            return (Criteria) this;
        }

        public Criteria andBatchdateNotBetween(String value1, String value2) {
            addCriterion("batchdate not between", value1, value2, "batchdate");
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