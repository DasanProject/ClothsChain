package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class Tab_planmatterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_planmatterExample() {
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

        public Criteria andPlanmatteridIsNull() {
            addCriterion("planmatterid is null");
            return (Criteria) this;
        }

        public Criteria andPlanmatteridIsNotNull() {
            addCriterion("planmatterid is not null");
            return (Criteria) this;
        }

        public Criteria andPlanmatteridEqualTo(Integer value) {
            addCriterion("planmatterid =", value, "planmatterid");
            return (Criteria) this;
        }

        public Criteria andPlanmatteridNotEqualTo(Integer value) {
            addCriterion("planmatterid <>", value, "planmatterid");
            return (Criteria) this;
        }

        public Criteria andPlanmatteridGreaterThan(Integer value) {
            addCriterion("planmatterid >", value, "planmatterid");
            return (Criteria) this;
        }

        public Criteria andPlanmatteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("planmatterid >=", value, "planmatterid");
            return (Criteria) this;
        }

        public Criteria andPlanmatteridLessThan(Integer value) {
            addCriterion("planmatterid <", value, "planmatterid");
            return (Criteria) this;
        }

        public Criteria andPlanmatteridLessThanOrEqualTo(Integer value) {
            addCriterion("planmatterid <=", value, "planmatterid");
            return (Criteria) this;
        }

        public Criteria andPlanmatteridIn(List<Integer> values) {
            addCriterion("planmatterid in", values, "planmatterid");
            return (Criteria) this;
        }

        public Criteria andPlanmatteridNotIn(List<Integer> values) {
            addCriterion("planmatterid not in", values, "planmatterid");
            return (Criteria) this;
        }

        public Criteria andPlanmatteridBetween(Integer value1, Integer value2) {
            addCriterion("planmatterid between", value1, value2, "planmatterid");
            return (Criteria) this;
        }

        public Criteria andPlanmatteridNotBetween(Integer value1, Integer value2) {
            addCriterion("planmatterid not between", value1, value2, "planmatterid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidIsNull() {
            addCriterion("plantypeid is null");
            return (Criteria) this;
        }

        public Criteria andPlantypeidIsNotNull() {
            addCriterion("plantypeid is not null");
            return (Criteria) this;
        }

        public Criteria andPlantypeidEqualTo(Integer value) {
            addCriterion("plantypeid =", value, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidNotEqualTo(Integer value) {
            addCriterion("plantypeid <>", value, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidGreaterThan(Integer value) {
            addCriterion("plantypeid >", value, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("plantypeid >=", value, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidLessThan(Integer value) {
            addCriterion("plantypeid <", value, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidLessThanOrEqualTo(Integer value) {
            addCriterion("plantypeid <=", value, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidIn(List<Integer> values) {
            addCriterion("plantypeid in", values, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidNotIn(List<Integer> values) {
            addCriterion("plantypeid not in", values, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidBetween(Integer value1, Integer value2) {
            addCriterion("plantypeid between", value1, value2, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlantypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("plantypeid not between", value1, value2, "plantypeid");
            return (Criteria) this;
        }

        public Criteria andPlanmatterIsNull() {
            addCriterion("planmatter is null");
            return (Criteria) this;
        }

        public Criteria andPlanmatterIsNotNull() {
            addCriterion("planmatter is not null");
            return (Criteria) this;
        }

        public Criteria andPlanmatterEqualTo(String value) {
            addCriterion("planmatter =", value, "planmatter");
            return (Criteria) this;
        }

        public Criteria andPlanmatterNotEqualTo(String value) {
            addCriterion("planmatter <>", value, "planmatter");
            return (Criteria) this;
        }

        public Criteria andPlanmatterGreaterThan(String value) {
            addCriterion("planmatter >", value, "planmatter");
            return (Criteria) this;
        }

        public Criteria andPlanmatterGreaterThanOrEqualTo(String value) {
            addCriterion("planmatter >=", value, "planmatter");
            return (Criteria) this;
        }

        public Criteria andPlanmatterLessThan(String value) {
            addCriterion("planmatter <", value, "planmatter");
            return (Criteria) this;
        }

        public Criteria andPlanmatterLessThanOrEqualTo(String value) {
            addCriterion("planmatter <=", value, "planmatter");
            return (Criteria) this;
        }

        public Criteria andPlanmatterLike(String value) {
            addCriterion("planmatter like", value, "planmatter");
            return (Criteria) this;
        }

        public Criteria andPlanmatterNotLike(String value) {
            addCriterion("planmatter not like", value, "planmatter");
            return (Criteria) this;
        }

        public Criteria andPlanmatterIn(List<String> values) {
            addCriterion("planmatter in", values, "planmatter");
            return (Criteria) this;
        }

        public Criteria andPlanmatterNotIn(List<String> values) {
            addCriterion("planmatter not in", values, "planmatter");
            return (Criteria) this;
        }

        public Criteria andPlanmatterBetween(String value1, String value2) {
            addCriterion("planmatter between", value1, value2, "planmatter");
            return (Criteria) this;
        }

        public Criteria andPlanmatterNotBetween(String value1, String value2) {
            addCriterion("planmatter not between", value1, value2, "planmatter");
            return (Criteria) this;
        }

        public Criteria andPlantypeIsNull() {
            addCriterion("plantype is null");
            return (Criteria) this;
        }

        public Criteria andPlantypeIsNotNull() {
            addCriterion("plantype is not null");
            return (Criteria) this;
        }

        public Criteria andPlantypeEqualTo(Integer value) {
            addCriterion("plantype =", value, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeNotEqualTo(Integer value) {
            addCriterion("plantype <>", value, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeGreaterThan(Integer value) {
            addCriterion("plantype >", value, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("plantype >=", value, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeLessThan(Integer value) {
            addCriterion("plantype <", value, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeLessThanOrEqualTo(Integer value) {
            addCriterion("plantype <=", value, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeIn(List<Integer> values) {
            addCriterion("plantype in", values, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeNotIn(List<Integer> values) {
            addCriterion("plantype not in", values, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeBetween(Integer value1, Integer value2) {
            addCriterion("plantype between", value1, value2, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeNotBetween(Integer value1, Integer value2) {
            addCriterion("plantype not between", value1, value2, "plantype");
            return (Criteria) this;
        }

        public Criteria andWarndayIsNull() {
            addCriterion("warnday is null");
            return (Criteria) this;
        }

        public Criteria andWarndayIsNotNull() {
            addCriterion("warnday is not null");
            return (Criteria) this;
        }

        public Criteria andWarndayEqualTo(Integer value) {
            addCriterion("warnday =", value, "warnday");
            return (Criteria) this;
        }

        public Criteria andWarndayNotEqualTo(Integer value) {
            addCriterion("warnday <>", value, "warnday");
            return (Criteria) this;
        }

        public Criteria andWarndayGreaterThan(Integer value) {
            addCriterion("warnday >", value, "warnday");
            return (Criteria) this;
        }

        public Criteria andWarndayGreaterThanOrEqualTo(Integer value) {
            addCriterion("warnday >=", value, "warnday");
            return (Criteria) this;
        }

        public Criteria andWarndayLessThan(Integer value) {
            addCriterion("warnday <", value, "warnday");
            return (Criteria) this;
        }

        public Criteria andWarndayLessThanOrEqualTo(Integer value) {
            addCriterion("warnday <=", value, "warnday");
            return (Criteria) this;
        }

        public Criteria andWarndayIn(List<Integer> values) {
            addCriterion("warnday in", values, "warnday");
            return (Criteria) this;
        }

        public Criteria andWarndayNotIn(List<Integer> values) {
            addCriterion("warnday not in", values, "warnday");
            return (Criteria) this;
        }

        public Criteria andWarndayBetween(Integer value1, Integer value2) {
            addCriterion("warnday between", value1, value2, "warnday");
            return (Criteria) this;
        }

        public Criteria andWarndayNotBetween(Integer value1, Integer value2) {
            addCriterion("warnday not between", value1, value2, "warnday");
            return (Criteria) this;
        }

        public Criteria andTransdayIsNull() {
            addCriterion("transday is null");
            return (Criteria) this;
        }

        public Criteria andTransdayIsNotNull() {
            addCriterion("transday is not null");
            return (Criteria) this;
        }

        public Criteria andTransdayEqualTo(Integer value) {
            addCriterion("transday =", value, "transday");
            return (Criteria) this;
        }

        public Criteria andTransdayNotEqualTo(Integer value) {
            addCriterion("transday <>", value, "transday");
            return (Criteria) this;
        }

        public Criteria andTransdayGreaterThan(Integer value) {
            addCriterion("transday >", value, "transday");
            return (Criteria) this;
        }

        public Criteria andTransdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("transday >=", value, "transday");
            return (Criteria) this;
        }

        public Criteria andTransdayLessThan(Integer value) {
            addCriterion("transday <", value, "transday");
            return (Criteria) this;
        }

        public Criteria andTransdayLessThanOrEqualTo(Integer value) {
            addCriterion("transday <=", value, "transday");
            return (Criteria) this;
        }

        public Criteria andTransdayIn(List<Integer> values) {
            addCriterion("transday in", values, "transday");
            return (Criteria) this;
        }

        public Criteria andTransdayNotIn(List<Integer> values) {
            addCriterion("transday not in", values, "transday");
            return (Criteria) this;
        }

        public Criteria andTransdayBetween(Integer value1, Integer value2) {
            addCriterion("transday between", value1, value2, "transday");
            return (Criteria) this;
        }

        public Criteria andTransdayNotBetween(Integer value1, Integer value2) {
            addCriterion("transday not between", value1, value2, "transday");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNull() {
            addCriterion("plandate is null");
            return (Criteria) this;
        }

        public Criteria andPlandateIsNotNull() {
            addCriterion("plandate is not null");
            return (Criteria) this;
        }

        public Criteria andPlandateEqualTo(String value) {
            addCriterion("plandate =", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotEqualTo(String value) {
            addCriterion("plandate <>", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThan(String value) {
            addCriterion("plandate >", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateGreaterThanOrEqualTo(String value) {
            addCriterion("plandate >=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThan(String value) {
            addCriterion("plandate <", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLessThanOrEqualTo(String value) {
            addCriterion("plandate <=", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateLike(String value) {
            addCriterion("plandate like", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotLike(String value) {
            addCriterion("plandate not like", value, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateIn(List<String> values) {
            addCriterion("plandate in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotIn(List<String> values) {
            addCriterion("plandate not in", values, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateBetween(String value1, String value2) {
            addCriterion("plandate between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andPlandateNotBetween(String value1, String value2) {
            addCriterion("plandate not between", value1, value2, "plandate");
            return (Criteria) this;
        }

        public Criteria andNodesdayIsNull() {
            addCriterion("nodesday is null");
            return (Criteria) this;
        }

        public Criteria andNodesdayIsNotNull() {
            addCriterion("nodesday is not null");
            return (Criteria) this;
        }

        public Criteria andNodesdayEqualTo(Integer value) {
            addCriterion("nodesday =", value, "nodesday");
            return (Criteria) this;
        }

        public Criteria andNodesdayNotEqualTo(Integer value) {
            addCriterion("nodesday <>", value, "nodesday");
            return (Criteria) this;
        }

        public Criteria andNodesdayGreaterThan(Integer value) {
            addCriterion("nodesday >", value, "nodesday");
            return (Criteria) this;
        }

        public Criteria andNodesdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("nodesday >=", value, "nodesday");
            return (Criteria) this;
        }

        public Criteria andNodesdayLessThan(Integer value) {
            addCriterion("nodesday <", value, "nodesday");
            return (Criteria) this;
        }

        public Criteria andNodesdayLessThanOrEqualTo(Integer value) {
            addCriterion("nodesday <=", value, "nodesday");
            return (Criteria) this;
        }

        public Criteria andNodesdayIn(List<Integer> values) {
            addCriterion("nodesday in", values, "nodesday");
            return (Criteria) this;
        }

        public Criteria andNodesdayNotIn(List<Integer> values) {
            addCriterion("nodesday not in", values, "nodesday");
            return (Criteria) this;
        }

        public Criteria andNodesdayBetween(Integer value1, Integer value2) {
            addCriterion("nodesday between", value1, value2, "nodesday");
            return (Criteria) this;
        }

        public Criteria andNodesdayNotBetween(Integer value1, Integer value2) {
            addCriterion("nodesday not between", value1, value2, "nodesday");
            return (Criteria) this;
        }

        public Criteria andWarnstateIsNull() {
            addCriterion("warnstate is null");
            return (Criteria) this;
        }

        public Criteria andWarnstateIsNotNull() {
            addCriterion("warnstate is not null");
            return (Criteria) this;
        }

        public Criteria andWarnstateEqualTo(Integer value) {
            addCriterion("warnstate =", value, "warnstate");
            return (Criteria) this;
        }

        public Criteria andWarnstateNotEqualTo(Integer value) {
            addCriterion("warnstate <>", value, "warnstate");
            return (Criteria) this;
        }

        public Criteria andWarnstateGreaterThan(Integer value) {
            addCriterion("warnstate >", value, "warnstate");
            return (Criteria) this;
        }

        public Criteria andWarnstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("warnstate >=", value, "warnstate");
            return (Criteria) this;
        }

        public Criteria andWarnstateLessThan(Integer value) {
            addCriterion("warnstate <", value, "warnstate");
            return (Criteria) this;
        }

        public Criteria andWarnstateLessThanOrEqualTo(Integer value) {
            addCriterion("warnstate <=", value, "warnstate");
            return (Criteria) this;
        }

        public Criteria andWarnstateIn(List<Integer> values) {
            addCriterion("warnstate in", values, "warnstate");
            return (Criteria) this;
        }

        public Criteria andWarnstateNotIn(List<Integer> values) {
            addCriterion("warnstate not in", values, "warnstate");
            return (Criteria) this;
        }

        public Criteria andWarnstateBetween(Integer value1, Integer value2) {
            addCriterion("warnstate between", value1, value2, "warnstate");
            return (Criteria) this;
        }

        public Criteria andWarnstateNotBetween(Integer value1, Integer value2) {
            addCriterion("warnstate not between", value1, value2, "warnstate");
            return (Criteria) this;
        }

        public Criteria andImportsIsNull() {
            addCriterion("imports is null");
            return (Criteria) this;
        }

        public Criteria andImportsIsNotNull() {
            addCriterion("imports is not null");
            return (Criteria) this;
        }

        public Criteria andImportsEqualTo(Integer value) {
            addCriterion("imports =", value, "imports");
            return (Criteria) this;
        }

        public Criteria andImportsNotEqualTo(Integer value) {
            addCriterion("imports <>", value, "imports");
            return (Criteria) this;
        }

        public Criteria andImportsGreaterThan(Integer value) {
            addCriterion("imports >", value, "imports");
            return (Criteria) this;
        }

        public Criteria andImportsGreaterThanOrEqualTo(Integer value) {
            addCriterion("imports >=", value, "imports");
            return (Criteria) this;
        }

        public Criteria andImportsLessThan(Integer value) {
            addCriterion("imports <", value, "imports");
            return (Criteria) this;
        }

        public Criteria andImportsLessThanOrEqualTo(Integer value) {
            addCriterion("imports <=", value, "imports");
            return (Criteria) this;
        }

        public Criteria andImportsIn(List<Integer> values) {
            addCriterion("imports in", values, "imports");
            return (Criteria) this;
        }

        public Criteria andImportsNotIn(List<Integer> values) {
            addCriterion("imports not in", values, "imports");
            return (Criteria) this;
        }

        public Criteria andImportsBetween(Integer value1, Integer value2) {
            addCriterion("imports between", value1, value2, "imports");
            return (Criteria) this;
        }

        public Criteria andImportsNotBetween(Integer value1, Integer value2) {
            addCriterion("imports not between", value1, value2, "imports");
            return (Criteria) this;
        }

        public Criteria andMaterialnodeIsNull() {
            addCriterion("materialnode is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnodeIsNotNull() {
            addCriterion("materialnode is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnodeEqualTo(String value) {
            addCriterion("materialnode =", value, "materialnode");
            return (Criteria) this;
        }

        public Criteria andMaterialnodeNotEqualTo(String value) {
            addCriterion("materialnode <>", value, "materialnode");
            return (Criteria) this;
        }

        public Criteria andMaterialnodeGreaterThan(String value) {
            addCriterion("materialnode >", value, "materialnode");
            return (Criteria) this;
        }

        public Criteria andMaterialnodeGreaterThanOrEqualTo(String value) {
            addCriterion("materialnode >=", value, "materialnode");
            return (Criteria) this;
        }

        public Criteria andMaterialnodeLessThan(String value) {
            addCriterion("materialnode <", value, "materialnode");
            return (Criteria) this;
        }

        public Criteria andMaterialnodeLessThanOrEqualTo(String value) {
            addCriterion("materialnode <=", value, "materialnode");
            return (Criteria) this;
        }

        public Criteria andMaterialnodeLike(String value) {
            addCriterion("materialnode like", value, "materialnode");
            return (Criteria) this;
        }

        public Criteria andMaterialnodeNotLike(String value) {
            addCriterion("materialnode not like", value, "materialnode");
            return (Criteria) this;
        }

        public Criteria andMaterialnodeIn(List<String> values) {
            addCriterion("materialnode in", values, "materialnode");
            return (Criteria) this;
        }

        public Criteria andMaterialnodeNotIn(List<String> values) {
            addCriterion("materialnode not in", values, "materialnode");
            return (Criteria) this;
        }

        public Criteria andMaterialnodeBetween(String value1, String value2) {
            addCriterion("materialnode between", value1, value2, "materialnode");
            return (Criteria) this;
        }

        public Criteria andMaterialnodeNotBetween(String value1, String value2) {
            addCriterion("materialnode not between", value1, value2, "materialnode");
            return (Criteria) this;
        }

        public Criteria andPurchsingnodeIsNull() {
            addCriterion("purchsingnode is null");
            return (Criteria) this;
        }

        public Criteria andPurchsingnodeIsNotNull() {
            addCriterion("purchsingnode is not null");
            return (Criteria) this;
        }

        public Criteria andPurchsingnodeEqualTo(String value) {
            addCriterion("purchsingnode =", value, "purchsingnode");
            return (Criteria) this;
        }

        public Criteria andPurchsingnodeNotEqualTo(String value) {
            addCriterion("purchsingnode <>", value, "purchsingnode");
            return (Criteria) this;
        }

        public Criteria andPurchsingnodeGreaterThan(String value) {
            addCriterion("purchsingnode >", value, "purchsingnode");
            return (Criteria) this;
        }

        public Criteria andPurchsingnodeGreaterThanOrEqualTo(String value) {
            addCriterion("purchsingnode >=", value, "purchsingnode");
            return (Criteria) this;
        }

        public Criteria andPurchsingnodeLessThan(String value) {
            addCriterion("purchsingnode <", value, "purchsingnode");
            return (Criteria) this;
        }

        public Criteria andPurchsingnodeLessThanOrEqualTo(String value) {
            addCriterion("purchsingnode <=", value, "purchsingnode");
            return (Criteria) this;
        }

        public Criteria andPurchsingnodeLike(String value) {
            addCriterion("purchsingnode like", value, "purchsingnode");
            return (Criteria) this;
        }

        public Criteria andPurchsingnodeNotLike(String value) {
            addCriterion("purchsingnode not like", value, "purchsingnode");
            return (Criteria) this;
        }

        public Criteria andPurchsingnodeIn(List<String> values) {
            addCriterion("purchsingnode in", values, "purchsingnode");
            return (Criteria) this;
        }

        public Criteria andPurchsingnodeNotIn(List<String> values) {
            addCriterion("purchsingnode not in", values, "purchsingnode");
            return (Criteria) this;
        }

        public Criteria andPurchsingnodeBetween(String value1, String value2) {
            addCriterion("purchsingnode between", value1, value2, "purchsingnode");
            return (Criteria) this;
        }

        public Criteria andPurchsingnodeNotBetween(String value1, String value2) {
            addCriterion("purchsingnode not between", value1, value2, "purchsingnode");
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