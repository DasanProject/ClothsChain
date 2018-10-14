package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_samplelistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_samplelistExample() {
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

        public Criteria andSampleidIsNull() {
            addCriterion("sampleid is null");
            return (Criteria) this;
        }

        public Criteria andSampleidIsNotNull() {
            addCriterion("sampleid is not null");
            return (Criteria) this;
        }

        public Criteria andSampleidEqualTo(Integer value) {
            addCriterion("sampleid =", value, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidNotEqualTo(Integer value) {
            addCriterion("sampleid <>", value, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidGreaterThan(Integer value) {
            addCriterion("sampleid >", value, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sampleid >=", value, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidLessThan(Integer value) {
            addCriterion("sampleid <", value, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidLessThanOrEqualTo(Integer value) {
            addCriterion("sampleid <=", value, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidIn(List<Integer> values) {
            addCriterion("sampleid in", values, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidNotIn(List<Integer> values) {
            addCriterion("sampleid not in", values, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidBetween(Integer value1, Integer value2) {
            addCriterion("sampleid between", value1, value2, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidNotBetween(Integer value1, Integer value2) {
            addCriterion("sampleid not between", value1, value2, "sampleid");
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

        public Criteria andSampletypeidIsNull() {
            addCriterion("sampletypeid is null");
            return (Criteria) this;
        }

        public Criteria andSampletypeidIsNotNull() {
            addCriterion("sampletypeid is not null");
            return (Criteria) this;
        }

        public Criteria andSampletypeidEqualTo(Integer value) {
            addCriterion("sampletypeid =", value, "sampletypeid");
            return (Criteria) this;
        }

        public Criteria andSampletypeidNotEqualTo(Integer value) {
            addCriterion("sampletypeid <>", value, "sampletypeid");
            return (Criteria) this;
        }

        public Criteria andSampletypeidGreaterThan(Integer value) {
            addCriterion("sampletypeid >", value, "sampletypeid");
            return (Criteria) this;
        }

        public Criteria andSampletypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sampletypeid >=", value, "sampletypeid");
            return (Criteria) this;
        }

        public Criteria andSampletypeidLessThan(Integer value) {
            addCriterion("sampletypeid <", value, "sampletypeid");
            return (Criteria) this;
        }

        public Criteria andSampletypeidLessThanOrEqualTo(Integer value) {
            addCriterion("sampletypeid <=", value, "sampletypeid");
            return (Criteria) this;
        }

        public Criteria andSampletypeidIn(List<Integer> values) {
            addCriterion("sampletypeid in", values, "sampletypeid");
            return (Criteria) this;
        }

        public Criteria andSampletypeidNotIn(List<Integer> values) {
            addCriterion("sampletypeid not in", values, "sampletypeid");
            return (Criteria) this;
        }

        public Criteria andSampletypeidBetween(Integer value1, Integer value2) {
            addCriterion("sampletypeid between", value1, value2, "sampletypeid");
            return (Criteria) this;
        }

        public Criteria andSampletypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("sampletypeid not between", value1, value2, "sampletypeid");
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
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

        public Criteria andOpendateIsNull() {
            addCriterion("opendate is null");
            return (Criteria) this;
        }

        public Criteria andOpendateIsNotNull() {
            addCriterion("opendate is not null");
            return (Criteria) this;
        }

        public Criteria andOpendateEqualTo(String value) {
            addCriterion("opendate =", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotEqualTo(String value) {
            addCriterion("opendate <>", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateGreaterThan(String value) {
            addCriterion("opendate >", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateGreaterThanOrEqualTo(String value) {
            addCriterion("opendate >=", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLessThan(String value) {
            addCriterion("opendate <", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLessThanOrEqualTo(String value) {
            addCriterion("opendate <=", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLike(String value) {
            addCriterion("opendate like", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotLike(String value) {
            addCriterion("opendate not like", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateIn(List<String> values) {
            addCriterion("opendate in", values, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotIn(List<String> values) {
            addCriterion("opendate not in", values, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateBetween(String value1, String value2) {
            addCriterion("opendate between", value1, value2, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotBetween(String value1, String value2) {
            addCriterion("opendate not between", value1, value2, "opendate");
            return (Criteria) this;
        }

        public Criteria andEdationdateIsNull() {
            addCriterion("edationdate is null");
            return (Criteria) this;
        }

        public Criteria andEdationdateIsNotNull() {
            addCriterion("edationdate is not null");
            return (Criteria) this;
        }

        public Criteria andEdationdateEqualTo(String value) {
            addCriterion("edationdate =", value, "edationdate");
            return (Criteria) this;
        }

        public Criteria andEdationdateNotEqualTo(String value) {
            addCriterion("edationdate <>", value, "edationdate");
            return (Criteria) this;
        }

        public Criteria andEdationdateGreaterThan(String value) {
            addCriterion("edationdate >", value, "edationdate");
            return (Criteria) this;
        }

        public Criteria andEdationdateGreaterThanOrEqualTo(String value) {
            addCriterion("edationdate >=", value, "edationdate");
            return (Criteria) this;
        }

        public Criteria andEdationdateLessThan(String value) {
            addCriterion("edationdate <", value, "edationdate");
            return (Criteria) this;
        }

        public Criteria andEdationdateLessThanOrEqualTo(String value) {
            addCriterion("edationdate <=", value, "edationdate");
            return (Criteria) this;
        }

        public Criteria andEdationdateLike(String value) {
            addCriterion("edationdate like", value, "edationdate");
            return (Criteria) this;
        }

        public Criteria andEdationdateNotLike(String value) {
            addCriterion("edationdate not like", value, "edationdate");
            return (Criteria) this;
        }

        public Criteria andEdationdateIn(List<String> values) {
            addCriterion("edationdate in", values, "edationdate");
            return (Criteria) this;
        }

        public Criteria andEdationdateNotIn(List<String> values) {
            addCriterion("edationdate not in", values, "edationdate");
            return (Criteria) this;
        }

        public Criteria andEdationdateBetween(String value1, String value2) {
            addCriterion("edationdate between", value1, value2, "edationdate");
            return (Criteria) this;
        }

        public Criteria andEdationdateNotBetween(String value1, String value2) {
            addCriterion("edationdate not between", value1, value2, "edationdate");
            return (Criteria) this;
        }

        public Criteria andSamplemulIsNull() {
            addCriterion("samplemul is null");
            return (Criteria) this;
        }

        public Criteria andSamplemulIsNotNull() {
            addCriterion("samplemul is not null");
            return (Criteria) this;
        }

        public Criteria andSamplemulEqualTo(Double value) {
            addCriterion("samplemul =", value, "samplemul");
            return (Criteria) this;
        }

        public Criteria andSamplemulNotEqualTo(Double value) {
            addCriterion("samplemul <>", value, "samplemul");
            return (Criteria) this;
        }

        public Criteria andSamplemulGreaterThan(Double value) {
            addCriterion("samplemul >", value, "samplemul");
            return (Criteria) this;
        }

        public Criteria andSamplemulGreaterThanOrEqualTo(Double value) {
            addCriterion("samplemul >=", value, "samplemul");
            return (Criteria) this;
        }

        public Criteria andSamplemulLessThan(Double value) {
            addCriterion("samplemul <", value, "samplemul");
            return (Criteria) this;
        }

        public Criteria andSamplemulLessThanOrEqualTo(Double value) {
            addCriterion("samplemul <=", value, "samplemul");
            return (Criteria) this;
        }

        public Criteria andSamplemulIn(List<Double> values) {
            addCriterion("samplemul in", values, "samplemul");
            return (Criteria) this;
        }

        public Criteria andSamplemulNotIn(List<Double> values) {
            addCriterion("samplemul not in", values, "samplemul");
            return (Criteria) this;
        }

        public Criteria andSamplemulBetween(Double value1, Double value2) {
            addCriterion("samplemul between", value1, value2, "samplemul");
            return (Criteria) this;
        }

        public Criteria andSamplemulNotBetween(Double value1, Double value2) {
            addCriterion("samplemul not between", value1, value2, "samplemul");
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

        public Criteria andAuditdateIsNull() {
            addCriterion("auditdate is null");
            return (Criteria) this;
        }

        public Criteria andAuditdateIsNotNull() {
            addCriterion("auditdate is not null");
            return (Criteria) this;
        }

        public Criteria andAuditdateEqualTo(String value) {
            addCriterion("auditdate =", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotEqualTo(String value) {
            addCriterion("auditdate <>", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThan(String value) {
            addCriterion("auditdate >", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThanOrEqualTo(String value) {
            addCriterion("auditdate >=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThan(String value) {
            addCriterion("auditdate <", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThanOrEqualTo(String value) {
            addCriterion("auditdate <=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLike(String value) {
            addCriterion("auditdate like", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotLike(String value) {
            addCriterion("auditdate not like", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateIn(List<String> values) {
            addCriterion("auditdate in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotIn(List<String> values) {
            addCriterion("auditdate not in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateBetween(String value1, String value2) {
            addCriterion("auditdate between", value1, value2, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotBetween(String value1, String value2) {
            addCriterion("auditdate not between", value1, value2, "auditdate");
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

        public Criteria andReceptnumIsNull() {
            addCriterion("receptnum is null");
            return (Criteria) this;
        }

        public Criteria andReceptnumIsNotNull() {
            addCriterion("receptnum is not null");
            return (Criteria) this;
        }

        public Criteria andReceptnumEqualTo(Integer value) {
            addCriterion("receptnum =", value, "receptnum");
            return (Criteria) this;
        }

        public Criteria andReceptnumNotEqualTo(Integer value) {
            addCriterion("receptnum <>", value, "receptnum");
            return (Criteria) this;
        }

        public Criteria andReceptnumGreaterThan(Integer value) {
            addCriterion("receptnum >", value, "receptnum");
            return (Criteria) this;
        }

        public Criteria andReceptnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("receptnum >=", value, "receptnum");
            return (Criteria) this;
        }

        public Criteria andReceptnumLessThan(Integer value) {
            addCriterion("receptnum <", value, "receptnum");
            return (Criteria) this;
        }

        public Criteria andReceptnumLessThanOrEqualTo(Integer value) {
            addCriterion("receptnum <=", value, "receptnum");
            return (Criteria) this;
        }

        public Criteria andReceptnumIn(List<Integer> values) {
            addCriterion("receptnum in", values, "receptnum");
            return (Criteria) this;
        }

        public Criteria andReceptnumNotIn(List<Integer> values) {
            addCriterion("receptnum not in", values, "receptnum");
            return (Criteria) this;
        }

        public Criteria andReceptnumBetween(Integer value1, Integer value2) {
            addCriterion("receptnum between", value1, value2, "receptnum");
            return (Criteria) this;
        }

        public Criteria andReceptnumNotBetween(Integer value1, Integer value2) {
            addCriterion("receptnum not between", value1, value2, "receptnum");
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

        public Criteria andEnsurestateIsNull() {
            addCriterion("ensurestate is null");
            return (Criteria) this;
        }

        public Criteria andEnsurestateIsNotNull() {
            addCriterion("ensurestate is not null");
            return (Criteria) this;
        }

        public Criteria andEnsurestateEqualTo(Integer value) {
            addCriterion("ensurestate =", value, "ensurestate");
            return (Criteria) this;
        }

        public Criteria andEnsurestateNotEqualTo(Integer value) {
            addCriterion("ensurestate <>", value, "ensurestate");
            return (Criteria) this;
        }

        public Criteria andEnsurestateGreaterThan(Integer value) {
            addCriterion("ensurestate >", value, "ensurestate");
            return (Criteria) this;
        }

        public Criteria andEnsurestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ensurestate >=", value, "ensurestate");
            return (Criteria) this;
        }

        public Criteria andEnsurestateLessThan(Integer value) {
            addCriterion("ensurestate <", value, "ensurestate");
            return (Criteria) this;
        }

        public Criteria andEnsurestateLessThanOrEqualTo(Integer value) {
            addCriterion("ensurestate <=", value, "ensurestate");
            return (Criteria) this;
        }

        public Criteria andEnsurestateIn(List<Integer> values) {
            addCriterion("ensurestate in", values, "ensurestate");
            return (Criteria) this;
        }

        public Criteria andEnsurestateNotIn(List<Integer> values) {
            addCriterion("ensurestate not in", values, "ensurestate");
            return (Criteria) this;
        }

        public Criteria andEnsurestateBetween(Integer value1, Integer value2) {
            addCriterion("ensurestate between", value1, value2, "ensurestate");
            return (Criteria) this;
        }

        public Criteria andEnsurestateNotBetween(Integer value1, Integer value2) {
            addCriterion("ensurestate not between", value1, value2, "ensurestate");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNull() {
            addCriterion("worktime is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNotNull() {
            addCriterion("worktime is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeEqualTo(Integer value) {
            addCriterion("worktime =", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotEqualTo(Integer value) {
            addCriterion("worktime <>", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThan(Integer value) {
            addCriterion("worktime >", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("worktime >=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThan(Integer value) {
            addCriterion("worktime <", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThanOrEqualTo(Integer value) {
            addCriterion("worktime <=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIn(List<Integer> values) {
            addCriterion("worktime in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotIn(List<Integer> values) {
            addCriterion("worktime not in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeBetween(Integer value1, Integer value2) {
            addCriterion("worktime between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotBetween(Integer value1, Integer value2) {
            addCriterion("worktime not between", value1, value2, "worktime");
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