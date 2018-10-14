package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_costbudgetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_costbudgetExample() {
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

        public Criteria andCostbudgetidIsNull() {
            addCriterion("costbudgetid is null");
            return (Criteria) this;
        }

        public Criteria andCostbudgetidIsNotNull() {
            addCriterion("costbudgetid is not null");
            return (Criteria) this;
        }

        public Criteria andCostbudgetidEqualTo(Integer value) {
            addCriterion("costbudgetid =", value, "costbudgetid");
            return (Criteria) this;
        }

        public Criteria andCostbudgetidNotEqualTo(Integer value) {
            addCriterion("costbudgetid <>", value, "costbudgetid");
            return (Criteria) this;
        }

        public Criteria andCostbudgetidGreaterThan(Integer value) {
            addCriterion("costbudgetid >", value, "costbudgetid");
            return (Criteria) this;
        }

        public Criteria andCostbudgetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("costbudgetid >=", value, "costbudgetid");
            return (Criteria) this;
        }

        public Criteria andCostbudgetidLessThan(Integer value) {
            addCriterion("costbudgetid <", value, "costbudgetid");
            return (Criteria) this;
        }

        public Criteria andCostbudgetidLessThanOrEqualTo(Integer value) {
            addCriterion("costbudgetid <=", value, "costbudgetid");
            return (Criteria) this;
        }

        public Criteria andCostbudgetidIn(List<Integer> values) {
            addCriterion("costbudgetid in", values, "costbudgetid");
            return (Criteria) this;
        }

        public Criteria andCostbudgetidNotIn(List<Integer> values) {
            addCriterion("costbudgetid not in", values, "costbudgetid");
            return (Criteria) this;
        }

        public Criteria andCostbudgetidBetween(Integer value1, Integer value2) {
            addCriterion("costbudgetid between", value1, value2, "costbudgetid");
            return (Criteria) this;
        }

        public Criteria andCostbudgetidNotBetween(Integer value1, Integer value2) {
            addCriterion("costbudgetid not between", value1, value2, "costbudgetid");
            return (Criteria) this;
        }

        public Criteria andCostbudgetnoIsNull() {
            addCriterion("costbudgetno is null");
            return (Criteria) this;
        }

        public Criteria andCostbudgetnoIsNotNull() {
            addCriterion("costbudgetno is not null");
            return (Criteria) this;
        }

        public Criteria andCostbudgetnoEqualTo(String value) {
            addCriterion("costbudgetno =", value, "costbudgetno");
            return (Criteria) this;
        }

        public Criteria andCostbudgetnoNotEqualTo(String value) {
            addCriterion("costbudgetno <>", value, "costbudgetno");
            return (Criteria) this;
        }

        public Criteria andCostbudgetnoGreaterThan(String value) {
            addCriterion("costbudgetno >", value, "costbudgetno");
            return (Criteria) this;
        }

        public Criteria andCostbudgetnoGreaterThanOrEqualTo(String value) {
            addCriterion("costbudgetno >=", value, "costbudgetno");
            return (Criteria) this;
        }

        public Criteria andCostbudgetnoLessThan(String value) {
            addCriterion("costbudgetno <", value, "costbudgetno");
            return (Criteria) this;
        }

        public Criteria andCostbudgetnoLessThanOrEqualTo(String value) {
            addCriterion("costbudgetno <=", value, "costbudgetno");
            return (Criteria) this;
        }

        public Criteria andCostbudgetnoLike(String value) {
            addCriterion("costbudgetno like", value, "costbudgetno");
            return (Criteria) this;
        }

        public Criteria andCostbudgetnoNotLike(String value) {
            addCriterion("costbudgetno not like", value, "costbudgetno");
            return (Criteria) this;
        }

        public Criteria andCostbudgetnoIn(List<String> values) {
            addCriterion("costbudgetno in", values, "costbudgetno");
            return (Criteria) this;
        }

        public Criteria andCostbudgetnoNotIn(List<String> values) {
            addCriterion("costbudgetno not in", values, "costbudgetno");
            return (Criteria) this;
        }

        public Criteria andCostbudgetnoBetween(String value1, String value2) {
            addCriterion("costbudgetno between", value1, value2, "costbudgetno");
            return (Criteria) this;
        }

        public Criteria andCostbudgetnoNotBetween(String value1, String value2) {
            addCriterion("costbudgetno not between", value1, value2, "costbudgetno");
            return (Criteria) this;
        }

        public Criteria andCostbudgetdateIsNull() {
            addCriterion("costbudgetdate is null");
            return (Criteria) this;
        }

        public Criteria andCostbudgetdateIsNotNull() {
            addCriterion("costbudgetdate is not null");
            return (Criteria) this;
        }

        public Criteria andCostbudgetdateEqualTo(String value) {
            addCriterion("costbudgetdate =", value, "costbudgetdate");
            return (Criteria) this;
        }

        public Criteria andCostbudgetdateNotEqualTo(String value) {
            addCriterion("costbudgetdate <>", value, "costbudgetdate");
            return (Criteria) this;
        }

        public Criteria andCostbudgetdateGreaterThan(String value) {
            addCriterion("costbudgetdate >", value, "costbudgetdate");
            return (Criteria) this;
        }

        public Criteria andCostbudgetdateGreaterThanOrEqualTo(String value) {
            addCriterion("costbudgetdate >=", value, "costbudgetdate");
            return (Criteria) this;
        }

        public Criteria andCostbudgetdateLessThan(String value) {
            addCriterion("costbudgetdate <", value, "costbudgetdate");
            return (Criteria) this;
        }

        public Criteria andCostbudgetdateLessThanOrEqualTo(String value) {
            addCriterion("costbudgetdate <=", value, "costbudgetdate");
            return (Criteria) this;
        }

        public Criteria andCostbudgetdateLike(String value) {
            addCriterion("costbudgetdate like", value, "costbudgetdate");
            return (Criteria) this;
        }

        public Criteria andCostbudgetdateNotLike(String value) {
            addCriterion("costbudgetdate not like", value, "costbudgetdate");
            return (Criteria) this;
        }

        public Criteria andCostbudgetdateIn(List<String> values) {
            addCriterion("costbudgetdate in", values, "costbudgetdate");
            return (Criteria) this;
        }

        public Criteria andCostbudgetdateNotIn(List<String> values) {
            addCriterion("costbudgetdate not in", values, "costbudgetdate");
            return (Criteria) this;
        }

        public Criteria andCostbudgetdateBetween(String value1, String value2) {
            addCriterion("costbudgetdate between", value1, value2, "costbudgetdate");
            return (Criteria) this;
        }

        public Criteria andCostbudgetdateNotBetween(String value1, String value2) {
            addCriterion("costbudgetdate not between", value1, value2, "costbudgetdate");
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

        public Criteria andVersiontypeIsNull() {
            addCriterion("versiontype is null");
            return (Criteria) this;
        }

        public Criteria andVersiontypeIsNotNull() {
            addCriterion("versiontype is not null");
            return (Criteria) this;
        }

        public Criteria andVersiontypeEqualTo(String value) {
            addCriterion("versiontype =", value, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeNotEqualTo(String value) {
            addCriterion("versiontype <>", value, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeGreaterThan(String value) {
            addCriterion("versiontype >", value, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("versiontype >=", value, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeLessThan(String value) {
            addCriterion("versiontype <", value, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeLessThanOrEqualTo(String value) {
            addCriterion("versiontype <=", value, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeLike(String value) {
            addCriterion("versiontype like", value, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeNotLike(String value) {
            addCriterion("versiontype not like", value, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeIn(List<String> values) {
            addCriterion("versiontype in", values, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeNotIn(List<String> values) {
            addCriterion("versiontype not in", values, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeBetween(String value1, String value2) {
            addCriterion("versiontype between", value1, value2, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiontypeNotBetween(String value1, String value2) {
            addCriterion("versiontype not between", value1, value2, "versiontype");
            return (Criteria) this;
        }

        public Criteria andVersiondateIsNull() {
            addCriterion("versiondate is null");
            return (Criteria) this;
        }

        public Criteria andVersiondateIsNotNull() {
            addCriterion("versiondate is not null");
            return (Criteria) this;
        }

        public Criteria andVersiondateEqualTo(String value) {
            addCriterion("versiondate =", value, "versiondate");
            return (Criteria) this;
        }

        public Criteria andVersiondateNotEqualTo(String value) {
            addCriterion("versiondate <>", value, "versiondate");
            return (Criteria) this;
        }

        public Criteria andVersiondateGreaterThan(String value) {
            addCriterion("versiondate >", value, "versiondate");
            return (Criteria) this;
        }

        public Criteria andVersiondateGreaterThanOrEqualTo(String value) {
            addCriterion("versiondate >=", value, "versiondate");
            return (Criteria) this;
        }

        public Criteria andVersiondateLessThan(String value) {
            addCriterion("versiondate <", value, "versiondate");
            return (Criteria) this;
        }

        public Criteria andVersiondateLessThanOrEqualTo(String value) {
            addCriterion("versiondate <=", value, "versiondate");
            return (Criteria) this;
        }

        public Criteria andVersiondateLike(String value) {
            addCriterion("versiondate like", value, "versiondate");
            return (Criteria) this;
        }

        public Criteria andVersiondateNotLike(String value) {
            addCriterion("versiondate not like", value, "versiondate");
            return (Criteria) this;
        }

        public Criteria andVersiondateIn(List<String> values) {
            addCriterion("versiondate in", values, "versiondate");
            return (Criteria) this;
        }

        public Criteria andVersiondateNotIn(List<String> values) {
            addCriterion("versiondate not in", values, "versiondate");
            return (Criteria) this;
        }

        public Criteria andVersiondateBetween(String value1, String value2) {
            addCriterion("versiondate between", value1, value2, "versiondate");
            return (Criteria) this;
        }

        public Criteria andVersiondateNotBetween(String value1, String value2) {
            addCriterion("versiondate not between", value1, value2, "versiondate");
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

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
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

        public Criteria andQuotedversionIsNull() {
            addCriterion("quotedversion is null");
            return (Criteria) this;
        }

        public Criteria andQuotedversionIsNotNull() {
            addCriterion("quotedversion is not null");
            return (Criteria) this;
        }

        public Criteria andQuotedversionEqualTo(String value) {
            addCriterion("quotedversion =", value, "quotedversion");
            return (Criteria) this;
        }

        public Criteria andQuotedversionNotEqualTo(String value) {
            addCriterion("quotedversion <>", value, "quotedversion");
            return (Criteria) this;
        }

        public Criteria andQuotedversionGreaterThan(String value) {
            addCriterion("quotedversion >", value, "quotedversion");
            return (Criteria) this;
        }

        public Criteria andQuotedversionGreaterThanOrEqualTo(String value) {
            addCriterion("quotedversion >=", value, "quotedversion");
            return (Criteria) this;
        }

        public Criteria andQuotedversionLessThan(String value) {
            addCriterion("quotedversion <", value, "quotedversion");
            return (Criteria) this;
        }

        public Criteria andQuotedversionLessThanOrEqualTo(String value) {
            addCriterion("quotedversion <=", value, "quotedversion");
            return (Criteria) this;
        }

        public Criteria andQuotedversionLike(String value) {
            addCriterion("quotedversion like", value, "quotedversion");
            return (Criteria) this;
        }

        public Criteria andQuotedversionNotLike(String value) {
            addCriterion("quotedversion not like", value, "quotedversion");
            return (Criteria) this;
        }

        public Criteria andQuotedversionIn(List<String> values) {
            addCriterion("quotedversion in", values, "quotedversion");
            return (Criteria) this;
        }

        public Criteria andQuotedversionNotIn(List<String> values) {
            addCriterion("quotedversion not in", values, "quotedversion");
            return (Criteria) this;
        }

        public Criteria andQuotedversionBetween(String value1, String value2) {
            addCriterion("quotedversion between", value1, value2, "quotedversion");
            return (Criteria) this;
        }

        public Criteria andQuotedversionNotBetween(String value1, String value2) {
            addCriterion("quotedversion not between", value1, value2, "quotedversion");
            return (Criteria) this;
        }

        public Criteria andPurchasemoneyIsNull() {
            addCriterion("purchasemoney is null");
            return (Criteria) this;
        }

        public Criteria andPurchasemoneyIsNotNull() {
            addCriterion("purchasemoney is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasemoneyEqualTo(Double value) {
            addCriterion("purchasemoney =", value, "purchasemoney");
            return (Criteria) this;
        }

        public Criteria andPurchasemoneyNotEqualTo(Double value) {
            addCriterion("purchasemoney <>", value, "purchasemoney");
            return (Criteria) this;
        }

        public Criteria andPurchasemoneyGreaterThan(Double value) {
            addCriterion("purchasemoney >", value, "purchasemoney");
            return (Criteria) this;
        }

        public Criteria andPurchasemoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("purchasemoney >=", value, "purchasemoney");
            return (Criteria) this;
        }

        public Criteria andPurchasemoneyLessThan(Double value) {
            addCriterion("purchasemoney <", value, "purchasemoney");
            return (Criteria) this;
        }

        public Criteria andPurchasemoneyLessThanOrEqualTo(Double value) {
            addCriterion("purchasemoney <=", value, "purchasemoney");
            return (Criteria) this;
        }

        public Criteria andPurchasemoneyIn(List<Double> values) {
            addCriterion("purchasemoney in", values, "purchasemoney");
            return (Criteria) this;
        }

        public Criteria andPurchasemoneyNotIn(List<Double> values) {
            addCriterion("purchasemoney not in", values, "purchasemoney");
            return (Criteria) this;
        }

        public Criteria andPurchasemoneyBetween(Double value1, Double value2) {
            addCriterion("purchasemoney between", value1, value2, "purchasemoney");
            return (Criteria) this;
        }

        public Criteria andPurchasemoneyNotBetween(Double value1, Double value2) {
            addCriterion("purchasemoney not between", value1, value2, "purchasemoney");
            return (Criteria) this;
        }

        public Criteria andMaterialprefitIsNull() {
            addCriterion("materialprefit is null");
            return (Criteria) this;
        }

        public Criteria andMaterialprefitIsNotNull() {
            addCriterion("materialprefit is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialprefitEqualTo(Double value) {
            addCriterion("materialprefit =", value, "materialprefit");
            return (Criteria) this;
        }

        public Criteria andMaterialprefitNotEqualTo(Double value) {
            addCriterion("materialprefit <>", value, "materialprefit");
            return (Criteria) this;
        }

        public Criteria andMaterialprefitGreaterThan(Double value) {
            addCriterion("materialprefit >", value, "materialprefit");
            return (Criteria) this;
        }

        public Criteria andMaterialprefitGreaterThanOrEqualTo(Double value) {
            addCriterion("materialprefit >=", value, "materialprefit");
            return (Criteria) this;
        }

        public Criteria andMaterialprefitLessThan(Double value) {
            addCriterion("materialprefit <", value, "materialprefit");
            return (Criteria) this;
        }

        public Criteria andMaterialprefitLessThanOrEqualTo(Double value) {
            addCriterion("materialprefit <=", value, "materialprefit");
            return (Criteria) this;
        }

        public Criteria andMaterialprefitIn(List<Double> values) {
            addCriterion("materialprefit in", values, "materialprefit");
            return (Criteria) this;
        }

        public Criteria andMaterialprefitNotIn(List<Double> values) {
            addCriterion("materialprefit not in", values, "materialprefit");
            return (Criteria) this;
        }

        public Criteria andMaterialprefitBetween(Double value1, Double value2) {
            addCriterion("materialprefit between", value1, value2, "materialprefit");
            return (Criteria) this;
        }

        public Criteria andMaterialprefitNotBetween(Double value1, Double value2) {
            addCriterion("materialprefit not between", value1, value2, "materialprefit");
            return (Criteria) this;
        }

        public Criteria andActurlworkIsNull() {
            addCriterion("acturlwork is null");
            return (Criteria) this;
        }

        public Criteria andActurlworkIsNotNull() {
            addCriterion("acturlwork is not null");
            return (Criteria) this;
        }

        public Criteria andActurlworkEqualTo(Double value) {
            addCriterion("acturlwork =", value, "acturlwork");
            return (Criteria) this;
        }

        public Criteria andActurlworkNotEqualTo(Double value) {
            addCriterion("acturlwork <>", value, "acturlwork");
            return (Criteria) this;
        }

        public Criteria andActurlworkGreaterThan(Double value) {
            addCriterion("acturlwork >", value, "acturlwork");
            return (Criteria) this;
        }

        public Criteria andActurlworkGreaterThanOrEqualTo(Double value) {
            addCriterion("acturlwork >=", value, "acturlwork");
            return (Criteria) this;
        }

        public Criteria andActurlworkLessThan(Double value) {
            addCriterion("acturlwork <", value, "acturlwork");
            return (Criteria) this;
        }

        public Criteria andActurlworkLessThanOrEqualTo(Double value) {
            addCriterion("acturlwork <=", value, "acturlwork");
            return (Criteria) this;
        }

        public Criteria andActurlworkIn(List<Double> values) {
            addCriterion("acturlwork in", values, "acturlwork");
            return (Criteria) this;
        }

        public Criteria andActurlworkNotIn(List<Double> values) {
            addCriterion("acturlwork not in", values, "acturlwork");
            return (Criteria) this;
        }

        public Criteria andActurlworkBetween(Double value1, Double value2) {
            addCriterion("acturlwork between", value1, value2, "acturlwork");
            return (Criteria) this;
        }

        public Criteria andActurlworkNotBetween(Double value1, Double value2) {
            addCriterion("acturlwork not between", value1, value2, "acturlwork");
            return (Criteria) this;
        }

        public Criteria andQuotedpriceIsNull() {
            addCriterion("quotedprice is null");
            return (Criteria) this;
        }

        public Criteria andQuotedpriceIsNotNull() {
            addCriterion("quotedprice is not null");
            return (Criteria) this;
        }

        public Criteria andQuotedpriceEqualTo(Double value) {
            addCriterion("quotedprice =", value, "quotedprice");
            return (Criteria) this;
        }

        public Criteria andQuotedpriceNotEqualTo(Double value) {
            addCriterion("quotedprice <>", value, "quotedprice");
            return (Criteria) this;
        }

        public Criteria andQuotedpriceGreaterThan(Double value) {
            addCriterion("quotedprice >", value, "quotedprice");
            return (Criteria) this;
        }

        public Criteria andQuotedpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("quotedprice >=", value, "quotedprice");
            return (Criteria) this;
        }

        public Criteria andQuotedpriceLessThan(Double value) {
            addCriterion("quotedprice <", value, "quotedprice");
            return (Criteria) this;
        }

        public Criteria andQuotedpriceLessThanOrEqualTo(Double value) {
            addCriterion("quotedprice <=", value, "quotedprice");
            return (Criteria) this;
        }

        public Criteria andQuotedpriceIn(List<Double> values) {
            addCriterion("quotedprice in", values, "quotedprice");
            return (Criteria) this;
        }

        public Criteria andQuotedpriceNotIn(List<Double> values) {
            addCriterion("quotedprice not in", values, "quotedprice");
            return (Criteria) this;
        }

        public Criteria andQuotedpriceBetween(Double value1, Double value2) {
            addCriterion("quotedprice between", value1, value2, "quotedprice");
            return (Criteria) this;
        }

        public Criteria andQuotedpriceNotBetween(Double value1, Double value2) {
            addCriterion("quotedprice not between", value1, value2, "quotedprice");
            return (Criteria) this;
        }

        public Criteria andTaxpointIsNull() {
            addCriterion("taxpoint is null");
            return (Criteria) this;
        }

        public Criteria andTaxpointIsNotNull() {
            addCriterion("taxpoint is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpointEqualTo(Double value) {
            addCriterion("taxpoint =", value, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointNotEqualTo(Double value) {
            addCriterion("taxpoint <>", value, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointGreaterThan(Double value) {
            addCriterion("taxpoint >", value, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointGreaterThanOrEqualTo(Double value) {
            addCriterion("taxpoint >=", value, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointLessThan(Double value) {
            addCriterion("taxpoint <", value, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointLessThanOrEqualTo(Double value) {
            addCriterion("taxpoint <=", value, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointIn(List<Double> values) {
            addCriterion("taxpoint in", values, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointNotIn(List<Double> values) {
            addCriterion("taxpoint not in", values, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointBetween(Double value1, Double value2) {
            addCriterion("taxpoint between", value1, value2, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointNotBetween(Double value1, Double value2) {
            addCriterion("taxpoint not between", value1, value2, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxationIsNull() {
            addCriterion("taxation is null");
            return (Criteria) this;
        }

        public Criteria andTaxationIsNotNull() {
            addCriterion("taxation is not null");
            return (Criteria) this;
        }

        public Criteria andTaxationEqualTo(Double value) {
            addCriterion("taxation =", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationNotEqualTo(Double value) {
            addCriterion("taxation <>", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationGreaterThan(Double value) {
            addCriterion("taxation >", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationGreaterThanOrEqualTo(Double value) {
            addCriterion("taxation >=", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationLessThan(Double value) {
            addCriterion("taxation <", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationLessThanOrEqualTo(Double value) {
            addCriterion("taxation <=", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationIn(List<Double> values) {
            addCriterion("taxation in", values, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationNotIn(List<Double> values) {
            addCriterion("taxation not in", values, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationBetween(Double value1, Double value2) {
            addCriterion("taxation between", value1, value2, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationNotBetween(Double value1, Double value2) {
            addCriterion("taxation not between", value1, value2, "taxation");
            return (Criteria) this;
        }

        public Criteria andCostratioIsNull() {
            addCriterion("costratio is null");
            return (Criteria) this;
        }

        public Criteria andCostratioIsNotNull() {
            addCriterion("costratio is not null");
            return (Criteria) this;
        }

        public Criteria andCostratioEqualTo(Double value) {
            addCriterion("costratio =", value, "costratio");
            return (Criteria) this;
        }

        public Criteria andCostratioNotEqualTo(Double value) {
            addCriterion("costratio <>", value, "costratio");
            return (Criteria) this;
        }

        public Criteria andCostratioGreaterThan(Double value) {
            addCriterion("costratio >", value, "costratio");
            return (Criteria) this;
        }

        public Criteria andCostratioGreaterThanOrEqualTo(Double value) {
            addCriterion("costratio >=", value, "costratio");
            return (Criteria) this;
        }

        public Criteria andCostratioLessThan(Double value) {
            addCriterion("costratio <", value, "costratio");
            return (Criteria) this;
        }

        public Criteria andCostratioLessThanOrEqualTo(Double value) {
            addCriterion("costratio <=", value, "costratio");
            return (Criteria) this;
        }

        public Criteria andCostratioIn(List<Double> values) {
            addCriterion("costratio in", values, "costratio");
            return (Criteria) this;
        }

        public Criteria andCostratioNotIn(List<Double> values) {
            addCriterion("costratio not in", values, "costratio");
            return (Criteria) this;
        }

        public Criteria andCostratioBetween(Double value1, Double value2) {
            addCriterion("costratio between", value1, value2, "costratio");
            return (Criteria) this;
        }

        public Criteria andCostratioNotBetween(Double value1, Double value2) {
            addCriterion("costratio not between", value1, value2, "costratio");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Double value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Double value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Double value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Double value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Double value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Double value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Double> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Double> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Double value1, Double value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Double value1, Double value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andProfitratioIsNull() {
            addCriterion("profitratio is null");
            return (Criteria) this;
        }

        public Criteria andProfitratioIsNotNull() {
            addCriterion("profitratio is not null");
            return (Criteria) this;
        }

        public Criteria andProfitratioEqualTo(Double value) {
            addCriterion("profitratio =", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioNotEqualTo(Double value) {
            addCriterion("profitratio <>", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioGreaterThan(Double value) {
            addCriterion("profitratio >", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioGreaterThanOrEqualTo(Double value) {
            addCriterion("profitratio >=", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioLessThan(Double value) {
            addCriterion("profitratio <", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioLessThanOrEqualTo(Double value) {
            addCriterion("profitratio <=", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioIn(List<Double> values) {
            addCriterion("profitratio in", values, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioNotIn(List<Double> values) {
            addCriterion("profitratio not in", values, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioBetween(Double value1, Double value2) {
            addCriterion("profitratio between", value1, value2, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioNotBetween(Double value1, Double value2) {
            addCriterion("profitratio not between", value1, value2, "profitratio");
            return (Criteria) this;
        }

        public Criteria andClothrateIsNull() {
            addCriterion("clothrate is null");
            return (Criteria) this;
        }

        public Criteria andClothrateIsNotNull() {
            addCriterion("clothrate is not null");
            return (Criteria) this;
        }

        public Criteria andClothrateEqualTo(Double value) {
            addCriterion("clothrate =", value, "clothrate");
            return (Criteria) this;
        }

        public Criteria andClothrateNotEqualTo(Double value) {
            addCriterion("clothrate <>", value, "clothrate");
            return (Criteria) this;
        }

        public Criteria andClothrateGreaterThan(Double value) {
            addCriterion("clothrate >", value, "clothrate");
            return (Criteria) this;
        }

        public Criteria andClothrateGreaterThanOrEqualTo(Double value) {
            addCriterion("clothrate >=", value, "clothrate");
            return (Criteria) this;
        }

        public Criteria andClothrateLessThan(Double value) {
            addCriterion("clothrate <", value, "clothrate");
            return (Criteria) this;
        }

        public Criteria andClothrateLessThanOrEqualTo(Double value) {
            addCriterion("clothrate <=", value, "clothrate");
            return (Criteria) this;
        }

        public Criteria andClothrateIn(List<Double> values) {
            addCriterion("clothrate in", values, "clothrate");
            return (Criteria) this;
        }

        public Criteria andClothrateNotIn(List<Double> values) {
            addCriterion("clothrate not in", values, "clothrate");
            return (Criteria) this;
        }

        public Criteria andClothrateBetween(Double value1, Double value2) {
            addCriterion("clothrate between", value1, value2, "clothrate");
            return (Criteria) this;
        }

        public Criteria andClothrateNotBetween(Double value1, Double value2) {
            addCriterion("clothrate not between", value1, value2, "clothrate");
            return (Criteria) this;
        }

        public Criteria andBudgetaryprofitIsNull() {
            addCriterion("budgetaryprofit is null");
            return (Criteria) this;
        }

        public Criteria andBudgetaryprofitIsNotNull() {
            addCriterion("budgetaryprofit is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetaryprofitEqualTo(Double value) {
            addCriterion("budgetaryprofit =", value, "budgetaryprofit");
            return (Criteria) this;
        }

        public Criteria andBudgetaryprofitNotEqualTo(Double value) {
            addCriterion("budgetaryprofit <>", value, "budgetaryprofit");
            return (Criteria) this;
        }

        public Criteria andBudgetaryprofitGreaterThan(Double value) {
            addCriterion("budgetaryprofit >", value, "budgetaryprofit");
            return (Criteria) this;
        }

        public Criteria andBudgetaryprofitGreaterThanOrEqualTo(Double value) {
            addCriterion("budgetaryprofit >=", value, "budgetaryprofit");
            return (Criteria) this;
        }

        public Criteria andBudgetaryprofitLessThan(Double value) {
            addCriterion("budgetaryprofit <", value, "budgetaryprofit");
            return (Criteria) this;
        }

        public Criteria andBudgetaryprofitLessThanOrEqualTo(Double value) {
            addCriterion("budgetaryprofit <=", value, "budgetaryprofit");
            return (Criteria) this;
        }

        public Criteria andBudgetaryprofitIn(List<Double> values) {
            addCriterion("budgetaryprofit in", values, "budgetaryprofit");
            return (Criteria) this;
        }

        public Criteria andBudgetaryprofitNotIn(List<Double> values) {
            addCriterion("budgetaryprofit not in", values, "budgetaryprofit");
            return (Criteria) this;
        }

        public Criteria andBudgetaryprofitBetween(Double value1, Double value2) {
            addCriterion("budgetaryprofit between", value1, value2, "budgetaryprofit");
            return (Criteria) this;
        }

        public Criteria andBudgetaryprofitNotBetween(Double value1, Double value2) {
            addCriterion("budgetaryprofit not between", value1, value2, "budgetaryprofit");
            return (Criteria) this;
        }

        public Criteria andQuotedquotationIsNull() {
            addCriterion("quotedquotation is null");
            return (Criteria) this;
        }

        public Criteria andQuotedquotationIsNotNull() {
            addCriterion("quotedquotation is not null");
            return (Criteria) this;
        }

        public Criteria andQuotedquotationEqualTo(Double value) {
            addCriterion("quotedquotation =", value, "quotedquotation");
            return (Criteria) this;
        }

        public Criteria andQuotedquotationNotEqualTo(Double value) {
            addCriterion("quotedquotation <>", value, "quotedquotation");
            return (Criteria) this;
        }

        public Criteria andQuotedquotationGreaterThan(Double value) {
            addCriterion("quotedquotation >", value, "quotedquotation");
            return (Criteria) this;
        }

        public Criteria andQuotedquotationGreaterThanOrEqualTo(Double value) {
            addCriterion("quotedquotation >=", value, "quotedquotation");
            return (Criteria) this;
        }

        public Criteria andQuotedquotationLessThan(Double value) {
            addCriterion("quotedquotation <", value, "quotedquotation");
            return (Criteria) this;
        }

        public Criteria andQuotedquotationLessThanOrEqualTo(Double value) {
            addCriterion("quotedquotation <=", value, "quotedquotation");
            return (Criteria) this;
        }

        public Criteria andQuotedquotationIn(List<Double> values) {
            addCriterion("quotedquotation in", values, "quotedquotation");
            return (Criteria) this;
        }

        public Criteria andQuotedquotationNotIn(List<Double> values) {
            addCriterion("quotedquotation not in", values, "quotedquotation");
            return (Criteria) this;
        }

        public Criteria andQuotedquotationBetween(Double value1, Double value2) {
            addCriterion("quotedquotation between", value1, value2, "quotedquotation");
            return (Criteria) this;
        }

        public Criteria andQuotedquotationNotBetween(Double value1, Double value2) {
            addCriterion("quotedquotation not between", value1, value2, "quotedquotation");
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