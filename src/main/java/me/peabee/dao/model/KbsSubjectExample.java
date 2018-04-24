package me.peabee.dao.model;

import java.util.ArrayList;
import java.util.List;

public class KbsSubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KbsSubjectExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNull() {
            addCriterion("subjectName is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNotNull() {
            addCriterion("subjectName is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameEqualTo(String value) {
            addCriterion("subjectName =", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotEqualTo(String value) {
            addCriterion("subjectName <>", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThan(String value) {
            addCriterion("subjectName >", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("subjectName >=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThan(String value) {
            addCriterion("subjectName <", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("subjectName <=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLike(String value) {
            addCriterion("subjectName like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotLike(String value) {
            addCriterion("subjectName not like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIn(List<String> values) {
            addCriterion("subjectName in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotIn(List<String> values) {
            addCriterion("subjectName not in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameBetween(String value1, String value2) {
            addCriterion("subjectName between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotBetween(String value1, String value2) {
            addCriterion("subjectName not between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectLibraryIsNull() {
            addCriterion("SubjectLibrary is null");
            return (Criteria) this;
        }

        public Criteria andSubjectLibraryIsNotNull() {
            addCriterion("SubjectLibrary is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectLibraryEqualTo(Integer value) {
            addCriterion("SubjectLibrary =", value, "subjectLibrary");
            return (Criteria) this;
        }

        public Criteria andSubjectLibraryNotEqualTo(Integer value) {
            addCriterion("SubjectLibrary <>", value, "subjectLibrary");
            return (Criteria) this;
        }

        public Criteria andSubjectLibraryGreaterThan(Integer value) {
            addCriterion("SubjectLibrary >", value, "subjectLibrary");
            return (Criteria) this;
        }

        public Criteria andSubjectLibraryGreaterThanOrEqualTo(Integer value) {
            addCriterion("SubjectLibrary >=", value, "subjectLibrary");
            return (Criteria) this;
        }

        public Criteria andSubjectLibraryLessThan(Integer value) {
            addCriterion("SubjectLibrary <", value, "subjectLibrary");
            return (Criteria) this;
        }

        public Criteria andSubjectLibraryLessThanOrEqualTo(Integer value) {
            addCriterion("SubjectLibrary <=", value, "subjectLibrary");
            return (Criteria) this;
        }

        public Criteria andSubjectLibraryIn(List<Integer> values) {
            addCriterion("SubjectLibrary in", values, "subjectLibrary");
            return (Criteria) this;
        }

        public Criteria andSubjectLibraryNotIn(List<Integer> values) {
            addCriterion("SubjectLibrary not in", values, "subjectLibrary");
            return (Criteria) this;
        }

        public Criteria andSubjectLibraryBetween(Integer value1, Integer value2) {
            addCriterion("SubjectLibrary between", value1, value2, "subjectLibrary");
            return (Criteria) this;
        }

        public Criteria andSubjectLibraryNotBetween(Integer value1, Integer value2) {
            addCriterion("SubjectLibrary not between", value1, value2, "subjectLibrary");
            return (Criteria) this;
        }

        public Criteria andDictionaryFlagIsNull() {
            addCriterion("DictionaryFlag is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryFlagIsNotNull() {
            addCriterion("DictionaryFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryFlagEqualTo(String value) {
            addCriterion("DictionaryFlag =", value, "dictionaryFlag");
            return (Criteria) this;
        }

        public Criteria andDictionaryFlagNotEqualTo(String value) {
            addCriterion("DictionaryFlag <>", value, "dictionaryFlag");
            return (Criteria) this;
        }

        public Criteria andDictionaryFlagGreaterThan(String value) {
            addCriterion("DictionaryFlag >", value, "dictionaryFlag");
            return (Criteria) this;
        }

        public Criteria andDictionaryFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DictionaryFlag >=", value, "dictionaryFlag");
            return (Criteria) this;
        }

        public Criteria andDictionaryFlagLessThan(String value) {
            addCriterion("DictionaryFlag <", value, "dictionaryFlag");
            return (Criteria) this;
        }

        public Criteria andDictionaryFlagLessThanOrEqualTo(String value) {
            addCriterion("DictionaryFlag <=", value, "dictionaryFlag");
            return (Criteria) this;
        }

        public Criteria andDictionaryFlagLike(String value) {
            addCriterion("DictionaryFlag like", value, "dictionaryFlag");
            return (Criteria) this;
        }

        public Criteria andDictionaryFlagNotLike(String value) {
            addCriterion("DictionaryFlag not like", value, "dictionaryFlag");
            return (Criteria) this;
        }

        public Criteria andDictionaryFlagIn(List<String> values) {
            addCriterion("DictionaryFlag in", values, "dictionaryFlag");
            return (Criteria) this;
        }

        public Criteria andDictionaryFlagNotIn(List<String> values) {
            addCriterion("DictionaryFlag not in", values, "dictionaryFlag");
            return (Criteria) this;
        }

        public Criteria andDictionaryFlagBetween(String value1, String value2) {
            addCriterion("DictionaryFlag between", value1, value2, "dictionaryFlag");
            return (Criteria) this;
        }

        public Criteria andDictionaryFlagNotBetween(String value1, String value2) {
            addCriterion("DictionaryFlag not between", value1, value2, "dictionaryFlag");
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

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIsNull() {
            addCriterion("subjectType is null");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIsNotNull() {
            addCriterion("subjectType is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeEqualTo(String value) {
            addCriterion("subjectType =", value, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeNotEqualTo(String value) {
            addCriterion("subjectType <>", value, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeGreaterThan(String value) {
            addCriterion("subjectType >", value, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("subjectType >=", value, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeLessThan(String value) {
            addCriterion("subjectType <", value, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeLessThanOrEqualTo(String value) {
            addCriterion("subjectType <=", value, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeLike(String value) {
            addCriterion("subjectType like", value, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeNotLike(String value) {
            addCriterion("subjectType not like", value, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeIn(List<String> values) {
            addCriterion("subjectType in", values, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeNotIn(List<String> values) {
            addCriterion("subjectType not in", values, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeBetween(String value1, String value2) {
            addCriterion("subjectType between", value1, value2, "subjectType");
            return (Criteria) this;
        }

        public Criteria andSubjectTypeNotBetween(String value1, String value2) {
            addCriterion("subjectType not between", value1, value2, "subjectType");
            return (Criteria) this;
        }

        public Criteria andMultiDealFlagIsNull() {
            addCriterion("multiDealFlag is null");
            return (Criteria) this;
        }

        public Criteria andMultiDealFlagIsNotNull() {
            addCriterion("multiDealFlag is not null");
            return (Criteria) this;
        }

        public Criteria andMultiDealFlagEqualTo(String value) {
            addCriterion("multiDealFlag =", value, "multiDealFlag");
            return (Criteria) this;
        }

        public Criteria andMultiDealFlagNotEqualTo(String value) {
            addCriterion("multiDealFlag <>", value, "multiDealFlag");
            return (Criteria) this;
        }

        public Criteria andMultiDealFlagGreaterThan(String value) {
            addCriterion("multiDealFlag >", value, "multiDealFlag");
            return (Criteria) this;
        }

        public Criteria andMultiDealFlagGreaterThanOrEqualTo(String value) {
            addCriterion("multiDealFlag >=", value, "multiDealFlag");
            return (Criteria) this;
        }

        public Criteria andMultiDealFlagLessThan(String value) {
            addCriterion("multiDealFlag <", value, "multiDealFlag");
            return (Criteria) this;
        }

        public Criteria andMultiDealFlagLessThanOrEqualTo(String value) {
            addCriterion("multiDealFlag <=", value, "multiDealFlag");
            return (Criteria) this;
        }

        public Criteria andMultiDealFlagLike(String value) {
            addCriterion("multiDealFlag like", value, "multiDealFlag");
            return (Criteria) this;
        }

        public Criteria andMultiDealFlagNotLike(String value) {
            addCriterion("multiDealFlag not like", value, "multiDealFlag");
            return (Criteria) this;
        }

        public Criteria andMultiDealFlagIn(List<String> values) {
            addCriterion("multiDealFlag in", values, "multiDealFlag");
            return (Criteria) this;
        }

        public Criteria andMultiDealFlagNotIn(List<String> values) {
            addCriterion("multiDealFlag not in", values, "multiDealFlag");
            return (Criteria) this;
        }

        public Criteria andMultiDealFlagBetween(String value1, String value2) {
            addCriterion("multiDealFlag between", value1, value2, "multiDealFlag");
            return (Criteria) this;
        }

        public Criteria andMultiDealFlagNotBetween(String value1, String value2) {
            addCriterion("multiDealFlag not between", value1, value2, "multiDealFlag");
            return (Criteria) this;
        }

        public Criteria andKernelSubjectIsNull() {
            addCriterion("kernelSubject is null");
            return (Criteria) this;
        }

        public Criteria andKernelSubjectIsNotNull() {
            addCriterion("kernelSubject is not null");
            return (Criteria) this;
        }

        public Criteria andKernelSubjectEqualTo(String value) {
            addCriterion("kernelSubject =", value, "kernelSubject");
            return (Criteria) this;
        }

        public Criteria andKernelSubjectNotEqualTo(String value) {
            addCriterion("kernelSubject <>", value, "kernelSubject");
            return (Criteria) this;
        }

        public Criteria andKernelSubjectGreaterThan(String value) {
            addCriterion("kernelSubject >", value, "kernelSubject");
            return (Criteria) this;
        }

        public Criteria andKernelSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("kernelSubject >=", value, "kernelSubject");
            return (Criteria) this;
        }

        public Criteria andKernelSubjectLessThan(String value) {
            addCriterion("kernelSubject <", value, "kernelSubject");
            return (Criteria) this;
        }

        public Criteria andKernelSubjectLessThanOrEqualTo(String value) {
            addCriterion("kernelSubject <=", value, "kernelSubject");
            return (Criteria) this;
        }

        public Criteria andKernelSubjectLike(String value) {
            addCriterion("kernelSubject like", value, "kernelSubject");
            return (Criteria) this;
        }

        public Criteria andKernelSubjectNotLike(String value) {
            addCriterion("kernelSubject not like", value, "kernelSubject");
            return (Criteria) this;
        }

        public Criteria andKernelSubjectIn(List<String> values) {
            addCriterion("kernelSubject in", values, "kernelSubject");
            return (Criteria) this;
        }

        public Criteria andKernelSubjectNotIn(List<String> values) {
            addCriterion("kernelSubject not in", values, "kernelSubject");
            return (Criteria) this;
        }

        public Criteria andKernelSubjectBetween(String value1, String value2) {
            addCriterion("kernelSubject between", value1, value2, "kernelSubject");
            return (Criteria) this;
        }

        public Criteria andKernelSubjectNotBetween(String value1, String value2) {
            addCriterion("kernelSubject not between", value1, value2, "kernelSubject");
            return (Criteria) this;
        }

        public Criteria andAttributiveIdIsNull() {
            addCriterion("attributiveId is null");
            return (Criteria) this;
        }

        public Criteria andAttributiveIdIsNotNull() {
            addCriterion("attributiveId is not null");
            return (Criteria) this;
        }

        public Criteria andAttributiveIdEqualTo(String value) {
            addCriterion("attributiveId =", value, "attributiveId");
            return (Criteria) this;
        }

        public Criteria andAttributiveIdNotEqualTo(String value) {
            addCriterion("attributiveId <>", value, "attributiveId");
            return (Criteria) this;
        }

        public Criteria andAttributiveIdGreaterThan(String value) {
            addCriterion("attributiveId >", value, "attributiveId");
            return (Criteria) this;
        }

        public Criteria andAttributiveIdGreaterThanOrEqualTo(String value) {
            addCriterion("attributiveId >=", value, "attributiveId");
            return (Criteria) this;
        }

        public Criteria andAttributiveIdLessThan(String value) {
            addCriterion("attributiveId <", value, "attributiveId");
            return (Criteria) this;
        }

        public Criteria andAttributiveIdLessThanOrEqualTo(String value) {
            addCriterion("attributiveId <=", value, "attributiveId");
            return (Criteria) this;
        }

        public Criteria andAttributiveIdLike(String value) {
            addCriterion("attributiveId like", value, "attributiveId");
            return (Criteria) this;
        }

        public Criteria andAttributiveIdNotLike(String value) {
            addCriterion("attributiveId not like", value, "attributiveId");
            return (Criteria) this;
        }

        public Criteria andAttributiveIdIn(List<String> values) {
            addCriterion("attributiveId in", values, "attributiveId");
            return (Criteria) this;
        }

        public Criteria andAttributiveIdNotIn(List<String> values) {
            addCriterion("attributiveId not in", values, "attributiveId");
            return (Criteria) this;
        }

        public Criteria andAttributiveIdBetween(String value1, String value2) {
            addCriterion("attributiveId between", value1, value2, "attributiveId");
            return (Criteria) this;
        }

        public Criteria andAttributiveIdNotBetween(String value1, String value2) {
            addCriterion("attributiveId not between", value1, value2, "attributiveId");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(String value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(String value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(String value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(String value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(String value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(String value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLike(String value) {
            addCriterion("rank like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotLike(String value) {
            addCriterion("rank not like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<String> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<String> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(String value1, String value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(String value1, String value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andSubjectApplyIsNull() {
            addCriterion("subjectApply is null");
            return (Criteria) this;
        }

        public Criteria andSubjectApplyIsNotNull() {
            addCriterion("subjectApply is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectApplyEqualTo(String value) {
            addCriterion("subjectApply =", value, "subjectApply");
            return (Criteria) this;
        }

        public Criteria andSubjectApplyNotEqualTo(String value) {
            addCriterion("subjectApply <>", value, "subjectApply");
            return (Criteria) this;
        }

        public Criteria andSubjectApplyGreaterThan(String value) {
            addCriterion("subjectApply >", value, "subjectApply");
            return (Criteria) this;
        }

        public Criteria andSubjectApplyGreaterThanOrEqualTo(String value) {
            addCriterion("subjectApply >=", value, "subjectApply");
            return (Criteria) this;
        }

        public Criteria andSubjectApplyLessThan(String value) {
            addCriterion("subjectApply <", value, "subjectApply");
            return (Criteria) this;
        }

        public Criteria andSubjectApplyLessThanOrEqualTo(String value) {
            addCriterion("subjectApply <=", value, "subjectApply");
            return (Criteria) this;
        }

        public Criteria andSubjectApplyLike(String value) {
            addCriterion("subjectApply like", value, "subjectApply");
            return (Criteria) this;
        }

        public Criteria andSubjectApplyNotLike(String value) {
            addCriterion("subjectApply not like", value, "subjectApply");
            return (Criteria) this;
        }

        public Criteria andSubjectApplyIn(List<String> values) {
            addCriterion("subjectApply in", values, "subjectApply");
            return (Criteria) this;
        }

        public Criteria andSubjectApplyNotIn(List<String> values) {
            addCriterion("subjectApply not in", values, "subjectApply");
            return (Criteria) this;
        }

        public Criteria andSubjectApplyBetween(String value1, String value2) {
            addCriterion("subjectApply between", value1, value2, "subjectApply");
            return (Criteria) this;
        }

        public Criteria andSubjectApplyNotBetween(String value1, String value2) {
            addCriterion("subjectApply not between", value1, value2, "subjectApply");
            return (Criteria) this;
        }

        public Criteria andFirstPinYinCharIsNull() {
            addCriterion("firstPinYinChar is null");
            return (Criteria) this;
        }

        public Criteria andFirstPinYinCharIsNotNull() {
            addCriterion("firstPinYinChar is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPinYinCharEqualTo(String value) {
            addCriterion("firstPinYinChar =", value, "firstPinYinChar");
            return (Criteria) this;
        }

        public Criteria andFirstPinYinCharNotEqualTo(String value) {
            addCriterion("firstPinYinChar <>", value, "firstPinYinChar");
            return (Criteria) this;
        }

        public Criteria andFirstPinYinCharGreaterThan(String value) {
            addCriterion("firstPinYinChar >", value, "firstPinYinChar");
            return (Criteria) this;
        }

        public Criteria andFirstPinYinCharGreaterThanOrEqualTo(String value) {
            addCriterion("firstPinYinChar >=", value, "firstPinYinChar");
            return (Criteria) this;
        }

        public Criteria andFirstPinYinCharLessThan(String value) {
            addCriterion("firstPinYinChar <", value, "firstPinYinChar");
            return (Criteria) this;
        }

        public Criteria andFirstPinYinCharLessThanOrEqualTo(String value) {
            addCriterion("firstPinYinChar <=", value, "firstPinYinChar");
            return (Criteria) this;
        }

        public Criteria andFirstPinYinCharLike(String value) {
            addCriterion("firstPinYinChar like", value, "firstPinYinChar");
            return (Criteria) this;
        }

        public Criteria andFirstPinYinCharNotLike(String value) {
            addCriterion("firstPinYinChar not like", value, "firstPinYinChar");
            return (Criteria) this;
        }

        public Criteria andFirstPinYinCharIn(List<String> values) {
            addCriterion("firstPinYinChar in", values, "firstPinYinChar");
            return (Criteria) this;
        }

        public Criteria andFirstPinYinCharNotIn(List<String> values) {
            addCriterion("firstPinYinChar not in", values, "firstPinYinChar");
            return (Criteria) this;
        }

        public Criteria andFirstPinYinCharBetween(String value1, String value2) {
            addCriterion("firstPinYinChar between", value1, value2, "firstPinYinChar");
            return (Criteria) this;
        }

        public Criteria andFirstPinYinCharNotBetween(String value1, String value2) {
            addCriterion("firstPinYinChar not between", value1, value2, "firstPinYinChar");
            return (Criteria) this;
        }

        public Criteria andKernelFromIsNull() {
            addCriterion("kernelFrom is null");
            return (Criteria) this;
        }

        public Criteria andKernelFromIsNotNull() {
            addCriterion("kernelFrom is not null");
            return (Criteria) this;
        }

        public Criteria andKernelFromEqualTo(String value) {
            addCriterion("kernelFrom =", value, "kernelFrom");
            return (Criteria) this;
        }

        public Criteria andKernelFromNotEqualTo(String value) {
            addCriterion("kernelFrom <>", value, "kernelFrom");
            return (Criteria) this;
        }

        public Criteria andKernelFromGreaterThan(String value) {
            addCriterion("kernelFrom >", value, "kernelFrom");
            return (Criteria) this;
        }

        public Criteria andKernelFromGreaterThanOrEqualTo(String value) {
            addCriterion("kernelFrom >=", value, "kernelFrom");
            return (Criteria) this;
        }

        public Criteria andKernelFromLessThan(String value) {
            addCriterion("kernelFrom <", value, "kernelFrom");
            return (Criteria) this;
        }

        public Criteria andKernelFromLessThanOrEqualTo(String value) {
            addCriterion("kernelFrom <=", value, "kernelFrom");
            return (Criteria) this;
        }

        public Criteria andKernelFromLike(String value) {
            addCriterion("kernelFrom like", value, "kernelFrom");
            return (Criteria) this;
        }

        public Criteria andKernelFromNotLike(String value) {
            addCriterion("kernelFrom not like", value, "kernelFrom");
            return (Criteria) this;
        }

        public Criteria andKernelFromIn(List<String> values) {
            addCriterion("kernelFrom in", values, "kernelFrom");
            return (Criteria) this;
        }

        public Criteria andKernelFromNotIn(List<String> values) {
            addCriterion("kernelFrom not in", values, "kernelFrom");
            return (Criteria) this;
        }

        public Criteria andKernelFromBetween(String value1, String value2) {
            addCriterion("kernelFrom between", value1, value2, "kernelFrom");
            return (Criteria) this;
        }

        public Criteria andKernelFromNotBetween(String value1, String value2) {
            addCriterion("kernelFrom not between", value1, value2, "kernelFrom");
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