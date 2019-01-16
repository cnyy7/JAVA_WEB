package com.chennan.mysite.cnyy.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class SkillExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table skill
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table skill
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table skill
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public SkillExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table skill
     *
     * @mbg.generated
     */
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

        public Criteria andSkillIdIsNull() {
            addCriterion("skill_id is null");
            return (Criteria) this;
        }

        public Criteria andSkillIdIsNotNull() {
            addCriterion("skill_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkillIdEqualTo(Integer value) {
            addCriterion("skill_id =", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdNotEqualTo(Integer value) {
            addCriterion("skill_id <>", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdGreaterThan(Integer value) {
            addCriterion("skill_id >", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("skill_id >=", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdLessThan(Integer value) {
            addCriterion("skill_id <", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdLessThanOrEqualTo(Integer value) {
            addCriterion("skill_id <=", value, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdIn(List<Integer> values) {
            addCriterion("skill_id in", values, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdNotIn(List<Integer> values) {
            addCriterion("skill_id not in", values, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdBetween(Integer value1, Integer value2) {
            addCriterion("skill_id between", value1, value2, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("skill_id not between", value1, value2, "skillId");
            return (Criteria) this;
        }

        public Criteria andSkillNameIsNull() {
            addCriterion("skill_name is null");
            return (Criteria) this;
        }

        public Criteria andSkillNameIsNotNull() {
            addCriterion("skill_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkillNameEqualTo(String value) {
            addCriterion("skill_name =", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameNotEqualTo(String value) {
            addCriterion("skill_name <>", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameGreaterThan(String value) {
            addCriterion("skill_name >", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameGreaterThanOrEqualTo(String value) {
            addCriterion("skill_name >=", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameLessThan(String value) {
            addCriterion("skill_name <", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameLessThanOrEqualTo(String value) {
            addCriterion("skill_name <=", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameLike(String value) {
            addCriterion("skill_name like", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameNotLike(String value) {
            addCriterion("skill_name not like", value, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameIn(List<String> values) {
            addCriterion("skill_name in", values, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameNotIn(List<String> values) {
            addCriterion("skill_name not in", values, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameBetween(String value1, String value2) {
            addCriterion("skill_name between", value1, value2, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillNameNotBetween(String value1, String value2) {
            addCriterion("skill_name not between", value1, value2, "skillName");
            return (Criteria) this;
        }

        public Criteria andSkillScoreIsNull() {
            addCriterion("skill_score is null");
            return (Criteria) this;
        }

        public Criteria andSkillScoreIsNotNull() {
            addCriterion("skill_score is not null");
            return (Criteria) this;
        }

        public Criteria andSkillScoreEqualTo(Integer value) {
            addCriterion("skill_score =", value, "skillScore");
            return (Criteria) this;
        }

        public Criteria andSkillScoreNotEqualTo(Integer value) {
            addCriterion("skill_score <>", value, "skillScore");
            return (Criteria) this;
        }

        public Criteria andSkillScoreGreaterThan(Integer value) {
            addCriterion("skill_score >", value, "skillScore");
            return (Criteria) this;
        }

        public Criteria andSkillScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("skill_score >=", value, "skillScore");
            return (Criteria) this;
        }

        public Criteria andSkillScoreLessThan(Integer value) {
            addCriterion("skill_score <", value, "skillScore");
            return (Criteria) this;
        }

        public Criteria andSkillScoreLessThanOrEqualTo(Integer value) {
            addCriterion("skill_score <=", value, "skillScore");
            return (Criteria) this;
        }

        public Criteria andSkillScoreIn(List<Integer> values) {
            addCriterion("skill_score in", values, "skillScore");
            return (Criteria) this;
        }

        public Criteria andSkillScoreNotIn(List<Integer> values) {
            addCriterion("skill_score not in", values, "skillScore");
            return (Criteria) this;
        }

        public Criteria andSkillScoreBetween(Integer value1, Integer value2) {
            addCriterion("skill_score between", value1, value2, "skillScore");
            return (Criteria) this;
        }

        public Criteria andSkillScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("skill_score not between", value1, value2, "skillScore");
            return (Criteria) this;
        }

        public Criteria andSkillShowIsNull() {
            addCriterion("skill_show is null");
            return (Criteria) this;
        }

        public Criteria andSkillShowIsNotNull() {
            addCriterion("skill_show is not null");
            return (Criteria) this;
        }

        public Criteria andSkillShowEqualTo(Boolean value) {
            addCriterion("skill_show =", value, "skillShow");
            return (Criteria) this;
        }

        public Criteria andSkillShowNotEqualTo(Boolean value) {
            addCriterion("skill_show <>", value, "skillShow");
            return (Criteria) this;
        }

        public Criteria andSkillShowGreaterThan(Boolean value) {
            addCriterion("skill_show >", value, "skillShow");
            return (Criteria) this;
        }

        public Criteria andSkillShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("skill_show >=", value, "skillShow");
            return (Criteria) this;
        }

        public Criteria andSkillShowLessThan(Boolean value) {
            addCriterion("skill_show <", value, "skillShow");
            return (Criteria) this;
        }

        public Criteria andSkillShowLessThanOrEqualTo(Boolean value) {
            addCriterion("skill_show <=", value, "skillShow");
            return (Criteria) this;
        }

        public Criteria andSkillShowIn(List<Boolean> values) {
            addCriterion("skill_show in", values, "skillShow");
            return (Criteria) this;
        }

        public Criteria andSkillShowNotIn(List<Boolean> values) {
            addCriterion("skill_show not in", values, "skillShow");
            return (Criteria) this;
        }

        public Criteria andSkillShowBetween(Boolean value1, Boolean value2) {
            addCriterion("skill_show between", value1, value2, "skillShow");
            return (Criteria) this;
        }

        public Criteria andSkillShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("skill_show not between", value1, value2, "skillShow");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table skill
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table skill
     *
     * @mbg.generated
     */
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