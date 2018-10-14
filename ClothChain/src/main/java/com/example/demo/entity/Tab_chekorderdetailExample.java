package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_chekorderdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_chekorderdetailExample() {
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

        public Criteria andOrdercheckidIsNull() {
            addCriterion("ordercheckid is null");
            return (Criteria) this;
        }

        public Criteria andOrdercheckidIsNotNull() {
            addCriterion("ordercheckid is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercheckidEqualTo(Integer value) {
            addCriterion("ordercheckid =", value, "ordercheckid");
            return (Criteria) this;
        }

        public Criteria andOrdercheckidNotEqualTo(Integer value) {
            addCriterion("ordercheckid <>", value, "ordercheckid");
            return (Criteria) this;
        }

        public Criteria andOrdercheckidGreaterThan(Integer value) {
            addCriterion("ordercheckid >", value, "ordercheckid");
            return (Criteria) this;
        }

        public Criteria andOrdercheckidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ordercheckid >=", value, "ordercheckid");
            return (Criteria) this;
        }

        public Criteria andOrdercheckidLessThan(Integer value) {
            addCriterion("ordercheckid <", value, "ordercheckid");
            return (Criteria) this;
        }

        public Criteria andOrdercheckidLessThanOrEqualTo(Integer value) {
            addCriterion("ordercheckid <=", value, "ordercheckid");
            return (Criteria) this;
        }

        public Criteria andOrdercheckidIn(List<Integer> values) {
            addCriterion("ordercheckid in", values, "ordercheckid");
            return (Criteria) this;
        }

        public Criteria andOrdercheckidNotIn(List<Integer> values) {
            addCriterion("ordercheckid not in", values, "ordercheckid");
            return (Criteria) this;
        }

        public Criteria andOrdercheckidBetween(Integer value1, Integer value2) {
            addCriterion("ordercheckid between", value1, value2, "ordercheckid");
            return (Criteria) this;
        }

        public Criteria andOrdercheckidNotBetween(Integer value1, Integer value2) {
            addCriterion("ordercheckid not between", value1, value2, "ordercheckid");
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

        public Criteria andAccountingnumberIsNull() {
            addCriterion("accountingnumber is null");
            return (Criteria) this;
        }

        public Criteria andAccountingnumberIsNotNull() {
            addCriterion("accountingnumber is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingnumberEqualTo(String value) {
            addCriterion("accountingnumber =", value, "accountingnumber");
            return (Criteria) this;
        }

        public Criteria andAccountingnumberNotEqualTo(String value) {
            addCriterion("accountingnumber <>", value, "accountingnumber");
            return (Criteria) this;
        }

        public Criteria andAccountingnumberGreaterThan(String value) {
            addCriterion("accountingnumber >", value, "accountingnumber");
            return (Criteria) this;
        }

        public Criteria andAccountingnumberGreaterThanOrEqualTo(String value) {
            addCriterion("accountingnumber >=", value, "accountingnumber");
            return (Criteria) this;
        }

        public Criteria andAccountingnumberLessThan(String value) {
            addCriterion("accountingnumber <", value, "accountingnumber");
            return (Criteria) this;
        }

        public Criteria andAccountingnumberLessThanOrEqualTo(String value) {
            addCriterion("accountingnumber <=", value, "accountingnumber");
            return (Criteria) this;
        }

        public Criteria andAccountingnumberLike(String value) {
            addCriterion("accountingnumber like", value, "accountingnumber");
            return (Criteria) this;
        }

        public Criteria andAccountingnumberNotLike(String value) {
            addCriterion("accountingnumber not like", value, "accountingnumber");
            return (Criteria) this;
        }

        public Criteria andAccountingnumberIn(List<String> values) {
            addCriterion("accountingnumber in", values, "accountingnumber");
            return (Criteria) this;
        }

        public Criteria andAccountingnumberNotIn(List<String> values) {
            addCriterion("accountingnumber not in", values, "accountingnumber");
            return (Criteria) this;
        }

        public Criteria andAccountingnumberBetween(String value1, String value2) {
            addCriterion("accountingnumber between", value1, value2, "accountingnumber");
            return (Criteria) this;
        }

        public Criteria andAccountingnumberNotBetween(String value1, String value2) {
            addCriterion("accountingnumber not between", value1, value2, "accountingnumber");
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

        public Criteria andAccountingdateIsNull() {
            addCriterion("accountingdate is null");
            return (Criteria) this;
        }

        public Criteria andAccountingdateIsNotNull() {
            addCriterion("accountingdate is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingdateEqualTo(String value) {
            addCriterion("accountingdate =", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateNotEqualTo(String value) {
            addCriterion("accountingdate <>", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateGreaterThan(String value) {
            addCriterion("accountingdate >", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateGreaterThanOrEqualTo(String value) {
            addCriterion("accountingdate >=", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateLessThan(String value) {
            addCriterion("accountingdate <", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateLessThanOrEqualTo(String value) {
            addCriterion("accountingdate <=", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateLike(String value) {
            addCriterion("accountingdate like", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateNotLike(String value) {
            addCriterion("accountingdate not like", value, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateIn(List<String> values) {
            addCriterion("accountingdate in", values, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateNotIn(List<String> values) {
            addCriterion("accountingdate not in", values, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateBetween(String value1, String value2) {
            addCriterion("accountingdate between", value1, value2, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andAccountingdateNotBetween(String value1, String value2) {
            addCriterion("accountingdate not between", value1, value2, "accountingdate");
            return (Criteria) this;
        }

        public Criteria andModelnumberIsNull() {
            addCriterion("modelnumber is null");
            return (Criteria) this;
        }

        public Criteria andModelnumberIsNotNull() {
            addCriterion("modelnumber is not null");
            return (Criteria) this;
        }

        public Criteria andModelnumberEqualTo(String value) {
            addCriterion("modelnumber =", value, "modelnumber");
            return (Criteria) this;
        }

        public Criteria andModelnumberNotEqualTo(String value) {
            addCriterion("modelnumber <>", value, "modelnumber");
            return (Criteria) this;
        }

        public Criteria andModelnumberGreaterThan(String value) {
            addCriterion("modelnumber >", value, "modelnumber");
            return (Criteria) this;
        }

        public Criteria andModelnumberGreaterThanOrEqualTo(String value) {
            addCriterion("modelnumber >=", value, "modelnumber");
            return (Criteria) this;
        }

        public Criteria andModelnumberLessThan(String value) {
            addCriterion("modelnumber <", value, "modelnumber");
            return (Criteria) this;
        }

        public Criteria andModelnumberLessThanOrEqualTo(String value) {
            addCriterion("modelnumber <=", value, "modelnumber");
            return (Criteria) this;
        }

        public Criteria andModelnumberLike(String value) {
            addCriterion("modelnumber like", value, "modelnumber");
            return (Criteria) this;
        }

        public Criteria andModelnumberNotLike(String value) {
            addCriterion("modelnumber not like", value, "modelnumber");
            return (Criteria) this;
        }

        public Criteria andModelnumberIn(List<String> values) {
            addCriterion("modelnumber in", values, "modelnumber");
            return (Criteria) this;
        }

        public Criteria andModelnumberNotIn(List<String> values) {
            addCriterion("modelnumber not in", values, "modelnumber");
            return (Criteria) this;
        }

        public Criteria andModelnumberBetween(String value1, String value2) {
            addCriterion("modelnumber between", value1, value2, "modelnumber");
            return (Criteria) this;
        }

        public Criteria andModelnumberNotBetween(String value1, String value2) {
            addCriterion("modelnumber not between", value1, value2, "modelnumber");
            return (Criteria) this;
        }

        public Criteria andCustomernoIsNull() {
            addCriterion("customerno is null");
            return (Criteria) this;
        }

        public Criteria andCustomernoIsNotNull() {
            addCriterion("customerno is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernoEqualTo(String value) {
            addCriterion("customerno =", value, "customerno");
            return (Criteria) this;
        }

        public Criteria andCustomernoNotEqualTo(String value) {
            addCriterion("customerno <>", value, "customerno");
            return (Criteria) this;
        }

        public Criteria andCustomernoGreaterThan(String value) {
            addCriterion("customerno >", value, "customerno");
            return (Criteria) this;
        }

        public Criteria andCustomernoGreaterThanOrEqualTo(String value) {
            addCriterion("customerno >=", value, "customerno");
            return (Criteria) this;
        }

        public Criteria andCustomernoLessThan(String value) {
            addCriterion("customerno <", value, "customerno");
            return (Criteria) this;
        }

        public Criteria andCustomernoLessThanOrEqualTo(String value) {
            addCriterion("customerno <=", value, "customerno");
            return (Criteria) this;
        }

        public Criteria andCustomernoLike(String value) {
            addCriterion("customerno like", value, "customerno");
            return (Criteria) this;
        }

        public Criteria andCustomernoNotLike(String value) {
            addCriterion("customerno not like", value, "customerno");
            return (Criteria) this;
        }

        public Criteria andCustomernoIn(List<String> values) {
            addCriterion("customerno in", values, "customerno");
            return (Criteria) this;
        }

        public Criteria andCustomernoNotIn(List<String> values) {
            addCriterion("customerno not in", values, "customerno");
            return (Criteria) this;
        }

        public Criteria andCustomernoBetween(String value1, String value2) {
            addCriterion("customerno between", value1, value2, "customerno");
            return (Criteria) this;
        }

        public Criteria andCustomernoNotBetween(String value1, String value2) {
            addCriterion("customerno not between", value1, value2, "customerno");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNull() {
            addCriterion("orderdate is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("orderdate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(String value) {
            addCriterion("orderdate =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(String value) {
            addCriterion("orderdate <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(String value) {
            addCriterion("orderdate >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(String value) {
            addCriterion("orderdate >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(String value) {
            addCriterion("orderdate <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(String value) {
            addCriterion("orderdate <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLike(String value) {
            addCriterion("orderdate like", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotLike(String value) {
            addCriterion("orderdate not like", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<String> values) {
            addCriterion("orderdate in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<String> values) {
            addCriterion("orderdate not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(String value1, String value2) {
            addCriterion("orderdate between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(String value1, String value2) {
            addCriterion("orderdate not between", value1, value2, "orderdate");
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

        public Criteria andStylenameIsNull() {
            addCriterion("stylename is null");
            return (Criteria) this;
        }

        public Criteria andStylenameIsNotNull() {
            addCriterion("stylename is not null");
            return (Criteria) this;
        }

        public Criteria andStylenameEqualTo(String value) {
            addCriterion("stylename =", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameNotEqualTo(String value) {
            addCriterion("stylename <>", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameGreaterThan(String value) {
            addCriterion("stylename >", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameGreaterThanOrEqualTo(String value) {
            addCriterion("stylename >=", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameLessThan(String value) {
            addCriterion("stylename <", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameLessThanOrEqualTo(String value) {
            addCriterion("stylename <=", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameLike(String value) {
            addCriterion("stylename like", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameNotLike(String value) {
            addCriterion("stylename not like", value, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameIn(List<String> values) {
            addCriterion("stylename in", values, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameNotIn(List<String> values) {
            addCriterion("stylename not in", values, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameBetween(String value1, String value2) {
            addCriterion("stylename between", value1, value2, "stylename");
            return (Criteria) this;
        }

        public Criteria andStylenameNotBetween(String value1, String value2) {
            addCriterion("stylename not between", value1, value2, "stylename");
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

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andDocumentarypeopleIsNull() {
            addCriterion("documentarypeople is null");
            return (Criteria) this;
        }

        public Criteria andDocumentarypeopleIsNotNull() {
            addCriterion("documentarypeople is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentarypeopleEqualTo(String value) {
            addCriterion("documentarypeople =", value, "documentarypeople");
            return (Criteria) this;
        }

        public Criteria andDocumentarypeopleNotEqualTo(String value) {
            addCriterion("documentarypeople <>", value, "documentarypeople");
            return (Criteria) this;
        }

        public Criteria andDocumentarypeopleGreaterThan(String value) {
            addCriterion("documentarypeople >", value, "documentarypeople");
            return (Criteria) this;
        }

        public Criteria andDocumentarypeopleGreaterThanOrEqualTo(String value) {
            addCriterion("documentarypeople >=", value, "documentarypeople");
            return (Criteria) this;
        }

        public Criteria andDocumentarypeopleLessThan(String value) {
            addCriterion("documentarypeople <", value, "documentarypeople");
            return (Criteria) this;
        }

        public Criteria andDocumentarypeopleLessThanOrEqualTo(String value) {
            addCriterion("documentarypeople <=", value, "documentarypeople");
            return (Criteria) this;
        }

        public Criteria andDocumentarypeopleLike(String value) {
            addCriterion("documentarypeople like", value, "documentarypeople");
            return (Criteria) this;
        }

        public Criteria andDocumentarypeopleNotLike(String value) {
            addCriterion("documentarypeople not like", value, "documentarypeople");
            return (Criteria) this;
        }

        public Criteria andDocumentarypeopleIn(List<String> values) {
            addCriterion("documentarypeople in", values, "documentarypeople");
            return (Criteria) this;
        }

        public Criteria andDocumentarypeopleNotIn(List<String> values) {
            addCriterion("documentarypeople not in", values, "documentarypeople");
            return (Criteria) this;
        }

        public Criteria andDocumentarypeopleBetween(String value1, String value2) {
            addCriterion("documentarypeople between", value1, value2, "documentarypeople");
            return (Criteria) this;
        }

        public Criteria andDocumentarypeopleNotBetween(String value1, String value2) {
            addCriterion("documentarypeople not between", value1, value2, "documentarypeople");
            return (Criteria) this;
        }

        public Criteria andNormalhoursIsNull() {
            addCriterion("normalhours is null");
            return (Criteria) this;
        }

        public Criteria andNormalhoursIsNotNull() {
            addCriterion("normalhours is not null");
            return (Criteria) this;
        }

        public Criteria andNormalhoursEqualTo(Integer value) {
            addCriterion("normalhours =", value, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursNotEqualTo(Integer value) {
            addCriterion("normalhours <>", value, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursGreaterThan(Integer value) {
            addCriterion("normalhours >", value, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("normalhours >=", value, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursLessThan(Integer value) {
            addCriterion("normalhours <", value, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursLessThanOrEqualTo(Integer value) {
            addCriterion("normalhours <=", value, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursIn(List<Integer> values) {
            addCriterion("normalhours in", values, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursNotIn(List<Integer> values) {
            addCriterion("normalhours not in", values, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursBetween(Integer value1, Integer value2) {
            addCriterion("normalhours between", value1, value2, "normalhours");
            return (Criteria) this;
        }

        public Criteria andNormalhoursNotBetween(Integer value1, Integer value2) {
            addCriterion("normalhours not between", value1, value2, "normalhours");
            return (Criteria) this;
        }

        public Criteria andTotalnumerIsNull() {
            addCriterion("totalnumer is null");
            return (Criteria) this;
        }

        public Criteria andTotalnumerIsNotNull() {
            addCriterion("totalnumer is not null");
            return (Criteria) this;
        }

        public Criteria andTotalnumerEqualTo(Integer value) {
            addCriterion("totalnumer =", value, "totalnumer");
            return (Criteria) this;
        }

        public Criteria andTotalnumerNotEqualTo(Integer value) {
            addCriterion("totalnumer <>", value, "totalnumer");
            return (Criteria) this;
        }

        public Criteria andTotalnumerGreaterThan(Integer value) {
            addCriterion("totalnumer >", value, "totalnumer");
            return (Criteria) this;
        }

        public Criteria andTotalnumerGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalnumer >=", value, "totalnumer");
            return (Criteria) this;
        }

        public Criteria andTotalnumerLessThan(Integer value) {
            addCriterion("totalnumer <", value, "totalnumer");
            return (Criteria) this;
        }

        public Criteria andTotalnumerLessThanOrEqualTo(Integer value) {
            addCriterion("totalnumer <=", value, "totalnumer");
            return (Criteria) this;
        }

        public Criteria andTotalnumerIn(List<Integer> values) {
            addCriterion("totalnumer in", values, "totalnumer");
            return (Criteria) this;
        }

        public Criteria andTotalnumerNotIn(List<Integer> values) {
            addCriterion("totalnumer not in", values, "totalnumer");
            return (Criteria) this;
        }

        public Criteria andTotalnumerBetween(Integer value1, Integer value2) {
            addCriterion("totalnumer between", value1, value2, "totalnumer");
            return (Criteria) this;
        }

        public Criteria andTotalnumerNotBetween(Integer value1, Integer value2) {
            addCriterion("totalnumer not between", value1, value2, "totalnumer");
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andJisuanmodelIsNull() {
            addCriterion("jisuanmodel is null");
            return (Criteria) this;
        }

        public Criteria andJisuanmodelIsNotNull() {
            addCriterion("jisuanmodel is not null");
            return (Criteria) this;
        }

        public Criteria andJisuanmodelEqualTo(String value) {
            addCriterion("jisuanmodel =", value, "jisuanmodel");
            return (Criteria) this;
        }

        public Criteria andJisuanmodelNotEqualTo(String value) {
            addCriterion("jisuanmodel <>", value, "jisuanmodel");
            return (Criteria) this;
        }

        public Criteria andJisuanmodelGreaterThan(String value) {
            addCriterion("jisuanmodel >", value, "jisuanmodel");
            return (Criteria) this;
        }

        public Criteria andJisuanmodelGreaterThanOrEqualTo(String value) {
            addCriterion("jisuanmodel >=", value, "jisuanmodel");
            return (Criteria) this;
        }

        public Criteria andJisuanmodelLessThan(String value) {
            addCriterion("jisuanmodel <", value, "jisuanmodel");
            return (Criteria) this;
        }

        public Criteria andJisuanmodelLessThanOrEqualTo(String value) {
            addCriterion("jisuanmodel <=", value, "jisuanmodel");
            return (Criteria) this;
        }

        public Criteria andJisuanmodelLike(String value) {
            addCriterion("jisuanmodel like", value, "jisuanmodel");
            return (Criteria) this;
        }

        public Criteria andJisuanmodelNotLike(String value) {
            addCriterion("jisuanmodel not like", value, "jisuanmodel");
            return (Criteria) this;
        }

        public Criteria andJisuanmodelIn(List<String> values) {
            addCriterion("jisuanmodel in", values, "jisuanmodel");
            return (Criteria) this;
        }

        public Criteria andJisuanmodelNotIn(List<String> values) {
            addCriterion("jisuanmodel not in", values, "jisuanmodel");
            return (Criteria) this;
        }

        public Criteria andJisuanmodelBetween(String value1, String value2) {
            addCriterion("jisuanmodel between", value1, value2, "jisuanmodel");
            return (Criteria) this;
        }

        public Criteria andJisuanmodelNotBetween(String value1, String value2) {
            addCriterion("jisuanmodel not between", value1, value2, "jisuanmodel");
            return (Criteria) this;
        }

        public Criteria andAmounttotalIsNull() {
            addCriterion("amounttotal is null");
            return (Criteria) this;
        }

        public Criteria andAmounttotalIsNotNull() {
            addCriterion("amounttotal is not null");
            return (Criteria) this;
        }

        public Criteria andAmounttotalEqualTo(Double value) {
            addCriterion("amounttotal =", value, "amounttotal");
            return (Criteria) this;
        }

        public Criteria andAmounttotalNotEqualTo(Double value) {
            addCriterion("amounttotal <>", value, "amounttotal");
            return (Criteria) this;
        }

        public Criteria andAmounttotalGreaterThan(Double value) {
            addCriterion("amounttotal >", value, "amounttotal");
            return (Criteria) this;
        }

        public Criteria andAmounttotalGreaterThanOrEqualTo(Double value) {
            addCriterion("amounttotal >=", value, "amounttotal");
            return (Criteria) this;
        }

        public Criteria andAmounttotalLessThan(Double value) {
            addCriterion("amounttotal <", value, "amounttotal");
            return (Criteria) this;
        }

        public Criteria andAmounttotalLessThanOrEqualTo(Double value) {
            addCriterion("amounttotal <=", value, "amounttotal");
            return (Criteria) this;
        }

        public Criteria andAmounttotalIn(List<Double> values) {
            addCriterion("amounttotal in", values, "amounttotal");
            return (Criteria) this;
        }

        public Criteria andAmounttotalNotIn(List<Double> values) {
            addCriterion("amounttotal not in", values, "amounttotal");
            return (Criteria) this;
        }

        public Criteria andAmounttotalBetween(Double value1, Double value2) {
            addCriterion("amounttotal between", value1, value2, "amounttotal");
            return (Criteria) this;
        }

        public Criteria andAmounttotalNotBetween(Double value1, Double value2) {
            addCriterion("amounttotal not between", value1, value2, "amounttotal");
            return (Criteria) this;
        }

        public Criteria andUsekucunIsNull() {
            addCriterion("usekucun is null");
            return (Criteria) this;
        }

        public Criteria andUsekucunIsNotNull() {
            addCriterion("usekucun is not null");
            return (Criteria) this;
        }

        public Criteria andUsekucunEqualTo(Integer value) {
            addCriterion("usekucun =", value, "usekucun");
            return (Criteria) this;
        }

        public Criteria andUsekucunNotEqualTo(Integer value) {
            addCriterion("usekucun <>", value, "usekucun");
            return (Criteria) this;
        }

        public Criteria andUsekucunGreaterThan(Integer value) {
            addCriterion("usekucun >", value, "usekucun");
            return (Criteria) this;
        }

        public Criteria andUsekucunGreaterThanOrEqualTo(Integer value) {
            addCriterion("usekucun >=", value, "usekucun");
            return (Criteria) this;
        }

        public Criteria andUsekucunLessThan(Integer value) {
            addCriterion("usekucun <", value, "usekucun");
            return (Criteria) this;
        }

        public Criteria andUsekucunLessThanOrEqualTo(Integer value) {
            addCriterion("usekucun <=", value, "usekucun");
            return (Criteria) this;
        }

        public Criteria andUsekucunIn(List<Integer> values) {
            addCriterion("usekucun in", values, "usekucun");
            return (Criteria) this;
        }

        public Criteria andUsekucunNotIn(List<Integer> values) {
            addCriterion("usekucun not in", values, "usekucun");
            return (Criteria) this;
        }

        public Criteria andUsekucunBetween(Integer value1, Integer value2) {
            addCriterion("usekucun between", value1, value2, "usekucun");
            return (Criteria) this;
        }

        public Criteria andUsekucunNotBetween(Integer value1, Integer value2) {
            addCriterion("usekucun not between", value1, value2, "usekucun");
            return (Criteria) this;
        }

        public Criteria andMaterialcombinedIsNull() {
            addCriterion("materialcombined is null");
            return (Criteria) this;
        }

        public Criteria andMaterialcombinedIsNotNull() {
            addCriterion("materialcombined is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialcombinedEqualTo(Integer value) {
            addCriterion("materialcombined =", value, "materialcombined");
            return (Criteria) this;
        }

        public Criteria andMaterialcombinedNotEqualTo(Integer value) {
            addCriterion("materialcombined <>", value, "materialcombined");
            return (Criteria) this;
        }

        public Criteria andMaterialcombinedGreaterThan(Integer value) {
            addCriterion("materialcombined >", value, "materialcombined");
            return (Criteria) this;
        }

        public Criteria andMaterialcombinedGreaterThanOrEqualTo(Integer value) {
            addCriterion("materialcombined >=", value, "materialcombined");
            return (Criteria) this;
        }

        public Criteria andMaterialcombinedLessThan(Integer value) {
            addCriterion("materialcombined <", value, "materialcombined");
            return (Criteria) this;
        }

        public Criteria andMaterialcombinedLessThanOrEqualTo(Integer value) {
            addCriterion("materialcombined <=", value, "materialcombined");
            return (Criteria) this;
        }

        public Criteria andMaterialcombinedIn(List<Integer> values) {
            addCriterion("materialcombined in", values, "materialcombined");
            return (Criteria) this;
        }

        public Criteria andMaterialcombinedNotIn(List<Integer> values) {
            addCriterion("materialcombined not in", values, "materialcombined");
            return (Criteria) this;
        }

        public Criteria andMaterialcombinedBetween(Integer value1, Integer value2) {
            addCriterion("materialcombined between", value1, value2, "materialcombined");
            return (Criteria) this;
        }

        public Criteria andMaterialcombinedNotBetween(Integer value1, Integer value2) {
            addCriterion("materialcombined not between", value1, value2, "materialcombined");
            return (Criteria) this;
        }

        public Criteria andLabourcostIsNull() {
            addCriterion("labourcost is null");
            return (Criteria) this;
        }

        public Criteria andLabourcostIsNotNull() {
            addCriterion("labourcost is not null");
            return (Criteria) this;
        }

        public Criteria andLabourcostEqualTo(Double value) {
            addCriterion("labourcost =", value, "labourcost");
            return (Criteria) this;
        }

        public Criteria andLabourcostNotEqualTo(Double value) {
            addCriterion("labourcost <>", value, "labourcost");
            return (Criteria) this;
        }

        public Criteria andLabourcostGreaterThan(Double value) {
            addCriterion("labourcost >", value, "labourcost");
            return (Criteria) this;
        }

        public Criteria andLabourcostGreaterThanOrEqualTo(Double value) {
            addCriterion("labourcost >=", value, "labourcost");
            return (Criteria) this;
        }

        public Criteria andLabourcostLessThan(Double value) {
            addCriterion("labourcost <", value, "labourcost");
            return (Criteria) this;
        }

        public Criteria andLabourcostLessThanOrEqualTo(Double value) {
            addCriterion("labourcost <=", value, "labourcost");
            return (Criteria) this;
        }

        public Criteria andLabourcostIn(List<Double> values) {
            addCriterion("labourcost in", values, "labourcost");
            return (Criteria) this;
        }

        public Criteria andLabourcostNotIn(List<Double> values) {
            addCriterion("labourcost not in", values, "labourcost");
            return (Criteria) this;
        }

        public Criteria andLabourcostBetween(Double value1, Double value2) {
            addCriterion("labourcost between", value1, value2, "labourcost");
            return (Criteria) this;
        }

        public Criteria andLabourcostNotBetween(Double value1, Double value2) {
            addCriterion("labourcost not between", value1, value2, "labourcost");
            return (Criteria) this;
        }

        public Criteria andAllcostIsNull() {
            addCriterion("allcost is null");
            return (Criteria) this;
        }

        public Criteria andAllcostIsNotNull() {
            addCriterion("allcost is not null");
            return (Criteria) this;
        }

        public Criteria andAllcostEqualTo(Double value) {
            addCriterion("allcost =", value, "allcost");
            return (Criteria) this;
        }

        public Criteria andAllcostNotEqualTo(Double value) {
            addCriterion("allcost <>", value, "allcost");
            return (Criteria) this;
        }

        public Criteria andAllcostGreaterThan(Double value) {
            addCriterion("allcost >", value, "allcost");
            return (Criteria) this;
        }

        public Criteria andAllcostGreaterThanOrEqualTo(Double value) {
            addCriterion("allcost >=", value, "allcost");
            return (Criteria) this;
        }

        public Criteria andAllcostLessThan(Double value) {
            addCriterion("allcost <", value, "allcost");
            return (Criteria) this;
        }

        public Criteria andAllcostLessThanOrEqualTo(Double value) {
            addCriterion("allcost <=", value, "allcost");
            return (Criteria) this;
        }

        public Criteria andAllcostIn(List<Double> values) {
            addCriterion("allcost in", values, "allcost");
            return (Criteria) this;
        }

        public Criteria andAllcostNotIn(List<Double> values) {
            addCriterion("allcost not in", values, "allcost");
            return (Criteria) this;
        }

        public Criteria andAllcostBetween(Double value1, Double value2) {
            addCriterion("allcost between", value1, value2, "allcost");
            return (Criteria) this;
        }

        public Criteria andAllcostNotBetween(Double value1, Double value2) {
            addCriterion("allcost not between", value1, value2, "allcost");
            return (Criteria) this;
        }

        public Criteria andForecastprofitsIsNull() {
            addCriterion("forecastprofits is null");
            return (Criteria) this;
        }

        public Criteria andForecastprofitsIsNotNull() {
            addCriterion("forecastprofits is not null");
            return (Criteria) this;
        }

        public Criteria andForecastprofitsEqualTo(Double value) {
            addCriterion("forecastprofits =", value, "forecastprofits");
            return (Criteria) this;
        }

        public Criteria andForecastprofitsNotEqualTo(Double value) {
            addCriterion("forecastprofits <>", value, "forecastprofits");
            return (Criteria) this;
        }

        public Criteria andForecastprofitsGreaterThan(Double value) {
            addCriterion("forecastprofits >", value, "forecastprofits");
            return (Criteria) this;
        }

        public Criteria andForecastprofitsGreaterThanOrEqualTo(Double value) {
            addCriterion("forecastprofits >=", value, "forecastprofits");
            return (Criteria) this;
        }

        public Criteria andForecastprofitsLessThan(Double value) {
            addCriterion("forecastprofits <", value, "forecastprofits");
            return (Criteria) this;
        }

        public Criteria andForecastprofitsLessThanOrEqualTo(Double value) {
            addCriterion("forecastprofits <=", value, "forecastprofits");
            return (Criteria) this;
        }

        public Criteria andForecastprofitsIn(List<Double> values) {
            addCriterion("forecastprofits in", values, "forecastprofits");
            return (Criteria) this;
        }

        public Criteria andForecastprofitsNotIn(List<Double> values) {
            addCriterion("forecastprofits not in", values, "forecastprofits");
            return (Criteria) this;
        }

        public Criteria andForecastprofitsBetween(Double value1, Double value2) {
            addCriterion("forecastprofits between", value1, value2, "forecastprofits");
            return (Criteria) this;
        }

        public Criteria andForecastprofitsNotBetween(Double value1, Double value2) {
            addCriterion("forecastprofits not between", value1, value2, "forecastprofits");
            return (Criteria) this;
        }

        public Criteria andOredermoneyIsNull() {
            addCriterion("oredermoney is null");
            return (Criteria) this;
        }

        public Criteria andOredermoneyIsNotNull() {
            addCriterion("oredermoney is not null");
            return (Criteria) this;
        }

        public Criteria andOredermoneyEqualTo(Double value) {
            addCriterion("oredermoney =", value, "oredermoney");
            return (Criteria) this;
        }

        public Criteria andOredermoneyNotEqualTo(Double value) {
            addCriterion("oredermoney <>", value, "oredermoney");
            return (Criteria) this;
        }

        public Criteria andOredermoneyGreaterThan(Double value) {
            addCriterion("oredermoney >", value, "oredermoney");
            return (Criteria) this;
        }

        public Criteria andOredermoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("oredermoney >=", value, "oredermoney");
            return (Criteria) this;
        }

        public Criteria andOredermoneyLessThan(Double value) {
            addCriterion("oredermoney <", value, "oredermoney");
            return (Criteria) this;
        }

        public Criteria andOredermoneyLessThanOrEqualTo(Double value) {
            addCriterion("oredermoney <=", value, "oredermoney");
            return (Criteria) this;
        }

        public Criteria andOredermoneyIn(List<Double> values) {
            addCriterion("oredermoney in", values, "oredermoney");
            return (Criteria) this;
        }

        public Criteria andOredermoneyNotIn(List<Double> values) {
            addCriterion("oredermoney not in", values, "oredermoney");
            return (Criteria) this;
        }

        public Criteria andOredermoneyBetween(Double value1, Double value2) {
            addCriterion("oredermoney between", value1, value2, "oredermoney");
            return (Criteria) this;
        }

        public Criteria andOredermoneyNotBetween(Double value1, Double value2) {
            addCriterion("oredermoney not between", value1, value2, "oredermoney");
            return (Criteria) this;
        }

        public Criteria andInputmoneyIsNull() {
            addCriterion("inputmoney is null");
            return (Criteria) this;
        }

        public Criteria andInputmoneyIsNotNull() {
            addCriterion("inputmoney is not null");
            return (Criteria) this;
        }

        public Criteria andInputmoneyEqualTo(Double value) {
            addCriterion("inputmoney =", value, "inputmoney");
            return (Criteria) this;
        }

        public Criteria andInputmoneyNotEqualTo(Double value) {
            addCriterion("inputmoney <>", value, "inputmoney");
            return (Criteria) this;
        }

        public Criteria andInputmoneyGreaterThan(Double value) {
            addCriterion("inputmoney >", value, "inputmoney");
            return (Criteria) this;
        }

        public Criteria andInputmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("inputmoney >=", value, "inputmoney");
            return (Criteria) this;
        }

        public Criteria andInputmoneyLessThan(Double value) {
            addCriterion("inputmoney <", value, "inputmoney");
            return (Criteria) this;
        }

        public Criteria andInputmoneyLessThanOrEqualTo(Double value) {
            addCriterion("inputmoney <=", value, "inputmoney");
            return (Criteria) this;
        }

        public Criteria andInputmoneyIn(List<Double> values) {
            addCriterion("inputmoney in", values, "inputmoney");
            return (Criteria) this;
        }

        public Criteria andInputmoneyNotIn(List<Double> values) {
            addCriterion("inputmoney not in", values, "inputmoney");
            return (Criteria) this;
        }

        public Criteria andInputmoneyBetween(Double value1, Double value2) {
            addCriterion("inputmoney between", value1, value2, "inputmoney");
            return (Criteria) this;
        }

        public Criteria andInputmoneyNotBetween(Double value1, Double value2) {
            addCriterion("inputmoney not between", value1, value2, "inputmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyIsNull() {
            addCriterion("outmoney is null");
            return (Criteria) this;
        }

        public Criteria andOutmoneyIsNotNull() {
            addCriterion("outmoney is not null");
            return (Criteria) this;
        }

        public Criteria andOutmoneyEqualTo(Double value) {
            addCriterion("outmoney =", value, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyNotEqualTo(Double value) {
            addCriterion("outmoney <>", value, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyGreaterThan(Double value) {
            addCriterion("outmoney >", value, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("outmoney >=", value, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyLessThan(Double value) {
            addCriterion("outmoney <", value, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyLessThanOrEqualTo(Double value) {
            addCriterion("outmoney <=", value, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyIn(List<Double> values) {
            addCriterion("outmoney in", values, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyNotIn(List<Double> values) {
            addCriterion("outmoney not in", values, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyBetween(Double value1, Double value2) {
            addCriterion("outmoney between", value1, value2, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyNotBetween(Double value1, Double value2) {
            addCriterion("outmoney not between", value1, value2, "outmoney");
            return (Criteria) this;
        }

        public Criteria andAccpetmoneyIsNull() {
            addCriterion("accpetmoney is null");
            return (Criteria) this;
        }

        public Criteria andAccpetmoneyIsNotNull() {
            addCriterion("accpetmoney is not null");
            return (Criteria) this;
        }

        public Criteria andAccpetmoneyEqualTo(Double value) {
            addCriterion("accpetmoney =", value, "accpetmoney");
            return (Criteria) this;
        }

        public Criteria andAccpetmoneyNotEqualTo(Double value) {
            addCriterion("accpetmoney <>", value, "accpetmoney");
            return (Criteria) this;
        }

        public Criteria andAccpetmoneyGreaterThan(Double value) {
            addCriterion("accpetmoney >", value, "accpetmoney");
            return (Criteria) this;
        }

        public Criteria andAccpetmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("accpetmoney >=", value, "accpetmoney");
            return (Criteria) this;
        }

        public Criteria andAccpetmoneyLessThan(Double value) {
            addCriterion("accpetmoney <", value, "accpetmoney");
            return (Criteria) this;
        }

        public Criteria andAccpetmoneyLessThanOrEqualTo(Double value) {
            addCriterion("accpetmoney <=", value, "accpetmoney");
            return (Criteria) this;
        }

        public Criteria andAccpetmoneyIn(List<Double> values) {
            addCriterion("accpetmoney in", values, "accpetmoney");
            return (Criteria) this;
        }

        public Criteria andAccpetmoneyNotIn(List<Double> values) {
            addCriterion("accpetmoney not in", values, "accpetmoney");
            return (Criteria) this;
        }

        public Criteria andAccpetmoneyBetween(Double value1, Double value2) {
            addCriterion("accpetmoney between", value1, value2, "accpetmoney");
            return (Criteria) this;
        }

        public Criteria andAccpetmoneyNotBetween(Double value1, Double value2) {
            addCriterion("accpetmoney not between", value1, value2, "accpetmoney");
            return (Criteria) this;
        }

        public Criteria andAccpetstatusIsNull() {
            addCriterion("accpetstatus is null");
            return (Criteria) this;
        }

        public Criteria andAccpetstatusIsNotNull() {
            addCriterion("accpetstatus is not null");
            return (Criteria) this;
        }

        public Criteria andAccpetstatusEqualTo(Integer value) {
            addCriterion("accpetstatus =", value, "accpetstatus");
            return (Criteria) this;
        }

        public Criteria andAccpetstatusNotEqualTo(Integer value) {
            addCriterion("accpetstatus <>", value, "accpetstatus");
            return (Criteria) this;
        }

        public Criteria andAccpetstatusGreaterThan(Integer value) {
            addCriterion("accpetstatus >", value, "accpetstatus");
            return (Criteria) this;
        }

        public Criteria andAccpetstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("accpetstatus >=", value, "accpetstatus");
            return (Criteria) this;
        }

        public Criteria andAccpetstatusLessThan(Integer value) {
            addCriterion("accpetstatus <", value, "accpetstatus");
            return (Criteria) this;
        }

        public Criteria andAccpetstatusLessThanOrEqualTo(Integer value) {
            addCriterion("accpetstatus <=", value, "accpetstatus");
            return (Criteria) this;
        }

        public Criteria andAccpetstatusIn(List<Integer> values) {
            addCriterion("accpetstatus in", values, "accpetstatus");
            return (Criteria) this;
        }

        public Criteria andAccpetstatusNotIn(List<Integer> values) {
            addCriterion("accpetstatus not in", values, "accpetstatus");
            return (Criteria) this;
        }

        public Criteria andAccpetstatusBetween(Integer value1, Integer value2) {
            addCriterion("accpetstatus between", value1, value2, "accpetstatus");
            return (Criteria) this;
        }

        public Criteria andAccpetstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("accpetstatus not between", value1, value2, "accpetstatus");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNull() {
            addCriterion("paydate is null");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNotNull() {
            addCriterion("paydate is not null");
            return (Criteria) this;
        }

        public Criteria andPaydateEqualTo(String value) {
            addCriterion("paydate =", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotEqualTo(String value) {
            addCriterion("paydate <>", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThan(String value) {
            addCriterion("paydate >", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThanOrEqualTo(String value) {
            addCriterion("paydate >=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThan(String value) {
            addCriterion("paydate <", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThanOrEqualTo(String value) {
            addCriterion("paydate <=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLike(String value) {
            addCriterion("paydate like", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotLike(String value) {
            addCriterion("paydate not like", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateIn(List<String> values) {
            addCriterion("paydate in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotIn(List<String> values) {
            addCriterion("paydate not in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateBetween(String value1, String value2) {
            addCriterion("paydate between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotBetween(String value1, String value2) {
            addCriterion("paydate not between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andAccpetbeforedateIsNull() {
            addCriterion("accpetbeforedate is null");
            return (Criteria) this;
        }

        public Criteria andAccpetbeforedateIsNotNull() {
            addCriterion("accpetbeforedate is not null");
            return (Criteria) this;
        }

        public Criteria andAccpetbeforedateEqualTo(String value) {
            addCriterion("accpetbeforedate =", value, "accpetbeforedate");
            return (Criteria) this;
        }

        public Criteria andAccpetbeforedateNotEqualTo(String value) {
            addCriterion("accpetbeforedate <>", value, "accpetbeforedate");
            return (Criteria) this;
        }

        public Criteria andAccpetbeforedateGreaterThan(String value) {
            addCriterion("accpetbeforedate >", value, "accpetbeforedate");
            return (Criteria) this;
        }

        public Criteria andAccpetbeforedateGreaterThanOrEqualTo(String value) {
            addCriterion("accpetbeforedate >=", value, "accpetbeforedate");
            return (Criteria) this;
        }

        public Criteria andAccpetbeforedateLessThan(String value) {
            addCriterion("accpetbeforedate <", value, "accpetbeforedate");
            return (Criteria) this;
        }

        public Criteria andAccpetbeforedateLessThanOrEqualTo(String value) {
            addCriterion("accpetbeforedate <=", value, "accpetbeforedate");
            return (Criteria) this;
        }

        public Criteria andAccpetbeforedateLike(String value) {
            addCriterion("accpetbeforedate like", value, "accpetbeforedate");
            return (Criteria) this;
        }

        public Criteria andAccpetbeforedateNotLike(String value) {
            addCriterion("accpetbeforedate not like", value, "accpetbeforedate");
            return (Criteria) this;
        }

        public Criteria andAccpetbeforedateIn(List<String> values) {
            addCriterion("accpetbeforedate in", values, "accpetbeforedate");
            return (Criteria) this;
        }

        public Criteria andAccpetbeforedateNotIn(List<String> values) {
            addCriterion("accpetbeforedate not in", values, "accpetbeforedate");
            return (Criteria) this;
        }

        public Criteria andAccpetbeforedateBetween(String value1, String value2) {
            addCriterion("accpetbeforedate between", value1, value2, "accpetbeforedate");
            return (Criteria) this;
        }

        public Criteria andAccpetbeforedateNotBetween(String value1, String value2) {
            addCriterion("accpetbeforedate not between", value1, value2, "accpetbeforedate");
            return (Criteria) this;
        }

        public Criteria andAccpetafterdateIsNull() {
            addCriterion("accpetafterdate is null");
            return (Criteria) this;
        }

        public Criteria andAccpetafterdateIsNotNull() {
            addCriterion("accpetafterdate is not null");
            return (Criteria) this;
        }

        public Criteria andAccpetafterdateEqualTo(String value) {
            addCriterion("accpetafterdate =", value, "accpetafterdate");
            return (Criteria) this;
        }

        public Criteria andAccpetafterdateNotEqualTo(String value) {
            addCriterion("accpetafterdate <>", value, "accpetafterdate");
            return (Criteria) this;
        }

        public Criteria andAccpetafterdateGreaterThan(String value) {
            addCriterion("accpetafterdate >", value, "accpetafterdate");
            return (Criteria) this;
        }

        public Criteria andAccpetafterdateGreaterThanOrEqualTo(String value) {
            addCriterion("accpetafterdate >=", value, "accpetafterdate");
            return (Criteria) this;
        }

        public Criteria andAccpetafterdateLessThan(String value) {
            addCriterion("accpetafterdate <", value, "accpetafterdate");
            return (Criteria) this;
        }

        public Criteria andAccpetafterdateLessThanOrEqualTo(String value) {
            addCriterion("accpetafterdate <=", value, "accpetafterdate");
            return (Criteria) this;
        }

        public Criteria andAccpetafterdateLike(String value) {
            addCriterion("accpetafterdate like", value, "accpetafterdate");
            return (Criteria) this;
        }

        public Criteria andAccpetafterdateNotLike(String value) {
            addCriterion("accpetafterdate not like", value, "accpetafterdate");
            return (Criteria) this;
        }

        public Criteria andAccpetafterdateIn(List<String> values) {
            addCriterion("accpetafterdate in", values, "accpetafterdate");
            return (Criteria) this;
        }

        public Criteria andAccpetafterdateNotIn(List<String> values) {
            addCriterion("accpetafterdate not in", values, "accpetafterdate");
            return (Criteria) this;
        }

        public Criteria andAccpetafterdateBetween(String value1, String value2) {
            addCriterion("accpetafterdate between", value1, value2, "accpetafterdate");
            return (Criteria) this;
        }

        public Criteria andAccpetafterdateNotBetween(String value1, String value2) {
            addCriterion("accpetafterdate not between", value1, value2, "accpetafterdate");
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