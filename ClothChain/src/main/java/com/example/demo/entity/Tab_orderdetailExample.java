package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_orderdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_orderdetailExample() {
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

        public Criteria andOrderdetailidIsNull() {
            addCriterion("orderdetailid is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIsNotNull() {
            addCriterion("orderdetailid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidEqualTo(Integer value) {
            addCriterion("orderdetailid =", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotEqualTo(Integer value) {
            addCriterion("orderdetailid <>", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidGreaterThan(Integer value) {
            addCriterion("orderdetailid >", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderdetailid >=", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLessThan(Integer value) {
            addCriterion("orderdetailid <", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLessThanOrEqualTo(Integer value) {
            addCriterion("orderdetailid <=", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIn(List<Integer> values) {
            addCriterion("orderdetailid in", values, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotIn(List<Integer> values) {
            addCriterion("orderdetailid not in", values, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidBetween(Integer value1, Integer value2) {
            addCriterion("orderdetailid between", value1, value2, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderdetailid not between", value1, value2, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidIsNull() {
            addCriterion("quarterlyid is null");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidIsNotNull() {
            addCriterion("quarterlyid is not null");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidEqualTo(Integer value) {
            addCriterion("quarterlyid =", value, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidNotEqualTo(Integer value) {
            addCriterion("quarterlyid <>", value, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidGreaterThan(Integer value) {
            addCriterion("quarterlyid >", value, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("quarterlyid >=", value, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidLessThan(Integer value) {
            addCriterion("quarterlyid <", value, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidLessThanOrEqualTo(Integer value) {
            addCriterion("quarterlyid <=", value, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidIn(List<Integer> values) {
            addCriterion("quarterlyid in", values, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidNotIn(List<Integer> values) {
            addCriterion("quarterlyid not in", values, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidBetween(Integer value1, Integer value2) {
            addCriterion("quarterlyid between", value1, value2, "quarterlyid");
            return (Criteria) this;
        }

        public Criteria andQuarterlyidNotBetween(Integer value1, Integer value2) {
            addCriterion("quarterlyid not between", value1, value2, "quarterlyid");
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

        public Criteria andBrandidIsNull() {
            addCriterion("brandid is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("brandid is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(Integer value) {
            addCriterion("brandid =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(Integer value) {
            addCriterion("brandid <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(Integer value) {
            addCriterion("brandid >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("brandid >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(Integer value) {
            addCriterion("brandid <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(Integer value) {
            addCriterion("brandid <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<Integer> values) {
            addCriterion("brandid in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<Integer> values) {
            addCriterion("brandid not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(Integer value1, Integer value2) {
            addCriterion("brandid between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("brandid not between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("orderno is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderno is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("orderno =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("orderno <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("orderno >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("orderno >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("orderno <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("orderno <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("orderno like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("orderno not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("orderno in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("orderno not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("orderno between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("orderno not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andStylenoIsNull() {
            addCriterion("styleno is null");
            return (Criteria) this;
        }

        public Criteria andStylenoIsNotNull() {
            addCriterion("styleno is not null");
            return (Criteria) this;
        }

        public Criteria andStylenoEqualTo(String value) {
            addCriterion("styleno =", value, "styleno");
            return (Criteria) this;
        }

        public Criteria andStylenoNotEqualTo(String value) {
            addCriterion("styleno <>", value, "styleno");
            return (Criteria) this;
        }

        public Criteria andStylenoGreaterThan(String value) {
            addCriterion("styleno >", value, "styleno");
            return (Criteria) this;
        }

        public Criteria andStylenoGreaterThanOrEqualTo(String value) {
            addCriterion("styleno >=", value, "styleno");
            return (Criteria) this;
        }

        public Criteria andStylenoLessThan(String value) {
            addCriterion("styleno <", value, "styleno");
            return (Criteria) this;
        }

        public Criteria andStylenoLessThanOrEqualTo(String value) {
            addCriterion("styleno <=", value, "styleno");
            return (Criteria) this;
        }

        public Criteria andStylenoLike(String value) {
            addCriterion("styleno like", value, "styleno");
            return (Criteria) this;
        }

        public Criteria andStylenoNotLike(String value) {
            addCriterion("styleno not like", value, "styleno");
            return (Criteria) this;
        }

        public Criteria andStylenoIn(List<String> values) {
            addCriterion("styleno in", values, "styleno");
            return (Criteria) this;
        }

        public Criteria andStylenoNotIn(List<String> values) {
            addCriterion("styleno not in", values, "styleno");
            return (Criteria) this;
        }

        public Criteria andStylenoBetween(String value1, String value2) {
            addCriterion("styleno between", value1, value2, "styleno");
            return (Criteria) this;
        }

        public Criteria andStylenoNotBetween(String value1, String value2) {
            addCriterion("styleno not between", value1, value2, "styleno");
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

        public Criteria andSinglepersonIsNull() {
            addCriterion("singleperson is null");
            return (Criteria) this;
        }

        public Criteria andSinglepersonIsNotNull() {
            addCriterion("singleperson is not null");
            return (Criteria) this;
        }

        public Criteria andSinglepersonEqualTo(String value) {
            addCriterion("singleperson =", value, "singleperson");
            return (Criteria) this;
        }

        public Criteria andSinglepersonNotEqualTo(String value) {
            addCriterion("singleperson <>", value, "singleperson");
            return (Criteria) this;
        }

        public Criteria andSinglepersonGreaterThan(String value) {
            addCriterion("singleperson >", value, "singleperson");
            return (Criteria) this;
        }

        public Criteria andSinglepersonGreaterThanOrEqualTo(String value) {
            addCriterion("singleperson >=", value, "singleperson");
            return (Criteria) this;
        }

        public Criteria andSinglepersonLessThan(String value) {
            addCriterion("singleperson <", value, "singleperson");
            return (Criteria) this;
        }

        public Criteria andSinglepersonLessThanOrEqualTo(String value) {
            addCriterion("singleperson <=", value, "singleperson");
            return (Criteria) this;
        }

        public Criteria andSinglepersonLike(String value) {
            addCriterion("singleperson like", value, "singleperson");
            return (Criteria) this;
        }

        public Criteria andSinglepersonNotLike(String value) {
            addCriterion("singleperson not like", value, "singleperson");
            return (Criteria) this;
        }

        public Criteria andSinglepersonIn(List<String> values) {
            addCriterion("singleperson in", values, "singleperson");
            return (Criteria) this;
        }

        public Criteria andSinglepersonNotIn(List<String> values) {
            addCriterion("singleperson not in", values, "singleperson");
            return (Criteria) this;
        }

        public Criteria andSinglepersonBetween(String value1, String value2) {
            addCriterion("singleperson between", value1, value2, "singleperson");
            return (Criteria) this;
        }

        public Criteria andSinglepersonNotBetween(String value1, String value2) {
            addCriterion("singleperson not between", value1, value2, "singleperson");
            return (Criteria) this;
        }

        public Criteria andTotalnumIsNull() {
            addCriterion("totalnum is null");
            return (Criteria) this;
        }

        public Criteria andTotalnumIsNotNull() {
            addCriterion("totalnum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalnumEqualTo(Integer value) {
            addCriterion("totalnum =", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotEqualTo(Integer value) {
            addCriterion("totalnum <>", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumGreaterThan(Integer value) {
            addCriterion("totalnum >", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalnum >=", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumLessThan(Integer value) {
            addCriterion("totalnum <", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumLessThanOrEqualTo(Integer value) {
            addCriterion("totalnum <=", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumIn(List<Integer> values) {
            addCriterion("totalnum in", values, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotIn(List<Integer> values) {
            addCriterion("totalnum not in", values, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumBetween(Integer value1, Integer value2) {
            addCriterion("totalnum between", value1, value2, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotBetween(Integer value1, Integer value2) {
            addCriterion("totalnum not between", value1, value2, "totalnum");
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

        public Criteria andMoneymodeIsNull() {
            addCriterion("moneymode is null");
            return (Criteria) this;
        }

        public Criteria andMoneymodeIsNotNull() {
            addCriterion("moneymode is not null");
            return (Criteria) this;
        }

        public Criteria andMoneymodeEqualTo(String value) {
            addCriterion("moneymode =", value, "moneymode");
            return (Criteria) this;
        }

        public Criteria andMoneymodeNotEqualTo(String value) {
            addCriterion("moneymode <>", value, "moneymode");
            return (Criteria) this;
        }

        public Criteria andMoneymodeGreaterThan(String value) {
            addCriterion("moneymode >", value, "moneymode");
            return (Criteria) this;
        }

        public Criteria andMoneymodeGreaterThanOrEqualTo(String value) {
            addCriterion("moneymode >=", value, "moneymode");
            return (Criteria) this;
        }

        public Criteria andMoneymodeLessThan(String value) {
            addCriterion("moneymode <", value, "moneymode");
            return (Criteria) this;
        }

        public Criteria andMoneymodeLessThanOrEqualTo(String value) {
            addCriterion("moneymode <=", value, "moneymode");
            return (Criteria) this;
        }

        public Criteria andMoneymodeLike(String value) {
            addCriterion("moneymode like", value, "moneymode");
            return (Criteria) this;
        }

        public Criteria andMoneymodeNotLike(String value) {
            addCriterion("moneymode not like", value, "moneymode");
            return (Criteria) this;
        }

        public Criteria andMoneymodeIn(List<String> values) {
            addCriterion("moneymode in", values, "moneymode");
            return (Criteria) this;
        }

        public Criteria andMoneymodeNotIn(List<String> values) {
            addCriterion("moneymode not in", values, "moneymode");
            return (Criteria) this;
        }

        public Criteria andMoneymodeBetween(String value1, String value2) {
            addCriterion("moneymode between", value1, value2, "moneymode");
            return (Criteria) this;
        }

        public Criteria andMoneymodeNotBetween(String value1, String value2) {
            addCriterion("moneymode not between", value1, value2, "moneymode");
            return (Criteria) this;
        }

        public Criteria andSettlemoneyIsNull() {
            addCriterion("settlemoney is null");
            return (Criteria) this;
        }

        public Criteria andSettlemoneyIsNotNull() {
            addCriterion("settlemoney is not null");
            return (Criteria) this;
        }

        public Criteria andSettlemoneyEqualTo(String value) {
            addCriterion("settlemoney =", value, "settlemoney");
            return (Criteria) this;
        }

        public Criteria andSettlemoneyNotEqualTo(String value) {
            addCriterion("settlemoney <>", value, "settlemoney");
            return (Criteria) this;
        }

        public Criteria andSettlemoneyGreaterThan(String value) {
            addCriterion("settlemoney >", value, "settlemoney");
            return (Criteria) this;
        }

        public Criteria andSettlemoneyGreaterThanOrEqualTo(String value) {
            addCriterion("settlemoney >=", value, "settlemoney");
            return (Criteria) this;
        }

        public Criteria andSettlemoneyLessThan(String value) {
            addCriterion("settlemoney <", value, "settlemoney");
            return (Criteria) this;
        }

        public Criteria andSettlemoneyLessThanOrEqualTo(String value) {
            addCriterion("settlemoney <=", value, "settlemoney");
            return (Criteria) this;
        }

        public Criteria andSettlemoneyLike(String value) {
            addCriterion("settlemoney like", value, "settlemoney");
            return (Criteria) this;
        }

        public Criteria andSettlemoneyNotLike(String value) {
            addCriterion("settlemoney not like", value, "settlemoney");
            return (Criteria) this;
        }

        public Criteria andSettlemoneyIn(List<String> values) {
            addCriterion("settlemoney in", values, "settlemoney");
            return (Criteria) this;
        }

        public Criteria andSettlemoneyNotIn(List<String> values) {
            addCriterion("settlemoney not in", values, "settlemoney");
            return (Criteria) this;
        }

        public Criteria andSettlemoneyBetween(String value1, String value2) {
            addCriterion("settlemoney between", value1, value2, "settlemoney");
            return (Criteria) this;
        }

        public Criteria andSettlemoneyNotBetween(String value1, String value2) {
            addCriterion("settlemoney not between", value1, value2, "settlemoney");
            return (Criteria) this;
        }

        public Criteria andMoneyphoneIsNull() {
            addCriterion("moneyphone is null");
            return (Criteria) this;
        }

        public Criteria andMoneyphoneIsNotNull() {
            addCriterion("moneyphone is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyphoneEqualTo(String value) {
            addCriterion("moneyphone =", value, "moneyphone");
            return (Criteria) this;
        }

        public Criteria andMoneyphoneNotEqualTo(String value) {
            addCriterion("moneyphone <>", value, "moneyphone");
            return (Criteria) this;
        }

        public Criteria andMoneyphoneGreaterThan(String value) {
            addCriterion("moneyphone >", value, "moneyphone");
            return (Criteria) this;
        }

        public Criteria andMoneyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("moneyphone >=", value, "moneyphone");
            return (Criteria) this;
        }

        public Criteria andMoneyphoneLessThan(String value) {
            addCriterion("moneyphone <", value, "moneyphone");
            return (Criteria) this;
        }

        public Criteria andMoneyphoneLessThanOrEqualTo(String value) {
            addCriterion("moneyphone <=", value, "moneyphone");
            return (Criteria) this;
        }

        public Criteria andMoneyphoneLike(String value) {
            addCriterion("moneyphone like", value, "moneyphone");
            return (Criteria) this;
        }

        public Criteria andMoneyphoneNotLike(String value) {
            addCriterion("moneyphone not like", value, "moneyphone");
            return (Criteria) this;
        }

        public Criteria andMoneyphoneIn(List<String> values) {
            addCriterion("moneyphone in", values, "moneyphone");
            return (Criteria) this;
        }

        public Criteria andMoneyphoneNotIn(List<String> values) {
            addCriterion("moneyphone not in", values, "moneyphone");
            return (Criteria) this;
        }

        public Criteria andMoneyphoneBetween(String value1, String value2) {
            addCriterion("moneyphone between", value1, value2, "moneyphone");
            return (Criteria) this;
        }

        public Criteria andMoneyphoneNotBetween(String value1, String value2) {
            addCriterion("moneyphone not between", value1, value2, "moneyphone");
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

        public Criteria andTotalmoneyIsNull() {
            addCriterion("totalmoney is null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNotNull() {
            addCriterion("totalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyEqualTo(Double value) {
            addCriterion("totalmoney =", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotEqualTo(Double value) {
            addCriterion("totalmoney <>", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThan(Double value) {
            addCriterion("totalmoney >", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("totalmoney >=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThan(Double value) {
            addCriterion("totalmoney <", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThanOrEqualTo(Double value) {
            addCriterion("totalmoney <=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIn(List<Double> values) {
            addCriterion("totalmoney in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotIn(List<Double> values) {
            addCriterion("totalmoney not in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyBetween(Double value1, Double value2) {
            addCriterion("totalmoney between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotBetween(Double value1, Double value2) {
            addCriterion("totalmoney not between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andLabortimeIsNull() {
            addCriterion("labortime is null");
            return (Criteria) this;
        }

        public Criteria andLabortimeIsNotNull() {
            addCriterion("labortime is not null");
            return (Criteria) this;
        }

        public Criteria andLabortimeEqualTo(Double value) {
            addCriterion("labortime =", value, "labortime");
            return (Criteria) this;
        }

        public Criteria andLabortimeNotEqualTo(Double value) {
            addCriterion("labortime <>", value, "labortime");
            return (Criteria) this;
        }

        public Criteria andLabortimeGreaterThan(Double value) {
            addCriterion("labortime >", value, "labortime");
            return (Criteria) this;
        }

        public Criteria andLabortimeGreaterThanOrEqualTo(Double value) {
            addCriterion("labortime >=", value, "labortime");
            return (Criteria) this;
        }

        public Criteria andLabortimeLessThan(Double value) {
            addCriterion("labortime <", value, "labortime");
            return (Criteria) this;
        }

        public Criteria andLabortimeLessThanOrEqualTo(Double value) {
            addCriterion("labortime <=", value, "labortime");
            return (Criteria) this;
        }

        public Criteria andLabortimeIn(List<Double> values) {
            addCriterion("labortime in", values, "labortime");
            return (Criteria) this;
        }

        public Criteria andLabortimeNotIn(List<Double> values) {
            addCriterion("labortime not in", values, "labortime");
            return (Criteria) this;
        }

        public Criteria andLabortimeBetween(Double value1, Double value2) {
            addCriterion("labortime between", value1, value2, "labortime");
            return (Criteria) this;
        }

        public Criteria andLabortimeNotBetween(Double value1, Double value2) {
            addCriterion("labortime not between", value1, value2, "labortime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andAutidateIsNull() {
            addCriterion("autidate is null");
            return (Criteria) this;
        }

        public Criteria andAutidateIsNotNull() {
            addCriterion("autidate is not null");
            return (Criteria) this;
        }

        public Criteria andAutidateEqualTo(String value) {
            addCriterion("autidate =", value, "autidate");
            return (Criteria) this;
        }

        public Criteria andAutidateNotEqualTo(String value) {
            addCriterion("autidate <>", value, "autidate");
            return (Criteria) this;
        }

        public Criteria andAutidateGreaterThan(String value) {
            addCriterion("autidate >", value, "autidate");
            return (Criteria) this;
        }

        public Criteria andAutidateGreaterThanOrEqualTo(String value) {
            addCriterion("autidate >=", value, "autidate");
            return (Criteria) this;
        }

        public Criteria andAutidateLessThan(String value) {
            addCriterion("autidate <", value, "autidate");
            return (Criteria) this;
        }

        public Criteria andAutidateLessThanOrEqualTo(String value) {
            addCriterion("autidate <=", value, "autidate");
            return (Criteria) this;
        }

        public Criteria andAutidateLike(String value) {
            addCriterion("autidate like", value, "autidate");
            return (Criteria) this;
        }

        public Criteria andAutidateNotLike(String value) {
            addCriterion("autidate not like", value, "autidate");
            return (Criteria) this;
        }

        public Criteria andAutidateIn(List<String> values) {
            addCriterion("autidate in", values, "autidate");
            return (Criteria) this;
        }

        public Criteria andAutidateNotIn(List<String> values) {
            addCriterion("autidate not in", values, "autidate");
            return (Criteria) this;
        }

        public Criteria andAutidateBetween(String value1, String value2) {
            addCriterion("autidate between", value1, value2, "autidate");
            return (Criteria) this;
        }

        public Criteria andAutidateNotBetween(String value1, String value2) {
            addCriterion("autidate not between", value1, value2, "autidate");
            return (Criteria) this;
        }

        public Criteria andDescribleIsNull() {
            addCriterion("describle is null");
            return (Criteria) this;
        }

        public Criteria andDescribleIsNotNull() {
            addCriterion("describle is not null");
            return (Criteria) this;
        }

        public Criteria andDescribleEqualTo(String value) {
            addCriterion("describle =", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleNotEqualTo(String value) {
            addCriterion("describle <>", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleGreaterThan(String value) {
            addCriterion("describle >", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleGreaterThanOrEqualTo(String value) {
            addCriterion("describle >=", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleLessThan(String value) {
            addCriterion("describle <", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleLessThanOrEqualTo(String value) {
            addCriterion("describle <=", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleLike(String value) {
            addCriterion("describle like", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleNotLike(String value) {
            addCriterion("describle not like", value, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleIn(List<String> values) {
            addCriterion("describle in", values, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleNotIn(List<String> values) {
            addCriterion("describle not in", values, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleBetween(String value1, String value2) {
            addCriterion("describle between", value1, value2, "describle");
            return (Criteria) this;
        }

        public Criteria andDescribleNotBetween(String value1, String value2) {
            addCriterion("describle not between", value1, value2, "describle");
            return (Criteria) this;
        }

        public Criteria andProstateIsNull() {
            addCriterion("prostate is null");
            return (Criteria) this;
        }

        public Criteria andProstateIsNotNull() {
            addCriterion("prostate is not null");
            return (Criteria) this;
        }

        public Criteria andProstateEqualTo(Integer value) {
            addCriterion("prostate =", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateNotEqualTo(Integer value) {
            addCriterion("prostate <>", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateGreaterThan(Integer value) {
            addCriterion("prostate >", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("prostate >=", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateLessThan(Integer value) {
            addCriterion("prostate <", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateLessThanOrEqualTo(Integer value) {
            addCriterion("prostate <=", value, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateIn(List<Integer> values) {
            addCriterion("prostate in", values, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateNotIn(List<Integer> values) {
            addCriterion("prostate not in", values, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateBetween(Integer value1, Integer value2) {
            addCriterion("prostate between", value1, value2, "prostate");
            return (Criteria) this;
        }

        public Criteria andProstateNotBetween(Integer value1, Integer value2) {
            addCriterion("prostate not between", value1, value2, "prostate");
            return (Criteria) this;
        }

        public Criteria andDuestateIsNull() {
            addCriterion("duestate is null");
            return (Criteria) this;
        }

        public Criteria andDuestateIsNotNull() {
            addCriterion("duestate is not null");
            return (Criteria) this;
        }

        public Criteria andDuestateEqualTo(Integer value) {
            addCriterion("duestate =", value, "duestate");
            return (Criteria) this;
        }

        public Criteria andDuestateNotEqualTo(Integer value) {
            addCriterion("duestate <>", value, "duestate");
            return (Criteria) this;
        }

        public Criteria andDuestateGreaterThan(Integer value) {
            addCriterion("duestate >", value, "duestate");
            return (Criteria) this;
        }

        public Criteria andDuestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("duestate >=", value, "duestate");
            return (Criteria) this;
        }

        public Criteria andDuestateLessThan(Integer value) {
            addCriterion("duestate <", value, "duestate");
            return (Criteria) this;
        }

        public Criteria andDuestateLessThanOrEqualTo(Integer value) {
            addCriterion("duestate <=", value, "duestate");
            return (Criteria) this;
        }

        public Criteria andDuestateIn(List<Integer> values) {
            addCriterion("duestate in", values, "duestate");
            return (Criteria) this;
        }

        public Criteria andDuestateNotIn(List<Integer> values) {
            addCriterion("duestate not in", values, "duestate");
            return (Criteria) this;
        }

        public Criteria andDuestateBetween(Integer value1, Integer value2) {
            addCriterion("duestate between", value1, value2, "duestate");
            return (Criteria) this;
        }

        public Criteria andDuestateNotBetween(Integer value1, Integer value2) {
            addCriterion("duestate not between", value1, value2, "duestate");
            return (Criteria) this;
        }

        public Criteria andDuemoneyIsNull() {
            addCriterion("duemoney is null");
            return (Criteria) this;
        }

        public Criteria andDuemoneyIsNotNull() {
            addCriterion("duemoney is not null");
            return (Criteria) this;
        }

        public Criteria andDuemoneyEqualTo(Double value) {
            addCriterion("duemoney =", value, "duemoney");
            return (Criteria) this;
        }

        public Criteria andDuemoneyNotEqualTo(Double value) {
            addCriterion("duemoney <>", value, "duemoney");
            return (Criteria) this;
        }

        public Criteria andDuemoneyGreaterThan(Double value) {
            addCriterion("duemoney >", value, "duemoney");
            return (Criteria) this;
        }

        public Criteria andDuemoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("duemoney >=", value, "duemoney");
            return (Criteria) this;
        }

        public Criteria andDuemoneyLessThan(Double value) {
            addCriterion("duemoney <", value, "duemoney");
            return (Criteria) this;
        }

        public Criteria andDuemoneyLessThanOrEqualTo(Double value) {
            addCriterion("duemoney <=", value, "duemoney");
            return (Criteria) this;
        }

        public Criteria andDuemoneyIn(List<Double> values) {
            addCriterion("duemoney in", values, "duemoney");
            return (Criteria) this;
        }

        public Criteria andDuemoneyNotIn(List<Double> values) {
            addCriterion("duemoney not in", values, "duemoney");
            return (Criteria) this;
        }

        public Criteria andDuemoneyBetween(Double value1, Double value2) {
            addCriterion("duemoney between", value1, value2, "duemoney");
            return (Criteria) this;
        }

        public Criteria andDuemoneyNotBetween(Double value1, Double value2) {
            addCriterion("duemoney not between", value1, value2, "duemoney");
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