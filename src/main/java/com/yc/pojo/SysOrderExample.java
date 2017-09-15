package com.yc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIsNull() {
            addCriterion("customer_tel is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIsNotNull() {
            addCriterion("customer_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelEqualTo(Integer value) {
            addCriterion("customer_tel =", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotEqualTo(Integer value) {
            addCriterion("customer_tel <>", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelGreaterThan(Integer value) {
            addCriterion("customer_tel >", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_tel >=", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLessThan(Integer value) {
            addCriterion("customer_tel <", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelLessThanOrEqualTo(Integer value) {
            addCriterion("customer_tel <=", value, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelIn(List<Integer> values) {
            addCriterion("customer_tel in", values, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotIn(List<Integer> values) {
            addCriterion("customer_tel not in", values, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelBetween(Integer value1, Integer value2) {
            addCriterion("customer_tel between", value1, value2, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerTelNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_tel not between", value1, value2, "customerTel");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardIsNull() {
            addCriterion("customer_id_card is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardIsNotNull() {
            addCriterion("customer_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardEqualTo(String value) {
            addCriterion("customer_id_card =", value, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardNotEqualTo(String value) {
            addCriterion("customer_id_card <>", value, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardGreaterThan(String value) {
            addCriterion("customer_id_card >", value, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id_card >=", value, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardLessThan(String value) {
            addCriterion("customer_id_card <", value, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardLessThanOrEqualTo(String value) {
            addCriterion("customer_id_card <=", value, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardLike(String value) {
            addCriterion("customer_id_card like", value, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardNotLike(String value) {
            addCriterion("customer_id_card not like", value, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardIn(List<String> values) {
            addCriterion("customer_id_card in", values, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardNotIn(List<String> values) {
            addCriterion("customer_id_card not in", values, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardBetween(String value1, String value2) {
            addCriterion("customer_id_card between", value1, value2, "customerIdCard");
            return (Criteria) this;
        }

        public Criteria andCustomerIdCardNotBetween(String value1, String value2) {
            addCriterion("customer_id_card not between", value1, value2, "customerIdCard");
            return (Criteria) this;
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

        public Criteria andRoomLevelIdIsNull() {
            addCriterion("room_level_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomLevelIdIsNotNull() {
            addCriterion("room_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomLevelIdEqualTo(Integer value) {
            addCriterion("room_level_id =", value, "roomLevelId");
            return (Criteria) this;
        }

        public Criteria andRoomLevelIdNotEqualTo(Integer value) {
            addCriterion("room_level_id <>", value, "roomLevelId");
            return (Criteria) this;
        }

        public Criteria andRoomLevelIdGreaterThan(Integer value) {
            addCriterion("room_level_id >", value, "roomLevelId");
            return (Criteria) this;
        }

        public Criteria andRoomLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_level_id >=", value, "roomLevelId");
            return (Criteria) this;
        }

        public Criteria andRoomLevelIdLessThan(Integer value) {
            addCriterion("room_level_id <", value, "roomLevelId");
            return (Criteria) this;
        }

        public Criteria andRoomLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_level_id <=", value, "roomLevelId");
            return (Criteria) this;
        }

        public Criteria andRoomLevelIdIn(List<Integer> values) {
            addCriterion("room_level_id in", values, "roomLevelId");
            return (Criteria) this;
        }

        public Criteria andRoomLevelIdNotIn(List<Integer> values) {
            addCriterion("room_level_id not in", values, "roomLevelId");
            return (Criteria) this;
        }

        public Criteria andRoomLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("room_level_id between", value1, value2, "roomLevelId");
            return (Criteria) this;
        }

        public Criteria andRoomLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_level_id not between", value1, value2, "roomLevelId");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNull() {
            addCriterion("arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNotNull() {
            addCriterion("arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeEqualTo(Date value) {
            addCriterion("arrive_time =", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotEqualTo(Date value) {
            addCriterion("arrive_time <>", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThan(Date value) {
            addCriterion("arrive_time >", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrive_time >=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThan(Date value) {
            addCriterion("arrive_time <", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThanOrEqualTo(Date value) {
            addCriterion("arrive_time <=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIn(List<Date> values) {
            addCriterion("arrive_time in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotIn(List<Date> values) {
            addCriterion("arrive_time not in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeBetween(Date value1, Date value2) {
            addCriterion("arrive_time between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotBetween(Date value1, Date value2) {
            addCriterion("arrive_time not between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(String value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(String value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(String value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(String value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(String value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLike(String value) {
            addCriterion("priority like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotLike(String value) {
            addCriterion("priority not like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<String> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<String> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(String value1, String value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(String value1, String value2) {
            addCriterion("priority not between", value1, value2, "priority");
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

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
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