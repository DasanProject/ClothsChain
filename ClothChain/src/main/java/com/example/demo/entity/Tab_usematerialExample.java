package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;

public class Tab_usematerialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tab_usematerialExample() {
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

        public Criteria andUsematerialidIsNull() {
            addCriterion("usematerialid is null");
            return (Criteria) this;
        }

        public Criteria andUsematerialidIsNotNull() {
            addCriterion("usematerialid is not null");
            return (Criteria) this;
        }

        public Criteria andUsematerialidEqualTo(Integer value) {
            addCriterion("usematerialid =", value, "usematerialid");
            return (Criteria) this;
        }

        public Criteria andUsematerialidNotEqualTo(Integer value) {
            addCriterion("usematerialid <>", value, "usematerialid");
            return (Criteria) this;
        }

        public Criteria andUsematerialidGreaterThan(Integer value) {
            addCriterion("usematerialid >", value, "usematerialid");
            return (Criteria) this;
        }

        public Criteria andUsematerialidGreaterThanOrEqualTo(Integer value) {
            addCriterion("usematerialid >=", value, "usematerialid");
            return (Criteria) this;
        }

        public Criteria andUsematerialidLessThan(Integer value) {
            addCriterion("usematerialid <", value, "usematerialid");
            return (Criteria) this;
        }

        public Criteria andUsematerialidLessThanOrEqualTo(Integer value) {
            addCriterion("usematerialid <=", value, "usematerialid");
            return (Criteria) this;
        }

        public Criteria andUsematerialidIn(List<Integer> values) {
            addCriterion("usematerialid in", values, "usematerialid");
            return (Criteria) this;
        }

        public Criteria andUsematerialidNotIn(List<Integer> values) {
            addCriterion("usematerialid not in", values, "usematerialid");
            return (Criteria) this;
        }

        public Criteria andUsematerialidBetween(Integer value1, Integer value2) {
            addCriterion("usematerialid between", value1, value2, "usematerialid");
            return (Criteria) this;
        }

