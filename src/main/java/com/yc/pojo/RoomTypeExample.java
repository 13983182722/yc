package com.yc.pojo;

import java.util.ArrayList;
import java.util.List;

public class RoomTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomTypeExample() {
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

        public Criteria andRoomTypeIdIsNull() {
            addCriterion("room_type_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdIsNotNull() {
            addCriterion("room_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdEqualTo(Integer value) {
            addCriterion("room_type_id =", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdNotEqualTo(Integer value) {
            addCriterion("room_type_id <>", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdGreaterThan(Integer value) {
            addCriterion("room_type_id >", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_type_id >=", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdLessThan(Integer value) {
            addCriterion("room_type_id <", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_type_id <=", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdIn(List<Integer> values) {
            addCriterion("room_type_id in", values, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdNotIn(List<Integer> values) {
            addCriterion("room_type_id not in", values, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("room_type_id between", value1, value2, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_type_id not between", value1, value2, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameIsNull() {
            addCriterion("room_type_name is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameIsNotNull() {
            addCriterion("room_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameEqualTo(String value) {
            addCriterion("room_type_name =", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameNotEqualTo(String value) {
            addCriterion("room_type_name <>", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameGreaterThan(String value) {
            addCriterion("room_type_name >", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("room_type_name >=", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameLessThan(String value) {
            addCriterion("room_type_name <", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameLessThanOrEqualTo(String value) {
            addCriterion("room_type_name <=", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameLike(String value) {
            addCriterion("room_type_name like", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameNotLike(String value) {
            addCriterion("room_type_name not like", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameIn(List<String> values) {
            addCriterion("room_type_name in", values, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameNotIn(List<String> values) {
            addCriterion("room_type_name not in", values, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameBetween(String value1, String value2) {
            addCriterion("room_type_name between", value1, value2, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameNotBetween(String value1, String value2) {
            addCriterion("room_type_name not between", value1, value2, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomPriceIsNull() {
            addCriterion("room_price is null");
            return (Criteria) this;
        }

        public Criteria andRoomPriceIsNotNull() {
            addCriterion("room_price is not null");
            return (Criteria) this;
        }

        public Criteria andRoomPriceEqualTo(Double value) {
            addCriterion("room_price =", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceNotEqualTo(Double value) {
            addCriterion("room_price <>", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceGreaterThan(Double value) {
            addCriterion("room_price >", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("room_price >=", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceLessThan(Double value) {
            addCriterion("room_price <", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceLessThanOrEqualTo(Double value) {
            addCriterion("room_price <=", value, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceIn(List<Double> values) {
            addCriterion("room_price in", values, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceNotIn(List<Double> values) {
            addCriterion("room_price not in", values, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceBetween(Double value1, Double value2) {
            addCriterion("room_price between", value1, value2, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomPriceNotBetween(Double value1, Double value2) {
            addCriterion("room_price not between", value1, value2, "roomPrice");
            return (Criteria) this;
        }

        public Criteria andRoomWeekendPriceIsNull() {
            addCriterion("room_weekend_price is null");
            return (Criteria) this;
        }

        public Criteria andRoomWeekendPriceIsNotNull() {
            addCriterion("room_weekend_price is not null");
            return (Criteria) this;
        }

        public Criteria andRoomWeekendPriceEqualTo(Double value) {
            addCriterion("room_weekend_price =", value, "roomWeekendPrice");
            return (Criteria) this;
        }

        public Criteria andRoomWeekendPriceNotEqualTo(Double value) {
            addCriterion("room_weekend_price <>", value, "roomWeekendPrice");
            return (Criteria) this;
        }

        public Criteria andRoomWeekendPriceGreaterThan(Double value) {
            addCriterion("room_weekend_price >", value, "roomWeekendPrice");
            return (Criteria) this;
        }

        public Criteria andRoomWeekendPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("room_weekend_price >=", value, "roomWeekendPrice");
            return (Criteria) this;
        }

        public Criteria andRoomWeekendPriceLessThan(Double value) {
            addCriterion("room_weekend_price <", value, "roomWeekendPrice");
            return (Criteria) this;
        }

        public Criteria andRoomWeekendPriceLessThanOrEqualTo(Double value) {
            addCriterion("room_weekend_price <=", value, "roomWeekendPrice");
            return (Criteria) this;
        }

        public Criteria andRoomWeekendPriceIn(List<Double> values) {
            addCriterion("room_weekend_price in", values, "roomWeekendPrice");
            return (Criteria) this;
        }

        public Criteria andRoomWeekendPriceNotIn(List<Double> values) {
            addCriterion("room_weekend_price not in", values, "roomWeekendPrice");
            return (Criteria) this;
        }

        public Criteria andRoomWeekendPriceBetween(Double value1, Double value2) {
            addCriterion("room_weekend_price between", value1, value2, "roomWeekendPrice");
            return (Criteria) this;
        }

        public Criteria andRoomWeekendPriceNotBetween(Double value1, Double value2) {
            addCriterion("room_weekend_price not between", value1, value2, "roomWeekendPrice");
            return (Criteria) this;
        }

        public Criteria andBedNumIsNull() {
            addCriterion("bed_num is null");
            return (Criteria) this;
        }

        public Criteria andBedNumIsNotNull() {
            addCriterion("bed_num is not null");
            return (Criteria) this;
        }

        public Criteria andBedNumEqualTo(Integer value) {
            addCriterion("bed_num =", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotEqualTo(Integer value) {
            addCriterion("bed_num <>", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumGreaterThan(Integer value) {
            addCriterion("bed_num >", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bed_num >=", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumLessThan(Integer value) {
            addCriterion("bed_num <", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumLessThanOrEqualTo(Integer value) {
            addCriterion("bed_num <=", value, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumIn(List<Integer> values) {
            addCriterion("bed_num in", values, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotIn(List<Integer> values) {
            addCriterion("bed_num not in", values, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumBetween(Integer value1, Integer value2) {
            addCriterion("bed_num between", value1, value2, "bedNum");
            return (Criteria) this;
        }

        public Criteria andBedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("bed_num not between", value1, value2, "bedNum");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
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