        public Criteria andUsematerialidNotBetween(Integer value1, Integer value2) {
            addCriterion("usematerialid not between", value1, value2, "usematerialid");
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

        public Criteria andMaterialtypeIsNull() {
            addCriterion("materialtype is null");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeIsNotNull() {
            addCriterion("materialtype is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeEqualTo(String value) {
            addCriterion("materialtype =", value, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeNotEqualTo(String value) {
            addCriterion("materialtype <>", value, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeGreaterThan(String value) {
            addCriterion("materialtype >", value, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeGreaterThanOrEqualTo(String value) {
            addCriterion("materialtype >=", value, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeLessThan(String value) {
            addCriterion("materialtype <", value, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeLessThanOrEqualTo(String value) {
            addCriterion("materialtype <=", value, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeLike(String value) {
            addCriterion("materialtype like", value, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeNotLike(String value) {
            addCriterion("materialtype not like", value, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeIn(List<String> values) {
            addCriterion("materialtype in", values, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeNotIn(List<String> values) {
            addCriterion("materialtype not in", values, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeBetween(String value1, String value2) {
            addCriterion("materialtype between", value1, value2, "materialtype");
            return (Criteria) this;
        }

        public Criteria andMaterialtypeNotBetween(String value1, String value2) {
            addCriterion("materialtype not between", value1, value2, "materialtype");
            return (Criteria) this;
        }

        public Criteria andGarmentpartsIsNull() {
            addCriterion("garmentparts is null");
            return (Criteria) this;
        }

        public Criteria andGarmentpartsIsNotNull() {
            addCriterion("garmentparts is not null");
            return (Criteria) this;
        }

        public Criteria andGarmentpartsEqualTo(String value) {
            addCriterion("garmentparts =", value, "garmentparts");
            return (Criteria) this;
        }

        public Criteria andGarmentpartsNotEqualTo(String value) {
            addCriterion("garmentparts <>", value, "garmentparts");
            return (Criteria) this;
        }

        public Criteria andGarmentpartsGreaterThan(String value) {
            addCriterion("garmentparts >", value, "garmentparts");
            return (Criteria) this;
        }

        public Criteria andGarmentpartsGreaterThanOrEqualTo(String value) {
            addCriterion("garmentparts >=", value, "garmentparts");
            return (Criteria) this;
        }

        public Criteria andGarmentpartsLessThan(String value) {
            addCriterion("garmentparts <", value, "garmentparts");
            return (Criteria) this;
        }

        public Criteria andGarmentpartsLessThanOrEqualTo(String value) {
            addCriterion("garmentparts <=", value, "garmentparts");
            return (Criteria) this;
        }

        public Criteria andGarmentpartsLike(String value) {
            addCriterion("garmentparts like", value, "garmentparts");
            return (Criteria) this;
        }

        public Criteria andGarmentpartsNotLike(String value) {
            addCriterion("garmentparts not like", value, "garmentparts");
            return (Criteria) this;
        }

        public Criteria andGarmentpartsIn(List<String> values) {
            addCriterion("garmentparts in", values, "garmentparts");
            return (Criteria) this;
        }

        public Criteria andGarmentpartsNotIn(List<String> values) {
            addCriterion("garmentparts not in", values, "garmentparts");
            return (Criteria) this;
        }

        public Criteria andGarmentpartsBetween(String value1, String value2) {
            addCriterion("garmentparts between", value1, value2, "garmentparts");
            return (Criteria) this;
        }

        public Criteria andGarmentpartsNotBetween(String value1, String value2) {
            addCriterion("garmentparts not between", value1, value2, "garmentparts");
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

        public Criteria andMaterialnameIsNull() {
            addCriterion("materialname is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNotNull() {
            addCriterion("materialname is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameEqualTo(String value) {
            addCriterion("materialname =", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotEqualTo(String value) {
            addCriterion("materialname <>", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThan(String value) {
            addCriterion("materialname >", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThanOrEqualTo(String value) {
            addCriterion("materialname >=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThan(String value) {
            addCriterion("materialname <", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThanOrEqualTo(String value) {
            addCriterion("materialname <=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLike(String value) {
            addCriterion("materialname like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotLike(String value) {
            addCriterion("materialname not like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIn(List<String> values) {
            addCriterion("materialname in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotIn(List<String> values) {
            addCriterion("materialname not in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameBetween(String value1, String value2) {
            addCriterion("materialname between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotBetween(String value1, String value2) {
            addCriterion("materialname not between", value1, value2, "materialname");
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

        public Criteria andSpecIsNull() {
            addCriterion("spec is null");
            return (Criteria) this;
        }

        public Criteria andSpecIsNotNull() {
            addCriterion("spec is not null");
            return (Criteria) this;
        }

        public Criteria andSpecEqualTo(String value) {
            addCriterion("spec =", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotEqualTo(String value) {
            addCriterion("spec <>", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThan(String value) {
            addCriterion("spec >", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThanOrEqualTo(String value) {
            addCriterion("spec >=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThan(String value) {
            addCriterion("spec <", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThanOrEqualTo(String value) {
            addCriterion("spec <=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLike(String value) {
            addCriterion("spec like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotLike(String value) {
            addCriterion("spec not like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecIn(List<String> values) {
            addCriterion("spec in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotIn(List<String> values) {
            addCriterion("spec not in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecBetween(String value1, String value2) {
            addCriterion("spec between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotBetween(String value1, String value2) {
            addCriterion("spec not between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andMadenumIsNull() {
            addCriterion("madenum is null");
            return (Criteria) this;
        }

        public Criteria andMadenumIsNotNull() {
            addCriterion("madenum is not null");
            return (Criteria) this;
        }

        public Criteria andMadenumEqualTo(Double value) {
            addCriterion("madenum =", value, "madenum");
            return (Criteria) this;
        }

        public Criteria andMadenumNotEqualTo(Double value) {
            addCriterion("madenum <>", value, "madenum");
            return (Criteria) this;
        }

        public Criteria andMadenumGreaterThan(Double value) {
            addCriterion("madenum >", value, "madenum");
            return (Criteria) this;
        }

        public Criteria andMadenumGreaterThanOrEqualTo(Double value) {
            addCriterion("madenum >=", value, "madenum");
            return (Criteria) this;
        }

        public Criteria andMadenumLessThan(Double value) {
            addCriterion("madenum <", value, "madenum");
            return (Criteria) this;
        }

        public Criteria andMadenumLessThanOrEqualTo(Double value) {
            addCriterion("madenum <=", value, "madenum");
            return (Criteria) this;
        }

        public Criteria andMadenumIn(List<Double> values) {
            addCriterion("madenum in", values, "madenum");
            return (Criteria) this;
        }

        public Criteria andMadenumNotIn(List<Double> values) {
            addCriterion("madenum not in", values, "madenum");
            return (Criteria) this;
        }

        public Criteria andMadenumBetween(Double value1, Double value2) {
            addCriterion("madenum between", value1, value2, "madenum");
            return (Criteria) this;
        }

        public Criteria andMadenumNotBetween(Double value1, Double value2) {
            addCriterion("madenum not between", value1, value2, "madenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumIsNull() {
            addCriterion("singlenum is null");
            return (Criteria) this;
        }

        public Criteria andSinglenumIsNotNull() {
            addCriterion("singlenum is not null");
            return (Criteria) this;
        }

        public Criteria andSinglenumEqualTo(Double value) {
            addCriterion("singlenum =", value, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumNotEqualTo(Double value) {
            addCriterion("singlenum <>", value, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumGreaterThan(Double value) {
            addCriterion("singlenum >", value, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumGreaterThanOrEqualTo(Double value) {
            addCriterion("singlenum >=", value, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumLessThan(Double value) {
            addCriterion("singlenum <", value, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumLessThanOrEqualTo(Double value) {
            addCriterion("singlenum <=", value, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumIn(List<Double> values) {
            addCriterion("singlenum in", values, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumNotIn(List<Double> values) {
            addCriterion("singlenum not in", values, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumBetween(Double value1, Double value2) {
            addCriterion("singlenum between", value1, value2, "singlenum");
            return (Criteria) this;
        }

        public Criteria andSinglenumNotBetween(Double value1, Double value2) {
            addCriterion("singlenum not between", value1, value2, "singlenum");
            return (Criteria) this;
        }

        public Criteria andLossIsNull() {
            addCriterion("loss is null");
            return (Criteria) this;
        }

        public Criteria andLossIsNotNull() {
            addCriterion("loss is not null");
            return (Criteria) this;
        }

        public Criteria andLossEqualTo(Double value) {
            addCriterion("loss =", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossNotEqualTo(Double value) {
            addCriterion("loss <>", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossGreaterThan(Double value) {
            addCriterion("loss >", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossGreaterThanOrEqualTo(Double value) {
            addCriterion("loss >=", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossLessThan(Double value) {
            addCriterion("loss <", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossLessThanOrEqualTo(Double value) {
            addCriterion("loss <=", value, "loss");
            return (Criteria) this;
        }

        public Criteria andLossIn(List<Double> values) {
            addCriterion("loss in", values, "loss");
            return (Criteria) this;
        }

        public Criteria andLossNotIn(List<Double> values) {
            addCriterion("loss not in", values, "loss");
            return (Criteria) this;
        }

        public Criteria andLossBetween(Double value1, Double value2) {
            addCriterion("loss between", value1, value2, "loss");
            return (Criteria) this;
        }

        public Criteria andLossNotBetween(Double value1, Double value2) {
            addCriterion("loss not between", value1, value2, "loss");
            return (Criteria) this;
        }

        public Criteria andTotalconsumptionIsNull() {
            addCriterion("totalconsumption is null");
            return (Criteria) this;
        }

        public Criteria andTotalconsumptionIsNotNull() {
            addCriterion("totalconsumption is not null");
            return (Criteria) this;
        }

        public Criteria andTotalconsumptionEqualTo(Double value) {
            addCriterion("totalconsumption =", value, "totalconsumption");
            return (Criteria) this;
        }

        public Criteria andTotalconsumptionNotEqualTo(Double value) {
            addCriterion("totalconsumption <>", value, "totalconsumption");
            return (Criteria) this;
        }

        public Criteria andTotalconsumptionGreaterThan(Double value) {
            addCriterion("totalconsumption >", value, "totalconsumption");
            return (Criteria) this;
        }

        public Criteria andTotalconsumptionGreaterThanOrEqualTo(Double value) {
            addCriterion("totalconsumption >=", value, "totalconsumption");
            return (Criteria) this;
        }

        public Criteria andTotalconsumptionLessThan(Double value) {
            addCriterion("totalconsumption <", value, "totalconsumption");
            return (Criteria) this;
        }

        public Criteria andTotalconsumptionLessThanOrEqualTo(Double value) {
            addCriterion("totalconsumption <=", value, "totalconsumption");
            return (Criteria) this;
        }

        public Criteria andTotalconsumptionIn(List<Double> values) {
            addCriterion("totalconsumption in", values, "totalconsumption");
            return (Criteria) this;
        }

        public Criteria andTotalconsumptionNotIn(List<Double> values) {
            addCriterion("totalconsumption not in", values, "totalconsumption");
            return (Criteria) this;
        }

        public Criteria andTotalconsumptionBetween(Double value1, Double value2) {
            addCriterion("totalconsumption between", value1, value2, "totalconsumption");
            return (Criteria) this;
        }

        public Criteria andTotalconsumptionNotBetween(Double value1, Double value2) {
            addCriterion("totalconsumption not between", value1, value2, "totalconsumption");
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

        public Criteria andSubmitnumIsNull() {
            addCriterion("submitnum is null");
            return (Criteria) this;
        }

        public Criteria andSubmitnumIsNotNull() {
            addCriterion("submitnum is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitnumEqualTo(Double value) {
            addCriterion("submitnum =", value, "submitnum");
            return (Criteria) this;
        }

        public Criteria andSubmitnumNotEqualTo(Double value) {
            addCriterion("submitnum <>", value, "submitnum");
            return (Criteria) this;
        }

        public Criteria andSubmitnumGreaterThan(Double value) {
            addCriterion("submitnum >", value, "submitnum");
            return (Criteria) this;
        }

        public Criteria andSubmitnumGreaterThanOrEqualTo(Double value) {
            addCriterion("submitnum >=", value, "submitnum");
            return (Criteria) this;
        }

        public Criteria andSubmitnumLessThan(Double value) {
            addCriterion("submitnum <", value, "submitnum");
            return (Criteria) this;
        }

        public Criteria andSubmitnumLessThanOrEqualTo(Double value) {
            addCriterion("submitnum <=", value, "submitnum");
            return (Criteria) this;
        }

        public Criteria andSubmitnumIn(List<Double> values) {
            addCriterion("submitnum in", values, "submitnum");
            return (Criteria) this;
        }

        public Criteria andSubmitnumNotIn(List<Double> values) {
            addCriterion("submitnum not in", values, "submitnum");
            return (Criteria) this;
        }

        public Criteria andSubmitnumBetween(Double value1, Double value2) {
            addCriterion("submitnum between", value1, value2, "submitnum");
            return (Criteria) this;
        }

        public Criteria andSubmitnumNotBetween(Double value1, Double value2) {
            addCriterion("submitnum not between", value1, value2, "submitnum");
            return (Criteria) this;
        }

        public Criteria andUncomittednumIsNull() {
            addCriterion("uncomittednum is null");
            return (Criteria) this;
        }

        public Criteria andUncomittednumIsNotNull() {
            addCriterion("uncomittednum is not null");
            return (Criteria) this;
        }

        public Criteria andUncomittednumEqualTo(Double value) {
            addCriterion("uncomittednum =", value, "uncomittednum");
            return (Criteria) this;
        }

        public Criteria andUncomittednumNotEqualTo(Double value) {
            addCriterion("uncomittednum <>", value, "uncomittednum");
            return (Criteria) this;
        }

        public Criteria andUncomittednumGreaterThan(Double value) {
            addCriterion("uncomittednum >", value, "uncomittednum");
            return (Criteria) this;
        }

        public Criteria andUncomittednumGreaterThanOrEqualTo(Double value) {
            addCriterion("uncomittednum >=", value, "uncomittednum");
            return (Criteria) this;
        }

        public Criteria andUncomittednumLessThan(Double value) {
            addCriterion("uncomittednum <", value, "uncomittednum");
            return (Criteria) this;
        }

        public Criteria andUncomittednumLessThanOrEqualTo(Double value) {
            addCriterion("uncomittednum <=", value, "uncomittednum");
            return (Criteria) this;
        }

        public Criteria andUncomittednumIn(List<Double> values) {
            addCriterion("uncomittednum in", values, "uncomittednum");
            return (Criteria) this;
        }

        public Criteria andUncomittednumNotIn(List<Double> values) {
            addCriterion("uncomittednum not in", values, "uncomittednum");
            return (Criteria) this;
        }

        public Criteria andUncomittednumBetween(Double value1, Double value2) {
            addCriterion("uncomittednum between", value1, value2, "uncomittednum");
            return (Criteria) this;
        }

        public Criteria andUncomittednumNotBetween(Double value1, Double value2) {
            addCriterion("uncomittednum not between", value1, value2, "uncomittednum");
            return (Criteria) this;
        }

        public Criteria andAutidionstateIsNull() {
            addCriterion("autidionstate is null");
            return (Criteria) this;
        }

        public Criteria andAutidionstateIsNotNull() {
            addCriterion("autidionstate is not null");
            return (Criteria) this;
        }

        public Criteria andAutidionstateEqualTo(Integer value) {
            addCriterion("autidionstate =", value, "autidionstate");
            return (Criteria) this;
        }

        public Criteria andAutidionstateNotEqualTo(Integer value) {
            addCriterion("autidionstate <>", value, "autidionstate");
            return (Criteria) this;
        }

        public Criteria andAutidionstateGreaterThan(Integer value) {
            addCriterion("autidionstate >", value, "autidionstate");
            return (Criteria) this;
        }

        public Criteria andAutidionstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("autidionstate >=", value, "autidionstate");
            return (Criteria) this;
        }

        public Criteria andAutidionstateLessThan(Integer value) {
            addCriterion("autidionstate <", value, "autidionstate");
            return (Criteria) this;
        }

        public Criteria andAutidionstateLessThanOrEqualTo(Integer value) {
            addCriterion("autidionstate <=", value, "autidionstate");
            return (Criteria) this;
        }

        public Criteria andAutidionstateIn(List<Integer> values) {
            addCriterion("autidionstate in", values, "autidionstate");
            return (Criteria) this;
        }

        public Criteria andAutidionstateNotIn(List<Integer> values) {
            addCriterion("autidionstate not in", values, "autidionstate");
            return (Criteria) this;
        }

        public Criteria andAutidionstateBetween(Integer value1, Integer value2) {
            addCriterion("autidionstate between", value1, value2, "autidionstate");
            return (Criteria) this;
        }

        public Criteria andAutidionstateNotBetween(Integer value1, Integer value2) {
            addCriterion("autidionstate not between", value1, value2, "autidionstate");
            return (Criteria) this;
        }

        public Criteria andPonoIsNull() {
            addCriterion("pono is null");
            return (Criteria) this;
        }

        public Criteria andPonoIsNotNull() {
            addCriterion("pono is not null");
            return (Criteria) this;
        }

        public Criteria andPonoEqualTo(String value) {
            addCriterion("pono =", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoNotEqualTo(String value) {
            addCriterion("pono <>", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoGreaterThan(String value) {
            addCriterion("pono >", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoGreaterThanOrEqualTo(String value) {
            addCriterion("pono >=", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoLessThan(String value) {
            addCriterion("pono <", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoLessThanOrEqualTo(String value) {
            addCriterion("pono <=", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoLike(String value) {
            addCriterion("pono like", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoNotLike(String value) {
            addCriterion("pono not like", value, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoIn(List<String> values) {
            addCriterion("pono in", values, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoNotIn(List<String> values) {
            addCriterion("pono not in", values, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoBetween(String value1, String value2) {
            addCriterion("pono between", value1, value2, "pono");
            return (Criteria) this;
        }

        public Criteria andPonoNotBetween(String value1, String value2) {
            addCriterion("pono not between", value1, value2, "pono");
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